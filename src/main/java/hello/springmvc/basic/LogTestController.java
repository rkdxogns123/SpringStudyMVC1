package hello.springmvc.basic;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
/*
스프링은 기본적으로 @Controller라고 하면 view이름이 반환된다. but, @RestController라고 하면
String이 그대로 반환된다. 그래서 test같이 간단하게 할 때 간편하게 사용 가능.
 */
public class LogTestController
{

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest()
    {
        String name = "Spring";

        System.out.println("name = " + name);


        //이렇게 쓰면 name에 위의 "Spring"이 들어와 " trace my log=Spring"으로 나옴.
        log.trace(" trace my log=" + name);
        //이 순서대로 띄울 수 있음.
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info("info log={}", name);
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
