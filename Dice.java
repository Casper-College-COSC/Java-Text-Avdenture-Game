public class Dice 
{
  private String type;
  private int numberOfSides;
  
  public Dice(String type, int numberOfSides) 
  {
    this.type = type;
    this.numberOfSides = numberOfSides;
  }
    
    public void information() {
      System.out.println("This die is of type: " + this.type + ".\nThe die has " + numberOfSides + "number of sides");
    
  }
  
}