package p1;
public class Test{
	//����һ����ά���飬���ұ���������
	public static void main(String[]args){
		int [][]a={{6,6,6},{7,7,7},{8,8,8},{9,9,9}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}