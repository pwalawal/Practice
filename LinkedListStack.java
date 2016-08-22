//Linked List as Stack

class LinkedList<T>()
{
	Private static class node<T>()
	{
		Private final T data;
		private  final node<T> next;
		
		Public node(T data)
{
this.data=data;
}
@overide
Public string toString()
{
Return data.toString();
}
		
	}
Private Node<T >first=null;

Public void insert(T data){
Node<T> temp=new Node<T>(data);
temp.next=first;
first=temp;

}

Public T remove(){
Node<T> temp=first;
first=first.next;
Return temp.data;

}

@override
Public string toString(){
StringBuilder builder=new StringBuilder();
Node <T>current=first;
while(current!=null)
{
builder.append(current).append(“”);
current=current.next;}
Return builder.toString();

}
}

Class Stack<T>()
{

Private final LinkedList<T> linklist=new LinkedList<T>();

Public void push(T data)
{
LiskList.insert(data);
}
Public T pop(){
Return LinkList.remove();
}

@override
Public string toString()
{
Return Linklist.toString();
]

}

Public class demo
{

Public static void main(String args[])
{
Stack<T> st=new Stack<T>()
st.push(10);
st.pop();s
}
}


