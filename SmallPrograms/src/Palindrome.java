
public class Palindrome {

	public static void main(String[] args) {
		int n=553;
		int temp=n;
		int rev=0,rem;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}System.out.println("rev no is="+rev);
if(n==rev){
	System.out.println("number is palindrome");
}else{
	System.out.println("number is not palindrome");
}
	}

}
