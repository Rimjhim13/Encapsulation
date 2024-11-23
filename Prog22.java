//Encapsulation Ex-
class Device{
	private String DeviceName;
	
	String getDevice(){
	return this.DeviceName;
	}
	void setDevice(String name){
		this.DeviceName=name +" is a Device";
	}
	
}
class Prog22 extends Device{
public static void main(String ar[]){
Device d=new Device();

d.setDevice("bulb");
System.out.println(d.getDevice());
}


}