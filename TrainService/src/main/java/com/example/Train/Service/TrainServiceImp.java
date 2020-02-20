package com.example.Train.Service;

import org.springframework.stereotype.Service;

import com.example.Train.Repository.TrainRepository;
import com.example.Train.modal.Train;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TrainServiceImp implements TrainService{
	
	private final TrainRepository repository;
	
	@Override
	public Train CheckAvailability(Integer trainNo) {
		 return repository.findById(trainNo).map(t->{
			  if(t.getAvailability()>0) {
				  return t;
			  }
			  return null;
		 }).orElse(null);
	}

	@Override
	public Train addTrain(Train train) {
		return repository.save(train);
	}

	@Override
	public Double getfare(Integer trainno) {
		 return repository.findById(trainno).map(t -> t.getFare()).orElse(0.0);
	}
	
	@Override
	public void UpdateTrain(Train train) {
		repository.findById(train.getTrainno()).ifPresent(t -> {
			train.setTrainno(t.getTrainno());
			repository.save(train);
		});;
		
	}
	
}
