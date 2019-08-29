package br.com.desafiobionexo.bionexo.services;

import br.com.desafiobionexo.bionexo.domain.Ubs;
import br.com.desafiobionexo.bionexo.dto.Score;
import br.com.desafiobionexo.bionexo.dto.UbsResponse;
import br.com.desafiobionexo.bionexo.repositories.UbsRepository;
import com.google.maps.model.LatLng;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UbsService{

    @Autowired
    private UbsRepository ubsRepository;

    public List<Ubs> findAll(){
        return (List<Ubs>) this.ubsRepository.findAll();
    }

    public List<UbsResponse> findByLocation(double lat, double lng, int qtd){

        LatLng latLng = new LatLng(lat,lng);
        List<UbsResponse> ubsResponses = new ArrayList<>();
        this.ubsRepository.findAll().forEach(ubs1 ->  ubsResponses.add(
                UbsResponse.of(ubs1.getCodCnes(),
                        ubs1.getNomEstab(),
                        ubs1.getDscEndereco(),
                        ubs1.getDscCidade(),
                        ubs1.getDscTelefone(),
                        new LatLng(ubs1.getVlrLatitude(),ubs1.getVlrLongitude()),
                        Score.of(ubs1.getDscAdapDeficFisicIdosos(), ubs1.getDscEquipamentos(), ubs1.getDscEstrutFisicAmbiencia())
                )));

        List<UbsResponse> nearestUbs = ubsResponses.stream().sorted(
                Comparator.comparing(ubs1 -> distFrom(ubs1.getGeocode(), latLng)))
                .limit(qtd)
                .collect(Collectors.toList());


        return nearestUbs;
    }

    //Haversine formula
    public static float distFrom(LatLng latLng, LatLng latLngOrigin) {
        double earthRadius = 6371000; //meters
        double dLat = Math.toRadians(latLngOrigin.lat - latLng.lat);
        double dLng = Math.toRadians(latLngOrigin.lng - latLng.lng);
        double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                Math.cos(Math.toRadians(latLng.lat)) * Math.cos(Math.toRadians(latLngOrigin.lat)) *
                        Math.sin(dLng/2) * Math.sin(dLng/2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        float dist = (float) (earthRadius * c);

        return dist;
    }


}
