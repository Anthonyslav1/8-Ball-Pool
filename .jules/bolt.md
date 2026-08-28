## 2024-05-30 - Cached build output staged with source
**Learning:** Even if `out/` is added to `.gitignore` *before* compiling, existing tracked elements in `out/` or complex staging scenarios might require forced cache removal to avoid committing binaries.
**Action:** Always run `git rm -r --cached out/ || true` after compiling and before committing, regardless of gitignore.
