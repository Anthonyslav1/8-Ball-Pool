## 2024-05-24 - Math.sqrt in high-frequency loops
**Learning:** Math.sqrt is an expensive operation when called repeatedly in tight loops like potCheck. We can optimize it by comparing squared distances instead of calculating the actual distance.
**Action:** Avoid Math.sqrt for simple distance comparisons (like checking if a ball is within a radius). Use squared distances (`dx*dx + dy*dy <= radius*radius`) instead.
