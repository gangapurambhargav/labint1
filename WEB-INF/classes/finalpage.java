import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class finalpage extends HttpServlet
{
 public void service(HttpServletRequest req, HttpServletResponse res) throws
IOException,ServletException
 {
 //set response content type
 res.setContentType("text/html");
 //get printWrite obj
 PrintWriter pw = res.getWriter();
 //read form data from page as request parameter
 String fname = req.getParameter("fname");
 String mname = req.getParameter("mname");
 String lname = req.getParameter("lname");
 String gender = req.getParameter("gender");
 String emp = req.getParameter("emp");
 
 String creditscore = req.getParameter("cs");
 if (creditscore==greaterthan700)
 {
 pw.println("<font color='green' size='4'>Welcome "+lname+" to this BAJAJ FINANCE LOAN</font>");
 pw.println("<font color='green' size='4'>You are eligible to our loan scheme please submit your documents</font>");
 pw.println("<font color='green'size='4'>Your Deatails:");
 pw.println("<font color='green' size='4'>First Name:"+fname"</font>");
 pw.println("<font color='green' size='4'>Middle Name:"+mname"</font>");
 pw.println("<font color='green' size='4'>Last Name:"+lname"</font>");
 pw.println("<font color='green' size='4'>Gender Name:"+gender"</font>");
 pw.println("<font color='green' size='4'>Employee Type:"+emp"</font>");

 }
 else
 pw.println("<font color='red' size='4'>Hello "+lname+", you are not eligible for this BAJAJ FINANCE LOAN</font>");
 

 //add hyperlink to dynamic page
 pw.println("<br><br><a href= 'index.html'>back</a>");
 //close the stream
 pw.close();
 }
} 