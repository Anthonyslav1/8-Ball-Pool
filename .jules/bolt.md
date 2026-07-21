## 2024-05-15 - [Squared Distance Over Sqrt in Game Loops]
**Learning:** The `potCheck()` method across all three `Ball` class duplicates unconditionally executes `Math.sqrt()` 6 times per check. This causes significant, unnecessary CPU overhead during tight game loops.
**Action:** Always prefer checking against squared distance (`dx*dx + dy*dy <= radius*radius`) instead of invoking `Math.sqrt()` in high-frequency rendering or collision paths. Additionally, method calls inside calculations (like `getCenterX()`) must be aggressively cached into local variables if invoked multiple times.
