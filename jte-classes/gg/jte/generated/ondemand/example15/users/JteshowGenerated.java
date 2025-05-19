package gg.jte.generated.ondemand.example15.users;
import org.example15.dto.users.UserPage;
import org.example15.NamedRoutes;
import java.time.format.DateTimeFormatter;
public final class JteshowGenerated {
	public static final String JTE_NAME = "example15/users/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,8,8,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,17,17,17,19,19,19,20,20,20,21,21,21,25,25,25,25,25,25,25,25,25,30,30,30,30,34,34,34,34,34,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.example15.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <h1>Данные пользователя</h1>\r\n            <div>\r\n                <a");
				var __jte_html_attribute_0 = NamedRoutes.editUserPath(page.getUser().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-warning\">Редактировать</a>\r\n                <a");
				var __jte_html_attribute_1 = NamedRoutes.usersPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-secondary\">Назад к списку</a>\r\n            </div>\r\n        </div>\r\n        <div class=\"card\">\r\n            <div class=\"card-body\">\r\n                <h5 class=\"card-title\">");
				jteOutput.setContext("h5", null);
				jteOutput.writeUserContent(page.getUser().getName());
				jteOutput.writeContent("</h5>\r\n                <ul class=\"list-group list-group-flush\">\r\n                    <li class=\"list-group-item\"><strong>ID:</strong> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(page.getUser().getId());
				jteOutput.writeContent("</li>\r\n                    <li class=\"list-group-item\"><strong>Email:</strong> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(page.getUser().getEmail());
				jteOutput.writeContent("</li>\r\n                    <li class=\"list-group-item\"><strong>Дата создания:</strong> ");
				jteOutput.setContext("li", null);
				jteOutput.writeUserContent(page.getUser().getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE));
				jteOutput.writeContent("</li>\r\n                </ul>\r\n            </div>\r\n            <div class=\"card-footer\">\r\n                <form");
				var __jte_html_attribute_2 = NamedRoutes.deleteUserPath(page.getUser().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n                    <button type=\"submit\" class=\"btn btn-danger\">Удалить пользователя</button>\r\n                </form>\r\n            </div>\r\n        </div>\r\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"container text-center\">\r\n            <p class=\"text-muted mb-0\">© 2025 User Manager | Users Page</p>\r\n        </div>\r\n    ");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage page = (UserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
