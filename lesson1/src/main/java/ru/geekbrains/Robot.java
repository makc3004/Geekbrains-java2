package ru.geekbrains;

public class Robot implements Action {
    public int maxrun;
    public int maxjump;

    public void Robot(int maxjump, int maxrun) {
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }
        @Override
        public void run(){
            System.out.println("Робот пробежал");


        }

        @Override
        public void jump(){
            System.out.println("Робот допрыгал");


        }
    }


