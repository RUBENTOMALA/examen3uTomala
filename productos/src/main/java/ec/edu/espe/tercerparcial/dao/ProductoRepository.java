package ec.edu.espe.tercerparcial.dao;
import ec.edu.espe.tercerparcial.domain.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository   extends MongoRepository<Producto, String> {
    Producto findByCodigoUnico(String codigoUnico);
}
