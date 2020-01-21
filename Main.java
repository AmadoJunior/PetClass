
class Pet{
  private String name, type;
  private double weight;

  public Pet(String name, String type, double weight){
    this.name = name;
    this.type = type;
    this.weight = weight;
  }

  public Pet(String type){
    this.name = "Unknown";
    this.type = type;
    this.weight = 0.0;
  }

  public String toString(){
    return "Name: " + this.name + "Type: " + this.type + "Weight: " + this.weight;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setWeight(double weight){
    this.weight = weight;
  }
}

public class Main {
  public static void main(String[] args) {
    Pet pet1 = new Pet("Sparky", "Dog", 20.5);
    pet1.toString();
  }
}