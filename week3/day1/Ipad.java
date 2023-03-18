package week3.day1;

public class Ipad extends IOS {
	
	public void watchMovie() {
		System.out.println("Watch Movie");
		}
	
	public void startApp() {
		System.out.println("Start IPAD App");
		}
	
	public static void main(String[] args) {
		
		IOS ios = new IOS();
		ios.startApp();
		Ipad ipad = new Ipad();
		ipad.startApp();		
		
	}

}
