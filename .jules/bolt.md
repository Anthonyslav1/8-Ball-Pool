## 2024-05-24 - Math.sqrt in high-frequency game loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a major performance anti-pattern in this codebase.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to reduce unnecessary computation overhead. Cache repeated method calls like `getCenterX()` and `getCenterY()` into local variables within these loops.

## 2024-05-24 - Duplicated logic in Ball classes
**Learning:** The codebase contains duplicated logic across multiple equivalent classes (e.g., `src/client/Ball.java`, `src/jfx/Ball1.java`, and `src/tcpobject/Ball.java`).
**Action:** Optimizations or logic changes generally need to be mirrored across all variants, while carefully preserving their class-specific state logic (e.g., differing `Try`/`Try2` references or return types).

## 2024-05-24 - Binary build outputs staging issue
**Learning:** Compiling the project manually outputs large amounts of binary `.class` files to the `out/` directory, which can easily be accidentally staged in git, polluting the PR and causing staging diff failures if ignored after the fact.
**Action:** The `out/` directory must be gitignored *before* compiling to avoid accidentally staging massive amounts of `.class` files. If it gets staged, use `git restore --staged out/` and remove it carefully before committing.
