package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.model.Video;

@Service
public class VideoDao {
	@Autowired(required=true)
	VideoRepo videoRepo;
	
	public Video addVideo(Video video) {
		return videoRepo.save(video);
	}
}
