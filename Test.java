package p1;
import java.util.Scanner;
public class Test{
	//��̬���� �������ﶼ����ʹ��
	//ID����
	static int []id = new int [2];
	//��������
	static String []name = new String [2];
	//�۸�����
	static double []price = new double [2];
	//��������
	static int []number = new int [2];
	static int count=0;
	public static void main(String[]args){
		System.out.println("��ӭʹ����Ʒ��Ϣ����ϵͳ");
		for(;;){
		    System.out.println("1.�����Ʒ"+"      "+"2.�޸���Ϣ"+"      "+"3.ɾ����Ϣ"+"      "+"4.�鿴ָ����Ϣ"+"      "+"5.�鿴������Ϣ");
		    Scanner s=new Scanner(System.in);
		    int shuzu1=s.nextInt();
		    switch(shuzu1){				
			    case 1:    
			               add();break;//�����Ʒ                
			    
				case 2:    
                           upDate();break;			//�޸���Ϣ
			    
				case 3:    
                           delete();break;			        //ɾ����Ϣ
			    
				case 4:    selectOne();break; //�鿴ָ����Ϣ    
				                                        
			    
				case 5:
				           selectAll();break;//�鿴������Ϣ
						   
		    }
		}
	} 
	//��������
	public static void add(){
		//ID���������
		System.out.println("��������ƷID��");
		Scanner s=new Scanner(System.in);
		int shuzu1 =s.nextInt();
		if(check(shuzu1)){
			System.out.println("error");
			return;
		}
		id[count] = shuzu1;
		id=java.util.Arrays.copyOf(id,id.length+1);
		//name ������������
		System.out.println("��������Ʒ���ƣ�");
		String shuzu2= s.next();
		name[count]=shuzu2;
		name=java.util.Arrays.copyOf(name,name.length+1);
		//�۸����������
		System.out.println("��������Ʒ�۸�");
		double shuzu3 = s.nextDouble();
		price[count] = shuzu3;
		price =java.util.Arrays.copyOf(price,price.length+1);
		//�������������
		System.out.println("��������Ʒ����");
		int shuzu4 = s.nextInt();
		number[count] = shuzu4;
		number=java.util.Arrays.copyOf(number,number.length+1);
		count++;
		System.out.println("��ӳɹ�");
		System.out.println("1.�������"+"        "+"2.������һ��");
		
		int shuzu5=s.nextInt();
		
		switch(shuzu5){
			case 1:add();break;
		}
	}
	//�ж� �Ƿ������������
	public static boolean check(int i){
		for(int j=0;j<id.length;j++){
			if(id[j]==i){
				return true;
			}
		}
		return false;
	}
	//��ѯȫ��
	public static void selectAll(){
		//��ֵ����������������λ
		for(int i=0;i<id.length-2;i++){
			System.out.println("=====================");
			System.out.println("��Ʒ��ID��"+id[i]);
			System.out.println("��Ʒ����"+name[i]);
			System.out.println("��Ʒ�ļ۸���"+price[i]);
			System.out.println("��Ʒ��������"+number[i]);
			System.out.println("=====================");
		}
	}
	//��ѯ����
	public static void selectOne(){
		System.out.println("��������ƷID��");
		Scanner s=new Scanner(System.in);
		int shuzhi=s.nextInt();
		//�ж�shuzhi�Ƿ��ID��ͬ
		if(!check(shuzhi)){
			System.out.println("���벻����");
			return;
		}
		else{
			for(int i=0;i<id.length-2;i++){
				if(id[i]==shuzhi){
					System.out.println("=====================");
			        System.out.println("��Ʒ��ID��"+id[i]);
			        System.out.println("��Ʒ����"+name[i]);
			        System.out.println("��Ʒ�ļ۸���"+price[i]);
			        System.out.println("��Ʒ��������"+number[i]);
			        System.out.println("=====================");
				}
			}
		}
	}
	//�޸���Ϣ
	public static void upDate(){
		System.out.println("������Ҫ�޸ĵ���ƷID���");
		Scanner s=new Scanner(System.in);
		int shuzhi=s.nextInt();
		if(!check(shuzhi)){
			System.out.println("�����޸ĵ���Ʒ��Ϣ������");
			return;
		}
		//�ҳ���Ҫ�޸���ֵ���±�
		int i=-1;
		for(int j=0;j<id.length;j++){
			if(id[j]==shuzhi){
				i=j;
			}
		}
		out:for(;;){
		System.out.println("��ѡ���޸��   1.ID    2.����     3.�޸ļ۸�    4.�޸�����    5.�˳�");
		int xiugai=s.nextInt();
		switch (xiugai){
			case 1:
			       System.out.println("�������µ�ID�ţ�");
				   int newId=s.nextInt();
				   if(!check(newId)){
					   id[i]=newId;
					   System.out.println("�޸ĳɹ�");
				   }
				   else{
					   System.out.println("ID�ظ�������������");
				   }
				   break;
			case 2:
                   System.out.println("�������µ���Ʒ����");
				   String newName=s.next();
                   name[i]=newName;
                   System.out.println("�޸ĳɹ�");
				   break;
            case 3:
                   System.out.println("�������µ���Ʒ�۸�");
				   double newPrice=s.nextDouble();
                   price[i]=newPrice;
                   System.out.println("�޸ĳɹ�");
				   break;
            case 4:
                   System.out.println("�������µ���Ʒ������");
				   int newNumber=s.nextInt();
                   number[i]=newNumber;
                   System.out.println("�޸ĳɹ�");
				   break;
            case 5:
                   break out;			
		    }
		}
	}
	//ɾ����Ϣ
	public static void delete(){
		//��ӡID
		System.out.println("������ɾ����Ʒ��ID");
		Scanner s=new Scanner(System.in);
		int deleteId=s.nextInt();
		//�ж�ID�Ƿ����
		if(!check(deleteId)){
			System.out.println("��ID������");
			return;
		}
		//�ҵ���Ҫɾ����ID������±�
		int i=-1;
		for(int j=0;j<id.length;j++){
			if(id[j]==deleteId){
				i=j;
			}
		}
		//����Ҫɾ����Ԫ�أ�������ǰһλ��ֵ
		//i+1�������Ҫɾ�����±�ĺ�һλ��ʼѭ��
		for(int j=i+1;j<id.length;j++){
			id[j-1]=id[j];
			name[j-1]=name[j];
			price[j-1]=price[j];
			number[j-1]=number[j];
		}
		//�ĸ�����ĳ���-1��
		id=java.util.Arrays.copyOf(id,id.length-1);
		name=java.util.Arrays.copyOf(name,name.length-1);
		price=java.util.Arrays.copyOf(price,price.length-1);
		number=java.util.Arrays.copyOf(number,number.length-1);
		count--;
	}
}