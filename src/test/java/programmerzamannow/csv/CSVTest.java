package programmerzamannow.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.StringWriter;

public class CSVTest {

    @Test
    void createCSV() throws IOException {
        StringWriter writer = new StringWriter();

        CSVPrinter printer = new CSVPrinter(writer, CSVFormat.DEFAULT);
        printer.printRecord("Eko", "Khannedy", 100);
        printer.printRecord("Budi", "Nugraha", 95);
        printer.flush();

        String csv = writer.getBuffer().toString();
        System.out.println(csv);
    }
}
