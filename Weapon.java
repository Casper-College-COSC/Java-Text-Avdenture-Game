public class Weapon
{
  private String type;
  private int attackDamage;
  private int durability;
  
  public Weapon(String type, int attackDamage, int durabiltiy) 
  {
    this.type = type;
    this.attackDamage = attackDamage;
    this.durability = durability;
    
}
  public void information() 
  {
    System.out.println("This weapon is of type: " + this.type + ".\nThe weapon has  an attack damage of: " + this.attackDamage + ".\nThe current durability of the weapon is: " + this.durability);
    
  }
              
}