## 2024-05-24 - Avoiding Math.sqrt in high-frequency game loops
**Learning:** Replacing Math.sqrt with squared distance comparisons significantly improves performance in tight execution loops like `potCheck` collision detection.
**Action:** Always prefer squared Euclidean distance checks (dx*dx + dy*dy <= radius*radius) and short-circuiting over calculating absolute distance with Math.sqrt in game logic.
