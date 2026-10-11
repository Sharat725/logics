package stringAssignment;

class Str26{
	public static void main(String[] args){
		String s="good#$%^ morning$%^";
		System.out.println(s.replaceAll("[a-zA-Z0-9 ]","").length());
	}
}