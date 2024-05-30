package examples.inheritance.birds;

import examples.inheritance.move.IMovable;

public class Parrot extends Bird {

  public Parrot(String name, String color, IMovable movable) {
    super(name, color, movable);
  }

  public void repeat(String sentence) {

    System.out.println(sentence);
  }
}
