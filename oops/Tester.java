package oops;

class MovieTicket {
	   private int movieId, noOfSeats;
	   private double costPerSeat;
	  
	   public void setMovieId(int movieId) {
	      this.movieId = movieId;
	   }
	   
	   public int getMovieId() {
	     return movieId;
	   }
	   
	   public void setNoOfSeats(int noOfSeats) {
	      this.noOfSeats = noOfSeats;
	   }
	   
	   public int getNoOfSeats() {
	     return noOfSeats;
	   }
	   
	   public double calculateTotalAmount() {
	      double amount = 0.0;
	      switch (movieId) {
	         case 111:
	            costPerSeat = 7.0;
	            amount = costPerSeat * noOfSeats;
	            break;
	         case 112:
	            costPerSeat = 8.0;
	            amount = costPerSeat * noOfSeats;
	            break;
	         case 113:
	            costPerSeat = 8.5;
	            amount = costPerSeat * noOfSeats;
	            break;
	         default:
	           // amount = 0.0; // Handle invalid movieId
	        	 System.out.println("Sorry! Please enter a valid movie ID and number of seats.");
	        	 break;
	      }
	      return amount;
	   }
	}

	class Tester {
	   public static void main(String[] args) {
	      MovieTicket movieTicket = new MovieTicket();
	      movieTicket.setMovieId(114);
	      movieTicket.setNoOfSeats(3);
	      
	      movieTicket.getMovieId();
	      movieTicket.getNoOfSeats();
	      double amount = movieTicket.calculateTotalAmount();
	      
	    //  if (amount == 0) {
	    	  //System.out.println("Sorry! Please enter a valid movie ID and number of seats.");
	    //} else {
	         System.out.println("Total amount for booking: $" + amount);
	      }
	   }
	//}

	


