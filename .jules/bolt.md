## 2024-05-24 - Avoid exact Euclidean distance unconditionally in high-frequency game loops
**Learning:** Calculating exact Euclidean distance unconditionally (`Math.sqrt`) in high-frequency loops (e.g., collision/pocket detection in game ticks) adds significant overhead and can form bottlenecks.
**Action:** Prefer short-circuiting logic and squared distance comparisons (e.g. `dx*dx + dy*dy <= radius*radius`) for distance checks instead of `Math.sqrt` to improve performance.
