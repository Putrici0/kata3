package es.ulpgc.software.kata3.control;

import es.ulpgc.software.kata3.model.Title;
import es.ulpgc.software.kata3.model.TotalTitleStatistics;
import es.ulpgc.software.kata3.model.TsvTitleLoader;
import es.ulpgc.software.kata3.view.TitleChartData;
import es.ulpgc.software.kata3.view.TitleChartDisplay;
import org.jfree.data.category.CategoryDataset;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Title> titleList = TsvTitleLoader.with(new File("title.basics.tsv")).load();

        Map<String, Integer> statistics = new TotalTitleStatistics().execute(titleList);
        for (String key : statistics.keySet()) {
            System.out.println(key+" = "+ statistics.get(key));
        }
        TitleChartData chartData = new TitleChartData(statistics);
        CategoryDataset dataset = chartData.createDataset();

        TitleChartDisplay chartDisplay = new TitleChartDisplay(dataset);
        chartDisplay.display();
    }
}
