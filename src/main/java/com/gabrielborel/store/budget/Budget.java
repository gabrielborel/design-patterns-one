package com.gabrielborel.store.budget;

import java.math.BigDecimal;

public class Budget {
   private final BigDecimal value;
   private Integer itemsQuantity;

   public Budget(BigDecimal value, Integer itemsQuantity) {
      this.value = value;
      this.itemsQuantity = itemsQuantity;
   }

   public BigDecimal getValue() {
      return this.value;
   }

   public Integer getItemsQty() {
      return this.itemsQuantity;
   }
}