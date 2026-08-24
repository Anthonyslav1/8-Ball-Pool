## 2024-05-18 - Git Hygiene: Removing Tracked Binaries
**Learning:** When a project previously tracked build output (like `out/`), merely adding it to `.gitignore` isn't enough; it must also be removed from git cache to avoid committing newly compiled binaries.
**Action:** Always check if build directories are already tracked (`git status` or `git ls-files`). If they are, use `git rm -r --cached <dir>` after compiling to remove them from the staging area before committing.
