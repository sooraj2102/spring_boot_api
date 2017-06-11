package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by sooraj on 3/6/17.
 */

  @RestController
public class GreetingController {

    private static final String template="Hello";
    private final AtomicLong counter =new AtomicLong();
    @RequestMapping("/greeting")
  public Greetings greetings(@RequestParam(value="name",defaultValue = "World") String name)
    {
      String message=template+name;
      return new Greetings(counter.incrementAndGet(),message);
    }
    @RequestMapping("/greetingf")
    public String greeting(){
        String s="dsvsdvdv";
        return  s;

    }


}
