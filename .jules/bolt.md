## 2024-06-25 - Avoid Math.sqrt in High-Frequency Game Loops
**Learning:** In JavaFX games like this, `Math.sqrt` inside tight loops (like `potCheck`) introduces unnecessary CPU overhead and was found to be an anti-pattern for this codebase's architecture.
**Action:** Always replace exact Euclidean distance checks with squared distance comparisons (`dx*dx + dy*dy <= radius*radius`) for collision or pocket detection.
