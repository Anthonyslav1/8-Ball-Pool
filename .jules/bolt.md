## 2024-06-25 - [Math.sqrt bottleneck in high-frequency game loops]
**Learning:** The application calculated exact Euclidean distance unconditionally for 6 pockets using Math.sqrt on every potCheck call for every ball. This is a common performance bottleneck in JavaFX games.
**Action:** Replace `Math.sqrt` with squared distance comparisons (`<= 81` instead of `<= 9`) and use `||` short-circuiting to avoid evaluating remaining pockets when a collision is found.
