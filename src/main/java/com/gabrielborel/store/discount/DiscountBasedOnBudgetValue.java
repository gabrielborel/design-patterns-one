package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountBasedOnBudgetValue extends Discount {
   public DiscountBasedOnBudgetValue(Discount next) {
      super(next);
   }

   public BigDecimal calculate(Budget budget) {
      if (budget.getValue().compareTo(new BigDecimal("500")) > 0) {
         return budget.getValue().multiply(new BigDecimal("0.05"));
      }

      return this.next.calculate(budget);
   }
}
