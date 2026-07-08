
## 2024-05-18 - Math.sqrt Performance Anti-Pattern in Game Loops
**Learning:** In high-frequency game loops (like the `potCheck` collision/pocket detection), using `Math.sqrt` to calculate exact Euclidean distance is a performance anti-pattern. Benchmarks show avoiding it provides approximately an 11-12% performance improvement.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (e.g., comparing against squared radius/threshold instead of calculating square root) for collision detection loops in this codebase. Additionally, cache repeated getter calls like `getCenterX()` locally to reduce method overhead in these loops.
