## 2024-11-20 - Math.sqrt Performance Anti-Pattern
**Learning:** Exact Euclidean distance calculation (`Math.sqrt`) used unconditionally in high-frequency game loop methods (e.g., `potCheck`) causes unnecessary overhead when simple squared distance comparisons (`dx*dx + dy*dy <= r*r`) achieve the same boolean collision result.
**Action:** Always replace `Math.sqrt` with squared distance comparisons for collision and bounds checking in high-frequency paths. Ensure identical fixes are applied across equivalent network, client, and UI duplicate class structures.
