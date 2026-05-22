
## $(date +%Y-%m-%d) - Cached Coordinate Lookups in High Frequency Method
**Learning:** In JavaFX games with high-frequency game loops, instantiating coordinate objects or continuously evaluating methods like `getCenterX()` inside tight loop sections (e.g. `potCheck()`) incurs overhead. The `Math.sqrt` calculations are significantly more expensive than short-circuited square distance checks.
**Action:** Replace direct calls to `Math.sqrt` with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`). When repeatedly checking distances to fixed locations (like pockets), cache the locations in static arrays to avoid object allocation and iterate efficiently with short-circuiting (`break` or early return).
