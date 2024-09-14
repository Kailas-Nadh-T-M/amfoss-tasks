x = int(input("Enter the number of lines for the upper half of the diamond: "))

if x > 0:
    for i in range(x):
        print(' ' * (x - i - 1) + '*' * (i * 2 + 1))
    
    for i in range(x - 2, -1, -1):
        print(' ' * (x - i - 1) + '*' * (i * 2 + 1))
else:
    print("Please enter a positive integer.")
