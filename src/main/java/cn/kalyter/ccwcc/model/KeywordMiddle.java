package cn.kalyter.ccwcc.model;

import java.util.Date;

/**
 * Created by Kalyter on 2017-5-21 0021.
 */
public class KeywordMiddle {
    private String keyword;
    private Date startTime;
    private Date endTime;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
