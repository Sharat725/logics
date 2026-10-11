package stringAssignment;

class Str22{
public static void main(String[] args){
String s="ABCDEFGH123";
String res=s.replaceAll("[A-z,a-z]","");
if(res.length()==0)
	System.out.println("only alphabets");
else
		System.out.println(" not only alphabets");
}
}