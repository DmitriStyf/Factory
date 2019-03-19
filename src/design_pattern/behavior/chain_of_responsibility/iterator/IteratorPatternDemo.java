package design_pattern.behavior.chain_of_responsibility.iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NamesRepository namesRepository = new NamesRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name: " + name);
        }
    }
}
