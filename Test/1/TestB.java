package p1;
public class TestB{
	public static void main(String[]args){
		a();
	}
	public static void a(){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;	
		}
		System.out.println(sum);
	}
}