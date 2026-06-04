## 2024-05-18 - Caching coordinate loops
**Learning:** In high-frequency game physics loops, unconditional calculation of `Math.sqrt()` along with redundant method calls to get coordinates severely harms performance.
**Action:** Instead of calling `Math.sqrt()` to check standard distances, always prefer substituting it with squaring the radius threshold (`dx^2 + dy^2 <= r^2`). Cache local properties into variables to minimize getter executions per frame.

## 2024-05-18 - Git tracking build artifacts
**Learning:** `out/` compilation directories were implicitly tracked in Git, causing patches and PRs to get polluted with `.class` files.
**Action:** Always make sure compiled binary output folders are added to `.gitignore` and removed from git's tracking cache to maintain clean source trees.
