package com.orderspractice.demo.services;

import com.orderspractice.demo.models.Agent;

public interface AgentServices
{
    Agent save(Agent agent);

    Agent findAgentById(long agentid);
}
