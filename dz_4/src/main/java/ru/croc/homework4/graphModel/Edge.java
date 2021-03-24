package ru.croc.homework4.graphModel;

import java.util.Objects;

/**
 * Ребро
 */
public class Edge {

    /**Вершина входа*/
    private Vertex vertexA;
    /**Вершина выхода*/
    private Vertex vertexB;

    public Edge(Vertex vertexA, Vertex vertexB) {
        this.vertexA = vertexA;
        this.vertexB = vertexB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;
        Edge edge = (Edge) o;
        return Objects.equals(getVertexA(), edge.getVertexA()) && Objects.equals(getVertexB(), edge.getVertexB());
    }

    @Override
    public String toString() {
        return "Edge{" +
                "vertexA=" + vertexA +
                ", vertexB=" + vertexB +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVertexA(), getVertexB());
    }

    public Vertex getVertexA() {
        return vertexA;
    }

    public Vertex getVertexB() {
        return vertexB;
    }

}
