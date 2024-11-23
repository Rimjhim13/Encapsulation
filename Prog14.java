//not purely encapsulated class
// encapsulation with method ovverloading
class Parent{
	private int x;
	int getX(){
		return x;
	}
	void setX(int n){
		this.x=n;
	}
	int sum(int a,int b ){
		return a+b;
	}
	//method overload
	int sum(int a,int b,int c){
		return a+b+c;
	}
	
}

class Prog14{
public static void main(String ar[]){
	Parent p=new Parent();
	
	p.setX(10);
	System.out.println(p.getX());
	System.out.println(p.sum(10,20));
	System.out.println(p.sum(10,20,30));
	

	
	
}
}