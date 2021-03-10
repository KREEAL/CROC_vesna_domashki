package Dictionaries;


import MainPackage.*;


import java.util.Arrays;

/**
 * Записная книжка зоопарка
 * */
public class RecordBook {


    private String[] cleaningHistory;
    private String[] feedingHistory;
    private String[] illnessesHistory;
    private String[] buyAndKillAnimals;
    //TODO почему-то здесь нулл
    private Animal[] animals;

    /**
     *
     * @param cleaningHistory массив, содержащий историю очистки вольеров
     * @param feedingHistory массив, содержащий историю кормления
     * @param illnessesHistory массив, содержащий историю болезней
     */
    public RecordBook(String[] cleaningHistory, String[] feedingHistory, String[] illnessesHistory) {
        this.cleaningHistory = cleaningHistory;
        this.feedingHistory = feedingHistory;
        this.illnessesHistory = illnessesHistory;
    }


    public void setAnimals(Animal[] animals) {

        this.animals = animals;
    }

    /**
     * Добавляет запись об очистке вольера
     * @param aviary в какой клетке производить очистку
     * @param employee какой работник производит очистку
     * */
    public void addCleanWriting(Aviary aviary, Employee employee)
    {
        String avi = Integer.toString(aviary.getNumber());

        cleaningHistory = Arrays.copyOf(cleaningHistory, cleaningHistory.length+1);
        cleaningHistory[cleaningHistory.length-1] = "Вольер "+ avi +" убрал работник "+ employee.getName();
    }
    /**
     * Добавляет запись о покормке животного
     * @param animal какое животное кормить
     * @param employee какой работник будет кормить
     * */
    public void addFeedWriting(Animal animal,Employee employee)
    {
        feedingHistory = Arrays.copyOf(feedingHistory,feedingHistory.length+1);
        feedingHistory[feedingHistory.length-1]= "Животное "+animal.getName()+" покормил работник "+employee.getName();
    }
    /**
     * Добавляет запись о болезни животного
     * @param animal какое животное получает болезнь
     * @param ill какую болезнь получает животное
     * */
    public void addIllnessWriting(Animal animal,String ill)
    {
        illnessesHistory = Arrays.copyOf(illnessesHistory,illnessesHistory.length+1);
        illnessesHistory[illnessesHistory.length-1]= "Животное " +animal.getName() + " имеет болезнь "+ill;
    }
    /**
     * Выводит все записи в книге на экран
     *
     * */
    public void printBook()
    {
        System.out.println("История очистки вольеров:");
        for(String current:cleaningHistory)
            System.out.println(current);

        System.out.println("История кормления животных:");
        for(String current:feedingHistory)
            System.out.println(current);

        System.out.println("История болезни животных:");
        for(String current: illnessesHistory)
            System.out.println(current);

        System.out.println("Животные, которые остались в зоопарке:");
        for(Animal current:animals)
            System.out.println(current.getName());
    }

}
