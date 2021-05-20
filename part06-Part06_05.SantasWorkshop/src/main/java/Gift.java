
public class Gift {
    
    private String name;
    private int itemWeight;
    
    public Gift (String name, int itemWeight) {
        this.name = name;
        this.itemWeight = itemWeight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.itemWeight;
    }
    
    public String toString() {
        return this.name + " (" + this.itemWeight + " kg)";
    }
}
