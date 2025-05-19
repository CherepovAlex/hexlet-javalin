package gg.jte.generated.ondemand.example15.users;
import org.example15.dto.users.UserPage;
import org.example15.NamedRoutes;
public final class JteeditGenerated {
	public static final String JTE_NAME = "example15/users/edit.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,2,2,4,4,7,7,10,10,10,10,10,10,10,10,10,13,13,13,13,13,13,13,13,13,22,22,22,22,22,22,22,22,22,32,32,32,32,32,32,32,32,32,47,47,47,47,47,47,47,47,47,50,50,50,50,54,54,54,54,54,2,2,2,2};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.example15.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"d-flex justify-content-between align-items-center mb-4\">\r\n            <h1>Редактирование пользователя</h1>\r\n            <a");
				var __jte_html_attribute_0 = NamedRoutes.userPath(page.getUser().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-secondary\">Назад к пользователю</a>\r\n        </div>\r\n\r\n        <form");
				var __jte_html_attribute_1 = NamedRoutes.updateUserPath(page.getUser().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_1)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_1);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n            <input type=\"hidden\" name=\"_method\" value=\"patch\">\r\n\r\n            <div class=\"mb-3\">\r\n                <label for=\"name\" class=\"form-label\">Имя</label>\r\n                <input type=\"text\"\r\n                       class=\"form-control\"\r\n                       id=\"name\"\r\n                       name=\"name\"");
				var __jte_html_attribute_2 = page.getUser().getName();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_2)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_2);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                       required>\r\n            </div>\r\n\r\n            <div class=\"mb-3\">\r\n                <label for=\"email\" class=\"form-label\">Email</label>\r\n                <input type=\"email\"\r\n                       class=\"form-control\"\r\n                       id=\"email\"\r\n                       name=\"email\"");
				var __jte_html_attribute_3 = page.getUser().getEmail();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_3)) {
					jteOutput.writeContent(" value=\"");
					jteOutput.setContext("input", "value");
					jteOutput.writeUserContent(__jte_html_attribute_3);
					jteOutput.setContext("input", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent("\r\n                       required>\r\n            </div>\r\n\r\n            <div class=\"mb-3\">\r\n                <label for=\"password\" class=\"form-label\">Новый пароль</label>\r\n                <input type=\"password\"\r\n                       class=\"form-control\"\r\n                       id=\"password\"\r\n                       name=\"password\">\r\n                <div class=\"form-text\">Оставьте пустым, если не хотите менять пароль</div>\r\n            </div>\r\n\r\n            <div class=\"d-grid gap-2 d-md-flex justify-content-md-end\">\r\n                <button type=\"submit\" class=\"btn btn-primary me-md-2\">Сохранить изменения</button>\r\n                <a");
				var __jte_html_attribute_4 = NamedRoutes.userPath(page.getUser().getId());
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_4)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_4);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" class=\"btn btn-outline-secondary\">Отмена</a>\r\n            </div>\r\n        </form>\r\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"container text-center\">\r\n            <p class=\"text-muted mb-0\">© 2025 User Manager | Редактирование пользователя</p>\r\n        </div>\r\n    ");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage page = (UserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
