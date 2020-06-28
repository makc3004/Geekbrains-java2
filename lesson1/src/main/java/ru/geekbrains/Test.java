package ru.geekbrains;

public class Test {
    //описываем массив в котором проверяем на прохождение стены и дорожки всеми участниками c выводом в консоль
    public static void main(String[] args) {

        Object[][] objects = new Object[3][2];

        Action[] members = {new Cat(), new Human(), new Robot()};
        Action[] obstacles = {new Wall(), new RunningTrack()};
        for (int i = 0; i < members.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {


            }
        }
    }
}
