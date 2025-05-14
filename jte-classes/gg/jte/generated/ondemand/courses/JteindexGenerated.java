package gg.jte.generated.ondemand.courses;
import org.example6.dto.courses.CoursesPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {1,1,2,2,2,9,9,9,9,14,14,14,16,16,18,18,19,19,21,21,21,21,21,21,21,22,22,22,24,24,25,25,31,31,31,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\r\n<!doctype html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"utf-8\" />\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n    <title>");
		jteOutput.setContext("title", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</title>\r\n</head>\r\n<body>\r\n    <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\r\n        <main>\r\n            <h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getHeader());
		jteOutput.writeContent("</h1>\r\n\r\n            ");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\r\n                <p>No courses available yet</p>\r\n            ");
		} else {
			jteOutput.writeContent("\r\n                ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\r\n                    <div style=\"margin-bottom: 20px; padding: 10px; border: 1px solid #ccc;\">\r\n                        <h2><a href=\"/courses/");
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
