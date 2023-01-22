package com.gabrielborel.store.tax;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class ISS implements TaxType {
   public BigDecimal calculate(Budget budget) {
      return budget.getValue().multiply(new BigDecimal("0.06"));
   }
}
