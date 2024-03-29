package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "JavaScript", "JavaScript description")
			));
	public List<Topic> getAllTopics() {
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

    public void addTopic(Topic topic) {
		topics.add(topic);
    }

	public void updateTopic(Topic topic, String id) {
		Topic originalTopic = getTopic(id);
		originalTopic.setId(topic.getId());
		originalTopic.setName(topic.getName());
		originalTopic.setDescription(topic.getDescription());
	}

	public void deleteTopic(String id) {
		Topic originalTopic = getTopic(id);
		topics.remove(originalTopic);
	}
}
