package Class;

public class Furniture {
    private String color;
    private String style;

    public Furniture(String color, String style) {
        this.color = color;
        this.style = style;
    }

    public String getColor() {
        return color;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Колір: " + color + ", Стиль: " + style;
    }
}


