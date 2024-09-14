
x= 'input.txt'
y = 'output.txt'

with open(x, 'r') as infile:
    a= infile.read()

with open(y, 'w') as outfile:
    outfile.write(a)

print("successful")
