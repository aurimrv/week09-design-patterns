package com.aurimrv.command;

public abstract class StringTransformer {
   private String backup;

   public abstract void execute(StringDrink drink);

   public void saveBackup(StringDrink drink) {
      backup = drink.getText();
   }

   public void undo(StringDrink drink){
      drink.setText(backup);
   }
}
