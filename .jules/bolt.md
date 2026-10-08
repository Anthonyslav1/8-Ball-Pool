## 2024-05-14 - potCheck unconditionally calculates exact Euclidean distance with Math.sqrt
**Learning:** Calculating exact Euclidean distance unconditionally in high-frequency game loops (e.g. `potCheck()`) with `Math.sqrt` introduces unnecessary performance overhead when a simple squared distance check would suffice.
**Action:** Replace `Math.sqrt` with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection in high-frequency loop environments.
