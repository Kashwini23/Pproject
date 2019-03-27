
public class RevString {

	public static void main(String[] args) {
	String s="Madam";
	int len=s.length();
	String rev="";
	for(int i=len-1;i>=0;i--){
		rev=rev+s.charAt(i);
	}System.out.println(rev);
if(rev.equals(s)){System.out.println("palindrome");}
else{System.out.println("NP");}
	}

}
