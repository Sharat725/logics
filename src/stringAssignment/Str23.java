package stringAssignment;

class Str23{
public static void main(String[] args){
String s="good1234morning";
String res=s.replaceAll("[A-z,a-z,0-9]","");
if(res.length()==0)
	System.out.println("only alphanumeric");
else
		System.out.println(" not only alphanumeric");
}
}