
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import entity.*;
import service.*;

static AdminService adminService=new AdminService();
static CustomerService customerService=new CustomerService();
static BookingService bookingService=new BookingService();
static PaymentService paymentService=new PaymentService();
static VehicleService vehicleService=new VehicleService();

int adminId=1;
int customId =1;
int bookId=1;
int vehicleId=1;
int payId=1;
Scanner sc=new Scanner(System.in);

void main() {
    adminService.addAdmin("AID"+(adminId++),"Nihitha","12345","9898766754");
    adminService.addAdmin("AID"+(adminId++),"Rani","123456","9898766754");
    adminService.addAdmin("AID"+(adminId++),"Jivitha","1234567","9898766754");
    adminService.addAdmin("AID"+(adminId++),"Latha","12345678","9898766754");
    adminService.addAdmin("AID"+(adminId++),"Balachandar","123456789","9898766754");

    customerService.addCustomer("CID"+(customId++),"Sanjay","12345","9876543211");
    customerService.addCustomer("CID"+(customId++),"Roshan","123456","9876543211");
    customerService.addCustomer("CID"+(customId++),"Venkat","123457","9876543211");
    customerService.addCustomer("CID"+(customId++),"Ezhil","123458","9876543211");
    customerService.addCustomer("CID"+(customId++),"Meenu","123459","9876543211");

    vehicleService.addVehicle("VID"+(vehicleId++),"TN 09 K 1234","Car","Petrol","25",950);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 10 K 4312","Bike","Petrol","35",550);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 11 K 4321","Bike","Diesel","20",700);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 09 K 4231","Car","Diesel","15",1500);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 13 K 1324","Car","Petrol","25",1200);

    vehicleService.addVehicle("VID"+(vehicleId++),"TN 14 K 1432","Bike","Electric","20",700);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 09 K 1342","Car","Electric","22",20000);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 16 K 4123","Car","Electric","15",32000);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 09 K 4132","Bike","Diesel","19",1200);
    vehicleService.addVehicle("VID"+(vehicleId++),"TN 09 K 4123","Bike","Petrol","24",3000);

    System.out.println("________________________________________________________________________________________________________________");
    System.out.println("Welcome to Vehicle Booking System");
    System.out.println("________________________________________________________________________________________________________________");
    System.out.println("Enter your choice:\n 1.Login as Admin.\n 2.Login as Customer.\n 3.Register new customer.\n 4.Exit");
    int choice=sc.nextInt();
    do{
        sc.nextLine();
        switch (choice){
            case 1:{
                System.out.println("Enter your admin ID: ");
                String id=sc.nextLine();
                System.out.println("Enter your password: ");
                String password=sc.nextLine();
                Admin admin=adminService.findAdminByID(id);
                if(admin!=null){
                    if(password.equals(admin.getPassword())) {
                        System.out.println("Login successfull.");
                        adminLogin(admin);
                    }
                    else
                        System.out.println("Login password is invalid please check it.");
                }
                else
                    System.out.println("Login ID is invalid please check it.");
                break;
            }
            case 2:{
                System.out.println("Enter your customer ID: ");
                String id=sc.nextLine();
                System.out.println("Enter your password: ");
                String password=sc.nextLine();
                Customer customer=customerService.findCustomerById(id);
                if(customer!=null){
                    if(customer.getPassword().equals(password)){
                        System.out.println("Login Successfull.");
                        customerLogin(customer);
                    }
                    else
                        System.out.println("Login password is incorrect please try again.");
                }
                else
                    System.out.println("Login ID is invalid please check it and try again.");
                break;
            }
            case 3:{
                System.out.println("Welcome to our Vehicle Booking Management.\nEnter your name: ");
                String name=sc.nextLine();
                System.out.println("Enter your phone number: ");
                String phone=sc.nextLine();
                System.out.println("Enter your password: ");
                String password=sc.nextLine();
                customerService.addCustomer("CID"+(customId++),name,password,phone);
                System.out.println("Registration successfull...");
                Customer customer=customerService.findCustomerById("CID"+customId);
                customerLogin(customer);
                break;
            }
            default:
                System.out.println("Exiting from our system.....\nThank you.....\n\nVisit us again..");
                break;
        }
        System.out.println("Enter your choice:\n 1.Login as Admin.\n 2.Login as Customer.\n 3.Register new customer.\n 4.Exit");
        choice=sc.nextInt();
    }while(choice!=4);

}

private void customerLogin(Customer customer) {
    System.out.println("Welcome back: "+customer.getName());
    System.out.println("\nEnter your choice:\n 1.View Bookings.\n 2.View Vehicles.\n 3.Search Vehicle.\n 4.Book a new Vehicle.\n 5.Cancel Booking.\n 6.Exit.");
    int choice=sc.nextInt();
    do{
        sc.nextLine();
        switch (choice){
            case 1:{
                System.out.println("Displaying Booking Details.....\n\n");
                bookingService.display(customer);
                break;
            }
            case 2:{
                System.out.println("Displaying vehicle details............\n\n");
                vehicleService.display();
                break;
            }
            case 3:{
                System.out.println("Do you want search the vehicle using its....\n1.Vehicle Type(Car/Bike)\n2.Vehicle Id\n3.Exit");
                int vchoice=sc.nextInt();
                sc.nextLine();
                switch (vchoice){
                    case 1:{
                        System.out.println("Enter the type you want to search(Car/Bike) :");
                        String type=sc.nextLine();
                        if(type.equalsIgnoreCase("car")||type.equalsIgnoreCase("bike")){
                            vehicleService.searchByType(type);
                            break;
                        }
                        else
                            System.out.println("Please enter a valid vehicle type.");
                        break;
                    }
                    case 2:{
                        System.out.println("Enter the Vehicle ID: ");
                        String id=sc.nextLine();
                        Vehicle vehicle=vehicleService.searchById(id);
                        if(vehicle!=null)
                            vehicle.display();
                        else
                            System.out.println("Enter a valid vehicle ID");
                        break;
                    }
                    default:
                        System.out.println("Make a valid choice");
                        break;
                }
                break;
            }
            case 4: {
                System.out.println("Enter the Vehicle ID which you would like to book: ");
                String id = sc.nextLine();
                Vehicle vehicle = vehicleService.searchById(id);
                if (vehicle == null){
                    System.out.println("Enter a valid vehicle ID.");
                    break;
                }
                System.out.println("The vehicle you have selected is\n");
                vehicle.display();
                System.out.println("Enter the duration for which you need the vehicle: ");
                int duration=sc.nextInt();
                System.out.println("Your amount for the booking would be: "+(duration*vehicle.getPrice())+"\nWould you like to continue booking(yes/no): ");
                sc.nextLine();
                String confirmation=sc.nextLine();
                if(confirmation.equalsIgnoreCase("no")){
                    System.out.println("Canceling Booking....");
                    break;
                }
                Payment payment=new Payment("PID"+(payId++),"BID"+(bookId++),(duration*vehicle.getPrice()));
                Booking booking=new Booking(payment.getBid(),customer,duration);
                customer.addBooking(booking);
                vehicle.setStatus(true);
                System.out.println("Booking completed successfully.\n");
                break;
            }
            case 5:{
                System.out.println("Enter the booking ID that you like to cancel: ");
                String id=sc.nextLine();
                Booking booking=bookingService.searchById(id,customer.getCid());
                if(booking==null){
                    System.out.println("Enter valid booking ID");
                    break;
                }
                System.out.println("Are you sure you want to cancel this booking(yes/no): ");
                String confirmation=sc.nextLine();
                if(confirmation.equalsIgnoreCase("no")){
                    System.out.println("Exiting from cancel booking......");
                    break;
                }
                bookingService.cancelBooking(booking);
                customer.removeBooking(booking);
                booking.getVehicle().setStatus(false);
                System.out.println("Booking is cancelled successfully...");
                break;
            }
            default:
                System.out.println("Enter a valid choice.");
                break;
        }
        System.out.println("\nEnter your choice:\n 1.View Bookings.\n 2.View Vehicles.\n 3.Search Vehicle.\n 4.Book a new Vehicle.\n 5.Cancel Booking.\n 6.Exit.");
        choice=sc.nextInt();
    }while(choice!=6);
}

private void adminLogin(Admin admin) {
    System.out.println("Welcome Back: "+admin.getName());
    System.out.println("\nEnter your choice:\n 1.View Customers.\n 2.View Vehicles.\n 3.View Bookings.\n 4.View Payments.\n 5.View Rental Duration.\n 6.Exit");
    int choice=sc.nextInt();
    do{
        sc.nextLine();
        switch (choice){
            case 1:{
                System.out.println("Displaying Customer Details........\n\n");
                customerService.display();
                break;
            }
            case 2:{
                System.out.println("Displaying Vehicles............\n\n");
                vehicleService.display();
                break;
            }
            case 3:{
                System.out.println("Displaying Booking Details.............\n\n");
                bookingService.display();
                break;
            }
            case 4:{
                System.out.println("Displaying payment details..............\n\n");
                paymentService.display();
                break;
            }
            case 5:{
                System.out.println("Displaying rental duration of all bookings..................\n\n");
                bookingService.rentalDuration();
                break;
            }
            default:
                System.out.println("Enter a valid choice.\n");
                break;
        }
        System.out.println("\nEnter your choice:\n 1.View Customers.\n 2.View Vehicles.\n 3.View Bookings.\n 4.View Payments.\n 5.View Rental Duration.\n 6.Exit");
        choice=sc.nextInt();
    }while(choice!=6);
}
