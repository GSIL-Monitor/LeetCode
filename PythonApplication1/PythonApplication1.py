#注释
'''
注释
'''
num=10
num1=0b100;
print(num)
print(num1)

str1="I am %s,I am %d years old"
print(str1%("liyukun",23))

str2="I am {0},and I am {1} years old".format("liyukun",23)
str3="I am {0},and I am {1} years old"
str3.format("liyukun",23)
str4="I am {name},and I am {age} years old".format(name="liyukun",age=23)
print(str2)
print(str3)
print(str4)

age=input("输入年龄：")
age=int(age)
if age>=18:
    print("大于18")
else:
    print("小于18")

for i in range(0,10):
    if i%2==1:
        continue
    else:
        print(i);

def func(person):
    print("it is {0}".format(person))
    return person

name = "liykun"
result=func(name)
print(result)

def stu(name , age , *args, hobby="女",**kwargs):
    print("个人信息如下:")
    print("我的名字是{0}，我的年龄是{1}，我的爱好是{2}".format(name,age,hobby))
    print(type(args))
    for i in args:
        print(i)
    print(type(kwargs))
    for i,k in kwargs.items():
        print(i,"---",k)

name1 = "liyukun"
age1 = 18;
stu(name1,age1,"我很帅","我有钱",hobby="男",addr="beijing",gender="mele") 
print("*"*50)

v1=1;
def fun1():
    global v1
    v1+=1;
    print(v1)
    fun1()
fun1()