package p1;
public class TestA{
	public static void main(String[]args){
		//假设只需要男人搬运，则最多需要9人；
		for(int a=0;a<=9;a++){
			//假设只需要女人搬运，则最多需要12人；
			for(int b=0;b<=12;b++){
				//假设只需要小孩搬运，则需要最多72个小孩；
				for(int c=0;c<=72;c++){
					if(4*a+3*b+c/2==36&&c%2==0){
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}
}