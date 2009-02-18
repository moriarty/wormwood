public class Drop implements Command {
   String itemName;

   public void exec (Player p) {
      Room r = p.getRoom();
      Item item = p.getItem(itemName);
      boolean removed = p.removeItem(itemName);

      // If the item was dropped
      if (removed == true) {
         // Drop it into the room 
         r.addItem(item);
         System.out.println("You dropped " + itemName + ".");
      }
      else 
         System.out.println("You don't have a " + itemName + " to drop.");
   }

   public void setDir (char d) {}

   public void setName (String itemToDrop) {
      itemName = itemToDrop;
   }
}
