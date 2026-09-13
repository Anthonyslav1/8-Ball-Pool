## 2026-09-13 - Squared Distance Pocket Detection
**Learning:** Replaced unconditional 6x `Math.sqrt` calls per ball in `potCheck` with a short-circuiting squared distance check (`dx*dx + dy*dy <= radius*radius`) over static cached pocket coordinates, which is significantly faster since it avoids expensive floating-point square roots in a high-frequency game loop function.
**Action:** Always prefer squared distance comparisons over `Math.sqrt` for collision and pocket detection in performance-critical game loops. Cache static reference coordinates to avoid redundant calculations.
