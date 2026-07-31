## 2024-05-15 - potCheck Game Loop Optimization
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a performance anti-pattern. Also, redundant coordinate retrieval (`getCenterX()`, `getCenterY()`) adds unnecessary overhead.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection. Cache repeated method calls into local variables within loops.
