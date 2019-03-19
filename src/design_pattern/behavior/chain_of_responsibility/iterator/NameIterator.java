package design_pattern.behavior.chain_of_responsibility.iterator;

public class NameIterator implements Iterator {
    String names[] = {"Robert", "John", "Dmitri", "Roman"};
    int index;

    @Override
    public boolean hasNext() {
        if (index < names.length) {
            return true;
        }
        return false;
    }


    @Override
    public Object next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }

}
