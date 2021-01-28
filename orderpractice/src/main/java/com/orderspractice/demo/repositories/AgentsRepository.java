package com.orderspractice.demo.repositories;

import com.orderspractice.demo.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long>
{

}
