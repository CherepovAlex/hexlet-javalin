package gg.jte.generated.ondemand.courses;
import org.example9.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,2,2,9,9,9,9,35,35,35,39,39,39,39,39,39,39,39,39,41,41,43,43,47,47,50,50,52,52,54,54,55,55,56,56,56,57,57,59,59,61,61,61,61,61,61,61,62,62,62,64,64,65,65,71,71,71,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</title>\r\n        <style>\r\n            .course-card {\r\n                margin-bottom: 20px;\r\n                padding: 15px;\r\n                border: 1px solid #ddd;\r\n                border-radius: 5px;\r\n            }\r\n            .search-box {\r\n                margin-bottom: 20px;\r\n                padding: 15px;\r\n                background: #f5f5f5;\r\n                border-radius: 5px;\r\n            }\r\n            .search-box input[type=\"text\"] {\r\n                padding: 8px;\r\n                width: 300px;\r\n            }\r\n            .search-box button {\r\n                padding: 8px 15px;\r\n            }\r\n        </style>\r\n</head>\r\n<body>\r\n    <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\r\n        <main>\r\n            <h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</h1>\r\n\r\n            <div class=\"search-box\">\r\n                <form action=\"/courses\" method=\"get\">\r\n                    <input type=\"text\" name=\"term\"");
		var __jte_html_attribute_0 = page.getTerm();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent(" placeholder=\"Search courses...\" />\r\n                    <button type=\"submit\">Search</button>\r\n                    ");
		if (page.getTerm() != null && !page.getTerm().isEmpty()) {
			jteOutput.writeContent("\r\n                         <a href=\"/courses\" style=\"margin-left: 10px;\">Show all</a>\r\n                    ");
		}
		jteOutput.writeContent("\r\n                </form>\r\n            </div>\r\n\r\n            ");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\r\n                <div class=\"course-card\">\r\n                    <p>No courses available yet</p>\r\n                    ");
			if (page.getTerm() != null && !page.getTerm().isEmpty()) {
				jteOutput.writeContent("\r\n                        <p>Try a different search term or <a href=\"/courses\">show all courses</a></p>\r\n                    ");
			}
			jteOutput.writeContent("\r\n                </div>\r\n            ");
		} else {
			jteOutput.writeContent("\r\n                ");
			if (page.getTerm() != null && !page.getTerm().isEmpty()) {
				jteOutput.writeContent("\r\n                    <p>Showing results for: <strong>");
				jteOutput.setContext("strong", null);
				jteOutput.writeUserContent(page.getTerm());
				jteOutput.writeContent("</strong></p>\r\n                ");
			}
			jteOutput.writeContent("\r\n\r\n                ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\r\n                    <div class=\"course-card\">>\r\n                        <h2><a href=\"/courses/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(course.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent(course.getName());
				jteOutput.writeContent("</a></h2>\r\n                        <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(course.getDescription());
				jteOutput.writeContent("</p>\r\n                    </div>\r\n                ");
			}
			jteOutput.writeContent("\r\n            ");
		}
		jteOutput.writeContent("\r\n\r\n            <p><a href=\"/\">Back to home</a></p>\r\n        </main>\r\n    </div>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
