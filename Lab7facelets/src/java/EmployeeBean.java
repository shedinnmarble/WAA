
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yafen
 */
@ManagedBean(name = "employeeBean", eager = true)
@RequestScoped
public class EmployeeBean {

    private List<Employee> employeeList;
    private Employee selected;

    public EmployeeBean() {
        employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "Frank Brown", "319-512-6089", 88888));
        employeeList.add(new Employee(2, "John Doe", "319-512-6089", 999));
        employeeList.add(new Employee(3, "Mary Jones", "319-512-6089", 111));
    }

    public void searchById(int id) {
        this.setSelected(getEmployeeList().stream().filter(e -> e.getId() == id).findAny().get());
    }

    /**
     * @return the employeeList
     */
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    /**
     * @param employeeList the employeeList to set
     */
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    /**
     * @return the selected
     */
    public Employee getSelected() {
        return selected;
    }

    /**
     * @param selected the selected to set
     */
    public void setSelected(Employee selected) {
        this.selected = selected;
    }

}
