package gg.jte.generated.ondemand.example16.courses;
import org.example16.dto.courses.CoursePage;
import org.example16.NamedRoutes;
import java.time.format.DateTimeFormatter;
public final class JteshowGenerated {
	public static final String JTE_NAME = "example16/courses/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,8,8,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,16,16,16,17,17,17,18,18,18,18,18,18,18,18,18,19,19,19,19,19,19,19,19,19,23,23,23,23,23,23,23,23,23,27,27,27,27,31,31,31,32,32,32,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.example16.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <h1>Данные курса</h1>\r\n            <div>\r\n                <a");
				var __jte_html_attribute_0 = NamedRoutes.editCoursePath(page.getCourse().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-warning\">Редактировать</a>\r\n                <a");
				var __jte_html_attribute_1 = NamedRoutes.coursesPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-secondary\">Назад к списку</a>\r\n            </div>\r\n            <div class=\"col-lg-8 mx-auto p-4 py-md-5\">\r\n                <main>\r\n                    <h1>");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getCourse().getName());
				jteOutput.writeContent("</h1>\r\n                    <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(page.getCourse().getDescription());
				jteOutput.writeContent("</p>\r\n                    <p><a");
				var __jte_html_attribute_2 = NamedRoutes.coursesPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">К списку курсов</a></p>\r\n                    <p><a");
				var __jte_html_attribute_3 = NamedRoutes.homePath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">На главную</a></p>\r\n                </main>\r\n            </div>\r\n            <div class=\"card-footer\">\r\n                    <form");
				var __jte_html_attribute_4 = NamedRoutes.deleteCoursePath(page.getCourse().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n                        <button type=\"submit\" class=\"btn btn-danger\">Удалить курс</button>\r\n                    </form>\r\n            </div>\r\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"container text-center\">\r\n            <p class=\"text-muted mb-0\">© 2025 Course Manager | Просмотр курса</p>\r\n        </div>\r\n    ");
			}
		});
		jteOutput.writeContent("\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
