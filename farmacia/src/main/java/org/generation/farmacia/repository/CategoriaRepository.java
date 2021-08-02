package org.generation.farmacia.repository;

import java.util.List;

import org.generation.farmacia.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	public List<CategoriaModel> findAllByTipoContainingIgnoreCase(String tipo);

}
