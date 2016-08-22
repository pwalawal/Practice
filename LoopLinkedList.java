//Detect a loop in linked list
//This is using two pointers, also can be done using hashset, where visited node is added to hashset and then checked.


Class LinkedList()
{
Private Class node()
{
Node next;
Int data;

node(int data)
{
this.data=data;
}

}

Private  node head=null;

Public void insert(int data){

Node temp=new Node(data);
trmp.next=head;
head =temp;

}


Public detect(node head)
{
Node slow=head;
Node fast=head;

while(slow!=null && fast!=null && fast.next!=null)
{
slow=slow.next;
fast=fast.next.next;
if(slow==fast)
{
Return 1;
}

}
Return 0;


}

}

