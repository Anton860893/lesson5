public class Main {

    public static void main(String[] args) {
        employer[] EmpArray = new employer[5];

        EmpArray[0] = new employer("Александр", "Сидоров", "Миланович",
                "чиновник", "alexandr@gail.com", 35, 250000, 911);
        EmpArray[1] = new employer("Иван", "Иванов", "Иванович",
                "уборщик", "ivanov2132@mail.ru", 74, 165000, 266250);
        EmpArray[2] = new employer("Кристина", "Петрова", "Сергеевна",
                "секретарша", "preattykris@yandex.ru", 24, 54500,112);
        EmpArray[3] = new employer("Мария", "Рыбкина", "Ивановна",
                "бухгалтер", "maryribkina@mail.ru", 44, 19000, 765132);
        EmpArray[4] = new employer("Николай", "Быков", "Алексеевич",
                "дальнобольщик", "нет", 54, 20000,626364);


        for (int i = 0; i < EmpArray.length; i++) {
            if (EmpArray[i].getAge() > 40) {
                EmpArray[i].getInfo();
            }
        }
    }
}