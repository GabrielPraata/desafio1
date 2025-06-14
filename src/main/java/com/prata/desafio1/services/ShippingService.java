package com.prata.desafio1.services;

import com.prata.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double basic) {
        if (basic < 100.0) {
            return 20.0;
        } else if (basic < 200.0) {
            return 12.0;
        } else {
            return 0.0;
        }

    }
}
