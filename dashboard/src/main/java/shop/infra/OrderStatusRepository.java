package shop.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import shop.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "orderStatuses",
    path = "orderStatuses"
)
public interface OrderStatusRepository
    extends PagingAndSortingRepository<OrderStatus, Long> {
    // keep

}
