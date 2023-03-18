package week3.day1.Assignments;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Desktop size info from Desktop class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop desktop = new Desktop();
		desktop.desktopSize();
		desktop.getComputerModel();

	}

}
