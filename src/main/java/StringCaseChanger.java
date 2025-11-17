public class StringCaseChanger extends StringTransformer {
   @Override
   public void execute(StringDrink drink) {
      saveBackup(drink);
      StringBuilder sb = new StringBuilder();
      for(char c : drink.getText().toCharArray()) {
         if(Character.isUpperCase(c)) {
            sb.append(Character.toLowerCase(c));
         } else {
            sb.append(Character.toUpperCase(c));
         }
      }
      drink.setText(sb.toString());
   }
}
