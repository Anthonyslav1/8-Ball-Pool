## 2024-06-25 - Avoid Math.sqrt for Euclidean Distance
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (like `potCheck`) is a significant performance anti-pattern.
**Action:** Always prefer squared distance comparisons (`(dx*dx + dy*dy) <= radius*radius`) for collision and pocket detection to avoid the overhead of `Math.sqrt`.
