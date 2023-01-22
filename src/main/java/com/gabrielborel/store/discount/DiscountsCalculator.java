package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountsCalculator {
   public BigDecimal calculate(Budget budget) {
      Discount discountsChain = new DiscountBasedOnBudgetItemsQuantity(
         new DiscountBasedOnBudgetValue(
            new WithoutDiscount()
         )
      );

      return discountsChain.calculate(budget);
   }
}
