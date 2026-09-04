## 2024-05-18 - Math.sqrt() overhead in tight loops
**Learning:** The codebase previously used Math.sqrt() heavily in game loop collision detection (like potCheck).
**Action:** When working on physics or distance calculations in high-frequency loops (like games), always replace Math.sqrt() with squared distance comparisons if exact distances are not required.
