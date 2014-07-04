/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IPDGES;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo Salvo Lara
 */
public class testMarce extends HttpServlet {

    
    String nombre = "gustavo";
    String apellido = "Salvo";
    String remendio = "nada";
    String parrafo = "hola como estas esta es una prueba de parrafo \n estoy probando el salto de llinea.";

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("application/pdf");
        Font typeBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, 1);
        Font type = new Font(Font.FontFamily.TIMES_ROMAN, 10);
        Font title = new Font(Font.FontFamily.TIMES_ROMAN, 15, 1);
        Font subTitle = new Font(Font.FontFamily.TIMES_ROMAN, 13, 1);
        Font subTitle2 = new Font(Font.FontFamily.TIMES_ROMAN, 10, 1);
        float space = (float) 20;
        try {
            Document document = new Document();
            document.setPageSize(PageSize.LETTER);
            PdfWriter.getInstance(document, response.getOutputStream());
            document.open();
            //parrafo
            Paragraph p1;
            //tabla
            PdfPTable tabla;
            
            //agregar un parrafo            
            p1 = new Paragraph(parrafo, type);            
            document.add(p1);
            //--------------
            p1=new Paragraph("sdafsadf asdfkasdhd aksjdh askjdh fksjdhf sakjdhf askjfh saldjh askjh alskjdhf alskdjhf sakjdfh aslkdjfh asldkf hasdk hasd\n aksjdhf askdjfh asdf askdjhf gasdjhdjfg asjdhdjg fasjdhdjfg sajdfh gsjdhgf", type);
            document.add(p1);
            //configurar tabla
           
           tabla  = new PdfPTable(4);
           tabla.setWidthPercentage(100);
           p1 = new Paragraph(space, "Rut:", type);
           PdfPCell cellRow1 = new PdfPCell(p1);
           tabla.addCell(cellRow1);
           tabla.addCell("17740216");
           tabla.addCell("nombre");
           tabla.addCell(nombre);
           document.add(tabla);
            document.close();
            
        } catch (DocumentException de) {
            throw new IOException(de.getMessage());
        }

    }

}
