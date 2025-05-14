<!-- src/main/jte/courses/index.jte -->
@import org.example9.dto.courses.CoursesPage
@param CoursesPage page

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>${page.getHeader()}</title>
        <style>
            .course-card {
                margin-bottom: 20px;
                padding: 15px;
                border: 1px solid #ddd;
                border-radius: 5px;
            }
            .search-box {
                margin-bottom: 20px;
                padding: 15px;
                background: #f5f5f5;
                border-radius: 5px;
            }
            .search-box input[type="text"] {
                padding: 8px;
                width: 300px;
            }
            .search-box button {
                padding: 8px 15px;
            }
        </style>
</head>
<body>
    <div class="col-lg-8 mx-auto p-4 py-md-5">
        <main>
            <h1>${page.getHeader()}</h1>

            <div class="search-box">
                <form action="/courses" method="get">
                    <input type="text" name="term" value="${page.getTerm()}" placeholder="Search courses..." />
                    <button type="submit">Search</button>
                    @if(page.getTerm() != null && !page.getTerm().isEmpty())
                         <a href="/courses" style="margin-left: 10px;">Show all</a>
                    @endif
                </form>
            </div>

            @if(page.getCourses().isEmpty())
                <div class="course-card">
                    <p>No courses available yet</p>
                    @if(page.getTerm() != null && !page.getTerm().isEmpty())
                        <p>Try a different search term or <a href="/courses">show all courses</a></p>
                    @endif
                </div>
            @else
                @if(page.getTerm() != null && !page.getTerm().isEmpty())
                    <p>Showing results for: <strong>${page.getTerm()}</strong></p>
                @endif

                @for(var course : page.getCourses())
                    <div class="course-card">>
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