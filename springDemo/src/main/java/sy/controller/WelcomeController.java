package sy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sun.util.logging.resources.logging;

/**
 * @Description 定义首页控制器
 * @author john
 * @Date 2016年5月24日 下午11:50:38
 * @Version v1.0
 */
@Controller
public class WelcomeController {
	private Logger log = Logger.getLogger(this.getClass());

	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		log.info("index");
		return new ModelAndView("index");
	}
}
