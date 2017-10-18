
public class CallingMethodsCheckpoint {
	int number;
	private String name;
	
	
public static void main(String[] args) {
	CallingMethodsCheckpoint cmc= new CallingMethodsCheckpoint ();
	cmc.runMethods();
}
void runMethods(){
	printMessage();
	setName("Jessica");
	int num=getNumber();


}
	

void printMessage(){
		System.out.println("message");
	}
	
	
	void setName(String name) {
		this.name=name;
	}
	int getNumber(){
		return number;
	}
}
