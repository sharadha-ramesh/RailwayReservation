package railwayreservation.serviceimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import railwayreservation.exception.BookingQueueOutOfBoundException;
import railwayreservation.model.Booking;
import railwayreservation.service.RailwayReservationService;

public class RailwayReservationImpl implements RailwayReservationService {
	Map<String ,ArrayList<Booking>> Queue = new HashMap<String,ArrayList<Booking>>();

	@Override
	public void bookTicket(Booking book) throws BookingQueueOutOfBoundException {
		// TODO Auto-generated method stub
		System.out.println("Inside add operation");
		if(Queue.containsKey(book.getTrainNo())) {
			ArrayList<Booking> bookList = Queue.get(book.getTrainNo());
			if(bookList.size()<10) {
				Queue.get(book.getTrainNo()).add(book);
				bookList.add(book);
				bookList.forEach(Books->
				System.out.println("Inside if"+Books.getDetail().getTrainName()));
				Queue.replace(book.getTrainNo(), bookList);
			}else {
				System.out.println("Queue size is large");
				throw new BookingQueueOutOfBoundException("Queue is full");
			}
		}else {
			ArrayList<Booking> bookTemp = new ArrayList<Booking>();
			bookTemp.add(book);
			bookTemp.forEach(bookss->System.out.println("insdie esle"+bookss.getDetail().getTrainName()));
			Queue.put(book.getTrainNo(), bookTemp);
		}
		
	}

}
