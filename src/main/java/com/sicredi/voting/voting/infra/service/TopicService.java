package com.sicredi.voting.voting.infra.service;

import com.sicredi.voting.voting.domain.Topic;
import com.sicredi.voting.voting.domain.mapper.TopicMapper;
import com.sicredi.voting.voting.domain.request.TopicRequest;
import com.sicredi.voting.voting.infra.repository.TopicRepository;
import com.sun.jdi.InternalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
    private TopicMapper topicMapper;

    public Topic saveTopic(TopicRequest topicRequest) {
        Topic topic = topicMapper.topicRequestToTopic(topicRequest);
        try {
            return topicRepository.save(topic);
        } catch (Exception e) {
            // LOG
            throw new InternalException(e.getMessage());
        }
    }

    public List<Topic> getAll() {
        try {
            System.out.println(topicRepository.count());
            List<Topic> all = topicRepository.findAll();
            return all;
        } catch (Exception e) {
            e.printStackTrace();
            throw new InternalException(e.getMessage());
        }
    }
}
