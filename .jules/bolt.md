
## 2024-10-23 - Avoid Expensive Math Functions in Game Loops
**Learning:** In a networking game, unconditional calls to `Math.sqrt` within tight execution loops (e.g., `potCheck()` checking for distances to multiple pool table pockets) create a measurable performance anti-pattern due to the overhead of the exact distance calculation and duplicate `getCenterX()`/`getCenterY()` calls.
**Action:** When implementing spatial comparisons or collision detections, cache repeated method calls locally and prefer using squared distance checks (e.g., `dx*dx + dy*dy <= radius*radius`) over calculating exact Euclidean distances using `Math.sqrt`.
