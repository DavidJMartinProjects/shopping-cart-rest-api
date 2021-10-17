package com.store.cart.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author david
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartDto {

    private Long id;

    private long customerId;
    private double totalPrice;
    private List<ItemDto> items;

}
