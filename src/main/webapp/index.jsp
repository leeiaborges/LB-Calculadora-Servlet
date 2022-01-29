<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <div class="container">
        <form method="post" action="PrimeiroServlet">
            <h1 class="d-flex justify-content-center">Calculadora</h1>

            <br>

            <div class="input-form d-flex justify-content-center">
                <label for="val1" style="margin-right: 10px">Valor 1</label>
                <input type="text" name="val1">
            </div>

            <br>

            <div class="input-form d-flex justify-content-center">
                <label for="val2" style="margin-right: 10px">Valor 2</label>
                <input type="text" name="val2">
            </div>

            <br>
            <div class="input-form d-flex justify-content-center space-between">
                <select name="opcao">
                    <option selected>OPERAÇÃO</option>
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
            </div>

            <br>
            <div class="input-form d-flex justify-content-center space-between">
                <button type="reset" class="btn btn-outline-dark" style="margin-right: 10px">LIMPAR</button>
                <button type="submit" class="btn btn-outline-dark">CALCULAR</button>
            </div>

            <br>

            <h6 class="d-flex justify-content-center">Resultado: ${requestScope.res}</h6>
        </form>
    </div>

</body>
</html>