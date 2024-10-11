public class Car {
    private String color;
    private double price;
    private char size;
    
    public Car() {
        color = "ColorNotSet";
        price = 0.00;
        size = 'N';
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    } 

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    public String toString() {
        String sizeDescriptor;
        switch (size) {
            case 'S':
                sizeDescriptor = "small";
                break;
            case 'M':
                sizeDescriptor = "medium";
                break;
            case 'L':
                sizeDescriptor = "large";
                break;
            default:
                sizeDescriptor = "unspecified";
        }
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }

    public static void main(String[] args) {
        Car car1 = new Car();

        car1.setColor("red");
        car1.setPrice(700234.75);
        car1.setSize('L');

        System.out.println(car1.toString());
    }
}
