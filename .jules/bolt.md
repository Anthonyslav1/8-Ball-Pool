## 2024-05-19 - Distance Calculation Anti-Pattern
**Learning:** Found exact Euclidean distance calculation (`Math.sqrt`) being performed unconditionally 6 times per `potCheck` call across multiple ball implementations in high-frequency game loops. This is computationally expensive without any benefit, since the pocket hitboxes are simple radius checks.
**Action:** Always replace unconditional exact distance (`sqrt()`) with short-circuiting squared distance comparisons (`dx*dx + dy*dy <= rad*rad`) for collision and pocket checking in this codebase.
