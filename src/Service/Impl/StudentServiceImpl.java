package Service.Impl;
import Model.Group;
import Model.Student;

import java.util.List;
public class StudentServiceImpl {

    @Override
    public String addStudent(Student student) {

    }

        public String getGroupById(int id, Databse database) {

            Group group = (Group) database.getGroups()
                    .stream()
                    .filter(g -> g.getId() == id);
            if (group != null) {
                return group.toString();
            } else {
                return "Group not found";
            }
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public String updateStudentFullName(int id, String fullName) {
        return null;
    }

    @Override
    public List<Student> filterByGender() {
        return null;
    }

    @Override
    public void deleteStudentById(int id) {

    }
}
