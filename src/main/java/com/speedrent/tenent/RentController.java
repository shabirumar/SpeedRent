package com.speedrent.tenent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RentController
{
    @Autowired
    Car myCar;
    @RequestMapping(value="/hello", method= RequestMethod.GET)
    @ResponseBody
    public Car getcar()
    {
        myCar.setName("BMW");
        myCar.setManufacturer("German");
        return myCar;
    }
}
