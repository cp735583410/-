package p1;
//����
public class Test{
	//������
	public static void main(String[]args){
		//����ȫ����ɹ�����������33ֻ��
		for(int a=0;a<=33;a++){
			//����ȫ�����ĸ����������50ֻ��
			for(int b=0;b<=50;b++){
				//����ȫ�����С����������300ֻ��
				for(int c=0;c<=300;c++){
				//���뱣֤��С������ǮΪ������
					if((a+b+c==100&&3*a+2*b+c/3==100)&&c%3==0){
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}
}