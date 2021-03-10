package MainPackage;

import Dictionaries.RecordBook;

import java.util.Arrays;
/**Зоопарк*/
public class Zoo {
    private Animal[] animals;
    private Aviary[] aviaries;
    private Employee[] employees;
    private RecordBook recordBook;
    private int aviaryCounts =0;

    public Animal[] getAnimals() {
        return animals;
    }

    public Aviary getAviary(int number) {
        return aviaries[number];
    }

    public Animal getAnimal(int number) {
        return animals[number];
    }

    public int getAviaryCounts() {
        return aviaryCounts;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;

    }

    public void setAviaries(Aviary[] aviaries) {
        this.aviaries = aviaries;
    }

    /**
     * Позволяет создать животное для передачи в метод addAnimal
     * @param name имя животного
     * @param employee работник, ответственный за данное животное
     * @param aviary вольер для данного животного
     * @param recordBook записная книжка
     * @return возвращает созданное животное
     * */
    public Animal newAnimal(String name,Employee employee,Aviary aviary,RecordBook recordBook)
    {
        Animal animal = new Animal(name,employee,aviary,recordBook);
        aviaries = Arrays.copyOf(aviaries,aviaries.length+1);
        aviaries[aviaries.length-1]=aviary;
        return animal;
    }

    /**
     * Добавлят новое животное в зоопарк
     * @param animal животное
     * */
    void addAnimal(Animal animal)
    {
        animals = Arrays.copyOf(animals,animals.length+1);
        animals[animals.length-1]=animal;

        aviaryCounts++;
    }

    /**
     * Удаляет животное из зоопарка
     * @param animal животное для удаления
     * */
    public void deleteAnimal(Animal animal)
    {

        Animal[] animal1 = new Animal[animals.length-1];
        int i=0;
        for(Animal current: animals)
        {

            if(current != animal) {
               // System.out.println(current.getName());
                animal1[i] = current;
                i++;
            }
        }
        System.out.println(animal1.length);
        this.animals = animal1;
    }

    /**
     *
     * @param number номер вольера
     * @return вольер
     */
    public Aviary newAviary(int number)
    {
        Aviary aviary = new Aviary(number);
        return aviary;
    }


}
