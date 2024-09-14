x=open("input.txt",mode='r')
y=open("output.txt",mode='w')
a=x.readlines()
for b in a:
    y.write(b)
x.close()
y.close()