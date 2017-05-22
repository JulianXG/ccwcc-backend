package cn.kalyter.ccwcc.model;

import java.util.List;

/**
 * Created by Kalyter on 2017-4-27 0027.
 */
public class ChartData<T> {
    private List<String> sections;
    private List<ChartElement> data;

    public List<String> getSections() {
        return sections;
    }

    public void setSections(List<String> sections) {
        this.sections = sections;
    }

    public List<ChartElement> getData() {
        return data;
    }

    public void setData(List<ChartElement> data) {
        this.data = data;
    }

    class ChartElement {
        private String name;
        private List<T> data;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<T> getData() {
            return data;
        }

        public void setData(List<T> data) {
            this.data = data;
        }
    }
}
