public class PrintServiceStation implements ServiceStation {
    @Override
    public void check(Transport[] transports) {
        if (transports[0] instanceof Bicycle) {
            for (int i = 0; i < transports.length; i++) {
                System.out.println("Обслуживаем " + transports[i].getModelName());
                for (int j = 0; j < transports[i].getWheelsCount(); j++) {
                    System.out.println("Меняем покрышку");
                }

                System.out.println();
            }
        }
        else if (transports[0] instanceof Car) {
            for (int i = 0; i < transports.length; i++) {
                System.out.println("Обслуживаем " + transports[i].getModelName());
                for (int j = 0; j < transports[i].getWheelsCount(); j++) {
                    System.out.println("Меняем покрышку");
                }
                System.out.println("Проверяем двигатель");

                System.out.println();
            }
        }
        else {
            for (int i = 0; i < transports.length; i++) {
                System.out.println("Обслуживаем " + transports[i].getModelName());
                for (int j = 0; j < transports[i].getWheelsCount(); j++) {
                    System.out.println("Меняем покрышку");
                }
                System.out.println("Проверяем двигатель");
                System.out.println("Проверяем прицеп");

                System.out.println();
            }
        }
    }
}
