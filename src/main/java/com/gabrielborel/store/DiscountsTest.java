package com.gabrielborel.store;

import com.gabrielborel.store.budget.Budget;
import com.gabrielborel.store.discount.DiscountsCalculator;

import java.math.BigDecimal;

public class DiscountsTest {
   public static void main(String[] args) {
      Budget budget = new Budget(new BigDecimal("1000"), 2);
      Budget secondBudget = new Budget(new BigDecimal("300"), 9);
      DiscountsCalculator discountsCalculator = new DiscountsCalculator();

      System.out.println(discountsCalculator.calculate(budget));
      System.out.println(discountsCalculator.calculate(secondBudget));
   }
}
