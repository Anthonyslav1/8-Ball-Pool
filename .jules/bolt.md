## 2026-10-31 - Short-circuit Euclidean distance
**Learning:** Exact Euclidean distance calculations (Math.sqrt) in high-frequency game loops like potCheck can cause unnecessary performance overhead.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (dx*dx + dy*dy <= radius*radius) for collision and pocket detection.
