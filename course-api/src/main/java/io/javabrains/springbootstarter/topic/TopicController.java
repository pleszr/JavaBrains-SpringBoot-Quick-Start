package io.javabrains.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicSevice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicSevice.getAllTopics();
	}
	
	@RequestMapping("/topic/{foo}")
	public Topic getTopic(@PathVariable("foo") String id) {
		return topicSevice.getTopic(id);
	}

}
