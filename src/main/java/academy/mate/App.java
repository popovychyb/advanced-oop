package academy.mate;

import java.util.Random;

//ADVANCED OOP
//Необходимо описать задачу с применением принципов ООП.
//Условие тестовой задачи:
//
//Дано объекты-фигуры следующих видов: квадрат, треугольник, круг, трапеция.
//Каждую фигуру можно нарисовать, получить ее площадь и цвет.
//Также фигуры имеют уникальные методы, например: вернуть радиус, длину гипотенузы, длину стороны и т. д.
//Нам необходимо сгенерировать случайный набор фигур, количество объектов в наборе также заранее неизвестно.
//После генерации массива нужно вывести весь список объектов, которые у нас имеются, например:
//
//Фигура: квадрат, площадь: 25 кв. ед., длина стороны: 5 ед., цвет: синий
//Фигура: треугольник, площадь: 12,5 кв.ед., гипотенуза: 7.1 ед., цвет: желтый
public class App {
    public static void main(String[] args) {
        int min = 1;
        int max = 10;
        int amount = new Random().nextInt(max - min + 1) + min;
        Figure[] figures = new Figure[amount];

        for (Figure figure : figures) {
            figure = getFigure(getRandomShape());
            System.out.println("Фигура: " + figure.draw());
        }
    }

    private static Figure getFigure(Shape shape) {
        Figure figure = null;
        if (shape.equals(Shape.CIRCLE)) {
            figure = new Circle();
        } else if (shape.equals(Shape.SQUARE)) {
            figure = new Square();
        } else if (shape.equals(Shape.TRAPEZE)) {
            figure = new Trapeze();
        } else {
            figure = new Triangle();
        }
        return figure;
    }

    private static Shape getRandomShape() {
        return Shape.values()[new Random().nextInt(Shape.values().length)];
    }
}
