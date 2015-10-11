package project.persistence.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import project.persistence.entities.PostitNote;

import java.util.List;

/**
 * By extending the {@link CrudRepository} we have access to powerful methods.
 * For detailed information, see:
 * http://docs.spring.io/spring-data/commons/docs/current/api/org/springframework/data/repository/CrudRepository.html
 * http://docs.spring.io/spring-data/data-commons/docs/1.6.1.RELEASE/reference/html/repositories.html
 *
 */
public interface PostitNoteRepository extends CrudRepository<PostitNote, Long>{

    PostitNote save(PostitNote postitNote);

    void delete(PostitNote postitNote);

    List<PostitNote> findAll();

    PostitNote findOne(Long id);

    List<PostitNote> findByName(String name);
}
