package gg.jte.generated.ondemand.example16.courses;
import org.example16.dto.courses.CoursePage;
import org.example16.NamedRoutes;
public final class JteeditGenerated {
	public static final String JTE_NAME = "example16/courses/edit.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,7,7,10,10,10,10,10,10,10,10,10,13,13,13,13,13,13,13,13,13,22,22,22,22,22,22,22,22,22,32,32,32,37,37,37,37,37,37,37,37,37,40,40,40,40,44,44,44,44,44,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursePage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.example16.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"d-flex justify-content-between align-items-center mb-4\">\r\n            <h1>Редактирование курса</h1>\r\n            <a");
				var __jte_html_attribute_0 = NamedRoutes.coursePath(page.getCourse().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-secondary\">Назад к курсу</a>\r\n        </div>\r\n\r\n        <form");
				var __jte_html_attribute_1 = NamedRoutes.updateCoursePath(page.getCourse().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n            <input type=\"hidden\" name=\"_method\" value=\"patch\">\r\n\r\n            <div class=\"mb-3\">\r\n                <label for=\"name\" class=\"form-label\">Имя</label>\r\n                <input type=\"text\"\r\n                       class=\"form-control\"\r\n                       id=\"name\"\r\n                       name=\"name\"");
				var __jte_html_attribute_2 = page.getCourse().getName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                       required>\r\n            </div>\r\n\r\n            <div class=\"mb-3\">\r\n                <label for=\"description\" class=\"form-label\">Описание</label>\r\n                <textarea\r\n                    class=\"form-control\"\r\n                    id=\"description\"\r\n                    name=\"description\"\r\n                    required>");
				jteOutput.setContext("textarea", null);
				jteOutput.writeUserContent(page.getCourse().getDescription());
				jteOutput.writeContent("</textarea>\r\n            </div>\r\n\r\n            <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\r\n                <button type=\"submit\" class=\"btn btn-primary me-md-2\">Сохранить изменения</button>\r\n                <a");
				var __jte_html_attribute_3 = NamedRoutes.coursePath(page.getCourse().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-outline-secondary\">Отмена</a>\r\n            </div>\r\n        </form>\r\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"container text-center\">\r\n            <p class=\"text-muted mb-0\">© 2025 Course Manager | Редактирование курса</p>\r\n        </div>\r\n    ");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursePage page = (CoursePage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
