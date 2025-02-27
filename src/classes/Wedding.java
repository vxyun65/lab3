package classes;

import interfaces.Event;

public final class Wedding implements Event {
    @Override
    public void prepare() {
        System.out.println("Начинается подготовка к свадьбе...");
    }

    @Override
    public void run() {
        System.out.println("Свадьба в полном разгаре!");
    }

    @Override
    public void finish() {
        System.out.println("Празднование завершено! Король лежит пьяный под столом...");
    }
}
