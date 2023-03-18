package week3.day1.Assignments;

public class AxisBank extends ReserveBank {

	public void deposit() {
		System.out.println("Deposit details from Axis Bank class");
	}
	public static void main(String[] args) {
	
		ReserveBank reserveBank = new ReserveBank();
		reserveBank.deposit();
		AxisBank axisBank = new AxisBank();
		axisBank.deposit();

	}

}
