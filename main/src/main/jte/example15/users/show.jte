@import org.example15.dto.users.UserPage
@import org.example15.NamedRoutes
@import java.time.format.DateTimeFormatter
@param UserPage page

@template.example15.layout.page(
    content = @`
        <h1>Данные пользователя</h1>
        <p>ID: ${page.getUser().getId()}</p>
        <p>Name: ${page.getUser().getName()}</p>
        <p>Email: ${page.getUser().getEmail()}</p>
        <p>Created: ${page.getUser().getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE)}</p>
        <a href="${NamedRoutes.usersPath()}">Назад к списку</a>
            `,
    footer = @`
        <div class="container text-center">
            <p class="text-muted mb-0">© 2025 User Manager | Users Page</p>
        </div>
    `
)