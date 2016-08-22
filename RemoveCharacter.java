//Remove specified characters in string

Class RemoveStrings()
{
Public static string removestr(String str,String sub)
{
Char org=str.toCharArray();
Char temp=sub.toCharArray();
String answer=’’”;
HashSet <Character > hs=new HashSet();
for(int i=0;i<sub.length();i++)
{
hs.put(sub[i]);
}

for(int j=0;j<org.length();j++)
{
if(!hs.contains(org[j]))
{
answer=answer+org[i];
}
}

Return answer;

}
Public static void main(String args[])
{
System.out.println(“Enter the string : ”);
Sccanner sc=new Scanner(System.in);
String s=sc.nextLine();
System.out.println(“Enter the specified string : ”);
String st=sc.nextLine();
string c=removestr(s,st);
System.out.println(c);
}


}

