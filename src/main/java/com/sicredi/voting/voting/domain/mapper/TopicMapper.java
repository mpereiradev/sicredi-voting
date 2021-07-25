package com.sicredi.voting.voting.domain.mapper;

import com.sicredi.voting.voting.domain.Topic;
import com.sicredi.voting.voting.domain.request.TopicRequest;
import com.sicredi.voting.voting.domain.response.TopicResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TopicMapper {

    Topic topicRequestToTopic(TopicRequest topicRequest);

    @Mapping(source = "id", target = "id")
    TopicResponse topicToTopicResponse(Topic topic);
}