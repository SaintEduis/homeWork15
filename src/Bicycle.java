public class Bicycle extends Transport implements  ServiceStation{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        super.check();
        System.out.println();
    }
}