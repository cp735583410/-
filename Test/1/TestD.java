package p1;
public class TestD{
	public static void main(String[]args){
		a();
	}
	//����һ������ ����1~100֮��7�ı����ĺ�
	public static void a(){
		int sum=0;
		for(int i=1;i<=100;i++){
			if(i%7==0){
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}