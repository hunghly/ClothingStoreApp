public abstract class Pants implements Clothing {

    public String size;
    public String color;

    public Pants(String size, String color) {
        this.size = size;
        this.color = color;
    }

    // Color does not change depending on country, therefore, this method does not need to be abstract
    public String getColor() {
        return this.color;
    }


    // Pant sizes change depending on country, which is why this is an abstract method
    public abstract String getSize();

}
