package ejbs;

import dtos.DTO;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import javax.ws.rs.PathParam;
/**
 * @author João Felix nº2161347
 * @author Carolina Marques nº2150644
 * @author Elton Pastilha nº2160849
 */
public interface Bean<E extends Serializable, D extends DTO, PK> {
    D create(D dto);
    D retrieve(@PathParam("primaryKey") PK primaryKey);
    D update(D dto);
    boolean delete(@PathParam("primaryKey") PK primaryKey);
    
    boolean exists(Object primaryKey);
    
    Iterable<D> all();
}
