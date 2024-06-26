package org.softuni.mobilele.repositories;

import org.softuni.mobilele.domain.entities.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long> {

    Optional<Model> findById(Long id);

    Optional<Model> findByName(String name);
    @Modifying
    @Query("DELETE FROM Model m WHERE m.id = :modelId")
    void deleteModelById(Long modelId);
}
