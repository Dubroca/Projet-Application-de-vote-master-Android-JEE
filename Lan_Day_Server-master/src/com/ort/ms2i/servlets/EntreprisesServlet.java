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

import com.ort.ms2i.Model.Entreprise;



/**
 * Servlet implementation class Entreprise
 */
@WebServlet("/Entreprises")
public class EntreprisesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EntreprisesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/add_entreprise.html");
		rd.forward(request, response);
		//response.getWriter().append("Served at: ").append(request.getContextPath());
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
		 Entreprise p1 = new Entreprise(request.getParameter("nom"),request.getParameter("logo"),request.getParameter("description"));

		 em.persist(p1);
		 transac.commit();
		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/add_entreprise.html");
		rd.forward(request, response);
		//doGet(request, response);
	}

}
