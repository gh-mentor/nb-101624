import java.util.ArrayList;
import java.util.List;


    /*
    Create a class called 'CompanyAddress'.
    private fields:
    - address: a string that stores the company's address
    - city: a string that stores the company's city
    - state: a string that stores the company's state
    - zip: a string that stores the company's zip code
    public methods:
    - A constructor that initializes the address, city, state, and zip fields
    - 'GetFullAddress' returns the full address as a string
    */


public class Company {
    private String name;
    private CompanyAddress address;
    private String phoneNumber;
    private List<Department> departments;

    public Company(String name, CompanyAddress address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    public Department getDepartment(int id) {
        for (Department department : departments) {
            if (department.getId() == id) {
                return department;
            }
        }
        return null; // or throw an exception
    }

    public List<Department> listDepartments() {
        return new ArrayList<>(departments);
    }
}




class Department {
    private int id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}