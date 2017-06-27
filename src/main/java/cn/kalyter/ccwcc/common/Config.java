package cn.kalyter.ccwcc.common;

import java.text.SimpleDateFormat;

/**
 * Created by Kalyter on 2017-5-21 0021.
 */
public final class Config {
    public static final SimpleDateFormat yyyyMM = new SimpleDateFormat("yyyy-MM");

    public static final SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static final int VALIDATE_CODE_EXPIRE_MINUTE = 15;

    public static final int VALIDATE_LINK_EXPIRE_MINUTE = 24 * 60;

    public static final int USER_AVAILABLE = 1;

    public static final int USER_UNAVAILABLE = 0;
}
