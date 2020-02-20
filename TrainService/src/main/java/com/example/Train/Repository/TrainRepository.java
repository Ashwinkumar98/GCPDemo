package com.example.Train.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Train.modal.Train;

@Repository
public interface TrainRepository extends JpaRepository<Train,Integer>{

}
