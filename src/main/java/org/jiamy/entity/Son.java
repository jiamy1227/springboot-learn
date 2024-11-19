package org.jiamy.entity;

/**
 * @description:
 * @author: jiamy
 * @create: 2024/11/14 20:12
 **/
public class Son {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Son(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                '}';
    }
}
