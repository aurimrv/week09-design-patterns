package com.aurimrv.command;

public class StringReplacer extends StringTransformer {
   private char a;
   private char x;

   public StringReplacer(char a, char x) {
      this.a = a;
      this.x = x;
   }

   @Override
   public void execute(StringDrink drink) {
      saveBackup(drink);
      drink.setText(drink.getText().replace(a, x));
   }
}
