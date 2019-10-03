package com.ort.ms2i.servlets;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ort.ms2i.Model.Status;


/**
 * Servlet implementation class Status
 */
@WebServlet("/Status")
public class StatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/add_status.html");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("nom"));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU_JPA");
		 EntityManager em = emf.createEntityManager();

		 EntityTransaction transac = em.getTransaction();
		 transac.begin();
		 Status p1 = new Status(request.getParameter("nom"));

		 em.persist(p1);
		 transac.commit();
		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/add_status.html");
		rd.forward(request, response);
	}

}
