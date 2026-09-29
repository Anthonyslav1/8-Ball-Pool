## 2024-05-18 - Math.sqrt in high-frequency loop
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (`potCheck`) is a known performance anti-pattern.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection. Cache repeated method calls like `getCenterX()` and `getCenterY()` into local variables within loops.
