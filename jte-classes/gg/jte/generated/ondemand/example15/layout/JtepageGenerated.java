package gg.jte.generated.ondemand.example15.layout;
import org.example15.NamedRoutes;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "example15/layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,27,27,27,27,27,27,27,27,27,27,31,31,31,34,34,34,37,37,37,2,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content content, Content footer) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n  <head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <title>User Manager</title>\r\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\r\n            rel=\"stylesheet\"\r\n            integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\r\n            crossorigin=\"anonymous\">\r\n    <style>\r\n        footer {\r\n            margin-top: 2rem;\r\n            padding: 1rem;\r\n            background-color: #f8f9fa;\r\n        }\r\n    </style>\r\n    </head>\r\n\r\n    <body>\r\n        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n            <div class=\"container\">\r\n                <a class=\"navbar-brand\"");
		var __jte_html_attribute_0 = NamedRoutes.homePath();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" href=\"");
			jteOutput.setContext("a", "href");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("a", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(">На главную</a>\r\n            </div>\r\n        </nav>\r\n        <main class=\"container mt-4\">\r\n            ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(content);
		jteOutput.writeContent("\r\n        </main>\r\n        <footer class=\"mt-5\">\r\n            ");
		jteOutput.setContext("footer", null);
		jteOutput.writeUserContent(footer);
		jteOutput.writeContent("\r\n        </footer>\r\n    </body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content content = (Content)params.get("content");
		Content footer = (Content)params.get("footer");
		render(jteOutput, jteHtmlInterceptor, content, footer);
	}
}
