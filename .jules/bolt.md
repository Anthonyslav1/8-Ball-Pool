## 2024-05-18 - Math.sqrt in Game Loop
**Learning:** Found exact Euclidean distance (Math.sqrt) calculated unconditionally in high-frequency game loops (potCheck) across all Ball class variants, causing significant computational overhead (micro-benchmarks show ~11-12% penalty).
**Action:** Always prefer short-circuiting logic and squared distance comparisons (dx*dx + dy*dy <= radius*radius) for collision and pocket detection to avoid Math.sqrt calls.
