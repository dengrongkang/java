package com.github.test;

public class Rectangle {
	int length, width;
	public Rectangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public void print() {
		System.out.println("2、定义一个矩形类Rectangle：（知识点：对象的创建和使用）[必做题]");
	}
	public void getArea() {
		System.out.println("面积"+length*width);
	}
	public void getPer() {
		System.out.println("周长"+(length+width)*2);
	}
	public void showAll() {
		System.out.println("长"+length+"宽"+width+"面积"+length*width+"周长"+(length+width)*2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.1  定义三个方法：getArea()求面积、getPer()求周长，showAll()分别在控制台输出长、宽、面积、周长。
		Rectangle d=new Rectangle(4,5);
		d.getArea();
		d.getPer();
		d.showAll();
		d.print();
	}

}
