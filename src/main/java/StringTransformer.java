public abstract class StringTransformer {
   private String backup;

   abstract void execute(StringDrink drink);

   public void saveBackup(StringDrink drink) {
      backup = drink.getText();
   }

   public void undo(StringDrink drink){
      drink.setText(backup);
   }
}
