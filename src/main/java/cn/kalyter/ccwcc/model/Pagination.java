package cn.kalyter.ccwcc.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kalyter on 1/15/2017.
 */
public class Pagination<T> {
    private int total;
    private int page;
    private int pageSize;
    private List<T> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Map<String, Object> generateMap() {
        Map<String, Object> result = new HashMap<>();
        result.put("page", getPage());
        result.put("pageSize", getPageSize());
        result.put("rows", getRows());
        return result;
    }
}
