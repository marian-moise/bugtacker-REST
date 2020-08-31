package com.project;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends JpaRepository<Status, Integer> {


    // select * from status where statusName like '%n' and statusId > 5
    // spring data jpa genereaza query-uri pe baza numelor metodelor

    List<Status> findAllByIdDeStatusGreaterThanOrderByIdDeStatusDesc(Integer startingId);

    List<Status> findAllByIdDeStatusGreaterThanOrderByIdDeStatus(Integer startingId);


}
