package ru.croc.homework4.graphModel;

import java.util.Objects;


/**
 * Вершина
 */
public class Vertex<T> {

    /**индекс*/
    private  int index;
    /**информация*/
    private  T info;

    public Vertex(int index, T info) {
        this.index = index;
        this.info = info;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "index=" + index +
                ", info=" + info +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;
        Vertex vertex = (Vertex) o;
        return getIndex() == vertex.getIndex();
    }

    @Override
    public int hashCode() {
        return Objects.hash(index);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
