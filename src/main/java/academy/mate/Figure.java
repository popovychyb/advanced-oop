package academy.mate;

import java.util.Random;

public abstract class Figure {
    public abstract String draw();

    public abstract int getArea();

    public abstract Color getColor();

    Color getRandomColor() {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }

    int getRandomValue() {
        int min = 1;
        int max = 10;
        return new Random().nextInt(max - min + 1) + min;
    }
}
