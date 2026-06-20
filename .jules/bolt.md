## 2024-05-18 - Math.sqrt in High-Frequency Game Loops
**Learning:** This codebase historically calculates exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops like `potCheck()` across multiple duplicated `Ball` classes. Because distances are always positive, calculating square roots is an unnecessary performance penalty.
**Action:** Always prefer squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection in this codebase.
