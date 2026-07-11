## 2024-06-25 - Mathematical Functions in High-Frequency Game Loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally for all possible collision targets every frame is a massive performance drain in JavaFX game loops like `potCheck`.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision/pocket detection, and always cache repeated property lookups (`getCenterX()`, `getCenterY()`) within the method body.
