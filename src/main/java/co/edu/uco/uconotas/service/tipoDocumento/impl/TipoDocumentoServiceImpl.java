package co.edu.uco.uconotas.service.tipoDocumento.impl;

import co.edu.uco.uconotas.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.uconotas.repository.TipoDocumentoRepository;
import co.edu.uco.uconotas.service.tipoDocumento.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService
{

    @Autowired
    private TipoDocumentoRepository tipoDocumentoRepository;

    @Override
    public List<TipoDocumentoIdentidadEntity> findAll() {
        return tipoDocumentoRepository.findAll();
    }
}