// solution to excercise 3.13 of java how to program
public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    public Employee ( String firstName, String lastName, double salary ) {
        this.firstName = firstName;
        this.lastName = lastName;
        if ( salary > 0.0 ) {
            this.salary = salary;
        }
    }
    public void setFirstName( String firstName ) {
        this.firstName = firstName;
    }
    public void setLastName( String lastName ) {
        this.lastName = lastName;
    }
    public void setSalary ( double salary ) {
        if ( salary > 0.0 ) {
            this.salary = salary;
        }
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public double getSalary() {
        return this.salary;
    }
    public void raiseSalary ( double percentage ) {
        if ( percentage > 0.0 ) {
            this.salary = this.salary + ( this.salary * (percentage / 100.00));
        }
    }
    public static void displayInfo( Employee employee ) {
        System.out.printf("%s %s's current salary is: %,.2f%n", employee.getFirstName(), employee.getLastName(), employee.getSalary());
    }
    public static void main( String[] args) {
        Employee em = new Employee( "John", "Doe", 10000.95);
        Employee en = new Employee ( "Lorem", "ipsum", 15000.91);
        displayInfo(em);
        displayInfo(en);
        em.raiseSalary(15);
        en.raiseSalary(25);
        displayInfo(em);
        displayInfo(en);
    }
}