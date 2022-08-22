package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class OutOfStockOccurred extends AbstractEvent {

    private Long id;

    public OutOfStockOccurred(Inventory aggregate) {
        super(aggregate);
    }

    public OutOfStockOccurred() {
        super();
    }
    // keep

}
