package models;

import java.util.Objects;

public class Department {
    
        private int id;
        private String departmentName;
        private String departmentDescription;
        private int numberOfEmployees;

        public Department(String departmentName, String description, int numberOfEmployees) {
            this.departmentName = departmentName;
            this.departmentDescription = description;
            this.numberOfEmployees = numberOfEmployees;
        }
        public int getId() {
        return id;
    }
        public String getDepartmentName() {
            return departmentName;
        }
        public String getdepartmentDescription() {
            return departmentDescription;
        }
        public int getNumberOfEmployees() {
            return numberOfEmployees;
        }

        public void setId(int id) {
        this.id = id;
    }
        public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
        public void setDepartmentDescription(String departmentDescription) { this.departmentDescription = departmentDescription; }
        public void setNumberOfEmployees(int numberOfEmployees) { this.numberOfEmployees = numberOfEmployees; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return numberOfEmployees == that.numberOfEmployees &&
                Objects.equals(departmentName, that.departmentName) &&
                Objects.equals(departmentDescription, that.departmentDescription);
    }
    @Override
    public int hashCode() {
        return Objects.hash(departmentName, departmentDescription, numberOfEmployees);
    }
}
