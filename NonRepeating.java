//Find first non repeating char in an array

Class NonRepeating
{
Public static Character firstnon(String str)
{
	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
	Int len=str.length();
	Character c;
Int i;
for(i=0;i<len;i++)
{
c=str.charAt(i);
if(hm.containsKey(c))
{
hm.put(c,hm.get(c)+1);
}
Else
hm.put(c,1);
}
}

for(i=0;i<len;i++)
{
if(hm.containsKey(str.charAt(i)))
Return str.charAt(i);
}
Return null;

}

Public static void main(String args[])
{
System.out.println(“Enter the string : ”);
Sccanner sc=new Scanner(System.in);
String s=sc.nextLine();
Char c=firstnon(s);
System.out.println(c);
}

}


