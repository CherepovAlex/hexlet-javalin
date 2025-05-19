@import org.example14.NamedRoutes
@template.example14.layout.page(
    content = @`
        <h1>Главная страница</h1>
        <a href="${NamedRoutes.usersPath()}">Пользователи</a>
    `,
    footer = @`
        <div class="container text-center">
            <p class="text-muted mb-0">© 2025 User Manager | Users Page</p>
        </div>
    `
)