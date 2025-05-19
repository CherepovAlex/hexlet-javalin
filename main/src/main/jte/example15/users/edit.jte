@import org.example15.dto.users.UserPage
@import org.example15.NamedRoutes
@param UserPage page

@template.example15.layout.page(
    content = @`
        <h1>Редактирование пользователя</h1>
        <form action="${NamedRoutes.usersPath(page.getUser().getId())}" method="post">
            <input type="hidden" name="_method" value="patch">

            <div class="mb-3">
                <label for="name" class="form-label">Имя</label>
                <input type="text"
                       class="form-control"
                       id="name"
                       name="name"
                       value="${page.getUser().getName()}"
                       required>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="email"
                       class="form-control"
                       id="email"
                       name="email"
                       value="${page.getUser().getEmail()}"
                       required>
            </div>

            <div class="mb-3">
                <label for="password" class="form-label">Новый пароль</label>
                <input type="password"
                       class="form-control"
                       id="password"
                       name="password">
                <div class="form-text">Оставьте пустым, если не хотите менять пароль</div>
            </div>

            <button type="submit" class="btn btn-primary">Сохранить изменения</button>
            <a href="${NamedRoutes.usersPath()}" class="btn btn-secondary">Отмена</a>
        </form>
    `,
    footer = @`
        <div class="container text-center">
            <p class="text-muted mb-0">© 2025 User Manager | Редактирование пользователя</p>
        </div>
    `
)