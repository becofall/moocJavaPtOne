
import java.util.ArrayList;

public class Points {
    
    private ArrayList<Integer> pointsArray;
    private ArrayList<Integer> passingPointsArray;
    
    public Points() {
        this.pointsArray = new ArrayList<>();
        this.passingPointsArray = new ArrayList<>();
    }
    
    public void addToArray(int points) {
        if (points >= 0 && points <= 100) {
            this.pointsArray.add(points);
        }
    }
    
    public void addToPassingArray(int points) {
        if (points >=50 && points <=100) {
            this.passingPointsArray.add(points);
        }
    }
    
    public int totalPoints() {
        int total = 0;
        for (int i = 0; i < this.pointsArray.size(); i++) {
            total = total + pointsArray.get(i);
        }
        return total;
    }
    
    public double passingTotalPoints() {
        int total = 0;
        for (int i = 0; i < pointsArray.size(); i++) {
            if (50 <= pointsArray.get(i)) {
                total = total + pointsArray.get(i);
            }
        }    
    return (double) total;
    }
    
    public double averagePoints() {
        int total = totalPoints();
        int size = pointsArray.size();
        double average = total / size;
        return average;
    }
    
    public double averagePassingPoints() {
        double total = passingTotalPoints();
        int size = passingPointsArray.size();
        return total / size;
    }
    
    public double passPercentage() {
        double passing = passingPointsArray.size();
        double participants = pointsArray.size();
        return 100.0 * (passing / participants);
    }
    
    public int gradeDistribution(int points) {
        int grade;
        if(points < 50) {
            grade = 0;
        } else if(points < 60) {
            grade = 1;
        } else if(points < 70) {
            grade = 2;
        } else if(points <80) {
            grade = 3;
        } else if(points <90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }
    
    public void pointsToGrade() {
        ArrayList<Integer> grade = new ArrayList<>();
        for (Integer point : pointsArray) {
            if (point < 50) {
                grade.add(0);
            } else if (point < 60) {
                grade.add(1);
            } else if (point < 70) {
                grade.add(2);
            } else if (point < 80) {
                grade.add(3);
            } else if (point < 90) {
                grade.add(4);
            } else {
                grade.add(5);
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grade,i));
        }
    }

    private String stars(ArrayList<Integer> grades, int number) {
        String star = "";
        for (Integer grade : grades) {
            if(grade==number) {
                star+="*";
            }
        }
        return star;
    }

    
    
//    public int printGradeDistribution(int grade) {
//        int stars = 0;
//        //while(grade >= 0) {
//            //System.out.println(grade + ": ");
//        for(int i = 0; i < pointsArray.size(); i++) {
//            if (gradeDistribution(pointsArray.get(i)) == grade){
//                stars++;
//            }
//        }
//            System.out.println("");
//            grade--;
//        return stars;
//    }
//    
//    public static void printStars(int number) {
//        int starNumber = 1;
//        while (starNumber <= number) {
//            System.out.println("*");
//        }
//    }
    
//    public int arraySize() {
//        return pointsArray.size();
//    }
//    
//    public int passingSize() {
//        return passingPointsArray.size();
//    }
//    public void printPassingPointsAverage() {
//        int total = 0;
//        int size = 0;
//        for (int i = 0; i < pointsArray.size(); i++) {
//            if (50 <= pointsArray.get(i)) {
//                total = total + pointsArray.get(i);
//                size++;
//            }
//        }
//        if (total == 0) {
//            System.out.println("-");
//        } else {
//            System.out.println(total / size);
//        }
//    }
}
