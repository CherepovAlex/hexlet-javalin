@import org.example14.NamedRoutes
@import org.example14.dto.users.UsersPage
@import java.time.format.DateTimeFormatter
@param UsersPage page

@template.example14.layout.page(
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
                                <td><a href="/users/${user.getId()}">${user.getId()}</a></td>
                                <td>${user.getName()}</td>
                                <td>${user.getEmail()}</td>
                                <td>${user.getCreatedAt().format(DateTimeFormatter.ISO_LOCAL_DATE)}</td>
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