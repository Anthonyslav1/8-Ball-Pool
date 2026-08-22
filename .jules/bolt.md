## 2024-05-24 - Git History Assumptions
**Learning:** The repository only contains a single initial commit, and `git reset` or `git commit --amend` should be avoided when managing uncommitted files to prevent accidentally manipulating or losing the original root commit.
**Action:** Always use `git rm --cached` or `git restore --staged` to carefully manage the staging area instead of attempting to rewrite history or unstage commits when tracking binary files by mistake.
