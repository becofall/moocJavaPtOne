
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        if (this.month == 12 && this.day == 30) {
            this.year++;
            this.month = 1;
            this.day = 1;
        } else if (this.day == 30) {
            this.month++;
            this.day = 1;
        } else {
            this.day++;
        }
    }
    
    public void advance(int howManyDays) {
        int counter = 0;
        while (counter < howManyDays) {
            this.advance();
            counter++;
        }
        
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        
        int counter = 0;
        while (counter < days) {
            newDate.advance();
            counter++;
        }
        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
