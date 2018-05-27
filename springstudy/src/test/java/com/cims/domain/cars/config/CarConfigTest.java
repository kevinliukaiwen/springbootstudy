package com.cims.domain.cars.config;

import com.cims.domain.cars.Car;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/11
 * @Modified
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CarConfig.class)
public class CarConfigTest {

//    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);
    @Autowired
    @Qualifier("audi")
    private Car audi;

    @Autowired
    @Qualifier("BMW")
    private Car bmw;

    @Test
    public void testCarAOP() {
        audi.getCarname();
        bmw.getCarname();

    }

}