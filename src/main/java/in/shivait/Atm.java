package in.shivait;

public class Atm {
	private Printer printer;

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	// Getter method
	public Printer getPrinter() {
		return this.printer;
	}

	public void start() {
		int status = printer.print();
		if (status == 1) {
			System.out.println("Atm is started ");
		} else {
			System.out.println("atm is not statred");
		}
	}

}
