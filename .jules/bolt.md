## 2024-05-24 - Math.sqrt in Game Loop Anti-Pattern
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck()`) is a significant performance bottleneck in this codebase.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection. Also, avoid allocating coordinate arrays inside the game loop by moving them to `private static final` class-level arrays.
