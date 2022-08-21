
public class Bird {
    
    private String birdName;
    private String latinName;
    private int timesObserved;

    public Bird(String birdName, String latinName) {
        this.birdName = birdName;
        this.latinName = latinName;
        this.timesObserved = 0;
    }

    public String getBirdName() {
        return birdName;
    }

    public String getLatinName() {
        return latinName;
    }
    
    public int timesObserved() {
        timesObserved++;
        return timesObserved;
    }

    @Override
    public String toString() {
        return birdName + " (" + latinName + "): " + timesObserved + " observations";
    }
    
    
}
