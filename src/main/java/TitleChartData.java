import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Map;

public class TitleChartData {
    private final Map<String, Integer> statistics;

    public TitleChartData(Map<String, Integer> statistics) {
        this.statistics = statistics;
    }

    public CategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Map.Entry<String, Integer> entry : statistics.entrySet()) {
            dataset.addValue(entry.getValue(), "Titles", entry.getKey());
        }
        return dataset;
    }

}
