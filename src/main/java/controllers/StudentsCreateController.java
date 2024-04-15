package controllers;

import db.DBManager;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "StudentsCreateController", urlPatterns = "/students-create")
public class StudentsCreateController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/student-create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String surname = req.getParameter("surname");
       String name = req.getParameter("name");
       String groups = req.getParameter("groups");
       String date = req.getParameter("date");

       DBManager.createStudent(surname, name, groups, date);
       resp.sendRedirect("/students");
    }
}
