import java.util.Arrays;

public class Hotel {

	private int[] availableRooms;
	private String hotelName;
	private double roomRate;

	public Hotel(int numberOfRooms, String hotelName, double roomRate) {
		this.hotelName = hotelName;
		this.roomRate = roomRate;
		availableRooms = new int[31];
		for (int i = 0; i < availableRooms.length; i++) {
			availableRooms[i] = numberOfRooms;
		}
	}

	//Took out unnecessary setters
	//Could use setter for HotelName but not using for this example.

	public int[] getAvailableRooms() {
		return availableRooms;
	}

	public String getHotelName() {
		return hotelName;
	}

	public double getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(double roomRate) {
		this.roomRate = roomRate;
	}

	@Override
	public String toString() {
		return "Hotel{" +
					   "availableRooms=" + Arrays.toString(availableRooms) +
					   ", hotelName='" + hotelName + '\'' +
					   ", roomRate=" + roomRate +
					   '}';
	}


	public double makeReservation(int day1, int endDay, int numrooms) {
		int sum = 0;
		double cost = 0;
		double endCost = 0;

		for (int i = day1; i < endDay; i++) {

			availableRooms[i] -= numrooms;

		}

		cost = (endDay - day1) * roomRate;
		endCost = cost * numrooms;

		return endCost;

	}

	public boolean isReservable(int day1, int exitDay, int numRooms) {

		boolean reserve = false;
		for (int i = day1; i < exitDay; i++) {

			if (availableRooms[i] > numRooms) {

				availableRooms[i] -= numRooms;

				reserve = true;

				continue;

			} else {

				reserve = false;
			}
		}
		return reserve;
	}

	public void cancelReservation(int day1, int checkoutDay, int numRooms) {

		for (int i = day1; i < checkoutDay; i++) {

			availableRooms[i] += numRooms;

		}

		System.out.println("Your reservation has been cancelled");
	}


	public static void main(String[] args) {

		Hotel hotel1 = new Hotel(20, "The Manor", 250);


		System.out.println("Thank you. Your reservation price is $" + hotel1.makeReservation(22, 30, 3));
		System.out.println(hotel1);

		System.out.println("Thank you. Your reservation price is $" + hotel1.makeReservation(10, 16, 7));
		System.out.println(hotel1);

		System.out.println("Thank you. Your reservation price is $" + hotel1.makeReservation(16, 25, 6));
		System.out.println(hotel1);

		hotel1.cancelReservation(14, 18, 4);


		System.out.println(hotel1);
		System.out.println("Reservation available? :" + hotel1.isReservable(2, 10, 85));
		System.out.println(hotel1);

	}
}