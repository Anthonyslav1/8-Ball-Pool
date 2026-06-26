## 2024-05-18 - Optimize potCheck distance calculations
**Learning:** In high-frequency game loop methods (e.g., collision and pocket detection routines like `potCheck()`), repeatedly calculating exact Euclidean distance via `Math.sqrt()` introduces unnecessary overhead.
**Action:** When comparing distances against a known constant radius, compare squared distances (`dx*dx + dy*dy <= radius*radius`) instead, and avoid redundant coordinate lookups by caching getter results into local variables.
