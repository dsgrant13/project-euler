"""
problem2.py
Daniel Grant
python solution to problem 2 project euler
"""

def memo(f):
    cache = {}
    def memoized(n):
        if n not in cache:
            cache[n] = f(n)
        return cache[n]
    return memoized

def fib(n):
    if n == 0:
        return 1
    if n == 1:
        return 1
    return fib(n-1) + fib(n-2)

fast_fib = memo(fib)

i, total = 0, 0
while True:
    term = fast_fib(i)
    if term > 4000000:
        break
    if term % 2 == 0:
        total += term
    i += 1

print total
