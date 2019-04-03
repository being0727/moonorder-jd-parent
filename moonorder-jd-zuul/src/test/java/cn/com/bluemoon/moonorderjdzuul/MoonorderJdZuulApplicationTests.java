package cn.com.bluemoon.moonorderjdzuul;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoonorderJdZuulApplicationTests {

	@Test
	public void contextLoads() throws  Exception {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 2019-03-25 09:00:00
		Date data = simpleDateFormat.parse("2019-03-25 09:00:00");
		long time=data.getTime();
		System.err.println(time+"");
	}

}

