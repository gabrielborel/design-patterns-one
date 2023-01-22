package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountBasedOnBudgetItemsQuantity extends Discount {
   public DiscountBasedOnBudgetItemsQuantity(Discount next) {
      super(next);
   }

   public BigDecimal calculate(Budget budget) {
      if (budget.getItemsQty() > 5) {
         return budget.getValue().multiply(new BigDecimal("0.1"));
      }

      return this.next.calculate(budget);
   }
}
