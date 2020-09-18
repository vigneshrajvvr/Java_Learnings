package com.practice.vvr.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
 		Theatre theatre = new Theatre("Olympian", 8, 12);
//		//theatre.getSeats();
//		if(theatre.reserveSeat("H11")) {
//			System.out.println("Please pay");
//		} else {
//			System.out.println("Sorry, seat is reserved");
//		}
//		if(theatre.reserveSeat("H11")) {
//			System.out.println("Please pay");
//		} else {
//			System.out.println("Sorry, seat is reserved");
//		}
 		//Shallow copy
 		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
 		printList(seatCopy);
 		
 		seatCopy.get(1).reserve();
 		if(theatre.reserveSeat("A02")) {
 			System.out.println("Please pay for A02");
 		} else {
 			System.out.println("Seat already reserved");
 		}
 		
 		//Collections.reverse(seatCopy);
 		Collections.shuffle(seatCopy);
 		System.out.println("Printing seatCopy");
 		printList(seatCopy);
 		System.out.println("Printing theatre.seats");
 		printList(theatre.seats);
 		
 		Theatre.Seat minSeat = Collections.min(seatCopy);
 		System.out.println("Min seat : "+minSeat.getSeatNumber());
 		
 		Theatre.Seat maxSeat = Collections.max(seatCopy);
 		System.out.println("Max seat : "+maxSeat.getSeatNumber());
 		
 		//Collections.swap(list, i, j);
 		//Collections.copy(object1, object2);
 		
 		
	}
	
	public static void printList(List<Theatre.Seat> list) {
		for(Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber());
		}
		System.out.println();
		System.out.println("==========================================");
	}
	
}
