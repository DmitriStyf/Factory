package design_pattern.behavior.chain_of_responsibility.iterator;

public class NamesRepository implements Container{

    @Override
    public Iterator getIterator(){
        return new NameIterator();
    }
}
