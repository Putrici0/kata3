import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

import javax.swing.*;

public class TitleChartDisplay {
    private final CategoryDataset dataset;

    public TitleChartDisplay(CategoryDataset dataset) {
        this.dataset = dataset;
    }

    public void display() {
        JFreeChart chart = ChartFactory
                .createBarChart(
                        "Title Types Statistics",
                        "Title Type",
                        "Count",
                        dataset,
                        PlotOrientation.VERTICAL,
                        false,
                        true,
                        false);

        JFrame frame = new JFrame("Title Histogram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
