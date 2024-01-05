package open_closed_principle.after;

public class Rectangle implements Shape{

    private int length;
    private int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        // Draw the rectangle...
    }
}
