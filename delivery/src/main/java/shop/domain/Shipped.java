package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;

    public Shipped(Shipping aggregate) {
        super(aggregate);
    }

    public Shipped() {
        super();
    }
    // keep

}
