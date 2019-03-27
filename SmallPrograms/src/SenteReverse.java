
public class SenteReverse {

	public static void main(String[] args) {
	String s="hello java";
String a[]=s.split("");
for(int i=0;i<a.length;i++){
	//System.out.print(a[i]+" ");
}
for(int i=a.length-1;i>=0;i--){
	System.out.print(a[i]);
}
	}

}
