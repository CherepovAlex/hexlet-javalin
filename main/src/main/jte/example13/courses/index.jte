@import org.example13.NamedRoutes
@import org.example13.dto.courses.CoursePage
@param CoursePage page

@template.example13.layout.page(
    content = @`
        <div class="mx-auto p-4 py-md-5">
            <main>
                <h1>Все курсы</h1>
                <div class="mb-3">
                    <a href="example13/courses/build">Создать новый курс</a>
                </div>
                @if(page.getCourses().isEmpty())
                 <p>Пока не добавлено ни одного курса</p>
                    @else
                         @for(var course : page.getCourses())
                            <div>
                                <h2><a href="${NamedRoutes.coursePath(course.getId())}">${course.getName()}</a></h2>
                                <p>${course.getDescription()}</p>
                            </div>
                        @endfor
                @endif
            </main>
        </div>
    `
)