## 2024-05-15 - potCheck Math.sqrt Optimization
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) in high-frequency game loops (e.g., `potCheck()`) is computationally expensive and unnecessary.
**Action:** Always prefer squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to improve performance.
