package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountBasedOnBudgetValue extends Discount {
   public DiscountBasedOnBudgetValue(Discount next) {
      super(next);
   }

   public BigDecimal performCalculation(Budget budget) {
      return budget.getValue().multiply(new BigDecimal("0.05"));
   }

   public boolean shouldApplyDiscount(Budget budget) {
      return budget.getValue().compareTo(new BigDecimal("500")) > 0;
   }
}
