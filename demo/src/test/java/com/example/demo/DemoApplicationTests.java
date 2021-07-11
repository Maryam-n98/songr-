package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testConstructor() {
		Album album1 = new Album("AMR","DIAB",20,"https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg",5050);
		album1.setTitle("AMR");
		assertEquals("AMR",album1.getTitle());
		album1.setArtist("DIAB");
		assertEquals("DIAB",album1.getArtist());
		album1.setSongCount(5555);
		assertEquals(5555,album1.getSongCount());
		album1.setLength(5050);
		assertEquals(5050 , album1.getLength());
		album1.setImageUrl("https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg");
		assertEquals("https://hatrabbits.com/wp-content/uploads/2017/01/random.jpg",album1.getImageUrl());
	}

}
