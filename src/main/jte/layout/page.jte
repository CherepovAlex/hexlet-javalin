@import org.example7.dto.UsersPage
@param UsersPage page

@template.layout(
    pageTitle = "Пользователи | My Website",
    content = @`
        <h1>Список пользователей</h1>
        <a href="/users/build" class="button">Добавить пользователя</a>
        <div class="user-list">
            @for(var user : page.getUsers())
                <div class="user-item">${user.getName()}</div>
            @endfor
        </div>
    `,
    footer = @`
        <div>
            <p>© 2025 My Website</p>
            <a href="https://github.com/CherepovAlex" target="_blank">GitHub профиль разработчика</a>
        </div>
    `
)