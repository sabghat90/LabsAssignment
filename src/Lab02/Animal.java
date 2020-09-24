package Lab02;

public class Animal {
    public String specie;
    public String color;
    public int numOfFeet;
    public boolean wings;

    public Animal(String specie, String color, int numOfFeet, boolean wings) {
        this.specie = specie;
        this.color = color;

        if (numOfFeet != 2 && numOfFeet != 4)
            throw new IllegalArgumentException("Wrong Number of feet");
        this.numOfFeet = numOfFeet;

        this.wings = wings;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumOfFeet() {
        return numOfFeet;
    }

    public void setNumOfFeet(int numOfFeet) {
        if (numOfFeet == 2 && numOfFeet == 4)
            throw new IllegalArgumentException("Wrong Number of feet");
        this.numOfFeet = numOfFeet;
    }

    public boolean isWings() {
        return wings;
    }

    public void setWings(boolean wings) {
        this.wings = wings;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", color='" + color + '\'' +
                ", numOfFeet=" + numOfFeet +
                ", wings=" + wings +
                '}';
    }
}
