<!-- src/main/jte/courses/show.jte -->
@import org.example6.dto.courses.CoursePage
@param CoursePage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${page.getCourse().getName()}</title>
</head>
<body>
    <div class="col-lg-8 mx-auto p-4 py-md-5">
        <main>
            <h1>${page.getCourse().getName()}</h1>
            <p>${page.getCourse().getDescription()}</p>
            <p><a href="/courses">Back to all courses</a></p>
            <p><a href="/">Back to home</a></p>
        </main>
    </div>
</body>
</html>