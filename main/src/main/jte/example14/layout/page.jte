@import org.example14.NamedRoutes
@import gg.jte.Content
@param Content content
@param Content footer

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>User Manager</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
            crossorigin="anonymous">
    <style>
        footer {
            margin-top: 2rem;
            padding: 1rem;
            background-color: #f8f9fa;
        }
    </style>
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container">
                <a class="navbar-brand" href="${NamedRoutes.homePath()}">На главную</a>
            </div>
        </nav>
        <main class="container mt-4">
            ${content}
        </main>
        <footer class="mt-5">
            ${footer}
        </footer>
    </body>
</html>