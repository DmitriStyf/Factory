//package design_pattern.behavior.chain_of_responsibility.observer;
//
//import java.util.List;
//
//public class MyTopic implements Subject {
//    private List<Observer> observers;
//    private String message;
//    private boolean changes;
//    private final Object MUTEX = new Object();
//
//    @Override
//    public void register(Observer obj) {
//        if (obj == null) throw new NullPointerException("Null observed");
//        synchronized (MUTEX) {
//            if (!observers.contains(obj)) observers.add(obj);
//        }
//    }
//
//    @Override
//    public void unregister(Observer obj) {
//        synchronized (MUTEX)
//    }
//
//    @Override
//    public void notifyObservers() {
//        List<Observer>
//    }
//
//    @Override
//    public Object getUpdate(Observer obj) {
//        return this.message;
//    }
//
//    void postMessage (String msg){
//        System.out.println("Message posted to topic: ");
//    }
//}
