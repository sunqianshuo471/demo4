package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器：实现用户CRUD的RESTful接口
 * @RestController：组合注解 = @Controller + @ResponseBody，返回JSON数据而非页面
 * @RequestMapping("/api/users")：接口根路径，所有该类下的接口都以/api/users开头
 */
@RestController
@RequestMapping("/api/users")
public class UserController {

    // 1. 查：根据用户ID查询用户信息
    // @GetMapping("/{id}")：GET请求，{id}是路径参数，匹配/api/users/1001、/api/users/1002等路径
    // @PathVariable("id")：将URL中的{id}绑定到方法参数Long id上
    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Long id) {
        return "查询成功,正在返回ID为" + id + "的用户信息";
    }

    // 2. 增：新增用户
    // @PostMapping：POST请求，无路径参数，直接匹配/api/users
    // @RequestBody User user：将前端传递的JSON请求体解析为User对象，自动赋值属性
    @PostMapping
    public String createUser(@RequestBody User user) {
        return "新增成功,接收到用户:" + user.getName() + ",年龄:" + user.getAge();
    }

    // 3. 改：根据ID全量更新用户信息
    // @PutMapping("/{id}")：PUT请求，{id}为要更新的用户ID
    // 组合使用：@PathVariable接收路径参数，@RequestBody接收更新后的用户JSON数据
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        return "更新成功,ID" + id + "的用户已修改为:" + user.getName();
    }

    // 4. 删：根据ID删除用户
    // @DeleteMapping("/{id}")：DELETE请求，{id}为要删除的用户ID
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        return "删除成功,已移除ID为" + id + "的用户";
    }
}
