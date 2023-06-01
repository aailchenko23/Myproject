package Class;
    class Chair extends Furniture {
        private String type;
        private int width;
        private int height;

        public Chair(String color, String style, String type, int width, int height) {
            super(color, style);
            this.type = type;
            this.width = width;
            this.height = height;
        }

        public String getType() {
            return type;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public void displayInfo() {
            System.out.println("Колір: " + getColor());
            System.out.println("Стиль: " + getStyle());
            System.out.println("Тип: " + getType());
            System.out.println("Ширина: " + getWidth());
            System.out.println("Висота: " + getHeight());
        }
}

