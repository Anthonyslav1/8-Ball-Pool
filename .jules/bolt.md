## 2024-05-24 - Performance optimization for potCheck distance calculations
**Learning:** Found an anti-pattern in high-frequency game loops where `Math.sqrt` was being unnecessarily used to determine exact Euclidean distance just for threshold checks.
**Action:** Replaced exact distance evaluation with squared distance comparison (`dx*dx + dy*dy <= threshold*threshold`) and cached redundant object access (`this.getCenterX()`/`this.getCenterY()`) in `potCheck` methods in `Ball.java` variants to reduce math and call overhead in tick calculations.
