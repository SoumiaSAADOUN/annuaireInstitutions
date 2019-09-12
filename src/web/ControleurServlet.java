package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.IInstitutionMetier;
import metier.IInstitutionMetierImp;
import metier.Institution;

public class ControleurServlet extends HttpServlet {
	private IInstitutionMetier metier;
	@Override
	public void init() throws ServletException {
		metier = new IInstitutionMetierImp();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("VueInstitutions.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		InstitutionModel model = new InstitutionModel();
		model.setMotCle(request.getParameter("motCle"));
		List<Institution> institutions = metier.institutionMotCle(model.getMotCle());
		model.setInstitutions(institutions);
		request.setAttribute("model", model);
		request.getRequestDispatcher("VueInstitutions.jsp").forward(request, response);
	}

}
