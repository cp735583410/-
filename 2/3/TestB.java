package p1;
public class TestB{
	public static void main(String[]args){
		add(100);
		System.out.println(add(100));
	}
	/**дһ�������������ͷ���ֵ���˺����������ڼ���1~100֮��3�ı���
	  ����Ҳ��5�ı�����������֮�Ͳ����ظý�����������ô���ӡ
	 */
	public static int add(int n){
		int sum=0;
		for(int i=1;i<=n;i++){
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		return sum;
	}
}