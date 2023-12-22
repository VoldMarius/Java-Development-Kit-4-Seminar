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

    public Employee findEmployeeByExperience(int experience) { // функция поиска сотрудника по стажу

        for (int i = 0; i < employeeRegister.legth(); i++) {
            if (employeeRegister.getEmployee(i).getExperience() == experience) {
                System.out.println("Employee with " + experience + " years : "
                        + employeeRegister.getEmployee(i).getName());
            }

        }
        System.out.printf("Employee with " + experience + " years' experience not found");
        return null;
    }
        public  Employee findEmployeeByName () { // функция поиска сотрудника по имени
            InputsOperations in = null;
            String findName = in.inputName();
            try {
                for (int i = 0; i < employeeRegister.legth(); i++) {
                    if (employeeRegister.getEmployee(i).getName().equals(findName)) {
                        return employeeRegister.getEmployee(i);
                    }
                }
            } catch (RuntimeException e) {
                System.out.printf("Employee named" + findName + " not found");
            }
            return null;
     }


        public void findEmployeeByIDNumber() {// функция поиска сотрудника по ID
            InputsOperations in = null;
            int findID = in.inputID();
            try {
                for (int i = 0; i < employeeRegister.legth(); i++) {
                    if (employeeRegister.getEmployee(i).getIdentificationNumber() == findID) {
                        System.out.println(employeeRegister.getEmployee(i));
                        break;
                    }
                }
            } catch (RuntimeException e) {
                System.out.printf("Employee with personnel number" + findID + "  not found");
            }
        }

    }
