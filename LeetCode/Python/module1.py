a="A"
b="B"
c="C"
def Hanoi(n,a,b,c):
    if(n==1):
        print(a,"_>",b)
        return None
    if(n==2):
        print(a,"_>",b)
        print(a,"_>",c)
        print(b,"_>",c)
        return None

    Hanoi(n-1,a,c,b)
    print(a,"_>",c)
    Hanoi(n-1,b,a,c)

Hanoi(3,a,b,c)

print("-"*30)

a=[x for x in range(1,10)]
print(a);
b=[m for m in a if m % 2 == 0]
print(b)

c=[x for x in range(1,100) if x % 10 == 0]
b=[x for x in range(1,10)]
e=[x1+x2 for x1 in c for x2 in b ]
print(e)

print("-"*30)

print(a)
if 1 in a:
    a.remove(1)
a.pop()
a.reverse()
print(a.count(2))
print(a)

print("-"*30)

print(id(a))
print(id(b))
a=b.copy()
print(id(a))
a=b
print(id(a))

print("-"*30)

t1 = (1,2,3)
#t1[1]=1   不能赋值
print (id(t1))
t2 = (4,5,6)
print (id(t2))
t1=t1+t2
print (id(t1))
print(t1)

print("-"*30)

d=dict()  #d={}    以键值对的形式出现
d={"one":1 , "two":2 , "three":3}

d1=dict(one =1,two=2 ,three=3)
d["one"]="一"
del d1["one"]
print(d)
print(d1)

if "one" in d:     #只访问键值
    print("true")
if ("two",2) in d:
    print("trur")
else:
    print("false")

for k in d.keys():
    print(k,d[k])
for k in d.values():
    print(k)
for k,v in d.items():
    print(k,"  ",v)
