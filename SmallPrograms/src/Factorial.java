import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
	int n=4;
	int fact=1;
	for(int i=1;i<=n;i++){
		fact=fact*i;
		
	}
	/*BigInteger fact=BigInteger.ONE;
	for(int i=1;i<=n;i++){
		fact=fact.multiply(BigInteger.valueOf(i));
	}*/
		System.out.println(fact);
	

	}

}
