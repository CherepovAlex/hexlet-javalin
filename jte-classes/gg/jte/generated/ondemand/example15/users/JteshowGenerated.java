package gg.jte.generated.ondemand.example15.users;
import org.example15.dto.users.UserPage;
import org.example15.NamedRoutes;
import java.time.format.DateTimeFormatter;
public final class JteshowGenerated {
	public static final String JTE_NAME = "example15/users/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,8,8,10,10,10,11,11,11,12,12,12,13,13,13,14,14,14,14,14,14,14,14,14,15,15,15,15,19,19,19,19,19,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.example15.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <h1>Данные пользователя</h1>\r\n        <p>ID: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(page.getUser().getId());
				jteOutput.writeContent("</p>\r\n        <p>Name: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(page.getUser().getName());
				jteOutput.writeContent("</p>\r\n        <p>Email: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(page.getUser().getEmail());
				jteOutput.writeContent("</p>\r\n        <p>Created: ");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(page.getUser().getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE));
				jteOutput.writeContent("</p>\r\n        <a");
				var __jte_html_attribute_0 = NamedRoutes.usersPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Назад к списку</a>\r\n            ");
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
