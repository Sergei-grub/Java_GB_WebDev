package Seminar_1.ru.gb.jcore.sample;

import Seminar_1.ru.gb.jcore.regular.Decorator;
import Seminar_1.ru.gb.jcore.regular.OtherClass;

/**
 * 7 * Основной класс приложения. Здесь мы можем описать
 * 8 * его основное назначение и способы взаимодействия с ним.
 * 9 *
 */
public class Main {
    /**
     * Точка входа в программу. С неё всегда всё начинается.
     *
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        int result = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(result));
        result = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}
