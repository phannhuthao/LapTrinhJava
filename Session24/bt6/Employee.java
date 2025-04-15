package Session24.bt6;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Role> roles = new ArrayList<>();

    public Employee(String name) {
        this.name = name;
    }

    public void addRole(Role role) {
        roles.add(role);
    }

    public void performAllDuties() {
        System.out.println("Nhân viên: " + name);
        for (Role role : roles) {
            role.showPrint();
        }
        System.out.println();
    }
}
