package net.javabackend.designpatterns.builder;

/**
 * This class is used to represent a house. It is used to show how to implement a builder pattern in Java
 */
public class House {

  private final String type;
  private final int rooms;
  private final int bathrooms;
  private final int floors;
  private final boolean hasGarage;

  private House(Builder builder) {
    this.type = builder.type;
    this.rooms = builder.rooms;
    this.bathrooms = builder.bathrooms;
    this.floors = builder.floors;
    this.hasGarage = builder.hasGarage;
  }

  public static class Builder {
    private final String type;
    private int rooms;
    private int bathrooms;
    private int floors;
    private boolean hasGarage;

    public Builder(String type) {
      this.type = type;
    }

    public Builder rooms(int rooms) {
      this.rooms = rooms;
      return this;
    }

    public Builder bathrooms(int bathrooms) {
      this.bathrooms = bathrooms;
      return this;
    }

    public Builder floors(int floors) {
      this.floors = floors;
      return this;
    }

    public Builder hasGarage(boolean hasGarage) {
      this.hasGarage = hasGarage;
      return this;
    }

    public House build() {
      return new House(this);
    }
  }


    public static void main(String[] args) {
      House house = new House.Builder("Casa de campo")
          .rooms(3)
          .bathrooms(2)
          .floors(2)
          .hasGarage(true)
          .build();

      System.out.println("House type: " + house.type);
      System.out.println("Rooms: " + house.rooms);
      System.out.println("Bathrooms: " + house.bathrooms);
      System.out.println("Floors: " + house.floors);
      System.out.println("Has garage: " + house.hasGarage);

    }


}


