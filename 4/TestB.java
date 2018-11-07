package p1;
public class TestB{
	public static void main(String[]args){
		//先定义一个三位数。
		for(int n=100;n<=999;n++){
			//先循环个位数
			for(int a=n%10;a<10;a++){
				//循环十位数
				for(int b=n/10%10;b<10;b++){
					//循环百位数
					for(int c=n/100;c<10;c++){
						if((a*a*a+b*b*b+c*c*c==n&&a==n%10)&&(b==n/10%10&&c==n/100)){
							System.out.println(n);
						}
					}
				}
			}
		}
	}
}