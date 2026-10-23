import math
import time

def slow_check(x, y):
    dis1 = math.sqrt(x*x + y*y)
    return dis1 <= 9

def fast_check(x, y):
    return (x*x + y*y) <= 81

start = time.time()
for _ in range(10000000):
    slow_check(5.0, 5.0)
print(f"Math.sqrt: {time.time() - start:.3f}s")

start = time.time()
for _ in range(10000000):
    fast_check(5.0, 5.0)
print(f"Squared dist: {time.time() - start:.3f}s")
