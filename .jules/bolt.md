## 2024-05-18 - Math.sqrt() is a performance killer in potCheck()
**Learning:** Calculating Euclidean distance unconditionally using Math.sqrt() in high-frequency game loops (like potCheck across Ball.java variants) causes measurable overhead.
**Action:** Use short-circuiting logic and squared distance comparisons (dx*dx + dy*dy <= radius*radius) to optimize.
