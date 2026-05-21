## 2024-05-24 - Avoid unconditional Math.sqrt in game loops
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops (like collision and pocket detection) is a performance anti-pattern. Additionally, instantiating primitive variables or coordinate arrays inside the loop adds unnecessary GC pressure.
**Action:** Always prefer short-circuited logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`). Cache coordinates as `private static final` constants at the class level instead of redefining them locally inside the method.
