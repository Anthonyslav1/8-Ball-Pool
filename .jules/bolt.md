## 2024-10-24 - Expensive Math.sqrt in Game Loop
**Learning:** Calculating exact Euclidean distance unconditionally using `Math.sqrt` in the `potCheck` method causes unnecessary CPU overhead in the tight game loop.
**Action:** Always prefer squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for distance collision detection and cache coordinates to avoid repeated temporary variable allocation.
