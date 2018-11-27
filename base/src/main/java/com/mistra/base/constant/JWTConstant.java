package com.mistra.base.constant;

/**
 * @Author: WangRui
 * @Date: 2018-09-18
 * Time: 下午3:48
 * Description: JWT Token 常量
 */
public class JWTConstant {

    /**
     * header里面用户key值
     */
    public final static String HEADER_USER_ID_FLAG = "userId";

    /**
     * token过期时间
     */
    public final static String TOKEN_EXPIRE_TIME = "expire";

    /**
     * token头
     */
    public final static String TOKEN_HEAD = "Mistra";

    /**
     * token分割后长度
     */
    public final static int TOKEN_LENGTH = 2;

    /**
     * token过期时间-小时
     */
    public final static int OVERDUE_TIME = 1;
}
