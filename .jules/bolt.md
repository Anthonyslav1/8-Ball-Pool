## 2024-05-24 - Unnecessary object creation and getters in high-frequency game loops
**Learning:** The `potCheck` method in `Ball` variants executes frequently and suffers from redundant `getCenterX()`/`getCenterY()` getter invocations and exact `Math.sqrt` calculations for distance logic, representing a major CPU bottleneck for games.
**Action:** Always prefer caching getters locally within tight loops and replace exact distance calculations with squared comparisons (`dx*dx + dy*dy <= radiusSq`) and short-circuit early returns to avoid wasteful operations.
