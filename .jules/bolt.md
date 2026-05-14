## 2024-05-24 - Avoid Math.sqrt in high-frequency game loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a performance anti-pattern in this codebase.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection.
