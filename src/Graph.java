import java.util.Scanner;

public class Graph {
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();//����
   int e=sc.nextInt();//��
   int max=32767;
   int arcs[][]=new int[n+1][n+1];//����ͼ
   int a[][]=new int[n+1][n+1];//������·������
   int path[][]=new int[n+1][n+1];//ǰһ����Ķ����
   
   
   public void floyd(Graph graph,int n) {
	  for(int i=1;i<=n;i++)  
		  for(int j=1;j<=n;j++) {
			  graph.a[i][j]=graph.arcs[i][j]; //���������Ȩֵ �洢����һ����ά����
			  if((i!=j)&&(a[i][j]<max)) 
				  graph.path[i][j]=i;
			  else 
				  graph.path[i][j]=0;
		  }
	      for(int k=1;k<=n;k++) {                 //��i�Ŷ��㵽j�Ŷ���ֻ����ǰk�ŵ�����·�̡�
	    	  for(int i=1;i<=n;i++)
	    		  for(int j=1;j<=n;j++)
	    			  if(graph.a[i][k]+graph.a[k][j]<graph.a[i][j]) {
	    				  graph.a[i][j]=graph.a[i][k]+graph.a[k][j];
	    				  graph.path[i][j]=graph.path[k][j];
	    			  }
	      }
	        for(int i=1;i<=n;i++)           //��ȡͼ�е����ݴ�ӡ����
	        	for(int j=1;j<=n;j++) {
	        		if(i!=j) {
	        			System.out.print(change(i)+"��"+change(j)+"��ȨֵΪ"+graph.a[i][j]);
	        		
	        			System.out.println();
	        		}
	        	}
   }
   
  
   public void add(Graph graph) {
	   int[] sum=new int[n+1];   //����һά����洢ÿ��¥����Ȩֵ
	   for(int i=0;i<n+1;i++)    //��ʼ��һλ����
	   sum[i]=0;                   
	   for(int i=1;i<=n;i++) {   //��ʼ����ÿ��¥����Ȩֵ
		   for(int j=1;j<=n;j++) {
			   if(i!=j) {
				   sum[i]=sum[i]+graph.a[i][j];
			   }
		   }
		   System.out.println();
		   if(sum[i]>30000) {           //�ж���������Ƿ�Ϊͨ·
			    System.out.print(change(i)+"�޷����������");
		   }else {
			   System.out.print(change(i)+"���������Ȩֵ�ܺ�Ϊ"+sum[i]);
		   }
		  
		   System.out.println();
	   }
	   sum[0]=sum[1];
	   int address=1;
	   for(int i=2;i<n+1;i++)    //���� ��С����
		   if(sum[0]>sum[i]) {
			   sum[0]=sum[i];
			   address=i;
		   }
	   System.out.println("������СȨֵ�ܺ�Ϊ"+sum[0]+","+"ѧԺ���е����ѡַΪ����"+change(address));
      System.out.println("(Ȩֵ�ܺ�ԽС����ô�����Խ��)");
   }
   
   
   public static String change(int i) {        //������ת��Ϊ��ĸ
		String str=null;
		switch(i) {
		case 1:
			return "A";
		case 2:
			return "B";
		case 3:
			return "C";
		case 4:
			return "D";
		case 5:
			return "E";
		case 6:
			return "F";
		case 7:
			return "G";
		case 8:
			return "H";
		case 9:
			return "I";
		case 10:
			return "J";
		case 11:
			return "K";
		case 12:
			return "L";
		case 13:
			return "M";
		case 14:
			return "N";
		case 15:
			return "O";
		case 16:
			return "P";
		}
		return str;
	}
}
