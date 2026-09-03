package co.edu.icesi.compunet.parcial.web;

import java.io.PrintWriter;

public class Html {

    private Html() {

    }

    public static String escape(String texto){

        if (texto == null) return "";

        return texto.replace("&", "&amp;")
                .replace("<", "&lt;")

                .replace(">", "&gt;")

                .replace("\"", "&quot;")

                .replace("'", "&#39;");
    }

    public static void header(PrintWriter out, String titulo, String ctx) {

        out.println("<!DOCTYPE html>");

        out.println("<html lang=\"es\">");

        out.println("<head>");

        out.println("<meta charset=\"UTF-8\">");

        out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");

        out.println("<style>");

        out.println("body { font-family: system-ui, sans-serif; margin: 2rem; }");

        out.println("table { border-collapse: collapse; }");

        out.println("th, td { border: 1px solid #ccc; padding: .4rem .8rem; text-align: left; }");

        out.println("th { background: #eee; }");

        out.println("</style>");

        out.println("<title>" + escape(titulo) + "</title>");

        out.println("</head>");

        out.println("<body>");

        out.println("<h1>" + escape(titulo) + "</h1>");

        out.println("<nav>");

        out.println("<a href=\"" + ctx + "/\">Inicio</a> | ");

        out.println("<a href=\"" + ctx + "/expeditions\">Expediciones</a> | ");

        out.println("<a href=\"" + ctx + "/expeditions/new\">Agregar Expedición</a>");

        out.println("<a href=\"" + ctx + "/sightings\">Avistamientos</a> | ");

        out.println("<a href=\"" + ctx + "/sightings/new\">Agregar Avistamiento</a>");

        out.println("</nav>");

        out.println("<hr>");

    };

    public static void footer(PrintWriter out){

        out.println("</body>");

        out.println("</html>");

    };
    
}
