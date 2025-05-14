<!-- src/main/jte/courses/index.jte -->
@import org.example6.dto.courses.CoursesPage
@param CoursesPage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${page.getHeader()}</title>
</head>
<body>
    <div class="col-lg-8 mx-auto p-4 py-md-5">
        <main>
            <h1>${page.getHeader()}</h1>

            @if(page.getCourses().isEmpty())
                <p>No courses available yet</p>
            @else
                @for(var course : page.getCourses())
                    <div style="margin-bottom: 20px; padding: 10px; border: 1px solid #ccc;">
                        <h2><a href="/courses/${course.getId()}">${course.getName()}</a></h2>
                        <p>${course.getDescription()}</p>
                    </div>
                @endfor
            @endif

            <p><a href="/">Back to home</a></p>
        </main>
    </div>
</body>
</html>