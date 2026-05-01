## 2024-05-18 - Math.sqrt in Game Loop
**Learning:** The project uses `Math.sqrt` repeatedly in the game loop within `potCheck` methods of the `Ball` classes to check proximity. This is a classic game development anti-pattern that can be a significant performance bottleneck because square root operations are computationally expensive.
**Action:** When performing proximity checks or distance calculations in a game loop, always evaluate comparing the squared distance (`x^2 + y^2`) directly against the squared threshold, entirely eliminating the need for `Math.sqrt`.
