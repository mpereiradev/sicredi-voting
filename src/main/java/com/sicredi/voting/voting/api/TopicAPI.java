package com.sicredi.voting.voting.api;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import com.sicredi.voting.voting.domain.Topic;
import com.sicredi.voting.voting.domain.mapper.TopicMapper;
import com.sicredi.voting.voting.domain.request.TopicRequest;
import com.sicredi.voting.voting.infra.service.TopicService;
import com.sun.jdi.InternalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topic")
public class TopicAPI {

    @Autowired
    private TopicService topicService;

    @GetMapping("")
    public CollectionModel<Topic> listAll() throws InternalException {
        List<Topic> all = topicService.getAll();
        return CollectionModel.of(all, linkTo(methodOn(TopicAPI.class).listAll()).withSelfRel());
    }

    @PostMapping("/save")
    public EntityModel<Topic> save(@RequestBody TopicRequest topicRequest) throws InternalException {
        Topic topic = topicService.saveTopic(topicRequest);
        EntityModel<Topic> entityTopic = EntityModel.of(topic, linkTo(methodOn(TopicAPI.class).listAll()).withSelfRel());
        return entityTopic;
    }
}
