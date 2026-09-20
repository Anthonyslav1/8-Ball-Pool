## 2024-05-15 - Unintentional Build Artifact Staging
**Learning:** Build artifacts (`out/`) that are incorrectly added and committed can pollute the repository and cause blocking merge issues, even if they are eventually gitignored. We must ensure the `out/` directory is gitignored and removed from the Git index before compiling and pushing changes.
**Action:** Always make sure `out/` is gitignored *before* compilation, and clear any accidentally staged build files using `git rm -r --cached out/`.
