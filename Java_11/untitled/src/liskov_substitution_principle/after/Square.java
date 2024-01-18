package liskov_substitution_principle.after;

import liskov_substitution_principle.before.Rectangle;

public class Square implements Shape {

    int size;

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int area() {
        return size * size;
    }
}
