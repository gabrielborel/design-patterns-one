package com.gabrielborel.store.budget.status;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class InAnalysis extends BudgetStatus {
   public BigDecimal calculateExtraDiscountValue(Budget budget) {
      return budget.getValue().multiply(new BigDecimal("0.05"));
   }

   public void approve(Budget budget) {
      budget.setStatus(new Approved());
   }

   public void reprove(Budget budget) {
      budget.setStatus(new Disapproved());
   }
}
