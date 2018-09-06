// solution to excercise of java how to program 3.14
public class Date {
    private int day;
    private int month;
    private int year;
    public Date ( int day, int month, int year ) {
        if ( (day > 0 && day <= 31) && ( month > 0 && month <=12 ) && year > 0 ) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }
    public void setDay( int day ){
        if ( day > 0 && day <=31 )
            this.day = day;
    }
    public void setMonth ( int month ) {
        if ( month > 0 && month <=12 )
            this.month = month;
    }
    public void setYear ( int year ) {
        if ( year > 0)
            this.year = year;
    }
    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }
    public void displayDate() {
        System.out.printf("%02d/%02d/%d", this.day, this.month, this.year);
    }
    public static void main( String[] args ) {
        Date date = new Date( 8, 02, 1998);
        date.displayDate();
    }
}