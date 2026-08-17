## 2024-05-13 - Math.sqrt in high-frequency game loops
**Learning:** `Math.sqrt` inside collision/pocket checking methods like `potCheck()` is an expensive operation that runs frequently. Squaring the distances (e.g. `dis <= 9` becomes `disSq <= 81`) avoids this.
**Action:** Replace `Math.sqrt` with squared distance calculations when doing collision boundary checks. Cache repeated calls like `getCenterX()` and `getCenterY()`.
