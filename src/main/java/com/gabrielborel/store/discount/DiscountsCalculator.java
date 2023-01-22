package com.gabrielborel.store.discount;

import com.gabrielborel.store.budget.Budget;

import java.math.BigDecimal;

public class DiscountsCalculator {
   public BigDecimal calculate(Budget budget) {
      Discount discount = new DiscountBasedOnBudgetItemsQuantity(
         new DiscountBasedOnBudgetValue(
            new WithoutDiscount()
         )
      );

      return discount.calculate(budget);
   }
}
