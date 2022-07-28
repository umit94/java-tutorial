package collections.set.hashSetLesson;

import java.util.Objects;

public class HashTestClassWithOverrides {
    private int id;

    public HashTestClassWithOverrides(int id){
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashTestClassWithOverrides that = (HashTestClassWithOverrides) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode");
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }
}
