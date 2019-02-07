public class employer {
    String name, surname, middlename, position, Email;
    int age, salary, telephone;

    public employer(String name, String surname, String middlename, String position, String email,
                    int age, int salary, int telephone ) {
        this.name = name;
        this.surname = surname;
        this.middlename = middlename;
        this.position = position;
        this.Email = email;
        this.age = age;
        this.salary = salary;
        this.telephone = telephone;

    }

    public void getInfo() {
        System.out.println("Сотрудник " + surname + " " + name + " " + middlename +
                " занимает должность " + position + ", e-mail: " + Email +
                ", у него зарплата " + salary + ", его возраст " + age + ".");
    }

    int getAge() {
        return age;
    }

}