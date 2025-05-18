@import org.example13.dto.courses.BuildCoursePage
@param BuildCoursePage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Hello Hexlet!</title>
</head>

<body>
@if(page.getErrors() != null && !page.getErrors().isEmpty())
    <div class="alert alert-danger">
        <ul>
            @for(var entry : page.getErrors().entrySet())
                @for(var error : entry.getValue())
                    <li>${error.getMessage()}</li>
                @endfor
            @endfor
        </ul>
    </div>
@endif
<form action="/courses" method="post">
  <div>
    <label>
      Название курса
      <input type="text" name="name" value="${page.getName()}" />
    </label>
  </div>
  <div>
    <label>
      Краткое описание курса
      <textarea name="description">${page.getDescription()}</textarea>
    </label>
  </div>
  <input type="submit" value="Опубликовать" />
</form>
</body>
</html>