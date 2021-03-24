package ru.croc.homework4.graphCache;

import java.util.HashMap;
import java.util.Map;


/**
 * Кэш
 */
public class Cache {

    private Map<String,Integer> cache = new HashMap<>();

    /**
     * Положить в кэш информацию о кол-ве компонент связности
     * @param key ключ графа!
     * @param value значение
     */
    public void put(String key,int value)
    {
        cache.put(key,value);
    }

    /**
     * Узнать кол-во компонент связности
     * @param key ключ графа
     * @return кол-во
     */
    public int get(String key)
    {
        return cache.get(key);
    }

    /**
     * :(
     * @param key ключ
     * @return :(
     */
    public String pravda(String key)
    {
        return "Я не смог реализовать обработку графа, извините";

    }
}
