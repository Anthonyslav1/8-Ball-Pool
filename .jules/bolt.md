## 2024-05-18 - Math.sqrt Performance Impact in Game Loops
**Learning:** Calculating exact Euclidean distance unconditionally using `Math.sqrt()` in high-frequency game loops (like `potCheck()`) is a significant bottleneck, particularly because it's called 6 times per frame per ball in this specific codebase.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to improve loop execution speed by 10-15%.
