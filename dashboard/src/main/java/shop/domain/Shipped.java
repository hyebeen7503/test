package shop.domain;

import java.util.Date;
import lombok.Data;
import shop.infra.AbstractEvent;

@Data
public class Shipped extends AbstractEvent {

    private Long id;
    private Long orderId;
}
