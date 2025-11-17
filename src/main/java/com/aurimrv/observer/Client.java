package com.aurimrv.observer;

import com.aurimrv.command.StringDrink;
import com.aurimrv.command.StringRecipe;

public interface Client extends BarObserver {
   void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
}
