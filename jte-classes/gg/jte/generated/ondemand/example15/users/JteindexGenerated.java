package gg.jte.generated.ondemand.example15.users;
import org.example15.NamedRoutes;
import org.example15.dto.users.UsersPage;
import java.time.format.DateTimeFormatter;
public final class JteindexGenerated {
	public static final String JTE_NAME = "example15/users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,8,8,10,10,10,10,10,10,10,10,10,21,21,25,25,26,26,28,28,28,28,28,28,28,29,29,29,30,30,30,31,31,31,33,33,34,34,37,37,37,37,41,41,41,41,41,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.example15.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <h1>Пользователи</h1>\r\n        <a");
				var __jte_html_attribute_0 = NamedRoutes.buildUsersPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" href=\"");
					jteOutput.setContext("a", "href");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("a", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(">Добавить пользователя</a>\r\n        <table>\r\n            <thead>\r\n                <tr>\r\n                    <th>ID</th>\r\n                    <th>Name</th>\r\n                    <th>Email</th>\r\n                    <th>Created At</th>\r\n                </tr>\r\n            </thead>\r\n            <tbody>\r\n                ");
				if (page.getUsers().isEmpty()) {
					jteOutput.writeContent("\r\n                    <tr>\r\n                        <td colspan=\"4\">Пока не добавлено ни одного пользователя</td>\r\n                    </tr>\r\n                ");
				} else {
					jteOutput.writeContent("\r\n                    ");
					for (var user : page.getUsers()) {
						jteOutput.writeContent("\r\n                       <tr>\r\n                                <td><a href=\"/users/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(user.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">");
						jteOutput.setContext("a", null);
						jteOutput.writeUserContent(user.getId());
						jteOutput.writeContent("</a></td>\r\n                                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getName());
						jteOutput.writeContent("</td>\r\n                                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getEmail());
						jteOutput.writeContent("</td>\r\n                                <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE));
						jteOutput.writeContent("</td>\r\n                       </tr>\r\n                    ");
					}
					jteOutput.writeContent("\r\n                ");
				}
				jteOutput.writeContent("\r\n            </tbody>\r\n        </table>\r\n    ");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n        <div class=\"container text-center\">\r\n            <p class=\"text-muted mb-0\">© 2025 User Manager | Users Page</p>\r\n        </div>\r\n    ");
			}
		});
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
