package helloWorldSpringAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class Main {
 
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext("helloWorldSpringAnnotation");
 
    HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
    System.out.println(helloWorld.getMessage());
  }
 
}