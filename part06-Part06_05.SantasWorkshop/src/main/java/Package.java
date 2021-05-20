import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts;
    
    //int totalWeight = 0;
//    int weight = gifts.getWeight();
    public Package() {
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int sum = 0;
        int index = 0;
        
        while (index < this.gifts.size()) {
            sum += this.gifts.get(index).getWeight();
            index++;
        }
        return sum;
    }
}
