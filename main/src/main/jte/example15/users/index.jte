@import org.example15.NamedRoutes
@import org.example15.dto.users.UsersPage
@import java.time.format.DateTimeFormatter
@param UsersPage page

@template.example15.layout.page(
    content = @`
        <h1>Пользователи</h1>
        <a href="${NamedRoutes.buildUsersPath()}">Добавить пользователя</a>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Created At</th>
                </tr>
            </thead>
            <tbody>
                @if(page.getUsers().isEmpty())
                    <tr>
                        <td colspan="4">Пока не добавлено ни одного пользователя</td>
                    </tr>
                @else
                    @for(var user : page.getUsers())
                       <tr>
                            <td>${user.getId()}</td>
                            <td>${user.getName()}</td>
                            <td>${user.getEmail()}</td>
                            <td>${user.getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE)}</td>
                            <td>
                                <a href="${NamedRoutes.userPath(user.getId())}">Просмотр</a>
                                <a href="${NamedRoutes.editUserPath(user.getId())}">Редактировать</a>
                                <form action="${NamedRoutes.deleteUserPath(user.getId())}" method="post">
                                    <button type="submit">Удалить</button>
                                </form>
                            </td>
                       </tr>
                    @endfor
                @endif
            </tbody>
        </table>
    `,
    footer = @`
        <div class="container text-center">
            <p class="text-muted mb-0">© 2025 User Manager | Users Page</p>
        </div>
    `
)