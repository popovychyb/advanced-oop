package academy.mate;

public class Circle extends Figure {
    private Color color;
    private int radius;

    public Circle() {
        this.color = getRandomColor();
        this.radius = getRandomValue();
    }

    @Override
    public String draw() {
        return "круг, площадь: " + this.getArea() + " кв. ед.," +
                " диаметер: " + getDiameter() + " ед.," +
                " цвет: " + color.label;
    }

    @Override
    public int getArea() {
        return (int) (radius * radius * Math.PI);
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int getDiameter() {
        return radius + radius;
    }
}
