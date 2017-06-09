package demo.msa;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tangfw on 2017/5/13.
 */
@RestController
public class HelloController {

    @RequestMapping(method= {RequestMethod.GET,RequestMethod.POST}, path="/hello")
    public String hello(){
        return "hello";
    }

}
