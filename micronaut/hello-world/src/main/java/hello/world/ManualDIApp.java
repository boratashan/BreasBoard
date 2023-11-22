package hello.world;

import hello.world.beans.Vehicle;
import io.micronaut.context.ApplicationContext;
import io.micronaut.context.BeanContext;

public class ManualDIApp {

    public static void main(String[] args) {
        final BeanContext beanContext = BeanContext.run();
        try {
            Vehicle vehicle = beanContext.getBean(Vehicle.class);
            System.out.println(vehicle.start() + " ." );
        }
        finally {
            beanContext.close();
        }


    }
}
