package com.FinalProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.VideoDao;
import com.model.Video;


@RestController
public class VideoController {
	@Autowired
	VideoDao videoDao;
	
	@PostMapping("/addVideo")
	public String addVideo(@RequestBody Video video) {
		Video video1 = videoDao.addVideo(video);
		
		if (video1 != null) {
			System.out.println("Video added Successfully!!!");
			return "1";
		}
		
		System.out.println("Video added Failed!!!");
		return "0";
	}
}
