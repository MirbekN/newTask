import Model.Group;

public class Main {
    public static void main(String[] args) {

        Group group = new Group(1,"Java",);
    }
}/*
1) Создать новый проект.
2) Создайте 3 новых пакета - модель, сервис, БД.
3) Создайте класс с именем Group, Student в пакете модели, свойствами группы являются int id, String name, String description, int year.
  Вы можете создать Student fullName, int age, Gender, Gender как перечисление в другом пакете.
4) создайте пакет db, создайте класс с именем Database внутри пакета,
У него 2 свойства - группы, студенты. Этот класс - наша база
можно дать.
5) создать GroupService и StudentService в пакете услуг и
  Создайте пакет с именем impl.
6) Групповой Сервис

     Строка addNewGroup(группа групп);

     // с потоком
     Строка getGroupById(int id);

     //с потоком
     Список<Группа> getAllGroups();

     //с потоком
     Строка updateGroupName (int id, String groupName);

     //с потоком (сортировать по возрастанию при нажатии asc, по убыванию при нажатии desc)
     List<Group>filterByYear(целый год, String ascDesc);

     //с потоком (сортировать по возрастанию при нажатии asc, по убыванию при нажатии desc)
     List<Group>sortGroupByYear(String ascDesc);

     //с потоком
     недействительным deleteGroupById (целый идентификатор);


7) СтудентСервис
     Строка addStudent(Студент Студент);

     Студент getStudentById (int id);

     Список<Студент> getAllStudents();

     Строка updateStudentFullName (int id, String fullName);

     // с потоком (нажмите 1, чтобы отфильтровать самку, нажмите 2, чтобы отфильтровать самца)
     Список<Студент> filterByGender();

     недействительным deleteStudentById (int id);


8) классы GroupServiceImpl, StudentServiceImpl в пакет impl
groupServiceImpl Этот класс реализует интерфейс GroupService,
StudentServiceImpl Этот класс реализует интерфейс GroupService и
  классы имеют нашу базу данных в качестве свойства (Database).
  */