
import java.util.ArrayList;


public class BirdDatabase {
    
    private ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String birdName, String latinName) {
        if(!containsBird(birdName)) {
            this.birds.add(new Bird(birdName, latinName));
        }
    }
    
    public boolean observation(String birdName) {
        for(Bird bird : birds) {
            if(bird.getBirdName().equals(birdName)) {
                bird.timesObserved();
                return true;
            }
        }
        return false;
    }
    
    public boolean containsBird(String birdName) {
        for(Bird bird : birds) {
            if(birdName.equals(bird)) {
                return true;
            }
        }
        return false;
    }
    
    public void printBird(String birdName) {
        for(Bird bird : birds) {
            if(bird.getBirdName().equals(birdName)) {
                System.out.println(bird.toString());
            }
        }
    }
    
    public void printBirds() {
        for(Bird bird : birds) {
            System.out.println(bird.toString());
        }
    }
    
    
}
