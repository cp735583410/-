package p1;
public class TestA{
	public static void main(String[]args){
		//����ֻ��Ҫ���˰��ˣ��������Ҫ9�ˣ�
		for(int a=0;a<=9;a++){
			//����ֻ��ҪŮ�˰��ˣ��������Ҫ12�ˣ�
			for(int b=0;b<=12;b++){
				//����ֻ��ҪС�����ˣ�����Ҫ���72��С����
				for(int c=0;c<=72;c++){
					if(4*a+3*b+c/2==36&&c%2==0){
						System.out.println(a+" "+b+" "+c);
					}
				}
			}
		}
	}
}