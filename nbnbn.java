package zhuoye;

import java.util.Scanner;

public class nbnbn {

	public static void main(String[] args) {
		Scanner sb=new Scanner(System.in);
				System.out.println("元素个数");
		int K=sb.nextInt();
		int e=0;
		int[]KKY=new int[K+1];
		for (int i = 0; i < K; i++) {
			System.out.println("第"+(i+1)+"个数字");
			KKY[i]=sb.nextInt();
			}
		for (int j = 0; j < K; j++) {
				
			for (int i = 0; i+j < K; i++) {
				if (KKY[j]>KKY[j+i]) {
				
			}
				else {e=KKY[j];
			KKY[j]=KKY[j+i];
			KKY[j+i]=e;
				}
				}
			}
		for (int i = 0; i < K; i++) {
			System.out.print(KKY[i]+"\t");
		}
		
		
		
		
		
		

	}

}
