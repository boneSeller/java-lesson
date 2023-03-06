package Lesson3;


/* Домашнее задание
Для выполнения домашнего задания создайте ветку с названием урока (Например
Lesson_3). Для каждого метода создавайте отдельный класс. Все классы поместите в один
пакет (Например lesson_3). После выполнения ДЗ сделайте commit (git commit) и загрузите
его в удаленный репозиторий GitHub (git push).
1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата,
возраст.
2. Конструктор класса должен заполнять эти поля при создании объекта.
3. Внутри класса «Сотрудник» написать метод, который выводит информацию об
объекте в консоль.
4. Создать массив из 5 сотрудников.
 */

public class EmployeeApp {

    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Anton Anton", "QA", "email.com", "80321", 200, 24);
        arr[1] = new Employee("Alex Alex", "AQA", "email.com", "80321", 201, 54);
        arr[2] = new Employee("Aloha Aloha", "SQA", "email.com", "80321", 252, 41);
        arr[3] = new Employee("Supa Supa", "LQA", "email.com", "80321", 300, 21);
        arr[4] = new Employee("Groha Groha", "NQA", "email.com", "80321", 200, 70);


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() > 40) {
                System.out.println(arr[i].toString());
            }
        }
    }
}
