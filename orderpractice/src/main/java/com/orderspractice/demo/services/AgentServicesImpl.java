package com.orderspractice.demo.services;

import com.orderspractice.demo.models.Agent;
import com.orderspractice.demo.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentServices")
public class AgentServicesImpl implements AgentServices
{
    @Autowired
    private AgentsRepository agentsrepos;

    @Transactional
    @Override
    public Agent save(Agent agent) {
        return agentsrepos.save(agent);
    }

    @Override
    public Agent findAgentById(long agentid) throws EntityNotFoundException
    {
        return agentsrepos.findById(agentid).orElseThrow(()->new EntityNotFoundException("Agent id " + agentid + " Not Found!"));
    }
}
