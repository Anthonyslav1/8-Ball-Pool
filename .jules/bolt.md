## 2024-05-24 - Math.sqrt in Game Loop Anti-Pattern
**Learning:** The codebase repeatedly used exact Euclidean distance via `Math.sqrt` for collision/pocket detection unconditionally inside the main update cycle across multiple duplicated ball classes.
**Action:** Replaced expensive `Math.sqrt` with squared distance thresholds and short-circuit logic (`|| `) to avoid calculating unnecessary distances once a hit is registered. Always mirror performance fixes across all ball implementations (`src/client/Ball.java`, `src/jfx/Ball1.java`, `src/tcpobject/Ball.java`).
