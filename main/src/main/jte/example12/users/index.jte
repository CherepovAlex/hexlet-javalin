@param java.util.List<org.example12.model.User> users
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Users List</title>
</head>
<body>
    <h1>Users</h1>
    <a href="/users/build">Добавить пользователя</a>
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
            @for(var user : users) {
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getName()}</td>
                    <td>${user.getEmail()}</td>
                    <td>${user.getCreatedAt().toString()}</td>
                </tr>
            }
            @endfor
        </tbody>
    </table>
</body>
</html>