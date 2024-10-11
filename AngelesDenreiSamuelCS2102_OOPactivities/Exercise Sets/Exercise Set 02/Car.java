public class Car {
    private String color;
    private double price;
    private char size;
    
    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
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
        this.color = getColor();
    }

    public void setPrice(double price) {
        this.price = getPrice();
    }

    public void setSize(char size) {
        this.size = getSize();
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
        Car car1 = new Car("red", 700234.75, 'm');

        System.out.println(car1.toString());
    }
}
