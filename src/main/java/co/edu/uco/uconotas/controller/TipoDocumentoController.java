package co.edu.uco.uconotas.controller;
import co.edu.uco.uconotas.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.uconotas.service.tipoDocumento.TipoDocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/TipoDocumento")

public class TipoDocumentoController {

    @Autowired
    private TipoDocumentoService tipoDocumentoService;

    @GetMapping("/TiposDocumentos")
    public List<TipoDocumentoIdentidadEntity> findAll(){
        return tipoDocumentoService.findAll();
    }
}