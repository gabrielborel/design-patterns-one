package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountBasedOnBudgetItemsQuantity extends Discount {
   public DiscountBasedOnBudgetItemsQuantity(Discount next) {
      super(next);
   }

   public BigDecimal performCalculation(Budget budget) {
      return budget.getValue().multiply(new BigDecimal("0.1"));
   }

   public boolean shouldApplyDiscount(Budget budget) {
      return budget.getItemsQty() > 5;
   }
}
