package stringAssignment;

class Str28{
	public static void main(String[] args){
		String s="Good Morning";
		System.out.println(s.replaceAll("[^A-Z]","").length());
	}
}