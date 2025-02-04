public class Shirt {
  public int shirtID = 1; 
  public String description = "Найкраща сорочка";
  public String colorCode = "Green";
  public double price = 100.0;
  public int quantityInStock = 99;

  public void displayShirtInformation() {
    System.out.println("Shirt ID: " + shirtID);
    System.out.println("Shirt description:" + description);
    System.out.println("Color Code: " + colorCode);
    System.out.println("Shirt price: $" + price);
    System.out.println("Quantity in stock: " + quantityInStock);
  } // кінець методу displayShirtInformation
} // кінець опису класу