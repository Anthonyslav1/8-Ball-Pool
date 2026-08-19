## 2026-08-19 - Safe Refactoring With Compiled Code Issues
**Learning:** The initial commit contained tracked `.class` files and `out/` build directories. When making changes and verifying them, Git tracked changes to these files, cluttering the commit. Removing them with `git rm --cached` was necessary to avoid a massive commit delta.
**Action:** If a repository tracks build artifacts initially, always use `git rm --cached -r <dir>` (after committing/resetting) or ensure you commit safely by isolating changes to source files.
