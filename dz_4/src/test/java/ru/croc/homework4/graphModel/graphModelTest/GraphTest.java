package ru.croc.homework4.graphModel.graphModelTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.croc.homework4.graphModel.Graph;
import ru.croc.homework4.graphModel.Vertex;

public class GraphTest {


    /**
     * Успешное добавление новой вершины
     */
    @Test
    public void vertexAddSuccesfullTest()
    {   Graph graph = new Graph<>("zero");
        Assertions.assertEquals("Вершина 0 успешно добавлена",
                graph.addVert("key",new Vertex(0,"info")));
    }

    /**
     * Добавление вершины, которая уже есть в графе
     */
    @Test
    public void vertexAddFailureTest()
    {
        Graph graph = new Graph<>("first");
        graph.addVert("key",new Vertex(0,"info"));
        Assertions.assertEquals("Вершина уже есть в графе",graph.addVert("key",new Vertex(1,"new info")));

    }

    /**
     * Удаление существующей вершины из графа
     */
    @Test
    public void vertexRemoveSuccesfullTest()
    {   Graph graph = new Graph<>("second");
        graph.addVert("key",new Vertex(0,222));
        Assertions.assertEquals("Вершина 0 успешно удалена",graph.removeVert("key"));
    }

    /**
     *  Удаление несуществующей вершины
     */
    @Test
    public void vertexRemoveFailureTest()
    {
        Graph graph = new Graph<>("third");
        Assertions.assertEquals("Невозможно удалить вершину",graph.removeVert("key"));
    }


}
