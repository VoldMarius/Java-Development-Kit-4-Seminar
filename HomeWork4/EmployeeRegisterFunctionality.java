package HomeWork4;

public class EmployeeRegisterFunctionality {

    private EmployeeRegister employeeRegister ;


    public void addNewEmployee() { // Прибытие нового сотрудника
        System.out.println("Arrival of a new employee:\n");

        Employee newEmployee = new Employee();
        InputsOperations operations = new InputsOperations();

        newEmployee.setName(operations.inputName());
        newEmployee.setIdentificationNumber(operations.inputID());
        newEmployee.setPhoneNumbers(operations.inputContactNumber());
        newEmployee.setExperience(operations.inputExperience());
        employeeRegister.addNewEmployee(newEmployee);

    }

    public void findEmployeeByExperience( int experience) {


        for (int i = 0; i < employeeRegister.legth(); i++) {
            if (employeeRegister.getEmployee(i).getExperience() == experience) {
                System.out.println(employeeRegister.getEmployee(i).getName());
            }
        }
    }
}