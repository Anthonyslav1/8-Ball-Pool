## 2024-06-25 - Avoid Math.sqrt in Game Loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a significant performance anti-pattern. Squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) are much faster and provide the same logical result for collision and pocket detection.
**Action:** Always prefer short-circuiting logic and squared distance comparisons in performance-critical areas like collision detection. Also cache repeated object method calls like `getCenterX()` locally to reduce overhead.
