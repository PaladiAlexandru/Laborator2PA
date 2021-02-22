package transporationPrbl;

import enums.SourceType;

public class Source {
    private String name;
    private int capacity;
    private SourceType type;

    public Source(String name, int capacity, SourceType type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }



    public int getCapacity() {
        return capacity;
    }

    public SourceType getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setType(SourceType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
