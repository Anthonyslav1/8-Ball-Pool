## 2024-06-17 - Avoid Math.sqrt in high-frequency distance checks
**Learning:** Calculating exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops like `potCheck` is a performance anti-pattern.
**Action:** Replace `Math.sqrt` with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) and cache repeated method calls (like `getCenterX()` and `getCenterY()`) into local variables within the method to avoid redundant execution overhead.
