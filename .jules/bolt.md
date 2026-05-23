
## 2026-05-23 - Replaced unrolled `Math.sqrt` calculations with cached arrays and short-circuit loops in pocket detection
**Learning:** Using `Math.sqrt` extensively inside high-frequency game loops (like collision or pot checks) creates measurable GC and calculation overhead. The `potCheck()` methods across `client`, `jfx`, and `tcpobject` unrolled distance calculations for 6 pockets, running all 6 unconditionally before checking.
**Action:** Replace unrolled exact distance computations (`Math.sqrt`) with cached pocket arrays (`POCKET_X`, `POCKET_Y`) and loop with early returns (`break`/`return`). Compute and compare against squared distances (`dx*dx + dy*dy <= 81.0`) instead of calling `Math.sqrt`. This pattern should be applied to any spatial collision checks running on a timer.
