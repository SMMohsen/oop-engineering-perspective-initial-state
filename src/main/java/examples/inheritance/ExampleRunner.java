package examples.inheritance;

import examples.inheritance.birds.Bat;
import examples.inheritance.birds.Parrot;
import examples.inheritance.birds.Penguin;
import examples.inheritance.move.Fly;
import examples.inheritance.move.Jump;
import examples.inheritance.move.Walk;


public class ExampleRunner {

  public static void main(String[] args) {

    Fly fly = new Fly();
    Walk walk = new Walk();
    Jump jump = new Jump();

    Parrot parrot = new Parrot("bebo", "blue",fly);
    Penguin penguin = new Penguin("pngo", "white", walk);
    Bat bat = new Bat("batbot", "black", jump);

    System.out.print("I am parrot, ");
    parrot.move();
    System.out.print("I am penguin, ");
    penguin.move();
    System.out.print("I am bat, ");
    bat.move();

    parrot.repeat("Don't repeat after me");

    penguin.swim();
  }
}
