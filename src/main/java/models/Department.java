package models;

import java.util.Objects;

public class Department {
    
        private int id;
        private String departmentname;
        private String departmentdescription;
        private int numberofemployees;

        public Department(String departmentname, String departmentdescription, int numberofemployees) {
            this.departmentname = departmentname;
            this.departmentdescription = departmentdescription;
            this.numberofemployees = numberofemployees;
        }
        public int getId() {
        return id;
    }
        public String getDepartmentName() {
            return departmentname;
        }
        public String getdepartmentDescription() {
            return departmentdescription;
        }
        public int getNumberOfEmployees() {
            return numberofemployees;
        }

        public void setId(int id) {
        this.id = id;
    }
        public void setDepartmentName(String departmentname) { this.departmentname = departmentname; }
        public void setDepartmentDescription(String departmentdescription) { this.departmentdescription = departmentdescription; }
        public void setNumberOfEmployees(int numberofemployees) { this.numberofemployees = numberofemployees; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return numberofemployees == that.numberofemployees &&
                Objects.equals(departmentname, that.departmentname) &&
                Objects.equals(departmentdescription, that.departmentdescription);
    }
    @Override
    public int hashCode() {
        return Objects.hash(departmentname, departmentdescription, numberofemployees);
    }
}
