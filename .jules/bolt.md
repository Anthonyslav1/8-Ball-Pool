## 2026-09-01 - [Avoid Math.sqrt in high-frequency loops]
**Learning:** Found explicit use of Math.sqrt in potCheck() in multiple Ball classes. As memory suggests, converting this to squared distance comparison (e.g., dx*dx + dy*dy <= 81) yields a ~10-12% performance improvement. Additionally, caching pocket coordinates or delta coordinates can save recomputation.
**Action:** Replace Math.sqrt with squared distance comparisons for all pot checks in src/client/Ball.java, src/jfx/Ball1.java, and src/tcpobject/Ball.java.
