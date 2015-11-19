package com.company.example.action.weixin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zavier.zhang on 11/19/2015.
 */

@Controller
@RequestMapping("/web/api/weixin")
public class weixinAction {


    /**
     * 微信接口测试
     */

    @RequestMapping("/login")
    @ResponseBody
    public void loginApi(
            @RequestParam(value = "signature", required = false) String signature,
            @RequestParam(value = "timestamp", required = false) String timestamp,
            @RequestParam(value = "nonce", required = false) String nonce,
            @RequestParam(value = "echostr", required = false) String echostr, HttpServletResponse response
    ) throws IOException {


        PrintWriter out = response.getWriter();

        if (SignUtil.checkSignature(signature, timestamp, nonce)) {


            out.print(echostr);
        }
        out.close();
    }
}
