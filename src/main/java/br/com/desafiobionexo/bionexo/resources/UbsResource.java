package br.com.desafiobionexo.bionexo.resources;

import br.com.desafiobionexo.bionexo.domain.Ubs;
import br.com.desafiobionexo.bionexo.dto.UbsResponse;
import br.com.desafiobionexo.bionexo.services.UbsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/ubs")
public class UbsResource {

    private final Logger logger = LoggerFactory.getLogger(UbsResource.class);

    @Autowired
    private UbsService ubsService;


    @GetMapping("/all")
    public List<Ubs> getAll(){

        return this.ubsService.findAll();
    }

    @GetMapping("/location")
    public ResponseEntity<List<UbsResponse>> getLocations(double lat, double lng, int qtd) throws InterruptedException {
        return ResponseEntity.ok(this.ubsService.findByLocation(lat, lng, qtd));
    }



}
//-23.999262, -46.424647