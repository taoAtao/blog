import java.util.Date;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.cnc.blog.pojo.UserInfo;
import com.cnc.blog.service.UserInfoServiceImpl;

/**
 * @author xiangt
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring_mybatis.xml")
public class testMybatis {

    @Autowired
    private UserInfoServiceImpl userService;

    @Test
    public void testList() {
//        List<UserInfo> user = userService.listUserInfo();
//        System.out.println(Arrays.toString(user.toArray()));
//
//        UserInfo userInfo = userService.getUserInfoById(1);
//        System.out.println(userInfo.toString());
        UserInfo userInfo = new UserInfo();
        userInfo.setName("xx");
        userInfo.setPassword("1111");
        userInfo.setSex("nan");
        Date dt =new Date();
        userInfo.setBirthday((new java.sql.Date(dt.getTime())));
        System.out.println(userService.addUser(userInfo));
    }

}
