package p1;
//主类
public class Test{
	//主函数
	public static void main(String[]args){
		//假设全部买成公鸡，可以买33只；
		for(int a=0;a<=33;a++){
			//假设全部买成母鸡，可以买50只；
			for(int b=0;b<=50;b++){
				//假设全部买成小鸡，可以买300只；
				for(int c=0;c<=300;c++){
				//必须保证买小鸡花的钱为整数；
					if((a+b+c==100&&3*a+2*b+c/3==100)&&c%3==0){
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}
}