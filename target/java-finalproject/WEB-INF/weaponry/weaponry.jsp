<%@ page import="com.morgan.weaponry.Weapon" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.morgan.login.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  if (session == null || session.getAttribute("user") == null) {
    response.sendRedirect("/java_finalproject_war_exploded/login");
  }

  List<Weapon> weaponry = (List<Weapon>)request.getAttribute("weaponry");
  if (weaponry == null) {
    weaponry = new ArrayList<>();
  }
%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Item Manager</title>


  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
  <script>
    document.getElementById('button')
  </script>
</head>
<body style="background-color: darkgray; font-family: 'Trebuchet MS'" >
<header class="container my-4">
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Inventory Manager</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="${pageContext.request.contextPath}/">Home</a>
          </li>
          <li class="nav-item">
              <a class="nav-link" href="${pageContext.request.contextPath}/logout">Log out</a>
          </li>
        </ul>
        <div class="dropdown ms-3">
          <button class="btn btn-secondary dropdown-toggle" type="button" id="filterDropdown" data-bs-toggle="dropdown" aria-expanded="false">
            Filter
          </button>
          <ul class="dropdown-menu" aria-labelledby="filterDropdown">
            <li><a class="dropdown-item" href="weaponry?show=all">All</a></li>
            <li><a class="dropdown-item" href="weaponry?show=Exotic">Exotic rarity</a></li>
            <li><a class="dropdown-item" href="weaponry?show=Legendary">Legendary rarity</a></li>
            <li><a class="dropdown-item" href="weaponry?show=Uncommon"></a>Uncommon rarity</li>
            <li><a class="dropdown-item" href="weaponry?show=Common"></a>Common rarity</li>
          </ul>
        </div>
        <div class="dropdown ms-3">
          <button class="btn btn-secondary dropdown-toggle" type="button" id="sortDropdown"
                  data-bs-toggle="dropdown" aria-expanded="false">
            Sort
          </button>
          <ul class="dropdown-menu" aria-labelledby="sortDropdown">
            <li><a class="dropdown-item" href="weaponry?sort=alphaAsc">Alphabetical A-Z</a></li>
            <li><a class="dropdown-item" href="weaponry?sort=alphaDesc">Alphabetical Z-A</a></li>
            <li><a class="dropdown-item" href="weaponry?sort=powerAsc">Ascending Power</a></li>
            <li><a class="dropdown-item" href="weaponry?sort=powerDesc">Descending Power</a></li>
          </ul>
        </div>
      </div>
    </div>
  </nav>
</header>
<main>
  <form action="${pageContext.request.contextPath}/weaponry" method="post">
    <div class="container my-4">
      <div class="row">
            <% for(Weapon weapon: weaponry) {%>
        <div class="col-sm-12 col-md-6 col-lg-4 col-xl-3">
          <% if (weapon.getTier().equals("Exotic")) {%>
            <div class="card m-3" style="width: 18rem; background-color: yellow;">
          <% } else if (weapon.getTier().equals("Legendary")) {%>
          <div class="card m-3" style="width: 18rem; background-color: #d15fe3">
          <% } else if (weapon.getTier().equals("Uncommon")) {%>
          <div class="card m-3" style="width: 18rem; background-color: cornflowerblue">
          <% } else {%>
            <div class="card m-3" style="width: 18rem; background-color: mediumseagreen">
          <% } %>

            <div class="card-body">
              <h3 class="card-title"><%= weapon.getName()%></h3>
              <p class="card-text"><%= weapon.getTier()%> <%= weapon.getType()%></p>
              <p class="card-text"><%= weapon.getPower()%> power</p>

              <% if (session != null && session.getAttribute("user") != null) {%>
                <button type="submit" name="toggleFavorite" value="<%= weapon.getId() %>">
                  <% if (((User)session.getAttribute("user")).getFavorites(weapon)) {%>
                    Remove as favorite
                  <% } else { %>
                    Add favorite
                  <% } %>
                </button>
              <% } %>
            </div>
          </div>
        </div>
        <% } %>
      </div>
    </div>
  </form>

</main>


<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="weapon_name"></h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <p>Kill tracker: <span id="kill_tracker"></span></p>

        <div id="map"></div>
        <br>
        <a
                href="https://www.google.com/maps/@-15.79,-47.88,4z"
                target="_blank">
          See full page map
        </a>
      </div>
    </div>
  </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
        crossorigin="anonymous"></script>
<%--<script
        src="https://code.jquery.com/jquery-3.6.4.slim.js"
        integrity="sha256-dWvV84T6BhzO4vG6gWhsWVKVoa4lVmLnpBOZh/CAHU4="
        crossorigin="anonymous"></script>
<script src="scripts/weapons.js"></script>--%>
</body>
</html>
