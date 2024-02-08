package java.com.practice.imp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;


    public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id)
    {
        return employeeRepository.findById(id);
    }

    public void deleteEmployee(Long id)
    {
        employeeRepository.deleteById(id);
    }
}
