
public class Container {
    
    private int container;
    //private int amount;
    
    public Container() {
        this.container = 0;
    }
    
    public int contains() {
        return container;
    }
    
    public void add(int amount) {
        if (container + amount >= 100) {
            container = 100;
        } else if (amount > 0) {
            container = container + amount;
        }
    }
    
    public void remove(int amount) {
        if (amount > container) {
            container = 0;
        } else {
            container = container - amount;
        }
    }
    
    public String toString() {
        return container + "/100";
    }
}
