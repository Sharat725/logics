package stringAssignment;

class Str25{
	public static void main(String[] args){
		String s="#$%^";
		System.out.println(s.replaceAll("[^a-zA-Z0-9]","@"));
	}
}