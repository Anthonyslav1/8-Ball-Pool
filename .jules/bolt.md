## 2024-06-25 - Object Allocation in High-Frequency Game Loops
**Learning:** Initializing arrays or objects inside high-frequency game loop methods (like `potCheck`) causes significant memory allocation and garbage collection pressure, which can negate the benefits of mathematical optimizations like removing `Math.sqrt`.
**Action:** Always extract static data structures (like pocket coordinates) to `private static final` class-level variables to prevent unnecessary per-frame allocations.
