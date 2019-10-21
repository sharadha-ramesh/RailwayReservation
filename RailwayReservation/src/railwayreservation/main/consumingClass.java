package railwayreservation.main;

import railwayreservation.exception.BookingQueueOutOfBoundException;
import railwayreservation.model.Booking;
import railwayreservation.model.Detail;
import railwayreservation.serviceimpl.RailwayReservationImpl;

public class consumingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RailwayReservationImpl local = new RailwayReservationImpl();
		Booking newBook =  new Booking();
		newBook.setTrainNo("PNR110");
		Detail det = new Detail();
		det.setFrom("Trichy");
		det.setTo("Chennai");
		det.setTrainName("RockFort");
		det.setStartDate("12/11/2019");
		newBook.setDetail(det);
		
		Booking newBook2 =  new Booking();
		newBook2.setTrainNo("PNR110");
		Detail det2 = new Detail();
		det2.setFrom("Trichy");
		det2.setTo("Chennai");
		det2.setTrainName("RockFort");
		det2.setStartDate("12/11/2019");
		newBook2.setDetail(det2);
		try {
			System.out.println("Inside try catch block");
			local.bookTicket(newBook);
			for(int i = 0; i<11;i++) {
			local.bookTicket(newBook2);
			}
		} catch (BookingQueueOutOfBoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ërror is being thrown" );
			System.out.println(e.getErrorMessage());
		}
	}

}
