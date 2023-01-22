package com.gabrielborel.store;

import com.gabrielborel.store.budget.Budget;
import com.gabrielborel.store.tax.CMS;
import com.gabrielborel.store.tax.ISS;
import com.gabrielborel.store.tax.TaxesCalculator;

import java.math.BigDecimal;

public class TaxesTest {
   public static void main(String[] args) {
      Budget budget = new Budget(new BigDecimal("1000"), 1);
      TaxesCalculator taxesCalculator = new TaxesCalculator();

      BigDecimal cmsTax = taxesCalculator.calculate(budget, new CMS());
      BigDecimal issTax = taxesCalculator.calculate(budget, new ISS());

      System.out.println(cmsTax);
      System.out.println(issTax);
   }
}
