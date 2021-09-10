public class FightCommand 
{
  private String definition;
  private String action;
  
  public FightCommand(String definition, String action) 
  {
    this.definition = definition;
    this.action = action;
  }
  public void information() 
  {
    System.out.println("This command has this definition: " + this.definition + ".\nThis command does the following action: " + this.action);
  }
}