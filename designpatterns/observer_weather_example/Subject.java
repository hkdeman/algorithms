import java.util.ArrayList;

abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();

    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void add(Observer o) {
        observers.add(o);
    }

    public void remove(Observer o) {
        observers.remove(o);
    }

}