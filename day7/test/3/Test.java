package p1;
public class Test{
	//定义一个二维数组，并且遍历该数组
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