package com.MainApp.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.MainApp.Pojo.Vote;

@Repository
public interface VoteRepo extends CrudRepository<Vote, String>{

	int countByCname(String cname);

}
