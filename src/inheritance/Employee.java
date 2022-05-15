package inheritance;

/**
 * Created by Nahid Chowdhury
 * Date: 5/15/2022
 * Time: 2:06 PM
 */

public class Employee extends Person {

    private String employeeId;
    private String title;

    public Employee() {
        super("Nahid");
        System.out.println("In Employee Default Constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
