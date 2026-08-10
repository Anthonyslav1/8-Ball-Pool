## 2024-05-24 - Distance Calculation Anti-Pattern
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) in high-frequency game loops (e.g., `potCheck`) is a major performance anti-pattern.
**Action:** Replace `Math.sqrt` with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to improve performance by 11-12%.

## 2024-05-24 - Repeated Method Calls in Loops
**Learning:** Method calls like `getCenterX()` and `getCenterY()` executed repeatedly inside calculation loops add unnecessary overhead.
**Action:** Cache these values into local variables (`cx`, `cy`) before performing calculations in tight loops.
