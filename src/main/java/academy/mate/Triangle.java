package academy.mate;

public class Triangle extends Figure {
    private Color color;
    private int cathetFirst;
    private int cathetSecond;


    public Triangle() {
        this.color = getRandomColor();
        this.cathetFirst = getRandomValue();
        this.cathetSecond = getRandomValue();
    }

    @Override
    public String draw() {
        return "прямугольный треугольник, площадь: " + this.getArea() + " кв. ед.," +
                " длина гипотенузы: " + getHypotenuse() +
                " цвет: " + this.color.label;
    }

    @Override
    public int getArea() {
        return (cathetFirst * cathetSecond) / 2;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getCathetFirst() {
        return cathetFirst;
    }

    public void setCathetFirst(int cathetFirst) {
        this.cathetFirst = cathetFirst;
    }

    public int getCathetSecond() {
        return cathetSecond;
    }

    public void setCathetSecond(int cathetSecond) {
        this.cathetSecond = cathetSecond;
    }

    public int getHypotenuse() {
        return (int) Math.sqrt((cathetFirst * cathetFirst) + (cathetSecond * cathetSecond));
    }
}
