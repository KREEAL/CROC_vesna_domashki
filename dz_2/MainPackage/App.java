package MainPackage;


import Dictionaries.*;

public class App {


    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        String[] strings = new String[0];
        RecordBook recordBook = new RecordBook(strings,strings,strings);

        /**
         * Работники, которые уже есть в зоопарке
         */
        Employee employee0 = new Employee("Олег",recordBook);
        Employee employee1 = new Employee("Дмитрий",recordBook);

        Employee[] employees = new Employee[]{employee0, employee1};
        zoo.setEmployees(employees);

        /**
         * Волеьеры, которые уже есть в зоопарке
         */
        Aviary aviary0 = new Aviary(0);
        Aviary aviary1 = new Aviary(1);
        Aviary aviary2 = new Aviary(2);
        Aviary aviary3 = new Aviary(3);

        Aviary[] aviaries = new Aviary[]{aviary0,aviary1,aviary2,aviary3};
        zoo.setAviaries(aviaries);

        /**
         * Животные, которые уже есть в зоопарке
         */
        Animal animal0 = new Animal("Слон",employee0,aviary0,recordBook);
        Animal animal1 = new Animal("Тигр",employee1,aviary1,recordBook);
        Animal animal2 = new Animal("Пингвин",employee0,aviary2,recordBook);
        Animal animal3 = new Animal("Медведь",employee1,aviary3,recordBook);

        Animal[] animals = new Animal[]{animal0,animal1,animal2,animal3};
        zoo.setAnimals(animals);


        /**
         * Покупаем новое животное
         */
        zoo.addAnimal(zoo.newAnimal("Кот",employee0,zoo.newAviary(zoo.getAviaryCounts()),recordBook));

        /**
         * Некоторые события в зоопарке
         */
        employee0.cleanAviary(aviary1);
        employee1.feedAnimal(animal3);
        employee0.cleanAviary(aviary2);
        animal0.newIll("Pвота");
        employee1.cleanAviary(zoo.getAviary(4));
        animal2.newIll("Повреждение лапки");

        /**
         *Продадим Слона и Медведя
         */
       zoo.deleteAnimal(zoo.getAnimal(0));
       zoo.deleteAnimal(zoo.getAnimal(2));

        /**
         * В книге изменим животных
         */
       recordBook.setAnimals(zoo.getAnimals());

        /**
         * Печать книги
         */
        recordBook.printBook();

    }
}
