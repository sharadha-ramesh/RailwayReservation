package railwayreservation.exception;

public class BookingQueueOutOfBoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;

	public BookingQueueOutOfBoundException(String errorMessage) {
		super();
		System.out.println(errorMessage);
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	
	

}
