## 2024-06-25 - Expensive Math.sqrt in Game Loop
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (e.g., `potCheck`) is a major performance anti-pattern in this codebase.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to avoid redundant `Math.sqrt` overhead.
