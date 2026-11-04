## 2024-05-24 - Avoid exact Euclidean distance in high-frequency loops
**Learning:** Calculating exact Euclidean distance unconditionally in high-frequency game loops (like potCheck) is a known performance anti-pattern in this codebase.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (e.g., dx*dx + dy*dy <= radius*radius) for collision and pocket detection to avoid the overhead of Math.sqrt().
