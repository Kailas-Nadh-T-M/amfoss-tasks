with open('input.txt', 'r') as infile:
    x = int(infile.read().strip())

y = []

if x > 0:
    for i in range(x):
        line = ' ' * (x - i - 1) + '*' * (2 * i + 1)
        y.append(line)
    
    for i in range(x - 2, -1, -1):
        line = ' ' * (x - i - 1) + '*' * (2 * i + 1)
        y.append(line)
else:
    y.append("Please enter a positive integer.")

with open('output.txt', 'w') as outfile:
    for line in y:
        outfile.write(line + '\n')
