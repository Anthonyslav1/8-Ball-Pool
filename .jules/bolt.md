## 2024-05-26 - Build Artifacts in Git
**Learning:** The project output directory (`out/`) was heavily polluting git status after compilation.
**Action:** Always verify `.gitignore` excludes `out/` and run `git rm -r --cached out/` if build artifacts are accidentally tracked.
