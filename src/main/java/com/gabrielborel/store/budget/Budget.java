package com.gabrielborel.store.budget;

import com.gabrielborel.store.budget.status.BudgetStatus;
import com.gabrielborel.store.budget.status.InAnalysis;

import java.math.BigDecimal;

public class Budget {
   private BigDecimal value;
   private final Integer itemsQuantity;
   private BudgetStatus status;

   public Budget(BigDecimal value, Integer itemsQuantity) {
      this.value = value;
      this.itemsQuantity = itemsQuantity;
      this.status = new InAnalysis();
   }

   public void applyExtraDiscount() {
      BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);
      this.value = this.value.subtract(extraDiscountValue);
   }

   public void approve() {
      this.status.approve(this);
   }

   public void disapprove() {
      this.status.disapprove(this);
   }

   public void finish() {
      this.status.finish(this);
   }

   public BudgetStatus getStatus() {
      return status;
   }

   public void setStatus(BudgetStatus status) {
      this.status = status;
   }

   public BigDecimal getValue() {
      return this.value;
   }

   public Integer getItemsQty() {
      return this.itemsQuantity;
   }
}