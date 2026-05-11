## 2024-06-25 - Euclidean Distance in Game Loops
**Learning:** The codebase previously calculated exact Euclidean distance (`Math.sqrt`) 6 times unconditionally per ball per frame in the `potCheck` method, causing unnecessary CPU overhead and garbage collection from inline literal object allocations.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection. Cache static coordinates instead of local variable assignments.
