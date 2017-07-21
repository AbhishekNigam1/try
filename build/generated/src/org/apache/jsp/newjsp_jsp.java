package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <img src=\"res/head.jpg\" style=\"width:100%\">\n");
      out.write("<link rel=\"stylesheet\" href=\"res/Site.css\"/>\n");
      out.write("<link rel=\"stylesheet\" href=\"res/w3.css\"/>\n");
      out.write("\n");
      out.write(' ');
      out.write('\n');
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("* {box-sizing:border-box}\n");
      out.write("body {font-family: Verdana,sans-serif;}\n");
      out.write(".mySlides {display:none}\n");
      out.write("\n");
      out.write("/* Slideshow container */\n");
      out.write(".slideshow-container {\n");
      out.write("  max-width: 900px;\n");
      out.write("  max-height: 100px;\n");
      out.write("  position: relative;\n");
      out.write("  margin: auto;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Caption text */\n");
      out.write(".text {\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  font-size: 15px;\n");
      out.write("  padding: 8px 12px;\n");
      out.write("  position: absolute;\n");
      out.write("  bottom: 8px;\n");
      out.write("  width: 100%;\n");
      out.write("  text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Number text (1/3 etc) */\n");
      out.write(".numbertext {\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  font-size: 12px;\n");
      out.write("  padding: 8px 12px;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* The dots/bullets/indicators */\n");
      out.write(".dot {\n");
      out.write("  height: 13px;\n");
      out.write("  width: 13px;\n");
      out.write("  margin: 0 2px;\n");
      out.write("  background-color: #bbb;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  display: inline-block;\n");
      out.write("  transition: background-color 0.6s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".active {\n");
      out.write("  background-color: #717171;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fading animation */\n");
      out.write(".fade {\n");
      out.write("  -webkit-animation-name: fade;\n");
      out.write("  -webkit-animation-duration: 1.5s;\n");
      out.write("  animation-name: fade;\n");
      out.write("  animation-duration: 1.5s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@-webkit-keyframes fade {\n");
      out.write("  from {opacity: .4} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fade {\n");
      out.write("  from {opacity: .4} \n");
      out.write("  to {opacity: 1}\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On smaller screens, decrease text size */\n");
      out.write("@media only screen and (max-width: 300px) {\n");
      out.write("  .text {font-size: 11px}\n");
      out.write("}\n");
      out.write(".content {\n");
      out.write("    max-width: 900px;\n");
      out.write("    margin: auto;\n");
      out.write("    background: white;\n");
      out.write("    padding: 6px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*accordin*/\n");
      out.write("button.accordion {\n");
      out.write("    background-color: #eee;\n");
      out.write("    color: #444;\n");
      out.write("    cursor: pointer;\n");
      out.write("    padding: 10px;\n");
      out.write("    width: 20%;\n");
      out.write("    border: none;\n");
      out.write("    text-align: left;\n");
      out.write("    outline: none;\n");
      out.write("    font-size: 15px;\n");
      out.write("    transition: 0.4s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.accordion.active, button.accordion:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("button.accordion:after {\n");
      out.write("    content: '\\002B';\n");
      out.write("    color: #777;\n");
      out.write("    font-weight: bold;\n");
      out.write("    float: right;\n");
      out.write("    margin-right: 5px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("button.accordion.active:after {\n");
      out.write("    content: \"\\2212\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("div.panel {\n");
      out.write("    padding: 0 18px;\n");
      out.write("    background-color: white;\n");
      out.write("    max-height: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    transition: max-height 0.2s ease-out;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* dropdown */\n");
      out.write(".container {\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color: #333;\n");
      out.write("    font-family: Arial;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container a {\n");
      out.write("    float: left;\n");
      out.write("    font-size: 16px;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown {\n");
      out.write("    float: left;\n");
      out.write("    overflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown .dropbtn {\n");
      out.write("    font-size: 16px;    \n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    background-color: inherit;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container a:hover, .dropdown:hover .dropbtn {\n");
      out.write("    background-color: red;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    display: none;\n");
      out.write("    position: absolute;\n");
      out.write("    background-color: #f9f9f9;\n");
      out.write("    min-width: 160px;\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("    z-index: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a {\n");
      out.write("    float: none;\n");
      out.write("    color: black;\n");
      out.write("    padding: 12px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: block;\n");
      out.write("    text-align: left;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content a:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("    display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("/* Style the tab */\n");
      out.write("div.tab {\n");
      out.write("    overflow: hidden;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    background-color: #f1f1f1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the buttons inside the tab */\n");
      out.write("div.tab button {\n");
      out.write("    background-color: inherit;\n");
      out.write("    float: left;\n");
      out.write("    border: none;\n");
      out.write("    outline: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    transition: 0.3s;\n");
      out.write("    font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Change background color of buttons on hover */\n");
      out.write("div.tab button:hover {\n");
      out.write("    background-color: #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create an active/current tablink class */\n");
      out.write("div.tab button.active {\n");
      out.write("    background-color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the tab content */\n");
      out.write(".tabcontent {\n");
      out.write("    display: none;\n");
      out.write("    padding: 6px 12px;\n");
      out.write("    -webkit-animation: fadeEffect 1s;\n");
      out.write("    animation: fadeEffect 1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Fade in tabs */\n");
      out.write("@-webkit-keyframes fadeEffect {\n");
      out.write("    from {opacity: 0;}\n");
      out.write("    to {opacity: 1;}\n");
      out.write("}\n");
      out.write("\n");
      out.write("@keyframes fadeEffect {\n");
      out.write("    from {opacity: 0;}\n");
      out.write("    to {opacity: 1;}\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topright {\n");
      out.write("    float: right;\n");
      out.write("    cursor: pointer;\n");
      out.write("    font-size: 20px;\n");
      out.write("}\n");
      out.write(".topright:hover{color:red;}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("<div class=\"container\">\n");
      out.write("  \n");
      out.write("  <a href=\"#home\">Home</a>\n");
      out.write("  <a href=\"#news\">News</a>\n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Dropdown</button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Link 1</a>\n");
      out.write("      <a href=\"#\">Link 2</a>\n");
      out.write("      <a href=\"#\">Link 3</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  <div class=\"dropdown\">\n");
      out.write("    <button class=\"dropbtn\">Dropdown</button>\n");
      out.write("    <div class=\"dropdown-content\">\n");
      out.write("      <a href=\"#\">Link 1</a>\n");
      out.write("      <a href=\"#\">Link 2</a>\n");
      out.write("      <a href=\"#\">Link 3</a>\n");
      out.write("    </div>\n");
      out.write("  </div> \n");
      out.write("  <a href=\"#news\">Link</a>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<p>Hover over the \"Dropdown\" link to see the dropdown menu.</p>\n");
      out.write("\n");
      out.write("</body>   \n");
      out.write("    \n");
      out.write("<div class=\"content\">\n");
      out.write("\n");
      out.write("<div class=\"slideshow-container\">\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">1 / 3</div>\n");
      out.write("  <img src=\"res/like_1.jpg\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption Text Abhi1</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">2 / 3</div>\n");
      out.write("  <img src=\"res/z.png\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption Two abhi2</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"mySlides fade\">\n");
      out.write("  <div class=\"numbertext\">3 / 3</div>\n");
      out.write("  <img src=\"res/z.png\" style=\"width:100%\">\n");
      out.write("  <div class=\"text\">Caption Three Abhi3</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div style=\"text-align:center\">\n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("  <span class=\"dot\"></span> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<br><br><br>\n");
      out.write("<p><center>Jaypee University Of Engineering and Technology</center></p>\n");
      out.write("\n");
      out.write("<br><br><br>\n");
      out.write("<div class=\"w3-cell-row \">\n");
      out.write("  <div class=\"w3-container w3-red w3-cell w3-cell-top \">\n");
      out.write("    <p>ANNOUNCEMENTS</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-container w3-green w3-cell w3-cell-middle \">\n");
      out.write("    <p>ACADEMICS</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-container w3-blue w3-cell w3-cell-bottom \">\n");
      out.write("    <p>ACTIVITIES</p>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h4><BR>Accordion with symbols</h4>\n");
      out.write("\n");
      out.write("<button class=\"accordion\">ABOUT</button>\n");
      out.write("<div class=\"panel\">\n");
      out.write("  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\n");
      out.write("     tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("     quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<button class=\"accordion\">MISSION</button>\n");
      out.write("<div class=\"panel\">\n");
      out.write("  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod \n");
      out.write("     tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\n");
      out.write("     quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<button class=\"accordion\">VISION</button>\n");
      out.write("<div class=\"panel\">\n");
      out.write("  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod \n");
      out.write("     tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, \n");
      out.write("     quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<h3>Fade in Tabs</h3>\n");
      out.write("\n");
      out.write("<div class=\"tab\">\n");
      out.write("  <button class=\"tablinks\" onclick=\"openCity(event, 'London')\">London</button>\n");
      out.write("  <button class=\"tablinks\" onclick=\"openCity(event, 'Paris')\">Paris</button>\n");
      out.write("  <button class=\"tablinks\" onclick=\"openCity(event, 'Tokyo')\">Tokyo</button>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"London\" class=\"tabcontent\">\n");
      out.write("<span onclick=\"this.parentElement.style.display='none'\" class=\"topright\">x</span>\n");
      out.write("  <h3>London</h3>\n");
      out.write("  <p>London is the capital city of England.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"Paris\" class=\"tabcontent\">\n");
      out.write("<span onclick=\"this.parentElement.style.display='none'\" class=\"topright\">x</span>\n");
      out.write("  <h3>Paris</h3>\n");
      out.write("  <p>Paris is the capital of France.</p> \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"Tokyo\" class=\"tabcontent\">\n");
      out.write("<span onclick=\"this.parentElement.style.display='none'\" class=\"topright\">x</span>\n");
      out.write("  <h3>Tokyo</h3>\n");
      out.write("  <p>Tokyo is the capital of Japan.</p>\n");
      out.write("  <a href=\"#\">hello</a>\n");
      out.write("</div>\n");
      out.write("<h2>its over</h2>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    //slideshow\n");
      out.write("var slideIndex = 0;\n");
      out.write("showSlides();\n");
      out.write("\n");
      out.write("function showSlides() {\n");
      out.write("    var i;\n");
      out.write("    var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("    var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("    for (i = 0; i < slides.length; i++) {\n");
      out.write("       slides[i].style.display = \"none\";  \n");
      out.write("    }\n");
      out.write("    slideIndex++;\n");
      out.write("    if (slideIndex> slides.length) {slideIndex = 1;}    \n");
      out.write("    for (i = 0; i < dots.length; i++) {\n");
      out.write("        dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("    }\n");
      out.write("    slides[slideIndex-1].style.display = \"block\";  \n");
      out.write("    dots[slideIndex-1].className += \" active\";\n");
      out.write("    setTimeout(showSlides, 2000); // Change image every 2 seconds\n");
      out.write("}\n");
      out.write("var acc = document.getElementsByClassName(\"accordion\");\n");
      out.write("var i;\n");
      out.write("\n");
      out.write("for (i = 0; i < acc.length; i++) {\n");
      out.write("  acc[i].onclick = function() {\n");
      out.write("    this.classList.toggle(\"active\");\n");
      out.write("    var panel = this.nextElementSibling;\n");
      out.write("    if (panel.style.maxHeight){\n");
      out.write("      panel.style.maxHeight = null;\n");
      out.write("    } else {\n");
      out.write("      panel.style.maxHeight = panel.scrollHeight + \"px\";\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("//tab\n");
      out.write("function openCity(evt, cityName) {\n");
      out.write("    var i, tabcontent, tablinks;\n");
      out.write("    tabcontent = document.getElementsByClassName(\"tabcontent\");\n");
      out.write("    for (i = 0; i < tabcontent.length; i++) {\n");
      out.write("        tabcontent[i].style.display = \"none\";\n");
      out.write("    }\n");
      out.write("    tablinks = document.getElementsByClassName(\"tablinks\");\n");
      out.write("    for (i = 0; i < tablinks.length; i++) {\n");
      out.write("        tablinks[i].className = tablinks[i].className.replace(\" active\", \"\");\n");
      out.write("    }\n");
      out.write("    document.getElementById(cityName).style.display = \"block\";\n");
      out.write("    evt.currentTarget.className += \" active\";\n");
      out.write("}\n");
      out.write("// Get the element with id=\"defaultOpen\" and click on it\n");
      out.write("document.getElementById(\"defaultOpen\").click();\n");
      out.write("\n");
      out.write("\n");
      out.write("//google map\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("<h6 align=\"center\" class=\"grey\">Jaypee University Of Engineering and Technology</h6>\n");
      out.write("<body bgcolor=\"red\" class=\"blue\">\n");
      out.write("    <p >hello</p>\n");
      out.write("    <h1>My First Google Map</h1>\n");
      out.write("\n");
      out.write("    <div id=\"googleMap\" style=\"width:100%;height:400px;\"></div>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("    function myMap() {\n");
      out.write("    var mapProp= {\n");
      out.write("        center:new google.maps.LatLng(51.508742,-0.120850),\n");
      out.write("        zoom:5};\n");
      out.write("    var map=new google.maps.Map(document.getElementById(\"googleMap\"),mapProp);\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("<script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBu-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap\"></script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}