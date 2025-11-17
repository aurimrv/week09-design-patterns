package com.aurimrv.composite;

import com.aurimrv.command.StringDrink;
import com.aurimrv.command.StringTransformer;

import java.util.List;

public class StringTransformerGroup extends StringTransformer {
   List<StringTransformer> transformers;

   public StringTransformerGroup(List<StringTransformer> transformers) {
      super();
      this.transformers = transformers;
   }

   @Override
   public void execute(StringDrink drink) {
      transformers.forEach(t -> t.execute(drink));
   }
}
