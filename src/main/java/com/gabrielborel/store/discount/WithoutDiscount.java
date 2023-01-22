package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount {
   public WithoutDiscount() {
      super(null);
   }

   public BigDecimal performCalculation(Budget budget) {
      return BigDecimal.ZERO;
   }

   public boolean shouldApplyDiscount(Budget budget) {
      return true;
   }
}
