package database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sooraj on 7/6/17.
 */
@RestController
@SpringBootApplication
public class Controller {

    @Autowired
    Repository repository;


    public static void main(String[] args)
    {
        SpringApplication.run(Controller.class,args);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/register")
    @ResponseBody
    public String register(String name,String email,String mob )
    {
        Data user;
        user=new Data(name,email,mob);
        repository.save(user);
        String message="Successfully registered with id =";
        return message+user.getId();

    }

    @RequestMapping(method = RequestMethod.POST,value = "/users/{id}")
    @ResponseBody
    public Data getUser(@PathVariable int id)
    {
        return repository.findOne(id);
    }


}
