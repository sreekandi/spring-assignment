package com.capgemini.spring.render;
import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component

public class MessageRender {
	@Autowired
       private MessageProvider provider;
       
       
       
       public void render(){
      System.out.println(provider.getMessage());
}
}