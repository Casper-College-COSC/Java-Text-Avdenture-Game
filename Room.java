public class Room 
{
  private int roomNumber;
  private Monster monsterInRoom;
  private String chestItemOne;
  private String chestItemTwo;
  private String chestItemThree;
 
  public Room(int roomNumber, Monster monsterInRoom, String chestItemOne, String chestIteTwo, String chestItemThree) {
    this.roomNumber = roomNumber;
    this.monsterInRoom = monsterInRoom;
    this.chestItemOne = chestItemOne;
    this.chestItemTwo = chestItemTwo;
    this.chestItemThree = chestItemThree;
  }
  public void roomInformation() {
    System.out.println("This is room number: " + roomNumber + ".");
  }
  
}
