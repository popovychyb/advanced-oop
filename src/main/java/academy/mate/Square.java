package academy.mate;

public class Square extends Figure {
    private Color color;
    private int width;

    public Square() {
        this.color = getRandomColor();
        this.width = getRandomValue();
    }

    @Override
    public String draw() {
        return "квадрат, площадь: " + this.getArea() + " кв. ед.," +
                " длина стороны: " + width + " ед.," +
                " цвет: " + color.label;
    }

    @Override
    public int getArea() {
        return width * width;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
