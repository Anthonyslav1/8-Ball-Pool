## 2024-07-22 - [Avoid Math.sqrt in high-frequency game loops]
**Learning:** [Calculating exact Euclidean distance unconditionally using Math.sqrt in high-frequency game loops like potCheck() is a performance anti-pattern. Squared distance comparisons provide roughly an 11-12% performance improvement in tight execution loops.]
**Action:** [Prefer short-circuiting logic and squared distance comparisons (dx*dx + dy*dy <= radius*radius) for collision and pocket detection.]
