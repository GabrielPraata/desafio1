package com.prata.desafio1.services;

import com.prata.desafio1.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountValue = order.getBasic() * (order.getDiscount() / 100.0);
        double total = order.getBasic() - discountValue + shippingService.shipment(order.getBasic());
        return total;
    }
}
