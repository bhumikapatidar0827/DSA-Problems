import java.util.*;
class bhumi{
	public static void main(String ar[])throws Exception{
		//Scanner sc =new Scanner(System.in);
	String s1="bhmk";
	int c=0;
	for(int i=0;i<s1.length();i++){
		if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'||s1.charAt(i)=='a'||s1.charAt(i)=='e'||
		s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u'){
			c=1;
		}
	}
	if(c==1){
		System.out.println("true");
	}
	else{
		System.out.println("false");
	}
}}
		