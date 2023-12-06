package br.net.curriculos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{
	@Query("SELECT c FROM Experiencia c WHERE c.idusuario = :idusuario")
    List<Experiencia> findByidusuario(Integer idusuario);
}
