## 2024-06-25 - Avoid Math.sqrt in Game Loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) in high-frequency loops (like `potCheck`) is a major performance bottleneck. Comparing squared distances is mathematically equivalent and much faster.
**Action:** Always prefer squared distance checks (`dx*dx + dy*dy <= radius*radius`) for collision detection.

## 2024-06-25 - Cache Redundant Method Calls
**Learning:** Repeatedly calling getter methods like `getCenterX()` within the same method (especially in loops or repetitive calculations) adds unnecessary overhead.
**Action:** Cache the results of these method calls into local variables if the value doesn't change during the method execution.
