package ru.geekbrains;

public class Cat implements Action{
    public int maxrun;
    public int maxjump;

    public void Cat(int maxjump, int maxrun) {
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Кот допрыгал");

    }
}

