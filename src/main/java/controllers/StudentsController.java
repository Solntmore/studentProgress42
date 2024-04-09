package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "StudentsController", urlPatterns = "/students")
public class StudentsController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n" +
                "<link href=\"https://fonts.googleapis.com/css2?family=Kelly+Slab&display=swap\" rel=\"stylesheet\">\n" +
                "    <title>student</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    <aside class=\"navigation\">\n" +
                "        <a href=\"#\" class=\"navigation-item\">на главную</a>\n" +
                "        \n" +
                "    </aside>\n" +
                "\n" +
                "    <main class=\"main\">\n" +
                "        <h1 class=\"main-heading\"> система управления студентами и их успеваемостью\n" +
                "\n" +
                "        </h1>\n" +
                "\n" +
                "        <div class=\"student-btns\">\n" +
                "            <div class=\"student-btns1\">\n" +
                "                <button class=\"student-btn\"> посмотреть умпеваемость выбранных студентов</button>\n" +
                "                <button class=\"student-btn\"> модифицировать выбранного студента</button>\n" +
                "            </div>\n" +
                "            <div class=\"student-btns1\">\n" +
                "                <button class=\"student-btn\"> создать студента</button>\n" +
                "                <button class=\"student-btn\">удалить выбранных студентов</button>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "        <h2 class=\"heading-secondary\">\n" +
                "            список студентов\n" +
                "        </h2>\n" +
                "        <table class=\"student-table\" border=\"1\">\n" +
                "            <tr>\n" +
                "                <th>&nbsp</th>\n" +
                "                <th>фамилия</th>\n" +
                "                <th>имя</th>\n" +
                "                <th>группа</th>\n" +
                "                <th>дата поступления</th>\n" +
                "            </tr>\n" +
                "\n" +
                "            <tr>\n" +
                "                <td> <input type=\"checkbox\" id=\"\">\n" +
                "                </td>\n" +
                "                <td>сидоров</td>\n" +
                "                <td>сидор</td>\n" +
                "                <td>кт-21</td>\n" +
                "                <td>дата</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td> <input type=\"checkbox\" id=\"\">\n" +
                "                </td>\n" +
                "                <td>петров</td>\n" +
                "                <td>петр</td>\n" +
                "                <td>кт-21</td>\n" +
                "                <td>дата</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td> <input type=\"checkbox\" id=\"\">\n" +
                "                </td>\n" +
                "                <td>иванов</td>\n" +
                "                <td>иван</td>\n" +
                "                <td>кт-21</td>\n" +
                "                <td>дата</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td> <input type=\"checkbox\" id=\"\">\n" +
                "                </td>\n" +
                "                <td>макаревич</td>\n" +
                "                <td>андрей</td>\n" +
                "                <td>кт-21</td>\n" +
                "                <td>дата</td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td> <input type=\"checkbox\" id=\"\">\n" +
                "                </td>\n" +
                "                <td>бельгиец</td>\n" +
                "                <td>василий</td>\n" +
                "                <td>кт-21</td>\n" +
                "                <td>дата</td>\n" +
                "            </tr>\n" +
                "        </table>\n" +
                "\n" +
                "    </main>\n" +
                "    <aside class=\"logout\">\n" +
                "        <a href=\"#\" class=\"logout-btn\">logout</a>\n" +
                "\n" +
                "    </aside>\n" +
                "    \n" +
                "</body>\n" +
                "</html>");
    }
}
