//Binary Search Implementation

Class BinarySearch
{
Public boolean binary(int []arr, int start,int end,int target)
{
if(start>end)
{ 
return false;
}
Int mid=(start+end)/2;
if(mid==target)
{
Return true;

}
Else if(mid>target)
{
Return binary(arr,start,mid,target);
}

Else if(target>mid)
{
Return binary(arr,mid+1,start,target);
}
}

}

Class Demo
{
Public static void main(String args[])
{

Int arr[]=new int[1,2,3,4,5,6];
Int start=0;
Int end=5;
Int target=4;
BinarySearch bs=new binarySearch();
bs.binary(arr,start,end,target);
}
}
