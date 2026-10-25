## 2024-05-24 - Unconditional Math.sqrt in high-frequency game loops
**Learning:** Calculating exact Euclidean distance unconditionally using `Math.sqrt` in tight loops like `potCheck` is a performance anti-pattern.
**Action:** Replace `Math.sqrt(dx*dx + dy*dy) <= radius` with squared distance comparisons `(dx*dx + dy*dy) <= radius*radius` to avoid the overhead of square root calculation.
