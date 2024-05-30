package examples.inheritance.birds;

import examples.inheritance.move.IMovable;

public class Penguin extends Bird {

  public Penguin(String name, String color, IMovable movable) {
    super(name, color, movable);
  }

  public void swim() {

    System.out.println("I am swimming ^_^");
  }
}
