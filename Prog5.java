//Encapsulation- data and information binding Together and manipulate them.by this we achive data hiding 
//in this example we use normal method not use getter setter 
class A{
	 private int x;
	 private int y;
	void get(int a,int b){
		x=a;
		y=b;
		
	}
	void show(){
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
class Prog5{
public static void main(String ar[]){
	A a=new A();
	a.get(1,2);
	a.show();
}
}