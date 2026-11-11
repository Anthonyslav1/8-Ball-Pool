
## 2024-11-10 - Coordinate Caching & Squared Distance Optimization in JavaFX Game Loop
**Learning:** Found a critical anti-pattern in the JavaFX physics loop where `Math.sqrt()` was used 6 times sequentially per frame in `potCheck()` for all ball instances, compounded by redundant `getCenterX()`/`getCenterY()` calls. High-frequency UI event loops must avoid allocating new objects and floating-point square roots to prevent stutter.
**Action:** Always replace `Math.sqrt` distance calculations with squared distance comparisons (`dx*dx + dy*dy <= r*r`) and cache redundant getter method results locally within tight simulation loops (e.g. `potCheck()`, `bounce()`).
