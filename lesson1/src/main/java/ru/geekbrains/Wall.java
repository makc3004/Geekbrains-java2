package ru.geekbrains;

public class Wall implements Action {
    // определяем высоту стены
    int heightWall;

    public void MembersJump(int heightWall) {
    this.heightWall=heightWall;

    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }
}



