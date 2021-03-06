package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

 
public class About implements Handler {

    // URL of this page relative to http://localhost:700/
    public static final String URL = "/about";
    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "<html>";

        // Add some Header information
        html = html + "<head>" ;

        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";



        html = html + "<head>";
        html = html +  "<meta charset='UTF-8' />"+
          "<meta name='viewport' content='width=device-width, initial-scale=1.0' />"+
          "<meta http-equiv='X-UA-Compatible' content='ie=edge' />"+
          "<title>Streetlesss</title>"+

          "<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'/>"+
          "<link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.2/css/all.css' integrity='sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr' crossorigin='anonymous'>";


    // Add the body
   html = html + "<body>";

   html = html + "<div class='container-fluid p-0'>"+
   "<nav class='navbar navbar-expand-lg'>"+
     "<a class='navbar-brand' href='#'>"+
      
     "<div class='logo'>"+ "<p style='font-size:44px'> STREETLESS</p></a>"+ "</div>"+
     "<button class='navbar-toggler' type='button' data-toggle='collapse' data-target='#navbarNav' aria-controls='navbarNav' aria-expanded='false' aria-label='Toggle navigation'>" +
       "<i class='fas fa-align-right text-light'>" + "</i>"+
     "</button>"+
       "<div class='collapse navbar-collapse' id='navbarNav'>"+
       "<div class='mr-auto'>" + "</div>"+
       "<ul class='navbar-nav'>"+
       " <li class='nav-item active'>"+
       " <a class='nav-link' href='#'>"+ "<h6></h6>"+
       " <span class='sr-only'> </span>"+
       " </a>"+
       " </li>"+
       "<p class='nav-item'>"+
       "<a class='nav-link' href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6></h6>"+"</a>"+
       "<a class='nav-link' href='http://localhost:7000'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>HOME</h6>"+"</a>"+
       "<li class='nav-item dropdown'>"+
       "<div class='dropdown'>"+
       "<a class='nav-link'   href='#'> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h6>REPORTS & DATA</h6></a>"+
       "<div class='dropdown-content'>"+
       "<a href='http://localhost:7000/lgaregion.html#'>Detailed reports</a>"+
       "<a href='http://localhost:7000/level.html'>In-depth reports</a>"+
       "</div>"+ "  </div>"+  "</li>"+
       "<a class='nav-link' href='http://localhost:7000/about'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>ABOUT</h6>"+"</a>"+
       "<a class='nav-link' href='#'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ "<h6>CONTACT</h6>"+"</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a>"+
"</p>"+
        "</ul>"+
        "</div>"+
        "</nav>"+
        "</div>";

        html = html + "<a href='http://localhost:7000/#'>Home > </a>"+
        "<a href='#'>  Contact </a>";
        html = html + "<br>"+ "<br>" + "This page is intended to present to you the data on homelessness in Australia from 2016 and 2018 </a>";
html = html + "</html>";
context.html(html);
}}
