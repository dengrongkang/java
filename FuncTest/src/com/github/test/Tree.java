package com.github.test; 
import com.neusoft.test.*;

	public class Tree {
		public String name;
		public int length;
		public boolean leaf;
		public String print="树";
		
		public Tree() {//默认空构造器
			
		}
		
		public void Tree() {//无返回值
			
		}
		
		public Tree (String name,int age){//有参数构造器
				this.name=name;
				length=age;       
				}
		public String print() {
			return name+"树叶"+length+"厘米\n";
		}

		public void print(String n,int l,boolean f) {
			if (f==true)
			System.out.println(n+"为有叶植物一般可生长到"+l+"米");
			else
				System.out.println("sadasfhas");
		}
		public String print(String name,int l) {
			this.name=name;//修改之后全局变量就变了
			return name+"树叶"+l+"厘米\n"+this.name;//this调用本类属性，也就是全局变量。
		}
		
		public static void main(String[] args) {
			Tree tree =new Tree("枫树",16);
			//tree.print("枫树",26,2>1);
			//tree.print("荷叶", 2, true);
			//System.out.println(tree.print);
			System.out.println(tree.print("红树",13));
			//FuncTest test=new FuncTest();
			//test.shu('3','*','8');
			System.out.println(tree.print());
			System.out.println(new Tree("枫树",17).print());
		}
}