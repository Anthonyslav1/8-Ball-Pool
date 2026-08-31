## 2026-08-31 - [Performance: Replacing Math.sqrt in high-frequency loops]
**Learning:** In high-frequency game loops like `potCheck()`, unconditional calculation of exact Euclidean distance using `Math.sqrt` is a major performance bottleneck. Since we only need to check if the distance is within a radius, squaring the radius and comparing it to the squared distance avoids the expensive `Math.sqrt` operation entirely.
**Action:** When implementing distance or collision checks, always evaluate if squaring both sides of the inequality allows for skipping the `Math.sqrt` call.
