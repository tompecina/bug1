package bugs;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import com.itextpdf.kernel.pdf.PdfReader;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.kernel.pdf.PdfDocument;

public class Bug1 {

    public static void main(String args[]) throws IOException {

	PdfReader reader = new PdfReader(new FileInputStream("empty.pdf"));
	PdfWriter writer = new PdfWriter(new FileOutputStream("out.pdf"));
	PdfDocument pdfDocument = new PdfDocument(reader, writer);
	pdfDocument.close();
    }
}
