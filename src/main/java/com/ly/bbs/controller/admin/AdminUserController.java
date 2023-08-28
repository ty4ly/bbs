package com.ly.bbs.controller.admin;

import com.ly.bbs.mapper.UserMapper;
import com.ly.bbs.pojo.Ban;
import com.ly.bbs.pojo.User;
import com.ly.bbs.service.BanService;
import com.ly.bbs.service.UserService;
import com.ly.bbs.util.DateFormat;
import com.ly.bbs.util.JsonResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Mr.Liu
 */
@RestController
@RequestMapping("/a_user")
public class AdminUserController {

    @Resource
    private UserService userServiceImpl;

    @Resource
    private BanService banServiceImpl;

    @PostMapping("/update")
    public int updateUser(@RequestBody User user){
        System.out.println(user);

        if ("1".equals(user.getuImageUrl())) {
            user.setuImageUrl("/bbs/upload/1.png");
        }

        int i = userServiceImpl.updateUser(user);

        if (i<1) {
            return 500;
        }

        return 200;
    }

    @GetMapping("/getOne/{id}")
    public User getById(@PathVariable("id") int id){
        return userServiceImpl.getById(1);
    }

    @GetMapping("/getAll")
    public JsonResult<List<User>> getAllUsers(){
        List<User> allUser = userServiceImpl.getAll();

        JsonResult<List<User>> listJsonResult = new JsonResult<>(200,allUser);

        listJsonResult.setMessage("success");

        return listJsonResult;
    }
    @GetMapping(value = "/ban/{id}/{state}")
    public int banUser(@PathVariable("id")int id,@PathVariable("state") int state){

        //这里bId任意 没有指定constructor
          int i = 0;

        if(state == 1){

            Ban lastOne = banServiceImpl.getByUidLastOne(id);

            banServiceImpl.updateBan(lastOne);

            i =  userServiceImpl.unBan(id);
        }else{
            if(banServiceImpl.getAllByUid(id)!=null){

            }
            int banTime = banServiceImpl.insertBan(new Ban(1,id, DateFormat.formatDate(),"1",new User()));

            i =  userServiceImpl.changeState(id);
        }


        if (i>0) {
            return 200;
        }else {
            return 500;
        }
    }


    @GetMapping(value = "/byId/{id}")
    public User getUser(@PathVariable("id") String id){

        return null;
    }

    @PostMapping("/login")
    public JsonResult<User> login(@RequestBody User user){
        System.out.println("---123---");
        System.out.println(user);

        User loginUser = userServiceImpl.adminLogin(user);
        JsonResult<User> result = new JsonResult<>();
        if (loginUser != null) {
            result.setState(200);
            result.setData(loginUser);
        }else{
            result.setState(500);
            result.setMessage("账号或密码错误");
        }

        return result;
    }


}
