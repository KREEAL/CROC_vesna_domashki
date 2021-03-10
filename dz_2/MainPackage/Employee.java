package MainPackage;

import Dictionaries.RecordBook;

/**Работник*/
public class Employee {
    final private String name;
    final private RecordBook recordBook;

    /**
     *
     * @param name имя работника
     * @param recordBook записная книжка, где будут храниться записи, связанные с этим работником
     */
    public Employee(String name,RecordBook recordBook) {
        this.name = name;
        this.recordBook = recordBook;
    }

    public String getName() {
        return name;
    }

    /**Очистка выбранного вольера
     * @param aviary вольер*/
    void cleanAviary(Aviary aviary)
    {
        recordBook.addCleanWriting(aviary,this);
    }
    /**Кормление выбранного животного
     * @param animal животное*/
    void feedAnimal(Animal animal)
    {
        recordBook.addFeedWriting(animal,this);
    }
    
}
