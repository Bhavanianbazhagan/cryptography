import java.io.*;
import java.util.*;
public class affine1
{
public static String encryption(String pt)
{
int a=2,b=3;
String cxt=" ";
for(int i=0;i< pt.length();i++)
{
cxt=cxt+(char) ((((a*pt.charAt(i))+b) % 26) +65);
}
return cxt;
}
public static String decryption(String cxt)
{
int a=2,b=3;
String pt=" ";
int flag=0;
int a_inv=0;
for(int i=0;i<26;i++)
{
flag=(a*i)%26;
if(flag==1)
{
a_inv=i;
System.out.println(i);
}
}
for(int i=0;i< cxt.length();i++)
{
if(cxt.charAt(i)=='a'&& cxt.charAt(i)=='e')
{
System.out.println(cxt.replace('a','b'));
System.out.println(cxt.replace('e','u'));
}
pt=pt+(char) ((((a*pt.charAt(i))-b) % 26) +65);
}
return pt;
}
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a message:");
String message=sc.nextLine();
System.out.println("The encrypted text is: "+encryption(message));
System.out.println("The decrypted text is: "+decryption(message));
sc.close();
}
}