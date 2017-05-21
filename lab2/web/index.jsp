<%--
  Created by IntelliJ IDEA.
  User: yafen
  Date: 3/3/2017
  Time: 8:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <title>Lab2 by Dewei Xiang</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
  <div id="allPerson">

  </div>

  <button type="button" class="btn btn-primary" id="btnShowAll">Show Al results</button>

  <div class="add">
    <div class="form-group row">
      <label for="input_key" class="col-2 col-form-label">Key</label>
      <div class="col-10">
        <input class="form-control" type="number" id="input_key">
      </div>
    </div>
    <div class="form-group row">
      <label for="input_firstName" class="col-2 col-form-label">First Name</label>
      <div class="col-10">
        <input class="form-control" type="text" id="input_firstName">
      </div>
    </div>
    <div class="form-group row">
      <label for="input_lastName" class="col-2 col-form-label">Last Name</label>
      <div class="col-10">
        <input class="form-control" type="text" id="input_lastName">
      </div>
    </div>
    <button type="submit" class="btn btn-primary" id="addPerson">Add</button>
  </div>
  <div class="remove">
    <div class="form-group row">
      <label for="input_key_del" class="col-2 col-form-label">keys</label>

      <div class="col-10">
        <input class="form-control" type="text" id="input_key_del">
      </div>
    </div>
    <button type="submit" class="btn btn-primary" id="btnDelete">Delete By Key</button>
  </div>
  <p id="requestResult" class="bg-info"></p>
</div>
<!-- jQuery first, then Tether, then Bootstrap JS. -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
        integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script src="js/index.js"></script>
</body>
</html>
