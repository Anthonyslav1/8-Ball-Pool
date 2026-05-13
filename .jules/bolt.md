## 2024-05-18 - Math.sqrt in High Frequency Loops

**Learning:** The codebase has multiple variants of `Ball.java` that run high-frequency exact Euclidean distance checks using `Math.sqrt` on every physics tick (e.g. `potCheck()`). This exact calculation to 12 constant variables unconditionally does a lot of compute that can be severely reduced.

**Action:** In identical duplicate classes (`client/Ball.java`, `jfx/Ball1.java`, `tcpobject/Ball.java`), whenever we need to check thresholds against radii or distances, replace Euclidean exact roots with Squared Distance comparisons (`dx*dx + dy*dy <= POCKET_RADIUS_SQ`). Static final definitions for such constants can speed things up and use short-circuit breaks to optimize worst case loop overhead.
