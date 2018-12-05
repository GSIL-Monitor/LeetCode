#include "t1.h"
#include "ListNode.h"

t1::t1()
{
    //ctor¹¹Ôìº¯Êý
}

int t1::sum(int a , int b)
{
    return a+b;
}

ListNode* t1::mergeTwoLists (ListNode *l1 , ListNode *l2){
    ListNode *preHead = new ListNode(0);
    ListNode *cur = preHead;
    while (l1 != nullptr && l2 != nullptr){
        if(l1->val <= l2->val){
        cur->next = l1;
        l1 = l1->next;
        if(l1 == nullptr){
            cur->next = l2;
            return preHead->next;
         }
        }else{
         cur->next = l2;
         l2 = l2->next;
         if(l2 == nullptr){
            cur->next = l1;
            return preHead->next;
         }
        }
        cur = cur->next;
    }
    return l1 == nullptr? l2:l1;
}


