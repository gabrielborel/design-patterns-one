package com.gabrielborel.store.tax;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class TaxesCalculator {
   public BigDecimal calculate(Budget budget, TaxType taxType) {
      return taxType.calculate(budget);
   }
}
