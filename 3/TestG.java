package p1;
//主类
public class TestG{
	//主函数
	public static void main(String[]args){
		//for循环先赋值语句，再判断条件，再执行循环体，最后执行语句；
		for(int i=1;i<=100;i++){
			//不包括7和7的倍数，以及个位数和十位数不为7的所有数字
			if((i%7!=0)&&(i%10!=7&&i/10%10!=7)){
				System.out.println(i);
			}
		}
	}
}