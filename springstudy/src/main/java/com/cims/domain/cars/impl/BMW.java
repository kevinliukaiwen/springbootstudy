package com.cims.domain.cars.impl;

import com.cims.Annotations.CarAction;
import com.cims.domain.cars.Car;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/4/3
 * @Modified
 */
@Component
@Scope("prototype")
public class BMW implements Car  {
    /**
     * 返回宝马名称
     * @return String
     */
    @Override
    @CarAction(name="这是宝马")
    public String getCarname() {
        return "BMW";
    }
}
