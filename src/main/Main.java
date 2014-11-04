package main;

import view.MainUI;
import model.ServiceHandler;

/**
 * Main class for CCChecker service.
 * Create models and views in this class and use to provide checking validation of Credit Card.
 * @author Pawin Suthipornopas 5510546123
 */
public class Main {

	/**
	 * Main method.
	 * Create a service handler, UI, inject service into UI and run them.
	 * @param args
	 */
	public static void main(String[] args) {
		ServiceHandler handler = new ServiceHandler();
		MainUI ui = new MainUI(handler);
		ui.run();
	}

}
