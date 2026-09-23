## 2026-09-23 - Optimize potCheck
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops is a performance anti-pattern. Cache coordinates to avoid redundant method calls, and prefer squared distance comparisons.
**Action:** Replace `Math.sqrt` with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection.
