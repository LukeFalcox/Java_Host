package com.devfalco.to_do_list.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devfalco.to_do_list.model.ListModel;

public interface ListRepository extends JpaRepository<ListModel,Long> {


}
