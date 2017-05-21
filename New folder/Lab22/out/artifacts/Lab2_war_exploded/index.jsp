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
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css"
          integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div id="allPerson">

    </div>
    <button type="button" class="btn btn-primary">Show Al results</button>
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
        <button type="submit" class="btn btn-primary">Add</button>
    </div>
    <div class="remove">
        <div class="form-group row">
            <label for="input_key_del" class="col-2 col-form-label">keys</label>

            <div class="col-10">
                <input class="form-control" type="text" id="input_key_del">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Delete By Key</button>
    </div>

</div>
<!-- jQuery first, then Tether, then Bootstrap JS. -->
<script src="https://code.jquery.com/jquery-3.1.1.slim.min.js"
        integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js"
        integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"
        integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn"
        crossorigin="anonymous"></script>
</body>
</html>
