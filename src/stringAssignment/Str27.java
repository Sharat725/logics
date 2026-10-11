package stringAssignment;

class Str27{
	public static void main(String[] args){
		String s="good morning";
		System.out.println(s.replaceAll("[^a-zA-Z]","").length());
	}
}