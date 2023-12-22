package HomeWork4;

import java.util.ArrayList;
import java.util.List;

import static java.awt.geom.Path2D.contains;

public class EmployeeRegister {
    private  List<Employee> employes;

    public EmployeeRegister() {
        employes = new ArrayList<>();
    }


    public void addNewEmployee(Employee employee) {// метод добавление нового сотрудника в справочник

        if (!employes.contains(employee)) {
            employes.add(employee);
        }
    }

    public Employee getEmployee(int IdentificationNumber) {
        return contains(IdentificationNumber) ? employes.get(IdentificationNumber) : null;
    }


    public boolean contains (int index) {
        return employes != null && employes.size()> index;
    }

    public int legth() {
        return employes.size();
    }

}
