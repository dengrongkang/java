package com.nuesoft.test;

import java.util.Arrays;
import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Arr {
	public static void main(String[] args) {
		/*int array[]=new int[4];
		int[] array1 = null;
		int array2[]=new int[]{1,2,3,4};
		int array3[]={1,2,3,4,5};
		char arr[]= {'a','A'};
		System.out.println(arr[1]);
		System.out.println(array1);
		for (int i=0;i<arr.length;i++)
			System.out.println(arr[i]);*/
		/*int arr1[]= {5,500,64,78,3,1};
		int arr2[]=new int[10];
		System.arraycopy(arr1, 0, arr2, 4, arr1.length);//将一个数组copy到另一个长度大的数组里面
		Arrays.sort(arr2,5,8);//默认全部升序排列，sort排序法
		System.out.println(Arrays.toString(arr2));*/
		/*char arr3[]= {'j','y','g','a'};
		char arr4[]=new char[10];
		arr4=Arrays.copyOf(arr3,arr3.length);//copy法
		System.out.println(arr4);
		Arrays.sort(arr3);
		System.arraycopy(arr3,0,arr4,0,arr3.length);
		System.out.println(arr4);*/
		//bubble sort
		Scanner scanner=new Scanner(System.in);
		String arr[]=new String[5];
		arr=scanner.next().split(",");//可以超出数组长度
		int srr1[]=new int[4];
		srr1[0]=1 ;
		srr1[1]=1 ;
		srr1[2]=1 ;
		srr1[3]=1 ;
//		srr1[4]=5 ;//这个就不能超出数组长度
		System.out.println(arr[5]);
		System.out.println(Arrays.toString(srr1));
		System.out.println(Arrays.toString(arr));
		/*for (int i=0;i<10;i++) {
			System.out.println("输入第"+i+"个数:");
			arr[i]=scanner.nextInt();
		}*/
		/*String str=scanner.next();
		String str1[]=str.split(",");
		System.out.println(Arrays.toString(str1));*/
		//int[] arri = Array.ConvertAll(arr1, new Converter<string,int>(StrToInt));
		//int n=10; int t;
		//System.out.println(Arrays.toString(arr));
		
			/*for (int j=0;j<arr.length-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					t=arr[j];//j>j+1,此时j空
					arr[j]=arr[j+1];//将j+1给j,此时j+1空
					arr[j+1]=t;//不停的[j+1]的值赋给t，当[j+1]=10的时候最大的值已经赋给arr[j+1]
				}
			}
			System.out.println(Arrays.toString(arr));*/
			
		/*for(int i = 1; i < n; i++)//只需要对比9次
				   {
				      for(int j = 0; j < n-i; j++)
				       {
				           if(arr[ j ] > arr[ j +1 ]) 
				            {
				                t = arr[ j ]; 
					            arr[ j ] = arr[ j +1 ]; 
					            arr[ j +1 ] = t;  
				            }
				       }
				  }
		System.out.println(Arrays.toString(arr));*/
		/*int sum=0;
		for (int j=0;j<arr.length;j++) {//比较九次
		 for(int i=0;i<arr.length;i++){//将大的数往后排，也可往前排将就需要j和i减减
			 if(arr[j]<arr[i]){
				 t=arr[i];
				 arr[i]=arr[j];
				 arr[j]=t;
			 }
		 	}
		 }
		 System.out.println(Arrays.toString(arr));
		 for (int i=0;i<10;i++)
			 sum+=arr[i];
		System.out.println(sum/arr.length);*/
		
	}
}
