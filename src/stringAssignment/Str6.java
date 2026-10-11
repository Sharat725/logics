package stringAssignment;

class Str6{
	public static void main(String[] args){
		String s="go342#$%34od mo#$%r8984&^ning";
		System.out.println(s.replaceAll("[^a-z0-9]",""));
	}
}