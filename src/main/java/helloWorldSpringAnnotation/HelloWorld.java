package helloWorldSpringAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
 
@Component
public class HelloWorld {
 
    @Value("Hello, World!")
    private String message;
 
    public String getMessage() {
        return message;
    }
 
}