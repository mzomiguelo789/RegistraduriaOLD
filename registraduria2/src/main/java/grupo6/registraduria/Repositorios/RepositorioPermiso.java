package grupo6.registraduria.Repositorios;
import grupo6.registraduria.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {
}
