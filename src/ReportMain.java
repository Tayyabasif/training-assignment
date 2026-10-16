//4.Business requirement: A company generates PDF reports, CSV reports, and Excel reports.
//All report types need a consistent generation workflow, but each format uses a different export implementation.

abstract class Report{
    public static void generateReport(){
        System.out.println("Common report generation logic");
    }

    public abstract void exportReport();
}

class PdfReport extends Report{
    @Override
    public void exportReport() {
        System.out.println("Export PDF report format");
    }
}

class CsvReport extends Report{
    @Override
    public void exportReport() {
        System.out.println("Export CSV report format");
    }
}

class ExcelReport extends Report{
    @Override
    public void exportReport() {
        System.out.println("Export Excel report format");
    }
}

public class ReportMain {

    public static void main(String[] args){
        Report.generateReport();
        Report pdf = new PdfReport();
        pdf.exportReport();

        Report csv = new CsvReport();
        csv.exportReport();

        Report excel = new ExcelReport();
        excel.exportReport();

    }

}
