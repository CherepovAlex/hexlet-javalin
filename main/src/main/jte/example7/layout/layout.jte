
@import gg.jte.Content
@param Content content
@param String pageTitle = "Hexlet Javalin Example"
@param Content footer = null

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${pageTitle}</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            line-height: 1.6;
        }
        header {
            background: #333;
            color: #fff;
            padding: 1rem;
        }
        .header-content {
            display: flex;
            justify-content: space-between;
            align-items: center;
            max-width: 1200px;
            margin: 0 auto;
        }
        .logo {
            font-size: 1.5rem;
            font-weight: bold;
        }
        nav a {
            color: #fff;
            text-decoration: none;
            margin-left: 1rem;
        }
        main {
            max-width: 1200px;
            margin: 2rem auto;
            padding: 0 1rem;
        }
        footer {
            background: #333;
            color: #fff;
            text-align: center;
            padding: 1rem;
            margin-top: 2rem;
        }
        footer a {
            color: #fff;
        }
    </style>
</head>

<body>
    <header>
        <div class="header-content">
            <div class="logo">My Website</div>
            <nav>
                <a href="/">Главная</a>
                <a href="/users">Пользователи</a>
                <a href="/courses">Курсы</a>
            </nav>
        </div>
    </header>

    <main>
        ${content}
    </main>

    @if (footer != null)
        <footer>
            ${footer}
        </footer>
    @else
        <footer>
            <a href="https://github.com/CherepovAlex" target="_blank">Мой профиль на GitHub</a>
        </footer>
    @endif
</body>
</html>