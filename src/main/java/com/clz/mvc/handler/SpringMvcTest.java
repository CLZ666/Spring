package com.clz.mvc.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@SessionAttributes(value = "user", types = String.class)
@Controller
@RequestMapping("/springMvc")
public class SpringMvcTest {
    public static final String SUCCESS = "success";

    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("hello springMvc");
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod() {
        System.out.println("test method");
        return SUCCESS;
    }

    @RequestMapping(value = "/testParamsAndHeader", params = {"userName", "age!=10"}, headers = {"Accept-Encoding=gzip, deflate"})
    public String testParamsAndHeader() {
        System.out.println("test method");
        return SUCCESS;
    }

    /**
     * url 占位符
     *
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") Integer id) {
        System.out.println("testPathVariable:" + id);
        return SUCCESS;
    }

    /**
     * 请求参数
     *
     * @return
     */
    @RequestMapping("/testRequestParams")
    public String testRequestParams(@RequestParam(value = "username") String username,
                                    @RequestParam(value = "age", required = false, defaultValue = "10") int age) {
        System.out.println("testRequestParams:userName" + username + ",age:" + age);
        return SUCCESS;
    }

    /**
     * 映射请求头
     *
     * @return
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept-Language") String al) {
        System.out.println("testRequestHeader:Accept-Language" + al);
        return SUCCESS;
    }

    /**
     * cookieValue
     *
     * @return
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String jsessionId) {
        System.out.println("testCookieValue:JSESSIONID: " + jsessionId);
        return SUCCESS;
    }


    /**
     * pojo 即 java对象对应请求参数
     *
     * @return
     */
    @RequestMapping(value = "/testPOJOParams", method = RequestMethod.POST)
    public String testPOJOParams(User user) {
        System.out.println(user.toString());
        return SUCCESS;
    }

    /**
     * modalAndView ，向请求域内添加数据
     *
     * @return
     */
    @RequestMapping(value = "/testModelAndView", method = RequestMethod.GET)
    public ModelAndView testModelAndView() {
        String viewName = SUCCESS;
        ModelAndView mv = new ModelAndView(viewName);
        //添加数据类型到ModelAndView中
        mv.addObject("time", new Date());
        return mv;
    }

    /**
     * 目标方法可以添加Map类型 的参数，向请求域内添加数据
     *
     * @SessionAttribute只能放在类上，不能放在方法上
     */
    @RequestMapping(value = "/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("names", Arrays.asList("Tom", "Jerry", "Tony"));
        return SUCCESS;
    }

    /**
     * 向会话域内添加数据
     *
     * @SessionAttributes只能放在类上，不能放在方法上
     */
    @RequestMapping(value = "/testSessionAttributes")
    public String testSessionAttributes(Map<String, Object> map) {
        User user = new User("小明", 25);
        map.put("user", user);
        map.put("school", "黑马");
        return SUCCESS;
    }
}
