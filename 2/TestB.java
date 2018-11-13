package p1;
public class TestB{
	public static void main(String[]args){
		a(100);
	}
	public static void a(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%2==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}