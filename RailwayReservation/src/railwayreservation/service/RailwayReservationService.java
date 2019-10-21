package railwayreservation.service;

import railwayreservation.exception.BookingQueueOutOfBoundException;
import railwayreservation.model.Booking;

public interface RailwayReservationService {
	public void bookTicket(Booking book) throws BookingQueueOutOfBoundException;
	
	
	

}
