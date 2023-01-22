package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class WithoutDiscount extends Discount {
   public WithoutDiscount() {
      super(null);
   }

   public BigDecimal calculate(Budget budget) {
      return BigDecimal.ZERO;
   }
}
