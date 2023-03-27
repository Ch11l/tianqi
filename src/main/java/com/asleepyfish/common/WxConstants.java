package com.asleepyfish.common;

/**
 * @Author: asleepyfish
 * @Date: 2022/8/23 18:46
 * @Description: 常量类
 */
public final class WxConstants {
    private WxConstants() {
    }

    /**
     * appId
     */
    public static final String APP_ID = "wx5f2c6da383f97f9b";

    /**
     * appSecret
     */
    public static final String APP_SECRET = "fd5db3209fbbd5fc8c1fc713bfd5873e";

    /**
     * 公众号
     */
    public static final String PUBLIC_ID = "gh_6198810edc5b";

    /**
     * token
     */
    public static final String TOKEN = "asleepyfish";

    /**
     * 请求api需要的token，开启定时任务，每一个小时获取一次
     */
    public static String accessToken = "";

    /**
     * 请求百度地图相关服务的AK
     */
    public static final String BAI_DU_AK = "grQhmPbvOljODjVOEDGGttb2vT3Gpe8p";

    /**
     * 天行API AK
     */
    public static final String TX_AK = "37a2daf1434663f712cd142c1d298dc3";

    /**
     * 相识日期
     */
    public static final String MEET_DATE = "2018-03-02";

    /**
     * 客服
     */
    public static String CUSTOMER_SERVICE = "ChatGPT@ChatGPT";
}
