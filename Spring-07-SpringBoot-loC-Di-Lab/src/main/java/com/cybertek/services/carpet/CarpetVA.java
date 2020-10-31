package com.cybertek.services.carpet;

import com.cybertek.enums.City;
import com.cybertek.interfaces.carpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
@Component
public class CarpetVA implements Carpet {



    private static final Map<City, BigDecimal> sqPriceForCity = new HashMap<>();
    static {
        sqPriceForCity.put(City.MCLEAN, new BigDecimal("4.32"));
        sqPriceForCity.put(City.FAIRFAX, new BigDecimal("1.32"));
        sqPriceForCity.put(City.ARLINGTON, new BigDecimal("2.44"));
    }


    @Override
    public BigDecimal getSqFtPrice(City city) {
        BigDecimal defaultValue = BigDecimal.ZERO;

        Optional<Map.Entry<City, BigDecimal>> collect =  sqPriceForCity.entrySet().stream().filter(x -> x.getKey()== city).findFirst();

        return collect.isPresent() ? collect.get().getValue() :  defaultValue;
    }
}
