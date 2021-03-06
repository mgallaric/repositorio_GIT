package ejercicio3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // Generar el contenedor de beans indicando el archivo xml
        ApplicationContext contenedor =
                new ClassPathXmlApplicationContext("spring.xml");

        Factura f1 = contenedor.getBean("factura1", Factura.class);
        Factura f2 = contenedor.getBean("factura2", Factura.class);
        Factura f3 = contenedor.getBean("factura3", Factura.class);
        Factura f4 = contenedor.getBean("factura4", Factura.class);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }

}
