package com.calculator.utils;

import cn.hutool.json.JSONUtil;
import com.calculator.common.result.Result;
import com.calculator.common.result.ResultCode;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description:
 *
 */
public class WebUtil {

    public static void returnString(HttpServletResponse response, Integer statusCode, String errorMessage) {
        try {
            response.setContentType("application/json; charset=UTF-8");
            response.setCharacterEncoding("utf-8");

            // 错误信息
            Result result = Result.failed(statusCode, errorMessage);
            response.getWriter().println(JSONUtil.toJsonStr(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void returnString(HttpServletResponse response, ResultCode resultCode) {
        try {
            response.setContentType("application/json; charset=UTF-8");
            response.setCharacterEncoding("utf-8");

            // 错误信息
            Result result = Result.failed(resultCode.getCode(), resultCode.getMessage());
            response.getWriter().println(JSONUtil.toJsonStr(result));
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
