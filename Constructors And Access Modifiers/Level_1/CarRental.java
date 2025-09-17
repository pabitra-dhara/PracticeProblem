/*6.Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays. Add constructors to initialize the rental details and calculate total cost. */
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double pricePerDay;

    CarRental(String customerName,String carModel,int rentalDays,double pricePerDay){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        this.pricePerDay=pricePerDay;
    }
    double totalCost(){
        return rentalDays*pricePerDay;
    }

    public static void main(String[] args) {
        CarRental obj=new CarRental("Pabitra", "Sedan", 3, 1500);

        System.out.println(obj.customerName+" "+obj.carModel +" "+obj.rentalDays + " days= Rs" + obj.totalCost());
    }
}
