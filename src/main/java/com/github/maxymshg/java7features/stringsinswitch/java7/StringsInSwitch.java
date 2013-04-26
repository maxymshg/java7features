package com.github.maxymshg.java7features.stringsinswitch.java7;

public class StringsInSwitch {

  enum Planet {
    MERCURY,
    VENUS,
    EARTH,
    MARS,
    JUPITER,
    SATURN,
    URANUS,
    NEPTUNE;
  }

  public static void main(String[] args) {
    if (args.length != 1) {
      System.err.println("Usage: java {Planet name}");
      System.exit(-1);
    }
    String name = args[0].toUpperCase();
    switch (name) {
      case "MERCURY":
        System.out.println("You have been transfered on: " + Planet.MERCURY);
        break;
      case "VENUS":
        System.out.println("You have been transfered on: " + Planet.VENUS);
        break;
      case "EARTH":
        System.out.println("You have been transfered on: " + Planet.EARTH);
        break;
      case "MARS":
        System.out.println("You have been transfered on: " + Planet.MARS);
        break;
      case "JUPITER":
        System.out.println("You have been transfered on: " + Planet.JUPITER);
        break;
      case "SATURN":
        System.out.println("You have been transfered on: " + Planet.SATURN);
        break;
      case "URANUS":
        System.out.println("You have been transfered on: " + Planet.URANUS);
        break;
      case "NEPTUNE":
        System.out.println("You have been transfered on: " + Planet.NEPTUNE);
        break;
      default:
        System.out.println("Transporter is not working.");
        break;
    }

  }
}
