package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public abstract class Discount {
   protected Discount next;

   public Discount(Discount next) {
      this.next = next;
   }

   public BigDecimal calculate(Budget budget) {
      if (this.shouldApplyDiscount(budget)) {
         return this.performCalculation(budget);
      }

      return this.next.calculate(budget);
   }

   protected abstract BigDecimal performCalculation(Budget budget);
   public abstract boolean shouldApplyDiscount(Budget budget);
}
