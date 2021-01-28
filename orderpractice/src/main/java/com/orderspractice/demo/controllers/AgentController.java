package com.orderspractice.demo.controllers;

import com.orderspractice.demo.models.Agent;
import com.orderspractice.demo.services.AgentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentController
{
    @Autowired
    AgentServices agentServices;

    //http://localhost:2019/agents/agent/9
    @GetMapping(value = "/agent/{agentid}", produces = "application/json")
    public ResponseEntity<?> getAgentById(@PathVariable long agentid)
    {
        Agent a = agentServices.findAgentById(agentid);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }
}
