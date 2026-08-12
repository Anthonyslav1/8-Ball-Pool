## 2024-05-24 - Math.sqrt in high-frequency loops
**Learning:** This codebase relies on `Math.sqrt()` for checking ball distances in `potCheck()` methods, which runs extremely frequently. Using exact Euclidean distance here is an anti-pattern.
**Action:** Replace `Math.sqrt()` with squared distance checks (`dx*dx + dy*dy <= radius*radius`) in performance-critical game loops. Caching coordinate getter methods into local variables also helps.

## 2024-05-24 - Repository hygiene for build artifacts
**Learning:** The project compiles into the `out/` directory, which is not in `.gitignore` by default. Accidentally staging it creates massive commits of binary `.class` files.
**Action:** Always ensure `out/` is gitignored before compiling. If staged accidentally, use `git reset HEAD out/` and delete the directory (`rm -rf out`) before committing.
