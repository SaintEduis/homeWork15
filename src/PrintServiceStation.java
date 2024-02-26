public class PrintServiceStation implements ServiceStation {
    @Override
    public void check(Bicycle[] bicycle) {
        for (int i = 0; i < bicycle.length; i++) {
            System.out.println("Обслуживаем " + bicycle[i].getModelName());
            for (int j = 0; j < bicycle[i].getWheelsCount(); j++) {
                System.out.println("Меняем покрышку");
            }

            System.out.println();
        }
    }

    @Override
    public void check(Car[] car) {
        for (int i = 0; i < car.length; i++) {
            System.out.println("Обслуживаем " + car[i].getModelName());
            for (int j = 0; j < car[i].getWheelsCount(); j++) {
                System.out.println("Меняем покрышку");
            }
            System.out.println("Проверяем двигатель");

            System.out.println();
        }
    }

    @Override
    public void check(Truck[] truck) {
        for (int i = 0; i < truck.length; i++) {
            System.out.println("Обслуживаем " + truck[i].getModelName());
            for (int j = 0; j < truck[i].getWheelsCount(); j++) {
                System.out.println("Меняем покрышку");
            }
            System.out.println("Проверяем двигатель");
            System.out.println("Проверяем прицеп");

            System.out.println();
        }
    }
}
