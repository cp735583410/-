package p1;
public class TestB{
	public static void main(String[]args){
		//�ȶ���һ����λ����
		for(int n=100;n<=999;n++){
			//��ѭ����λ��
			for(int a=n%10;a<10;a++){
				//ѭ��ʮλ��
				for(int b=n/10%10;b<10;b++){
					//ѭ����λ��
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