## 2024-05-24 - Math.sqrt in high-frequency game loops
**Learning:** Found an anti-pattern in `Ball.java` (duplicated across client, jfx, and tcpobject variants) where exact Euclidean distance via `Math.sqrt` was used unconditionally in the high-frequency `potCheck()` method for pocket detection.
**Action:** Replace `Math.sqrt` with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and threshold detection to avoid expensive floating-point operations in tight loops. Cache repeated `getCenterX/Y()` method calls into local variables to reduce overhead.
