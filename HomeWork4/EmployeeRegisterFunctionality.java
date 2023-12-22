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

    public Employee findEmployeeByExperience(int experience) { // метод, который ищет сотрудника по стажу

        for (int i = 0; i < employeeRegister.legth(); i++) {
            if (employeeRegister.getEmployee(i).getExperience() == experience) {
                System.out.println("Employee with " + experience + " years : "
                        + employeeRegister.getEmployee(i).getName());
            }

        }
        System.out.printf("Employee with " + experience + " years' experience not found");
        return null;
    }
        public  void findEmployeePhoneByName () { // метод, который возвращает номер телефона сотрудника по имени
            InputsOperations in = null;
            String nameEmployee = in.inputName();
            try {
                for (int i = 0; i < employeeRegister.legth(); i++) {
                    if (employeeRegister.getEmployee(i).getName().equals(nameEmployee)) {
                        System.out.println(employeeRegister.getEmployee(i).getPhoneNumbers());
                        break;
                    }
                }
            } catch (RuntimeException e) {
                System.out.printf("Employee with name" + nameEmployee + " not found");
            }
        }


        public void findEmployeeByIDNumber() {// метод, который ищет сотрудника по табельному номеру
            InputsOperations input = null;
            int findID = input.inputID();
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


