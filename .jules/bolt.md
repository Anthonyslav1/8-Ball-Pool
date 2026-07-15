## 2026-07-15 - Added out/ to gitignore
**Learning:** The out/ directory gets heavily populated with binary files and artifacts during JavaFX builds. When committing changes, this can accidentally introduce thousands of .class and image files into git.
**Action:** Add `out/` to .gitignore and aggressively remove it using `git rm -r --cached out/` before submitting a PR to keep the patch clean.
