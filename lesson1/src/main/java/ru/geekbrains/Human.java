package ru.geekbrains;

public class Human implements Action{

   public int maxrun;
  public int maxjump;

  public void Human(int maxjump, int maxrun){
      this.maxrun = maxrun;
      this.maxjump = maxjump;


  }
    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }

}
