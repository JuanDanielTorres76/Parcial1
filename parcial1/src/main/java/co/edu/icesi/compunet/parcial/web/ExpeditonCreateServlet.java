package co.edu.icesi.compunet.parcial.web;

import co.edu.icesi.compunet.parcial.service.SightingService;
import co.edu.icesi.compunet.parcial.service.ExpeditionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import java.io.IOException;
import java.io.PrintWriter;

public class ExpeditonCreateServlet extends HttpServlet {

    private ExpeditionService expeditionservice;

    private SightingService sightingservice;

    private String contextPath;

    @Override
    public void init() throws ServletException {

        WebApplicationContext ctx = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());

        this.expeditionservice = ctx.getBean("expeditionservice", ExpeditionService.class);

        this.sightingservice = ctx.getBean("sightingservice", SightingService.class);

        this.contextPath = getServletContext().getContextPath();

    }

    
    private void pintarFormulario(PrintWriter out, HttpServletRequest request, HttpServletResponse response, String error,  String name, String code, String Region, String BaseCamp, String Leader, String StartDate, String EndDate, String Estate) throws IOException {

        Html.header(out, "Crear Expedicion", contextPath);

        if(error != null && !error.isBlank()){

            out.println("<p style=\"color:red;\">" + Html.escape(error) + "</p>");

        }

        out.println("<form method=\"post\">");

        out.println("<p><label>Nombre: <input type=\"text\" name=\"name\" value=\"" + Html.escape(name) + "\"></label></p>");

        out.println("<p><label>Code: <input type=\"text\" name=\"code\" value=\"" + Html.escape(code) + "\"></label></p>");

        out.println("<p><label>Code: <input type=\"text\" name=\"region\" value=\"" + Html.escape(Region) + "\"></label></p>");

        out.println("<p><label>Code: <input type=\"text\" name=\"base\" value=\"" + Html.escape(BaseCamp) + "\"></label></p>");

        out.println("<p><label>Code: <input type=\"text\" name=\"lider\" value=\"" + Html.escape(Leader) + "\"></label></p>");

        out.println("<p><label>Code: <input type=\"text\" name=\"fechai\" value=\"" + Html.escape(StartDate) + "\"></label></p>");

        out.println("<p><label>Code: <input type=\"text\" name=\"fechaf\" value=\"" + Html.escape(EndDate) + "\"></label></p>");

        out.println("<p><label>Code: <input type=\"text\" name=\"estado\" value=\"" + Html.escape(Estate) + "\"></label></p>");

        out.println("<p><button type=\"submit\">Crear</button></p>");

        out.println("</form>");

        Html.footer(out);

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
    
        PrintWriter out = response.getWriter();
    
        pintarFormulario(out, null, null,"", "", "", "", "", "", "", "", "");

    }

        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String SightingCode = request.getParameter("SightingCode");
        
        String name = request.getParameter("name");

        String code = request.getParameter("code");

        try{

            ExpeditionService.create("id", String SightingCode, String name, String Description, String ScientificName, String SightedAt, String Location, Integer Quantity, Integer ConfidenceLevel, Integer ExpeditionId);

            response.sendRedirect(request.getContextPath() + "/artists");

        }catch(IllegalArgumentException e){

            response.setContentType("text/html;charset=UTF-8");
    
            PrintWriter out = response.getWriter();
    
            pintarFormulario(out, e.getMessage(), name, nationality);

        }

    }
    
}
