#include <iostream>
#include <t1.h>
#include <string.h>

using namespace std;

class stud//����һ����
{
    private://˽�в���
        int num;
        char name[10];
        char sex;
    public://���ò���
        stud(int n,const char nam[],char s)//���캯��
        {
            num = n;
            strcpy(name, nam);
            sex = s;
        }

        ~stud() //��������
        {
            cout<<"stud has been destructed!"<<endl;//ͨ�������ʾ����������������ȷʵ��������
        }

    void display()//��Ա������������������
    {
        cout<<"num:"<<num<<endl;
        cout<<"name:"<<name<<endl;
        cout<<"sex:"<<sex<<endl;
    }
};
/*

struct ListNode {
      int val;  //��ǰ����ֵ
      ListNode *next;  //ָ����һ������ָ��
      ListNode(int x) : val(x), next(NULL) {}  //��ʼ����ǰ���ֵΪx,ָ��Ϊ��
  };
  */
int main()
{
    t1 t;
    stud stud1(10010, "Wang-li", 'f'), stud2(10011, "Zhang-fun", 'm');//������������
    stud1.display();//���ѧ��1������
    stud2.display();//���ѧ��2������

    cout << t.sum(1,2)<< endl;
    return 0;


}



