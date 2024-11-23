//not purely encapsulated class
// encapsulation with method ovverriding
class Parent{
	private int x;
	
	int getX(){
		return x;
	}
	void setX(int n){
		this.x=n;
	}
	void show(){
		System.out.println("show");
	}
}
class Child extends Parent{
	//override
	void show(){
		System.out.println(" override show");
	}
}
class Prog12{
public static void main(String ar[]){
	Parent p=new Child();
	/*
	it give error
	p.x=10;
	System.out.println(p.x);
*/
	p.setX(10);
	System.out.println(p.getX());
p.show();
	
	
}
}