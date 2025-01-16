package es.ulpgc.software.kata3.view;

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
                        "es.ulpgc.software.kata3.model.Title Types Statistics",
                        "es.ulpgc.software.kata3.model.Title Type",
                        "Count",
                        dataset,
                        PlotOrientation.VERTICAL,
                        false,
                        true,
                        false);

        JFrame frame = new JFrame("es.ulpgc.software.kata3.model.Title Histogram");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChartPanel(chart));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
