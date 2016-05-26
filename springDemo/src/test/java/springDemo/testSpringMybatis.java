package springDemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sy.model.User;
import sy.service.UserServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class testSpringMybatis {
	/** junit测试方法一 **/
	// @Test
	// public void test1() {
	// @SuppressWarnings("resource")
	// ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
	// UserServiceI userService = (UserServiceI) applicationContext.getBean("UserService");
	// User user = userService.getUserById(1);
	// System.out.println(user);
	// }

	/** junit测试方法二 **/
	/** "@Before"在当前的类的所有方法之前执行这个方法,一般用作资源的初始化 **/
	// ApplicationContext applicationContext;
	//
	// @Before
	// public void before() {//只会执行一次
	// applicationContext = new ClassPathXmlApplicationContext(new String[] { "spring.xml", "spring-mybatis.xml" });
	// }
	//
	// @Test
	// public void test2() {
	// UserServiceI userService = (UserServiceI) applicationContext.getBean("UserService");
	// User user = userService.getUserById(1);
	// System.out.println(user);
	// }
	/** "@Before"在当前的类的所有方法之前执行这个方法,一般用作资源的初始化 **/

	/** junit测试方法三:采用spring-test,
	 * 注意：
	 * @RunWith(SpringJUnit4ClassRunner.class)
		@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
	 **/
	@Autowired
	UserServiceI userService;

	@Test
	public void test2() {
		User user = userService.getUserById(1);
		System.out.println(user.getName());
	}
}
