## 2024-05-17 - Math.sqrt Performance Bottleneck
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) in high-frequency game loops (e.g., `potCheck` for pocket collision detection) is a significant performance anti-pattern.
**Action:** Always replace unconditional `Math.sqrt` calculations with short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) in tight loops.
