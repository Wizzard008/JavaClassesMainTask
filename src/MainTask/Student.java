package MainTask;

import java.util.Random;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String middleName;
    private int yearBirth;
    private String adress;
    private String phoneNumber;
    private String faculty;
    private int group;
    private int course;

    Student generate(int id){
        Student student=new Student();
        String[][] names={{"Владимир", "Алесандр","Михаил", "Максим", "Артем", "Лев",
                "Марк", "Дмитрий", "Иван", "Матвей","Даниил"},{"Софья",  "Мария",
                "Анна", "Виктория", "Алиса", "Полина", "Ева",
                "Елизавета", "Анастасия", "Александра", "Елена"}};
        String[][] surnames={{"Иванов","Васильев", "Петров", "Смирнов", "Михайлов", "Фёдоров",
                "Соколов", "Яковлев", "Попов", "Андреев", "Алексеев", "Александров", "Лебедев",
                "Григорьев", "Степанов"},{"Иванова","Васильева", "Петрова", "Смирнова", "Михайлова",
                "Фёдорова", "Соколова", "Яковлева", "Попова", "Андреева", "Алексеева",
                "Александрова", "Лебедева","Григорьева", "Степанова"}};
        String[][] middlenames={{"Владимирович", "Алесандрович","Михайлович", "Максимович", "Артемович", "Львович",
                "Маркович", "Дмитриевич", "Иванович", "Матвеевич","Даниилович"},{"Владимировна", "Алесандровна",
                "Михаиловна", "Максимовна", "Артемовна", "Львовна","Марковна",
                "Дмитриевна", "Ивановна", "Матвеевна","Данииловна"}};
        int initYear=1998;

        String[] streetNames={"Ленина", "Калинина", "Центральная", "Молодежная", "Школьная", "Лесная",
                "Садовая", "Советская", "Новая", "Набережная", "Заречная", "Зеленая"};
        String[] faculties={"Mеханико–математический","Физический","Химический ", "Биологический",
                "Геологический","Исторический", "Филологический", "Экономический","Юридический",
                "Журналистики","Психологии"};
        student.id=id;
        Random random=new Random();
        int gender=random.nextInt(2);
        int name=random.nextInt(names[gender].length);
        int surname=random.nextInt(surnames[gender].length);
        int middlename=random.nextInt(middlenames[gender].length);
        int street=random.nextInt(streetNames.length);
        int house=random.nextInt(200);
        int room=random.nextInt(100);
        int faculty=random.nextInt(faculties.length);
        student.faculty=faculties[faculty];
        student.group=100+random.nextInt(400);
        student.course=student.group/100;
        student.adress=streetNames[street]+" д. "+house+" кв. "+room;
        student.phoneNumber="+7"+" "+random.nextInt(1000)+" "+random.nextInt(10000000);
        student.name=names[gender][name];
        student.surname=surnames[gender][surname];
        student.middleName=middlenames[gender][middlename];
        student.yearBirth=initYear+(int)(random.nextInt(10));
        return student;
    }
    public String toCSV() {
        return   id +
                "," + name +
                "," + middleName+
                "," + surname +
                "," + yearBirth +
                "," + adress +
                "," + phoneNumber +
                "," + faculty +
                "," + group +
                "," + course;
    }

    @Override
    public String toString() {
        return   "id=" + id +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surname='" + surname + '\'' +

                ", yearBirth=" + yearBirth +
                ", adress='" + adress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", group=" + group +
                ", course=" + course +
                '}';
    }

    public static void main(String[] args) {

    }
}
