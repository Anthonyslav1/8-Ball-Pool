## 2024-05-24 - Math.sqrt in high-frequency game loops
**Learning:** This codebase uses exact Euclidean distance (`Math.sqrt`) unconditionally in high-frequency game loops like `potCheck()` across multiple duplicate `Ball` classes. This is an unnecessary performance overhead when only checking if distance is below a threshold.
**Action:** Always prefer short-circuiting logic and squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision and pocket detection to avoid the computationally expensive `Math.sqrt` operation.
