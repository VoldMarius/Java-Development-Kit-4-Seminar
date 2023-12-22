package HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRegister {
    private List<Employee> employes;

    public EmployeeRegister() {
        employes = new ArrayList<>();
    }


    public void addNewEmployee(Employee employee) {// функция для Прибытие нового сотрудника

        if (!employes.contains(employee)) {
            employes.add(employee);
        }
    }
}
