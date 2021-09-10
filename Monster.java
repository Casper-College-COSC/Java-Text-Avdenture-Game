public class Monster
{
    private String type;
    private String name;
    private int attack;
    private int health;
    private int roomNumber;
    
    public Monster(String type, String name, int attack, int health, int roomNumber) 
  {
    this.type = type;
    this.name = name;
    this.attack = attack;
    this.health = health;
    this.roomNumber = roomNumber;
    }
    public void information()
    
    {
      System.out.println("This monster is of type: " + this.type + ".\nThe monster is called a(n): " + this.name + ".\nThe monster has an attack of: " + this.attack + ".\n The monster has a health amount of: " + this.health + ".\n The location of the monster is: " + this.roomNumber);
      
      
    }
}