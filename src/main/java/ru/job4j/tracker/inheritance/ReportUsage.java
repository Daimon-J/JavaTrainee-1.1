package ru.job4j.tracker.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport htmlReport = new HtmlReport();
        String htmlText = htmlReport.generate("Report's name", "Report's body");
        System.out.println(htmlText);
    }
}
