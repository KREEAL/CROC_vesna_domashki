package ru.croc.homework4.graphModel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *Граф
 *
 * @param <T> Тип
 */
public class Graph <T>{


    /**множество ребер*/
    private Set<Edge> edges;
    /**карта вершин*/
    private Map<String,Vertex<T>> vertexMap;
    /**ключ графа*/
    private final String graphKey;



    public Graph(String graphKey) {
        this.graphKey = graphKey;
        this.vertexMap = new HashMap<>();
        this.edges = new HashSet<>();
    }


    /***
     * Проверка на наличие вершины
     * @param id ключ
     * @return информация о наличии вершины в графе
     */
    public boolean hasVert(String id)
    {
        if(vertexMap.containsKey(id)){
            return true;
        }
        return  false;
    }

    /**
     * Добавление вершины
     * @param key ключ
     * @param vertex вершина
     * @return результат добавления
     */
    public String addVert(String key,Vertex<T> vertex)
    {
        if(!hasVert(key)){
            vertexMap.put(key,vertex);
            return "Вершина "+ vertex.getIndex()+" успешно добавлена";
        }
        return "Вершина уже есть в графе";
    }

    /**
     * Удалить вершину
     * @param key ключ
     * @return результат операции
     */
    public String removeVert(String key)
    {


        if(hasVert(key))
        {
            int s1 = vertexMap.get(key).getIndex();

            vertexMap.remove(key);

         return "Вершина "+s1+" успешно удалена";
        }
        return "Невозможно удалить вершину";
    }

    /**
     * Получить вершину по ключу
     * @param key ключ
     * @return вершина
     */
    public Vertex getVertexByKey(String key)
    {
        if(hasVert(key)){
            return vertexMap.get(key);
        }
        return null;
    }

    /**
     * Добавить ребро
     * @param edge ребро
     */
    public void addEdge(Edge edge)
    {
        edges.add(edge);
    }

    /**
     * Удалить ребро
     * @param edge ребро
     */
    public void removeEdge(Edge edge)
    {
        edges.remove(edge);
    }

    public String getGraphKey() {
        return graphKey;
    }
}
