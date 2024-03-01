public class Car extends Transport implements ServiceStation{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        super.check();
        System.out.println("Проверяем двигатель");

        System.out.println();
    }
}