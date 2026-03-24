package relationship;
class Engine {
    String type;
    Engine(String type) {
        this.type = type;
    }
}
class Car {
    String model;
    Engine engine; 
    Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }
    void show() {
        System.out.println(model + " car has " + engine.type + " engine");
    }
}
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e = new Engine("Petrol");
        Car c = new Car("Swift", e);
        c.show();
	}

}
