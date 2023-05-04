import java.io.*;
import java.util.*;
public class caesar
{
public static final String alphabet="abcdefghijklmnopqrstuvwxyz";
public static void main(String[] arg)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the plaintext:");
String plaintext=sc.nextLine();
System.out.println("enter the key value:");
int key=sc.nextInt();
String cipher="";
System.out.println("select choice for encryption and decryption(1/2):");
int sw=sc.nextInt();
switch(sw)
{
case 1:
for(int i=0;i<plaintext.length();i++)
{
int chars=alphabet.indexOf(plaintext.charAt(i));
int keyvalue=(key+chars)%26;
char replace=alphabet.charAt(keyvalue);
cipher+=replace;
}
System.out.println("cipher text is: "+cipher);
break;
case 2:
for(int i=0;i<cipher.length();i++)
{
int chars=alphabet.indexOf(cipher.charAt(i));
int keyvalue=(chars-key)%26;
if(keyvalue<0)
{
  keyvalue=alphabet.length()+keyvalue;
}
char replace=alphabet.charAt(keyvalue);
plaintext+=cipher;
}
System.out.println("plain text is:"+plaintext);
}
}
}