package com.he2b.spring_ai.controller;

import com.he2b.spring_ai.service.RoadmapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roadmap")
public class RoadmapController {

    private final RoadmapService roadmapService;

    @GetMapping
    public String getRoadmap(@RequestParam String skill,@RequestParam int months) {
        return roadmapService.getRoadmap(skill, months);
    }
}
