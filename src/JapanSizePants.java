public class JapanSizePants extends Pants {

    public JapanSizePants(String size, String color) {
        super(size, color);
    }

    @Override
    public String getSize() {
        return (Double.parseDouble(super.size) * 1.5) + "";
    }
}
