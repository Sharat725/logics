package stringAssignment;

class Str29{
	public static void main(String[] args){
		String s="Good Morning";
		System.out.println(s.replaceAll("[^a-z]","").length());
	}
}