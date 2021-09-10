import java.util.Scanner;
import java.util.Random;

    


public class TextAdventureGame 
{
  public static void main(String[] args0) 
  {
    int userHealth = 60;
    boolean gameCompleted = false;
    int[] floorOne = {0,1,2,3,4};
    int[] floorTwo = {5,6,7,8};
    int[] floorThree = {9,10,11};
    int startingLocation = 0;
    String inventorySlotOne = " ";
    String inventorySlotTwo = " ";
    String inventorySlotThree = " ";
    String inventorySlotFour = " ";
    String inventorySlotFive =" ";
    String inventorySlotSix = " ";
    boolean inventorySlotOneOpen = true;
    boolean inventorySlotTwoOpen = true;
    boolean inventorySlotThreeOpen = true;
    boolean inventorySlotFourOpen = true;
    boolean inventorySlotFiveOpen = true;
    boolean inventorySlotSixOpen = true;
    GeneralCommand listCommands = new GeneralCommand("This command lists all the avaiable commands in the game", "");
    GeneralCommand lookAround = new GeneralCommand("This command allows you to look around a room for chests and monsters", "");
    GeneralCommand openChest = new GeneralCommand("This command allows you to open a chest in the room if present", "");
    GeneralCommand throwItemAway = new GeneralCommand("This command allows you to throw away an item out of any inventory slot", "");
    
    FightCommand useSlotOne = new FightCommand("Use item: " + inventorySlotOne, "");
    FightCommand useSlotTwo = new FightCommand("Use item: " + inventorySlotTwo, "") ;
    FightCommand useSlotThree = new FightCommand("Use item: " + inventorySlotThree, "");
    FightCommand useSlotFour= new FightCommand("Use item: " + inventorySlotFour, "");
    FightCommand useSlotFive= new FightCommand("Use item: " + inventorySlotFive, "");
    FightCommand useSlotOSix= new FightCommand("Use item: " + inventorySlotSix, "");
    while (userHealth > 0 || gameCompleted == false) 
    {
      System.out.println("Welcome to the best text adventure game written in Java.\nYour quest shall be here to pick up items and deafeat enemies as you clear rooms. There are 12 rooms you must clear to win the game.");
      Scanner userNameInput = new Scanner(System.in);
      System.out.println("Enter your name grateful warrior: ");
      String userName = userNameInput.nextLine();
      System.out.println("Nice to meet you, " + userName + ". Good luck on your quest my liege.");
      //String receivedMessage = roomZero;
      //System.out.println(receivedMessage);
      
    }
      
    }
  public static String roomZero() 
  {
    Potion strength25 = new Potion("Strength", 25);
    Weapon ironSword = new Weapon("Basic", 15, 28);
    Dice weakDie = new Dice("Weak", 5);
    Monster griffin = new Monster("Easy", "Griffin", 15, 20, 0);
    String item1 = strength25.toString();
    String item2 = weakDie.toString();
    String item3 = ironSword.toString();
    Room roomZero = new Room(0, griffin, item1, item2, item3);
    String roomMessage = roomZero.toString();
    return roomMessage;
  }
}


