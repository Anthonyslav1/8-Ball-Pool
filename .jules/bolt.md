## 2024-06-25 - Math.sqrt in high-frequency game loops
**Learning:** Found exact Euclidean distance (`Math.sqrt`) being calculated repeatedly unconditionally in high-frequency loops like `potCheck` for 6 pockets. This causes significant performance drag for checking simple distances.
**Action:** Always prefer caching center coordinates in local variables and comparing squared distances (`dx*dx + dy*dy <= r*r`) against squared radii.
