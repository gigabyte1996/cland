<%@page import="java.sql.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="model.bean.News"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.bean.Category"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/templates/public/inc/header.jsp" %>
  <section id="mainContent">
    <div class="content_bottom">
      <div class="col-lg-8 col-md-8">
        <div class="content_bottom_left">
          <div class="single_category wow fadeInDown">
            <div class="archive_style_1">
              <div style="margin-top:15px;">
                <ol class="breadcrumb">
                  <li><a href="#">Home</a></li>
                  <%
                	Category category =(Category) request.getAttribute("category");
                  if(category != null){
                  %>

                  <li><a href="#"><%=category.getName() %></a></li>
                  
                  <li class="active">Duis quis erat non nunc fringilla </li>
                </ol>
              </div>
              <h2> <span class="bold_line"><span></span></span> <span class="solid_line"></span> <span class="title_text">Latest Updates</span> </h2>
              <%}
                  	ArrayList<News> news = (ArrayList<News>) request.getAttribute("news");
                  	if(news != null && news.size()>0){
                  		int i= 0;
                  		for(News item : news){
                  			i++;
                  			
                  			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy | hh:mm:ss");
                  			String strDate = sdf.format(item.getDate_create());

                  %>
              <div class="business_category_left wow fadeInDown">
                <ul class="fashion_catgnav">
                  <li>
                    <div class="catgimg2_container"> <a href="single.jsp"><img alt="" src="../images/390x240x1.jpg"></a> </div>
                    <h2 class="catg_titile"><a href="single.jsp"><%=item.getTitle() %></a></h2>
                    <div class="comments_box"> <span class="meta_date"><%=strDate%></span> <span class="meta_comment"><a href="#">No Comments</a></span> <span class="meta_more"><a  href="#">Read More...</a></span> </div>
                    <p><%if(item.getContain().length() > 50) out.print(item.getContain().substring(0, 50)); else out.print(item.getContain()+" ...");  %></p>
                  </li>
                </ul>
              </div>
              <%
                  		}
                  	}
              %>
            </div>
          </div>
        </div>
        <div class="pagination_area">
          <nav>
            <ul class="pagination">
              <li><a href="#"><span aria-hidden="true">&laquo;</span><span class="sr-only">Previous</span></a></li>
              <li><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">5</a></li>
              <li><a href="#"><span aria-hidden="true">&raquo;</span><span class="sr-only">Next</span></a></li>
            </ul>
          </nav>
        </div>
      </div>
<%@include file="/templates/public/inc/right-bar.jsp" %>
    </div>
  </section>
</div>
<%@include file="/templates/public/inc/footer.jsp" %>