package com.company.example.action.weixin;

import me.chanjar.weixin.common.bean.WxMenu;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.WxMpServiceImpl;

/**
 * Created by zavier.zhang on 11/19/2015.
 */
public class wenxin {
    public static void main(String[] args) throws WxErrorException {
        WxMpInMemoryConfigStorage config = new WxMpInMemoryConfigStorage();
        config.setAppId("wxe88947ae9d024e94"); // 设置微信公众号的appid
        config.setSecret("847a83992a5d5a183b54d9a8479c2fd7"); // 设置微信公众号的app corpSecret
        config.setToken("BLzIcQnkZa6e5bZIBYyhyvY0u2znpO6izcjmvNLS3cA-A9bvFfuYiFNpekWaScktPAhBjk3kS4O4FxQ1jR7Kn4tm4KKWA4viNGpkbtRDjl0XABgAJABEF"); // 设置微信公众号的token
        config.setAesKey("VMxibUEoM6JvTxucZLEN9AdmO5gPmumnjep928yAu66"); // 设置微信公众号的EncodingAESKey
        //config.setOauth2redirectUri("http://zhangw.cn-hangzhou.aliapp.com/OAuth.do");
        WxMpService wxService = new WxMpServiceImpl();
        wxService.setWxMpConfigStorage(config);

// 用户的openid在下面地址获得
// https://mp.weixin.qq.com/debug/cgi-bin/apiinfo?t=index&type=用户管理&form=获取关注者列表接口%20/user/get
//        String openid = "oXbeuuAdc6LbFsqLBj2vx8hp5da8";
//        WxMpCustomMessage message = WxMpCustomMessage.TEXT().toUser(openid).content(wxService.oauth2buildAuthorizationUrl(WxConsts.OAUTH2_SCOPE_USER_INFO,null)).build();
//        wxService.customMessageSend(message);


        WxMenu wxMenu = WxMenu.fromJson("{\"menu\":{\"button\":[{\"type\":\"click\",\"name\":\"便民服务\",\"key\":\"V1001_TODAY_MUSIC\",\"sub_button\":[{\"type\":\"view\",\"name\":\"自助移车\",\"url\":\"http://www.soso.com/\",\"sub_button\":[]},{\"type\":\"view\",\"name\":\"走失寻人\",\"url\":\"http://www.soso.com/\",\"sub_button\":[]},{\"type\":\"view\",\"name\":\"开锁服务\",\"url\":\"http://www.soso.com/\",\"sub_button\":[]}   ]}," +
                "{\"type\":\"click\",\"name\":\"报警举报\",\"key\":\"V1001_TODAY_SINGER\",\"sub_button\":[{\"type\":\"view\",\"name\":\"微信报警\",\"url\":\"http://www.soso.com/\",\"sub_button\":[]} ,{\"type\":\"view\",\"name\":\"随手拍\",\"url\":\"http://www.soso.com/\",\"sub_button\":[]}]}," +
                "{\"name\":\"民警互动\",\"sub_button\":[{\"type\":\"view\",\"name\":\"用户注册\",\"url\":\"http://www.soso.com/\",\"sub_button\":[]},{\"type\":\"view\",\"name\":\"公安微博\",\"url\":\"http://zhangw.cn-hangzhou.aliapp.com/game.html\",\"sub_button\":[]},{\"type\":\"click\",\"name\":\"信息公示\",\"key\":\"V1001_GOOD\",\"sub_button\":[]}]}]}}");


// 设置菜单
        wxService.menuCreate(wxMenu);

        WxMenu wxMenu1 = wxService.menuGet();
        System.out.println(wxMenu1.toString());


//        WxMpMassOpenIdsMessage massMessage = new WxMpMassOpenIdsMessage();
//        massMessage.setMsgType(WxConsts.MASS_MSG_TEXT);
//        massMessage.setContent("早上好！");
//        massMessage.getToUsers().add("oXbeuuGM8X5DvhVQoqLMEJf4--GM");
//        massMessage.getToUsers().add("oXbeuuAdc6LbFsqLBj2vx8hp5da8");
//        massMessage.getToUsers().add("oXbeuuEAs0OVo15wgl2n7Qo-_rxk");
//
//        WxMpMassSendResult massResult = wxService.massOpenIdsMessageSend(massMessage);
//        wxService.oauth2buildAuthorizationUrl(WxConsts.OAUTH2_SCOPE_USER_INFO,"http://zhangw.cn-hangzhou.aliapp.com/game.html");

//        WxMpOAuth2AccessToken wxMpOAuth2AccessToken = wxService.oauth2getAccessToken(code);
//        WxMpUser wxMpUser = wxService.oauth2getUserInfo(wxMpOAuth2AccessToken, null);
    }
}
