## 2024-06-25 - Avoid Math.sqrt for Distance Calculation in Game Loops
**Learning:** Calculating exact Euclidean distance using `Math.sqrt` unconditionally in high-frequency game loops (like `potCheck`) introduces unnecessary overhead. This is a noticeable anti-pattern in real-time logic.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) over `Math.sqrt()` for bounding-box style collision or pocket detection.
