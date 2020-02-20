package com.example.Train.Service;

import com.example.Train.modal.Train;

public interface TrainService {
	
	public Train CheckAvailability(Integer trainNo);
	public Train addTrain(Train train);
	public void UpdateTrain(Train train);
	public Double getfare(Integer trainno);
}
