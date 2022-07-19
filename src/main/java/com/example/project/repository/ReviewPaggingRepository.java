package com.example.project.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Review;



@Repository
public interface ReviewPaggingRepository extends PagingAndSortingRepository<Review, Long>  {

}
