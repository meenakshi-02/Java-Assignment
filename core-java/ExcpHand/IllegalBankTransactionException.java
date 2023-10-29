package assignment.ExcpHand;

public class IllegalBankTransactionException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalBankTransactionException() {
		super();
	}

	public IllegalBankTransactionException(String errMsg) {
		super(errMsg);
	}
}
