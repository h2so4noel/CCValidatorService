package model;

import net.webservicex.CCChecker;
import net.webservicex.CCCheckerSoap;

/**
 * A handler class to handle service of CCChecker SOAP.
 * Create components and own methods for availability of services from CCChecker.
 * @author Pawin Suthipornopas 5510546123
 */
public class ServiceHandler {
	CCCheckerSoap soap;
	CCChecker factory;
	/**
	 * Default constructor, doesn't require any attributes.
	 * Create SOAP service and the factory of it.
	 */
	public ServiceHandler() {
		create();
	}
	
	/**
	 * Private create method for generating factory and SOAP.
	 */
	private void create() {
		factory = new CCChecker();
		soap = factory.getCCCheckerSoap();
	}
	/**
	 * Validate the Credit Card by sending request to the SOAP service.
	 * @param cardType is type of the credit card.
	 * @param cardNumber is number of the credit card.
	 * @return String indicating the status of that credit card.
	 */
	public String validate(String cardType, String cardNumber){
		return soap.validateCardNumber(cardType, cardNumber);
	}

	public CCCheckerSoap getSoap() {
		return soap;
	}

	public void setSoap(CCCheckerSoap soap) {
		this.soap = soap;
	}

	public CCChecker getFactory() {
		return factory;
	}

	public void setFactory(CCChecker factory) {
		this.factory = factory;
	}
}
