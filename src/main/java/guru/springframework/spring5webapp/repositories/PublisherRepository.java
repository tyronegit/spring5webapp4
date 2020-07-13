package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
/*
 * Created by ta 7/3/20
 * Author POJO = plan old java objects
 */
public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
