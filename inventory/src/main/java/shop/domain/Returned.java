package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class Returned extends AbstractEvent {

    private Long id;
    private Long orderId;
    // keep

}
