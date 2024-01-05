package open_closed_principle.before;

public class ShapePrinter {

    public void drawShape(Object shape) {
        if(shape instanceof Rectangle) {
            // Draw Rectangle...
        } else if(shape instanceof Square) {
            // Draw Square...
        }
    }

}
