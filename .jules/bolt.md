## 2024-05-24 - Math.sqrt performance optimization
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a known performance anti-pattern in this codebase.
**Action:** Replace `Math.sqrt` with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to improve performance by 11-12% in tight execution loops.

## 2024-05-24 - Duplicated logic across Ball classes
**Learning:** The codebase contains duplicated logic across multiple equivalent classes (`src/client/Ball.java`, `src/jfx/Ball1.java`, and `src/tcpobject/Ball.java`).
**Action:** Optimizations or logic changes generally need to be mirrored across all variants, while carefully preserving their class-specific state logic (e.g., differing `Try`/`Try2` references or return types).

## 2024-05-24 - Redundant coordinate calculations in high-frequency loops
**Learning:** `this.getCenterX()` and `this.getCenterY()` are called repeatedly in `potCheck()` which is an anti-pattern as they return exactly the same value during a single iteration.
**Action:** Cache these method calls into local variables (`cx` and `cy`) at the start of the method to reduce method invocation overhead.
