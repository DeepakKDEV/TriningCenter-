package com.example.StartUpTraini8.Controller;


import com.example.StartUpTraini8.Model.TrainingCenter;
import com.example.StartUpTraini8.Service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Validated
public class TrainingCenterController {



                 @Autowired
             TrainingCenterService   trainingCenterService;
  //Create a POST api to create and save a new training center
    @PostMapping("Post/data")
    public String PstApi(@RequestBody @Valid TrainingCenter trainingCenter) {
        return trainingCenterService.PstApi(trainingCenter);
    }
    //Create a GET api to get list of all stored training centers

    @GetMapping("get/data")
    public List<TrainingCenter> getData(){
        return trainingCenterService.getData();
    }
    @GetMapping("get/data/id/{id}")

    public List<TrainingCenter>  getByIdTrainingCenter(@PathVariable  Long  id){
        return  trainingCenterService.getByIdTrainingCenter(id);
    }


}
