package grupo6.registraduria.Repositorios;
import grupo6.registraduria.Modelos.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioUsuario extends MongoRepository<Usuario,String> {

}
