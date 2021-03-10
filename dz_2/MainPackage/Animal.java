package MainPackage;

import Dictionaries.*;


/**Животное*/
public class Animal {
    private final String name;
    private final Aviary aviary;
    private final Employee employee;
    private final RecordBook recordBook;

    /**
     *
     * @param name имя животного
     * @param employee ответственный работник
     * @param aviary вольер для животного
     * @param recordBook записная книжка, где будут храниться данные об этом животном
     */
    public Animal(String name, Employee employee, Aviary aviary,RecordBook recordBook) {
        this.name = name;
        this.employee = employee;
        this.aviary = aviary;
        this.recordBook = recordBook;
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee(){
        return  employee;
    }

    /**
     * Добавляет новую запись о болезни животного
     * @param ill болезнь
     * */
    public void newIll(String ill)
    {
        recordBook.addIllnessWriting(this,ill);
    }
}
