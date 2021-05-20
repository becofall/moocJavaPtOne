public class PaymentCard {
    private double balance;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }
    
    public void eatAffordably() {
        if (this.balance - 2.6 >= 0) {
            this.balance = this.balance - 2.6;
        }
    }
    
    public void eatHeartily() {
        if (this.balance - 4.6 >= 0) {
            this.balance = this.balance - 4.6;
        }
    }
    
    public void addMoney(double add) {
        if (add > 0) {
            if (this.balance + add > 150) {
                this.balance = 150;
            } else {
                this.balance = this.balance + add;
            }
        }    
    }
    
    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}
