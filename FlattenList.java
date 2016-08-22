//Flatten List

Class FlattenList(){

Public node flattenlist(node head){
if (head==null)
Return head;
List<node>queue=new List<node>();
Node curr=head;
while(curr!=null)
{
while(curr.next)
{
if(curr.child){
queue.add(curr.child)
}
curr=curr.next;
}
if(curr.next==null && curr.child!=null)
{
queue.add(curr.child)
}
}
if(queue.size()!=null)
{
curr.next=queue.remove(0);
}
curr=curr.next;

}
Return head;
}

}


