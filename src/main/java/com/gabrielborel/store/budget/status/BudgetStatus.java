package com.gabrielborel.store.budget.status;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public abstract class BudgetStatus {
   public BigDecimal calculateExtraDiscountValue(Budget budget) {
      return BigDecimal.ZERO;
   }

   public void approve(Budget budget) {
      throw new RuntimeException("Budget cannot be approved.");
   }

   public void disapprove(Budget budget) {
      throw new RuntimeException("Budget cannot be reproved.");
   }

   public void finish(Budget budget) {
      throw new RuntimeException("Budget cannot be finished.");
   }
}
