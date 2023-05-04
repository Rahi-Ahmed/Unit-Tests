import static org.junit.Assert.*;

import java.rmi.UnexpectedException;
import java.util.Random;

import org.junit.Test;


public class TestRunner {

	@Test
	public void DoubleRoomTypeTest() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		if(RoomType.equals("double")){
			assertEquals("double", room.getType());
			assertEquals(false, RoomType.equals("king"));
			assertEquals(false, RoomType.equals("queen"));
		}
	}
	
	
	@Test
	public void KingRoomTypeTest() throws UnexpectedException {
		
		String RoomType = "king";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		if(RoomType.equals("king")){
			assertEquals("king", room.getType());
			assertEquals(false, RoomType.equals("double"));
			assertEquals(false, RoomType.equals("queen"));
		}
	}
	
	
	@Test
	public void QueenRoomTypeTest() throws UnexpectedException {
		String RoomType = "queen";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		if(RoomType.equals("queen")){
			assertEquals("queen", room.getType());
			assertEquals(false, RoomType.equals("king"));
			assertEquals(false, RoomType.equals("double"));
		}
	}
	
	
	@Test
	public void OtherRoomTypeTest() throws UnexpectedException {
		String RoomType = "others";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		
	}
	
	@Test
	public void DoubleRoomPriceTest() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		assertEquals(90, room.getPrice());
	}
	
	@Test
	public void KingRoomPriceTest() throws UnexpectedException {
		String RoomType = "king";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		assertEquals(150, room.getPrice());
	}
	
	@Test
	public void QueenRoomPriceTest() throws UnexpectedException {
		String RoomType = "queen";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		assertEquals(110, room.getPrice());
	}
	
	@Test
	public void DoubleAvailabilityTest() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		assertEquals(true, room.getAvailability());
	}
	
	@Test
	public void KingAvailabilityTest() throws UnexpectedException {
		String RoomType = "king";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		assertEquals(true, room.getAvailability());
	}
	
	@Test
	public void QueenAvailabilityTest() throws UnexpectedException {
		String RoomType = "queen";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		assertEquals(true, room.getAvailability());
	}
	
	
	@Test
	public void DoubleChangeAvailability() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		room.changeAvailability();
		assertEquals(false, room.getAvailability());
		
	}
	
	@Test
	public void KingChangeAvailability() throws UnexpectedException {
		String RoomType = "king";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		room.changeAvailability();
		
		assertEquals(false, room.getAvailability());
		
	}
	
	@Test
	public void QueenChangeAvailability() throws UnexpectedException {
		String RoomType = "queen";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		
		room.changeAvailability();
		
		assertEquals(false, room.getAvailability());
		
	}
	
	
	@Test
	public void DoubleMultipleRooms() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1,r2 ,r3};
		
		Room r =new Room(RoomType);
		
		Room retRoom = Room.findAvailableRoom(room, RoomType);
		
		assertEquals(null,retRoom);
		assertEquals(retRoom, retRoom);
		
		
	}
	
	@Test
	public void KingMultipleRooms() throws UnexpectedException {
		String RoomType = "king";
		RoomType = RoomType.toLowerCase();
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1,r2 ,r3};
		
		Room r =new Room(RoomType);
		
		Room retRoom = Room.findAvailableRoom(room, RoomType);
		
		assertEquals(null,retRoom);
		assertEquals(retRoom, retRoom);
		
		
	}
	
	
	
	
	
	//================================================================================================
	
	
	
	@Test
	public void ReservationGetNameTestDouble() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		Reservation reserve = new Reservation(room, "name");
		assertEquals("name", reserve.getName());
	}
	
	
	@Test
	public void ReservationGetNameTestKing() throws UnexpectedException {
		String RoomType = "king";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		Reservation reserve = new Reservation(room, "name");
		assertEquals("name", reserve.getName());
	}
	
	
	@Test
	public void ReservationGetNameTestQueen() throws UnexpectedException {
		String RoomType = "queen";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		Reservation reserve = new Reservation(room, "name");
		assertEquals("name", reserve.getName());
	}
	
	
	@Test
	public void ReservationGetRoomTestDouble() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		Reservation reserve = new Reservation(room, "name");
		assertEquals(room, reserve.getRoom());
	}
	
	@Test
	public void ReservationGetRoomTestKing() throws UnexpectedException {
		String RoomType = "king";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		Reservation reserve = new Reservation(room, "name");
		assertEquals(room, reserve.getRoom());
	}
	
	
	@Test
	public void ReservationGetRoomTestQueen() throws UnexpectedException {
		String RoomType = "queen";
		RoomType = RoomType.toLowerCase();
		
		Room room = new Room(RoomType);
		Reservation reserve = new Reservation(room, "name");
		assertEquals(room, reserve.getRoom());
	}
	
	//======================================================================================================
	
	
	@Test
	public void BookingSystemGetRandomNumberRoomsTest() throws UnexpectedException {
		
		Random rend = new Random();
		
		BookingSystem b = new BookingSystem();
		assertEquals(b.getRandomNumberOfRooms(), rend.nextInt(50)+1);
	}
	
	@Test
	public void BookingSystemDoubleTypeTest() throws UnexpectedException {
		
		BookingSystem b = new BookingSystem();
		assertEquals(b.getRandomType(), "double");
	}
	
	
	@Test
	public void BookingSystemKingTypeTest() throws UnexpectedException {
		
		BookingSystem b = new BookingSystem();
		assertEquals(b.getRandomType(), "king");
	}
	
	
	
	@Test
	public void BookingSystemQueenTypeTest() throws UnexpectedException {
		
		BookingSystem b = new BookingSystem();
		assertEquals(b.getRandomType(), "queen");
	}
	
	
	@Test
	public void BookingSystemCreateRoomsTest() throws UnexpectedException {
		
		int numOfRooms = 5;
		Room[] room = new Room[5];
		BookingSystem b = new BookingSystem();
		assertEquals(b.createRooms(numOfRooms), room);
	}
	
	
	@Test
	public void RoomFindAvailabilityFoDoubleTest() throws UnexpectedException {
		String RoomType = "double";
		RoomType = RoomType.toLowerCase();
		
		Room[] room = new Room[5];
		
		assertNotNull(room[room.length-1].findAvailableRoom(room, RoomType));
	}

	
	//====================================================================================================================

	
	@Test
	public void HotelTest() throws UnexpectedException {
		String name = "name";
		String RoomType = "double";
		
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1, r2, r3};
		Room roomi = new Room(RoomType);
		
		
		Hotel hotel = new Hotel(name, room);
		
		hotel.createReservation(name, RoomType);
		
		
	}
	
	
	@Test
	public void HotelTestCancelReservation() throws UnexpectedException {
		String name = "name";
		String RoomType = "double";
		
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1, r2, r3};
		Room roomi = new Room(RoomType);
		
		
		Hotel hotel = new Hotel(name, room);
		
		hotel.createReservation(name, RoomType);
		
		hotel.cancelReservation(name, RoomType);
		
		
	}
	
	
	@Test
	public void HotelTestPrintInvoice() throws UnexpectedException {
		String name = "name";
		String RoomType = "double";
		
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1, r2, r3};
		Room roomi = new Room(RoomType);
		
		
		Hotel hotel = new Hotel(name, room);
		
		hotel.createReservation(name, RoomType);
		
		hotel.printInvoice(name);
		
		
		
	}
	
	
	@Test
	public void HotelTestToStringDouble() throws UnexpectedException {
		String name = "name";
		String RoomType = "double";
		
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1, r2, r3};
		Room roomi = new Room(RoomType);
		
		
		Hotel hotel = new Hotel(name, room);
		
		hotel.createReservation(name, RoomType);
		
		String someThing = hotel.toString();
		
		assertEquals("double", someThing);
		
	}
	
	
	@Test
	public void HotelTestToStringKing() throws UnexpectedException {
		String name = "name";
		String RoomType = "King";
		
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1, r2, r3};
		Room roomi = new Room(RoomType);
		
		
		Hotel hotel = new Hotel(name, room);
		
		hotel.createReservation(name, RoomType);
		
		String someThing = hotel.toString();
		
		assertEquals("king", someThing);
	}
	
	
	@Test
	public void HotelTestToStringQueen() throws UnexpectedException {
		String name = "name";
		String RoomType = "queen";
		
		
		Room r1 =new Room(RoomType);
		Room r2 =new Room(RoomType);
		Room r3 = null;
		
		Room[] room = {r1, r2, r3};
		Room roomi = new Room(RoomType);
		
		
		Hotel hotel = new Hotel(name, room);
		
		hotel.createReservation(name, RoomType);
		
		String someThing = hotel.toString();
		assertEquals("queen", someThing);
		
	}
	
	
	
}
