import java.util.*;

class Hotel {
    protected int duration;
    protected String location;
    protected String hotelName;
    protected double totalCost;

    public void chooseLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Here are popular places to stay - choose one:");
        System.out.println("Chandigarh, Amritsar, Delhi, Gurgaon, Goa");
        System.out.print("Enter your choice: ");
        location = scanner.nextLine();
    }

    public int nightStaying() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Check-In Date (in days of the month): ");
        int checkIn = scanner.nextInt();
        System.out.print("Enter Check-Out Date (in days of the month): ");
        int checkOut = scanner.nextInt();

        duration = checkOut - checkIn;

        System.out.println("Your duration of stay is " + duration + " nights.");
        return duration;
    }

    public void selectHotel() {
        System.out.println("Hotels available in " + location + " are:");
        Scanner scanner = new Scanner(System.in);
        String hotelChoice;
        boolean validHotel = false;

        while (!validHotel) {
            if (location.equalsIgnoreCase("Chandigarh")) {
                System.out.println("1. The Oberoi (Starting @Rs 3k)");
                System.out.println("2. Taj Chandigarh (Starting @Rs 3.5k)");
            } else if (location.equalsIgnoreCase("Amritsar")) {
                System.out.println("1. Hyatt Amritsar (Starting @Rs 2.5k)");
                System.out.println("2. Radisson Blu (Starting @Rs 3k)");
            } else if (location.equalsIgnoreCase("Delhi")) {
                System.out.println("1. The Leela Palace (Starting @Rs 4k)");
            } else if (location.equalsIgnoreCase("Gurgaon")) {
                System.out.println("1. The Oberoi Gurgaon (Starting @Rs 3.5k)");
                System.out.println("2. Leela Ambience (Starting @Rs 4.5k)");
            } else if (location.equalsIgnoreCase("Goa")) {
                System.out.println("1. Taj Exotica (Starting @Rs 5k)");
                System.out.println("2. Park Hyatt Goa (Starting @Rs 6k)");
            }

            System.out.print("Enter your Hotel Choice: ");
            hotelChoice = scanner.nextLine();

            if (hotelChoice.equalsIgnoreCase("The Oberoi") ||
                hotelChoice.equalsIgnoreCase("Taj Chandigarh") ||
                hotelChoice.equalsIgnoreCase("Hyatt Amritsar") ||
                hotelChoice.equalsIgnoreCase("Radisson Blu") ||
                hotelChoice.equalsIgnoreCase("The Leela Palace") ||
                hotelChoice.equalsIgnoreCase("The Oberoi Gurgaon") ||
                hotelChoice.equalsIgnoreCase("Leela Ambience") ||
                hotelChoice.equalsIgnoreCase("Taj Exotica") ||
                hotelChoice.equalsIgnoreCase("Park Hyatt Goa")) {
                validHotel = true;
                hotelName = hotelChoice;
            } else {
                System.out.println("Invalid hotel choice. Please choose from the listed options.");
            }
        }
    }
}

class Room extends Hotel {
    private String roomCategory;
    private double pricePerNight;

    public void selectRoom() {
        System.out.println("Room Categories:");
        Scanner scanner = new Scanner(System.in);
        String roomChoice;
        boolean validRoom = false;

        while (!validRoom) {
            if (hotelName.equalsIgnoreCase("The Oberoi")) {
                System.out.println("1. Standard (Price: Rs 3k)\n2. Deluxe (Price: Rs 4k)\n3. Suite (Price: Rs 5k)");
            } else if (hotelName.equalsIgnoreCase("Taj Chandigarh")) {
                System.out.println("1. Standard (Price: Rs 3.5k)\n2. Deluxe (Price: Rs 4.5k)\n3. Suite (Price: Rs 5.5k)");
            } else if (hotelName.equalsIgnoreCase("Hyatt Amritsar")) {
                System.out.println("1. Standard (Price: Rs 2.5k)\n2. Deluxe (Price: Rs 3.5k)\n3. Suite (Price: Rs 4.5k)");
            } else if (hotelName.equalsIgnoreCase("Radisson Blu")) {
                System.out.println("1. Standard (Price: Rs 3k)\n2. Deluxe (Price: Rs 4k)\n3. Suite (Price: Rs 5k)");
            } else if (hotelName.equalsIgnoreCase("The Leela Palace")) {
                System.out.println("1. Standard (Price: Rs 4k)\n2. Deluxe (Price: Rs 5k)\n3. Suite (Price: Rs 6k)");
            } else if (hotelName.equalsIgnoreCase("The Oberoi Gurgaon")) {
                System.out.println("1. Standard (Price: Rs 3.5k)\n2. Deluxe (Price: Rs 4.5k)\n3. Suite (Price: Rs 5.5k)");
            } else if (hotelName.equalsIgnoreCase("Leela Ambience")) {
                System.out.println("1. Standard (Price: Rs 4.5k)\n2. Deluxe (Price: Rs 5.5k)\n3. Suite (Price: Rs 6.5k)");
            } else if (hotelName.equalsIgnoreCase("Taj Exotica")) {
                System.out.println("1. Standard (Price: Rs 5k)\n2. Deluxe (Price: Rs 6k)\n3. Suite (Price: Rs 7k)");
            } else if (hotelName.equalsIgnoreCase("Park Hyatt Goa")) {
                System.out.println("1. Standard (Price: Rs 6k)\n2. Deluxe (Price: Rs 7k)\n3. Suite (Price: Rs 8k)");
            }

            System.out.print("Enter the type of Room you want: ");
            roomChoice = scanner.nextLine();

            if (roomChoice.equalsIgnoreCase("Standard") ||
                roomChoice.equalsIgnoreCase("Deluxe") ||
                roomChoice.equalsIgnoreCase("Suite")) {
                validRoom = true;
                roomCategory = roomChoice;
            } else {
                System.out.println("Invalid room category. Please choose from 'Standard', 'Deluxe', or 'Suite'.");
            }
        }

        if (roomCategory.equalsIgnoreCase("Standard")) {
            pricePerNight = hotelName.equalsIgnoreCase("The Oberoi") ? 3000 :
                            hotelName.equalsIgnoreCase("Taj Chandigarh") ? 3500 :
                            hotelName.equalsIgnoreCase("Hyatt Amritsar") ? 2500 :
                            hotelName.equalsIgnoreCase("Radisson Blu") ? 3000 :
                            hotelName.equalsIgnoreCase("The Leela Palace") ? 4000 :
                            hotelName.equalsIgnoreCase("The Oberoi Gurgaon") ? 3500 :
                            hotelName.equalsIgnoreCase("Leela Ambience") ? 4500 :
                            hotelName.equalsIgnoreCase("Taj Exotica") ? 5000 :
                            hotelName.equalsIgnoreCase("Park Hyatt Goa") ? 6000 : 0;
        } else if (roomCategory.equalsIgnoreCase("Deluxe")) {
            pricePerNight = hotelName.equalsIgnoreCase("The Oberoi") ? 4000 :
                            hotelName.equalsIgnoreCase("Taj Chandigarh") ? 4500 :
                            hotelName.equalsIgnoreCase("Hyatt Amritsar") ? 3500 :
                            hotelName.equalsIgnoreCase("Radisson Blu") ? 4000 :
                            hotelName.equalsIgnoreCase("The Leela Palace") ? 5000 :
                            hotelName.equalsIgnoreCase("The Oberoi Gurgaon") ? 4500 :
                            hotelName.equalsIgnoreCase("Leela Ambience") ? 5500 :
                            hotelName.equalsIgnoreCase("Taj Exotica") ? 6000 :
                            hotelName.equalsIgnoreCase("Park Hyatt Goa") ? 7000 : 0;
        } else {
            pricePerNight = hotelName.equalsIgnoreCase("The Oberoi") ? 5000 :
                            hotelName.equalsIgnoreCase("Taj Chandigarh") ? 5500 :
                            hotelName.equalsIgnoreCase("Hyatt Amritsar") ? 4500 :
                            hotelName.equalsIgnoreCase("Radisson Blu") ? 5000 :
                            hotelName.equalsIgnoreCase("The Leela Palace") ? 6000 :
                            hotelName.equalsIgnoreCase("The Oberoi Gurgaon") ? 5500 :
                            hotelName.equalsIgnoreCase("Leela Ambience") ? 6500 :
                            hotelName.equalsIgnoreCase("Taj Exotica") ? 7000 :
                            hotelName.equalsIgnoreCase("Park Hyatt Goa") ? 8000 : 0;
        }
    }

    public void totalCost() {
        totalCost = duration * pricePerNight;
        System.out.println("Your total Cost = Rs " + totalCost);
    }
}

public class HotelBooking {
    public static void main(String[] args) {
        Room room = new Room();

        System.out.println("Welcome to the Hotel Room Booking System!");
        System.out.println("We will assist you in booking the best room for your stay.");

        System.out.println("\nFirst choose Location");
        room.chooseLocation();

        System.out.println("\nNow calculating your Duration of Stay");
        room.nightStaying();

        System.out.println("\nNow choose a Hotel");
        room.selectHotel();

        System.out.println("\nNow select a Room Category");
        room.selectRoom();

        System.out.println("\nNow calculating the Total Cost");
        room.totalCost();

        System.out.println("\nThank you for using our Hotel Room Booking System. Have a pleasant stay!");
    }
}
