package com.andreipiletsky.springsecurity.service;
import com.andreipiletsky.springsecurity.model.Topic;

import java.util.List;
public interface TopicService {
    List<Topic> getAllTopics();
    Topic getTopic(String id);
    void addTopic(Topic topic);
    void updateTopic(String id, Topic topic);
    void deleteTopic(String id);
}
