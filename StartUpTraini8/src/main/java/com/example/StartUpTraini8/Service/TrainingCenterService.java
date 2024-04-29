package com.example.StartUpTraini8.Service;

import com.example.StartUpTraini8.Model.TrainingCenter;
import com.example.StartUpTraini8.Repo.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrainingCenterService {
    List<TrainingCenter> trainingCenters1 = new ArrayList<>();

        @Autowired
       TrainingCenterRepository  trainingCenterRepository;


    public String PstApi(TrainingCenter trainingCenter) {
          trainingCenterRepository .save(trainingCenter);
           return "data saved";
    }

    public List<TrainingCenter> getData() {
        return  trainingCenterRepository.findAll();
    }
// error message should be shown. This should be handled by an ExceptionHandler.



    public List<TrainingCenter> getByIdTrainingCenter(Long id) {
        List<TrainingCenter> Tc = new ArrayList<>();
        for (TrainingCenter trainingCenter: trainingCenters1) {
            if (trainingCenter.getId().equals(id)) {
               Tc.add(trainingCenter);
            }
        }
        if (!Tc.isEmpty()) {
            return Tc;
        }
        throw new RuntimeException("No Training  center  data found with ID: " + id);
    }

}
