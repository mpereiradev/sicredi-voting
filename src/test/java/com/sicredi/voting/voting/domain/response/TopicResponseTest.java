package com.sicredi.voting.voting.domain.response;

import com.sicredi.voting.voting.domain.mapper.TopicMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.sicredi.voting.voting.domain.Topic;

import static org.junit.jupiter.api.Assertions.*;

class TopicResponseTest {

    @Mock
    TopicMapper topicMapper;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenTopicComplete() {
        Topic topic = new Topic();
        topic.setId("1ABC");
        topic.setDescription("Topic for test");

        TopicResponse topicResponse = topicMapper.topicToTopicResponse(topic);
        assertEquals("1ABC", topicResponse.getId());
    }
}