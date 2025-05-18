package gg.jte.generated.ondemand.courses;
import org.example13.dto.courses.BuildCoursePage;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "courses/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,12,12,12,15,15,16,16,17,17,17,18,18,19,19,22,22,27,27,27,27,27,27,27,27,27,33,33,33,39,39,39,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BuildCoursePage page) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <title>Hello Hexlet!</title>\r\n</head>\r\n\r\n<body>\r\n");
		if (page.getErrors() != null && !page.getErrors().isEmpty()) {
			jteOutput.writeContent("\r\n    <div class=\"alert alert-danger\">\r\n        <ul>\r\n            ");
			for (var entry : page.getErrors().entrySet()) {
				jteOutput.writeContent("\r\n                ");
				for (var error : entry.getValue()) {
					jteOutput.writeContent("\r\n                    <li>");
					jteOutput.setContext("li", null);
					jteOutput.writeUserContent(error.getMessage());
					jteOutput.writeContent("</li>\r\n                ");
				}
				jteOutput.writeContent("\r\n            ");
			}
			jteOutput.writeContent("\r\n        </ul>\r\n    </div>\r\n");
		}
		jteOutput.writeContent("\r\n<form action=\"/courses\" method=\"post\">\r\n  <div>\r\n    <label>\r\n      Название курса\r\n      <input type=\"text\" name=\"name\"");
		var __jte_html_attribute_0 = page.getName();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" />\r\n    </label>\r\n  </div>\r\n  <div>\r\n    <label>\r\n      Краткое описание курса\r\n      <textarea name=\"description\">");
		jteOutput.setContext("textarea", null);
		jteOutput.writeUserContent(page.getDescription());
		jteOutput.writeContent("</textarea>\r\n    </label>\r\n  </div>\r\n  <input type=\"submit\" value=\"Опубликовать\" />\r\n</form>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BuildCoursePage page = (BuildCoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
