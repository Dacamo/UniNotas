package co.edu.uco.uconotas.repository;

import co.edu.uco.uconotas.entity.PersonaEntity;
import co.edu.uco.uconotas.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.uconotas.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity,Long> {

    List<PersonaEntity> findByTipoDocumentoIdentidadAndNroDocumento
            (TipoDocumentoIdentidadEntity TipoDocumentoIdentidad, String NroDocumento);

}
