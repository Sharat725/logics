package stringAssignment;

class Str20{
public static void main(String[] args){
String s="12345";
String res=s.replaceAll("[0-9]","");
if(res.length()==0)
	System.out.println("only digits");
else
		System.out.println(" not only digits");
}
}