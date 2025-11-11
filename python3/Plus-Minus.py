# Problem: Plus Minus
# Language: python3
# Submitted: 2025-11-11 23:59:40
# Challenge ID: plus-minus
# URL: https://www.hackerrank.com/challenges/plus-minus
# Difficulty: Easy
# Tags: math
#

def plusMinus(arr):
    n = len(arr)
    pos = sum(1 for x in arr if x > 0)
    neg = sum(1 for x in arr if x < 0)
    zero = sum(1 for x in arr if x == 0)
    print(f"{pos/n:.6f}")
    print(f"{neg/n:.6f}")
    print(f"{zero/n:.6f}")