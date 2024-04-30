package com.rabbit.javaBasic.easyExcel.controller;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.util.ListUtils;
import com.rabbit.javaBasic.Result.result.R;
import com.rabbit.javaBasic.Thread.dao.UserMapper;
import com.rabbit.javaBasic.Thread.dto.User;
import com.rabbit.javaBasic.easyExcel.service.EasyExcelTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.List;

/**
 * @author yinhao
 * @date 2024/04/28
 */
@RestController
@RequestMapping("/testEasyExcel")
@RequiredArgsConstructor
public class EasyExcelTestController {

    private final EasyExcelTestService easyExcelTestService;
    private final UserMapper userMapper;

    @GetMapping("download")
    public void download(HttpServletResponse response) throws IOException {
        // 这里注意 有同学反应使用swagger 会导致各种问题，请直接用浏览器或者用postman
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");
        // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
        String fileName = URLEncoder.encode("测试", "UTF-8").replaceAll("\\+", "%20");
        response.setHeader("Content-disposition", "attachment;filename*=utf-8''" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), User.class).sheet("模板").doWrite(data());
    }

    private List<User> data() {
        return userMapper.selectList(null);
    }

}
