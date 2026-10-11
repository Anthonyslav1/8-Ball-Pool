## 2024-10-11 - Replace Math.sqrt with squared distance in high-frequency potCheck loops
**Learning:** Calculating exact Euclidean distance unconditionally via Math.sqrt in game loop methods like potCheck() is a performance anti-pattern.
**Action:** Use squared distance checks without Math.sqrt to improve performance (~11-12% gain) and cache repetitive calls like getCenterX/Y.
