## 2024-05-30 - Squared Distance Optimization
**Learning:** Calculating exact Euclidean distance unconditionally in high-frequency game loops is a major bottleneck in this engine.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection.
