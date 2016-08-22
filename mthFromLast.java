//Find Mth Node from Last

Class LinkedList<T>()
{
Private class Node<T>(){
Private final T data;
Private final Node<T> next;

Public Node(T data){
this.data=data

}
}

Private Node<T> first=null;
Public void insert(T data){

Private Node<T> temp=new Node<T>(data);
temp.next=first;
first=temp;

}

Void printmth(int m)
{
Int len=0;
Node<T> temp=head;
While (len<m)
{
if(temp.next)
temp=temp.next;
Else 
return null;

}

Node<T> m=head;
while(temp.next)
{
temp=temp.next;
m=m.next
}
System.out.println(m.data);

}

}
Class demo()
{
Public static void main(String args[])
{
LinkedList<T>ll=new LinkedList();
ll.insert(33);
ll.printmth(1);
}
}
