package Service.Impl;

import Model.Group;
import db.Databse;

import java.util.List;
import java.util.Optional;

public class GroupServiceImpl {

    Databse databse = new Databse();
    Group group = new Group();

    public boolean addNewGroup(Group group) {
        return databse.getGroups().add(group);

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

    //with stream
    public List<Group> getAllGroups(Databse databse) {
        return null;
    }

    //with stream
    public String updateGroupName(int id, String groupName, Databse database) {
        // Используем Stream API для поиска группы с заданным id
        Group group = database.getGroups()
                .stream()
                .filter(g -> g.getId() == id)
                .findFirst()
                .orElse(null);

        // Если группа не найдена, возвращаем ошибку
        if (group == null) {
            return "Group not found";
        }

    //with stream
    public List<Group> filterByYear( String ascDesc) {
        return ;
    }

    //with stream  (asc ди басканда ascending, desc ди басканда descending кылып сорттосун)
    public List<Group> sortGroupByYear(String ascDesc) {
        return null;
    }

        public void deleteGroupById(Databse,Long ) {
            Database database = getDatabase();
            Optional<Group> optionalGroup = database.getGroups().stream()
                    .filter(group -> group.getId() == id)
                    .findFirst();
            if (optionalGroup.isPresent()) {
                Group group = optionalGroup.get();
                database.removeGroupById(group.getId());
            }
        }
}
}