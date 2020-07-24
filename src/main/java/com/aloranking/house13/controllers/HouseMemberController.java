package com.aloranking.house13.controllers;

import com.aloranking.house13.models.HouseMember;
import com.aloranking.house13.repositories.HouseMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/members")
public class HouseMemberController {

    @Autowired
    private HouseMemberRepository houseMemberRepository;


    @PostMapping("/register")
    public HouseMember createMember(@RequestBody final HouseMember houseMember){

        return houseMemberRepository.saveAndFlush(houseMember);
    }

    @GetMapping
    public List<HouseMember> getAllMember(){

        return houseMemberRepository.findAll();
    }
}
