package com.gabrielborel.store.tax;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public interface TaxType {
   BigDecimal calculate(Budget budget);
}
