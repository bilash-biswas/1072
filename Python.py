c=0
d=0
a=int(input())
if a<10000:
    for i in range(0,a):
        b=int(input())
        if b>=10 and b<=20:
            c=c+1
        else:
            d=d+1
print("{} in".format(c))
print("{} out".format(d))
