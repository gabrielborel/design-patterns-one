package com.gabrielborel.store.budget.status;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class Approved extends BudgetStatus {
   public BigDecimal calculateExtraDiscountValue(Budget budget) {
      return budget.getValue().multiply(new BigDecimal("0.02"));
   }

   public void finish(Budget budget) {
      budget.setStatus(new Finished());
   }
}
