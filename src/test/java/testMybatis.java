import java.util.Arrays;
import java.util.List;
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
        List<UserInfo> user = userService.listUserInfo();
        System.out.println(Arrays.toString(user.toArray()));
//
//        UserInfo userInfo = userService.getUserInfoById();
//        System.out.println(userInfo.toString());
    }

}
