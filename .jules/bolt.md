
## 2024-05-24 - Distance Calculation in Game Loop
**Learning:** This codebase replicates core physics/logic (like `potCheck`) across multiple slightly variant classes (`client/Ball`, `tcpobject/Ball`, `jfx/Ball1`). Performance optimizations made to physics calculations MUST be checked and applied across all duplicates, otherwise regressions or desyncs will occur. Furthermore, when reading lines via Python to bypass character truncation, chunks of 30 lines are too large (hitting EOF or being cut off by stdout limits) - use 15 lines max.
**Action:** When finding a game logic bottleneck, always run a global `grep` for the method name or math function. Ensure line-reading helper scripts restrict output to tiny, ~15 line chunks.
