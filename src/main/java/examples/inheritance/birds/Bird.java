package examples.inheritance.birds;

import examples.inheritance.move.IMovable;

public class Bird {

  private String name;

  private String color;

  private IMovable movable;

  Bird(String name, String color, IMovable movable) {

    this.name = name;
    this.color = color;
    this.movable = movable;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void move() {
    this.movable.move();
  }

  public void setMoveType(IMovable movable) {
    this.movable = movable;
  }
}
