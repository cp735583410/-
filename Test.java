package p1;
import java.util.Scanner;
public class Test{
	//静态变量 在主类里都可以使用
	//ID数组
	static int []id = new int [2];
	//名字数组
	static String []name = new String [2];
	//价格数组
	static double []price = new double [2];
	//数量数组
	static int []number = new int [2];
	static int count=0;
	public static void main(String[]args){
		System.out.println("欢迎使用商品信息管理系统");
		for(;;){
		    System.out.println("1.添加商品"+"      "+"2.修改信息"+"      "+"3.删除信息"+"      "+"4.查看指定信息"+"      "+"5.查看所有信息");
		    Scanner s=new Scanner(System.in);
		    int shuzu1=s.nextInt();
		    switch(shuzu1){				
			    case 1:    
			               add();break;//添加商品                
			    
				case 2:    
                           upDate();break;			//修改信息
			    
				case 3:    
                           delete();break;			        //删除信息
			    
				case 4:    selectOne();break; //查看指定信息    
				                                        
			    
				case 5:
				           selectAll();break;//查看所有信息
						   
		    }
		}
	} 
	//数组扩容
	public static void add(){
		//ID数组的扩容
		System.out.println("请输入商品ID：");
		Scanner s=new Scanner(System.in);
		int shuzu1 =s.nextInt();
		if(check(shuzu1)){
			System.out.println("error");
			return;
		}
		id[count] = shuzu1;
		id=java.util.Arrays.copyOf(id,id.length+1);
		//name 名字数组扩容
		System.out.println("请输入商品名称：");
		String shuzu2= s.next();
		name[count]=shuzu2;
		name=java.util.Arrays.copyOf(name,name.length+1);
		//价格数组的扩容
		System.out.println("请输入商品价格：");
		double shuzu3 = s.nextDouble();
		price[count] = shuzu3;
		price =java.util.Arrays.copyOf(price,price.length+1);
		//数量数组的扩容
		System.out.println("请输入商品数量");
		int shuzu4 = s.nextInt();
		number[count] = shuzu4;
		number=java.util.Arrays.copyOf(number,number.length+1);
		count++;
		System.out.println("添加成功");
		System.out.println("1.继续添加"+"        "+"2.返回上一级");
		
		int shuzu5=s.nextInt();
		
		switch(shuzu5){
			case 1:add();break;
		}
	}
	//判断 是否出现在数组中
	public static boolean check(int i){
		for(int j=0;j<id.length;j++){
			if(id[j]==i){
				return true;
			}
		}
		return false;
	}
	//查询全部
	public static void selectAll(){
		//赋值的数组留有两个空位
		for(int i=0;i<id.length-2;i++){
			System.out.println("=====================");
			System.out.println("商品的ID是"+id[i]);
			System.out.println("商品名是"+name[i]);
			System.out.println("商品的价格是"+price[i]);
			System.out.println("商品的数量是"+number[i]);
			System.out.println("=====================");
		}
	}
	//查询单个
	public static void selectOne(){
		System.out.println("请输入商品ID：");
		Scanner s=new Scanner(System.in);
		int shuzhi=s.nextInt();
		//判断shuzhi是否跟ID相同
		if(!check(shuzhi)){
			System.out.println("输入不存在");
			return;
		}
		else{
			for(int i=0;i<id.length-2;i++){
				if(id[i]==shuzhi){
					System.out.println("=====================");
			        System.out.println("商品的ID是"+id[i]);
			        System.out.println("商品名是"+name[i]);
			        System.out.println("商品的价格是"+price[i]);
			        System.out.println("商品的数量是"+number[i]);
			        System.out.println("=====================");
				}
			}
		}
	}
	//修改信息
	public static void upDate(){
		System.out.println("请输入要修改的商品ID编号");
		Scanner s=new Scanner(System.in);
		int shuzhi=s.nextInt();
		if(!check(shuzhi)){
			System.out.println("您所修改的商品信息不存在");
			return;
		}
		//找出需要修改数值的下标
		int i=-1;
		for(int j=0;j<id.length;j++){
			if(id[j]==shuzhi){
				i=j;
			}
		}
		out:for(;;){
		System.out.println("请选择修改项：   1.ID    2.名称     3.修改价格    4.修改数量    5.退出");
		int xiugai=s.nextInt();
		switch (xiugai){
			case 1:
			       System.out.println("请输入新的ID号：");
				   int newId=s.nextInt();
				   if(!check(newId)){
					   id[i]=newId;
					   System.out.println("修改成功");
				   }
				   else{
					   System.out.println("ID重复，请重新输入");
				   }
				   break;
			case 2:
                   System.out.println("请输入新的商品名：");
				   String newName=s.next();
                   name[i]=newName;
                   System.out.println("修改成功");
				   break;
            case 3:
                   System.out.println("请输入新的商品价格：");
				   double newPrice=s.nextDouble();
                   price[i]=newPrice;
                   System.out.println("修改成功");
				   break;
            case 4:
                   System.out.println("请输入新的商品数量：");
				   int newNumber=s.nextInt();
                   number[i]=newNumber;
                   System.out.println("修改成功");
				   break;
            case 5:
                   break out;			
		    }
		}
	}
	//删除信息
	public static void delete(){
		//打印ID
		System.out.println("请输入删除商品的ID");
		Scanner s=new Scanner(System.in);
		int deleteId=s.nextInt();
		//判断ID是否存在
		if(!check(deleteId)){
			System.out.println("此ID不存在");
			return;
		}
		//找到需要删除的ID数组的下标
		int i=-1;
		for(int j=0;j<id.length;j++){
			if(id[j]==deleteId){
				i=j;
			}
		}
		//把需要删除的元素，依次向前一位赋值
		//i+1代表从需要删除的下标的后一位开始循环
		for(int j=i+1;j<id.length;j++){
			id[j-1]=id[j];
			name[j-1]=name[j];
			price[j-1]=price[j];
			number[j-1]=number[j];
		}
		//四个数组的长度-1；
		id=java.util.Arrays.copyOf(id,id.length-1);
		name=java.util.Arrays.copyOf(name,name.length-1);
		price=java.util.Arrays.copyOf(price,price.length-1);
		number=java.util.Arrays.copyOf(number,number.length-1);
		count--;
	}
}