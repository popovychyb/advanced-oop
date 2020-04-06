package academy.mate;

public class Trapeze extends Figure {
    private Color color;
    private int baseFirst;
    private int baseSecond;
    private int height;

    public Trapeze() {
        this.color = getRandomColor();
        this.baseFirst = getRandomValue();
        this.baseSecond = getRandomValue();
        this.height = getRandomValue();
    }

    @Override
    public String draw() {
        return "равнобедренная трапеция, площадь: " + this.getArea() + " кв. ед.," +
                " медиана: " + getMedian() + " ед.," +
                " цвет: " + color.label;
    }

    @Override
    public int getArea() {
        return (int) (0.5 * (baseFirst + baseSecond) * height);
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBaseFirst() {
        return baseFirst;
    }

    public void setBaseFirst(int baseFirst) {
        this.baseFirst = baseFirst;
    }

    public int getBaseSecond() {
        return baseSecond;
    }

    public void setBaseSecond(int baseSecond) {
        this.baseSecond = baseSecond;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMedian() {
        return (baseFirst + baseSecond) / 2;
    }
}
