package Class;
class Closet extends Furniture {
    private int width;
    private int height;
    private int depth;

    public Closet(String color, String style, int width, int height, int depth) {
        super(color, style);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public void displayInfo() {
        System.out.println("Колір: " + getColor());
        System.out.println("Стиль: " + getStyle());
        System.out.println("Ширина: " + getWidth());
        System.out.println("Висота: " + getHeight());
        System.out.println("Глибина: " + getDepth());
    }
}




