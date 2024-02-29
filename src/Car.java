public class Car extends Transport implements ServiceStation{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int j = 0; j < this.getWheelsCount(); j++) {
            System.out.println("Меняем покрышку");
        }
        System.out.println("Проверяем двигатель");

        System.out.println();
    }
}