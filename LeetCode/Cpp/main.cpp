#include <iostream>
#include <t1.h>
#include <string.h>

using namespace std;

class stud//声明一个类
{
    private://私有部分
        int num;
        char name[10];
        char sex;
    public://公用部分
        stud(int n,const char nam[],char s)//构造函数
        {
            num = n;
            strcpy(name, nam);
            sex = s;
        }

        ~stud() //析构函数
        {
            cout<<"stud has been destructed!"<<endl;//通过输出提示告诉我们析构函数确实被调用了
        }

    void display()//成员函数，输出对象的数据
    {
        cout<<"num:"<<num<<endl;
        cout<<"name:"<<name<<endl;
        cout<<"sex:"<<sex<<endl;
    }
};
/*

struct ListNode {
      int val;  //当前结点的值
      ListNode *next;  //指向下一个结点的指针
      ListNode(int x) : val(x), next(NULL) {}  //初始化当前结点值为x,指针为空
  };
  */
int main()
{
    t1 t;
    stud stud1(10010, "Wang-li", 'f'), stud2(10011, "Zhang-fun", 'm');//建立两个对象
    stud1.display();//输出学生1的数据
    stud2.display();//输出学生2的数据

    cout << t.sum(1,2)<< endl;
    return 0;


}



