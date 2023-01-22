package com.gabrielborel.store.budget.status;

import com.gabrielborel.store.budget.Budget;

public class Disapproved extends BudgetStatus {
   public void finish(Budget budget) {
      budget.setStatus(new Finished());
   }
}
