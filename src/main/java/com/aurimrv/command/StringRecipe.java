package com.aurimrv.command;

import java.util.List;

public class StringRecipe {
   private List<StringTransformer> transformers;

   public StringRecipe(List<StringTransformer> transformers) {
      this.transformers = transformers;
   }

   public void mix(StringDrink drink) {
      transformers.forEach(t -> t.execute(drink));
   }
}
