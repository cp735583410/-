package p1;
public class TestJ{
	public static void main(String[]args){
		//���ص��������ô���ӡ
		if(n(2)){
			System.out.println("��");
		}
		else{
			System.out.println("����");
		}
	}
	//дһ����������һ�����Ͳ���n���˺��������ж�n�Ƿ���һ������6��ż��	
	public static boolean n(int n){
		if(n%2==0&&n<6){
			return true;
		}
		else{
			return false;
		    }		
	}
}