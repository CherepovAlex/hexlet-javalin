@import org.example7.dto.MainPage
@param MainPage page

@template.layout(
    pageTitle = "Добро пожаловать | My Website",
    content = @`
        <h1>Добро пожаловать на наш сайт!</h1>
        <p>Здесь вы найдете много полезной информации.</p>
        <a href="/users">Посмотреть всех пользователей</a>
    `
)