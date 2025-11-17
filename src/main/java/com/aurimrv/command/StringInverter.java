package com.aurimrv.command;

public class StringInverter extends StringTransformer {
   @Override
   public void execute(StringDrink drink) {
      saveBackup(drink);
      drink.setText(new StringBuilder(drink.getText()).reverse().toString());
   }
}
