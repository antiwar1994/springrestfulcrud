package com.andreipiletsky.springsecurity.service;
import com.andreipiletsky.springsecurity.model.Topic;
import com.andreipiletsky.springsecurity.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicServiceImp implements TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Override
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }
    @Override
    public Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }
    @Override
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }
    @Override
    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }
    @Override
    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
