package p1;
public class TestF{
	public static void main(String[]args){
		a();
	}
	//����һ���������ڴ�ӡ1~100֮������3�ı�������Ҳ��5�ı�����������
	public static void a(){
		for(int i=1;i<=100;i++){
			if(i%3==0&&i%5==0){
				System.out.println(i);
			}
		}
	}
}