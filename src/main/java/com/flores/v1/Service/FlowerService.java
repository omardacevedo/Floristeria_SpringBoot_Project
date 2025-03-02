package com.flores.v1.Service;

import com.flores.v1.model.Flower;
import com.flores.v1.repository.FlowerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository= flowerRepository;
    }
    public List<Flower> getAllFlowers(){
        return flowerRepository.findAll();
    }

    public Flower getFlowerById(Long id){
        return flowerRepository.findById(id).orElse(null);
    }

    public Flower saveFlower(Flower flower){
        return flowerRepository.save(flower);  //Guarda la nueva flor en el repositorio
    }

    public void deleteFlower(Long id){
        flowerRepository.deleteById(id);
    }
    
}
