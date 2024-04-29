package com.example.StartUpTraini8.Repo;

import com.example.StartUpTraini8.Model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Long > {

}
