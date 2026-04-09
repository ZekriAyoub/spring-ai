package com.he2b.spring_ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;

@Service
public class RoadmapService {

    private final ChatClient chatClient;

    public RoadmapService(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String getRoadmap(String skill, int months){
        var prompt = """
                You are a career advisor. Create a roadmap for someone who wants to learn %s in %s months. 
                The roadmap should be divided into monthly milestones, with specific topics and resources 
                for each month in French.
                """.formatted(skill, months);

        var completion = Map.of("completion", Objects.requireNonNull(chatClient.prompt().user(prompt).call().content()));
        return completion.get("completion");
    }
}
