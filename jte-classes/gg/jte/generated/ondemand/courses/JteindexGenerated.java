package gg.jte.generated.ondemand.courses;
import org.example13.NamedRoutes;
import org.example13.dto.courses.CoursePage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "courses/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,6,6,13,13,15,15,16,16,18,18,18,18,18,18,18,18,18,18,18,18,19,19,19,21,21,22,22,25,25,25,25,25,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"mx-auto p-4 py-md-5\">\r\n            <main>\r\n                <h1>Все курсы</h1>\r\n                <div class=\"mb-3\">\r\n                    <a href=\"/courses/build\">Создать новый курс</a>\r\n                </div>\r\n                ");
				if (page.getCourses().isEmpty()) {
					jteOutput.writeContent("\r\n                 <p>Пока не добавлено ни одного курса</p>\r\n                    ");
				} else {
					jteOutput.writeContent("\r\n                         ");
					for (var course : page.getCourses()) {
						jteOutput.writeContent("\r\n                            <div>\r\n                                <h2><a");
						var __jte_html_attribute_0 = NamedRoutes.coursePath(course.getId());
						if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
							jteOutput.writeContent(" href=\"");
							jteOutput.setContext("a", "href");
							jteOutput.writeUserContent(__jte_html_attribute_0);
							jteOutput.setContext("a", null);
							jteOutput.writeContent("\"");
						}
						jteOutput.writeContent(">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(course.getName());
						jteOutput.writeContent("</a></h2>\r\n                                <p>");
						jteOutput.setContext("p", null);
						jteOutput.writeUserContent(course.getDescription());
						jteOutput.writeContent("</p>\r\n                            </div>\r\n                        ");
					}
					jteOutput.writeContent("\r\n                ");
				}
				jteOutput.writeContent("\r\n            </main>\r\n        </div>\r\n    ");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
