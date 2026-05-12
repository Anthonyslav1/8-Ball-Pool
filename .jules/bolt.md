## 2024-05-19 - Duplicate Logic in High-Frequency Game Loops
**Learning:** The codebase copies game physics logic (like `potCheck`) across multiple files (`client/Ball.java`, `jfx/Ball1.java`, `tcpobject/Ball.java`). Optimizations must be applied simultaneously to all instances to be fully effective, otherwise parts of the app (client, UI, network server) will run with unoptimized physics.
**Action:** When finding a performance anti-pattern (like unconditional `Math.sqrt` usage), always `grep` for the method name across the entire `src/` directory to ensure all duplicate classes receive the fix.

## 2024-05-19 - Build Artifact Pollution
**Learning:** The `out/` directory is not excluded in `.gitignore`. Running compilation drops `.class` files into the tree, which can accidentally be checked into git and bloat PRs if `git add .` is used blindly.
**Action:** Always clean the `out/` directory (`rm -rf out/`) after headless verification and manually select which files to stage using `git add src/...` to ensure binary artifacts are never committed.
