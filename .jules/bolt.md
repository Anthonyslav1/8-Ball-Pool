## 2024-05-30 - Math.sqrt in hot loops
**Learning:** Exact Euclidean distance calculations (`Math.sqrt`) are unnecessarily expensive in high-frequency game loop checks like collision and pocket detection.
**Action:** Always prefer squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for boolean boundary checks.
