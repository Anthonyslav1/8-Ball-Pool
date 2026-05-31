## 2024-05-18 - Math.sqrt in Game Loops
**Learning:** Found unconditional `Math.sqrt` calls being executed for every pocket during every game loop frame in the `Ball` classes (`jfx.Ball1`, `client.Ball`, `tcpobject.Ball`), accompanied by repetitive un-cached method calls like `getCenterX()`.
**Action:** Replace `Math.sqrt(dx*dx + dy*dy) <= r` with `dx*dx + dy*dy <= r*r` in high-frequency loops. Short-circuit loops early when possible. Also, ensure method results are cached locally inside loops when they are static across iterations.
