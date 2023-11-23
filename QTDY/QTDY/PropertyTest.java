abstract class Property {
    protected String address;
    protected int propertyId;
    protected double areaInYard;
    protected double pricePerYard;
    protected static int propertyCount = 0;

    public Property(String address, int propertyId, double areaInYard, double pricePerYard) {
        this.address = address;
        this.propertyId = propertyId;
        this.areaInYard = areaInYard;
        this.pricePerYard = pricePerYard;
        propertyCount++;
    }

    public abstract long calculatePriceOfProperty();

    public void printPropertyInfo() {
        System.out.println("Property ID: " + propertyId);
        System.out.println("Address: " + address);
        System.out.println("Area in Yard: " + areaInYard);
        System.out.println("Price per Yard: $" + pricePerYard);
    }

    public static int PropertiesTotalCount() {
        return propertyCount;
    }
}

class FurnishedHome extends Property {
    private double furnitureCharge;

    public FurnishedHome(String address, int propertyId, double areaInYard, double pricePerYard, double furnitureCharge) {
        super(address, propertyId, areaInYard, pricePerYard);
        this.furnitureCharge = furnitureCharge;
    }

    @Override
    public long calculatePriceOfProperty() {
        double totalPrice = (areaInYard * pricePerYard) + furnitureCharge;
        double stampDuty = totalPrice * 0.05; // 5% of total price as stamp duty
        return Math.round(totalPrice + stampDuty);
    }

    @Override
    public void printPropertyInfo() {
        super.printPropertyInfo();
        System.out.println("Furniture Charge: $" + furnitureCharge);
        System.out.println("Total Price (including stamp duty): $" + calculatePriceOfProperty());
    }
}

public class PropertyTest {
    public static void main(String[] args) {
        // Creating FurnishedHome objects and testing methods
        FurnishedHome home1 = new FurnishedHome("123 Main St", 1, 200, 100, 5000);
        FurnishedHome home2 = new FurnishedHome("456 Elm St", 2, 300, 120, 6000);

        // Display property information
        System.out.println("Property 1 Information:");
        home1.printPropertyInfo();
        System.out.println();

        System.out.println("Property 2 Information:");
        home2.printPropertyInfo();
        System.out.println();

        // Display total count of Property objects created
        System.out.println("Total Property Objects: " + Property.PropertiesTotalCount());
    }
}
