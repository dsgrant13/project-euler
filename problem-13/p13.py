#p13.py
#python solution to project euler p13
#Danny Grant
#God I love Python

total = 0
numbers = open('bignums.txt', 'r')

for number in numbers:
    total += int(number)

answer = str(total)[0:10]

print answer
