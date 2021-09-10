public class Potion
{
  private String type;
  private int scaleFactor;
  
  public Potion(String type, int scaleFactor) 
  {
    this.type = type;
    this.scaleFactor = scaleFactor;
    
  }
  public void information() 
  {
  
    System.out.println("This potion is of type: " + this.type + ".\nThe scale factor of this potion is: " + this.scaleFactor); 
  }
}