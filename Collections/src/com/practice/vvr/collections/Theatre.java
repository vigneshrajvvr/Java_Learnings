package com.practice.vvr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Theatre {

	private final String theatreName;
	//Even replacing ArrayList with LinkedList, this implementation will work
	private List<Seat> seats = new ArrayList<>();
//	private List<Seat> seats = new LinkedList<>();
//	private Collection<Seat> seats = new LinkedList<>();
//	private Collection<Seat> seats = new HashSet<>();
//	private Collection<Seat> seats = new LinkedHashSet<>();

	public Theatre(String theatreName, int numRows, int seatsPerRow) {
		super();
		this.theatreName = theatreName;

		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum < seatsPerRow; seatNum++) {
				Seat seat = new Seat(row + String.format("%02d", seatNum));
				seats.add(seat);
			}
		}
	}

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if(foundSeat >= 0) {
			return requestedSeat.reserve();	
		} else {
			System.out.println("There is no seat " + seatNumber);
			return false;
		}
//		for (Seat seat : seats) {
//			System.out.print(".");
//			if (seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			}
//		}
//
//		if (requestedSeat == null) {
//			System.out.println("There is no seat " + seatNumber);
//			return false;
//		}
//		return requestedSeat.reserve();
	}

	// for testing
	public void getSeats() {
		for (Seat seat : seats) {
			System.out.println(seat.getSeatNumber());
		}
	}

	private class Seat implements Comparable<Seat>{
		private final String seatNumber;
		private boolean reserved = false;

		public Seat(String seatNumber) {
			super();
			this.seatNumber = seatNumber;
		}
		
		public boolean reserve() {
			if(!this.reserved) {
				this.reserved = true;
				System.out.println("Seat " + seatNumber + " resevered.");
				return true;
			}
			return false;
		}
		
		public boolean cancel() {
			if(this.reserved) {
				this.reserved = false;	
				System.out.println("Reservation of seat " + seatNumber + " cancelled");
				return true;
			}
			return false;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		@Override
		public int compareTo(Seat seat) {
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}
		

	}

}
