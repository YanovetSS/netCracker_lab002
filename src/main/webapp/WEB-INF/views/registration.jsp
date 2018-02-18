<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>User Registration Form</title>
    <link href="<c:url value='/static/css/bootstrap.css' />" rel="stylesheet"></link>
    <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
</head>

<body class="regisration_page">
<div class="generic-container registration_content">
    <%@include file="authheader.jsp" %>

    <div class="well lead">User Registration Form</div>
    <form:form method="POST" modelAttribute="user" class="form-hor izontal">
        <%--<form:input type="hidden" path="objectId" id="objectId"/>--%>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="objectId">object_id</label>
                <div class="col-md-7">
                    <form:input type="text" path="objectId" id="objectId" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="objectId" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="object">object</label>
                <div class="col-md-7">
                    <form:input type="text" path="object" id="object" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="object" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="oType">object_type_id</label>
                <div class="col-md-7">
                        <%--<form:input type="text" path="oType" id="oType" class="form-control input-sm"/>--%>
                    <select path="oType" name="oType" id="oType" class="form-control input-sm">
                        <option value="31">CLERK</option>
                        <option value="32">MANAGER</option>
                        <option value="33">SALESMAN</option>
                        <option value="34">ANALYST</option>
                        <option value="35">PRESIDENT</option>
                    </select>
                    <div class="has-error">
                        <form:errors path="oType" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="attrId">attr_id</label>
                <div class="col-md-7">
                    <form:input type="text" path="attrId" id="attrId" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="attrId" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="attrName">attr_name</label>
                <div class="col-md-7">
                    <form:input type="text" path="attrName" id="attrName" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="attrName" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="mgr">mgr</label>
                <div class="col-md-7">
                    <form:input type="text" path="mgr" id="mgr" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="mgr" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <%--<div class="row">--%>
        <%--<div class="form-group col-md-12">--%>
        <%--<label class="col-md-3 control-lable" for="hirerDate">hirerdate</label>--%>
        <%--<div class="col-md-7">--%>
        <%--<form:input type="date" path="hirerDate" id="hirerDate" class="form-control input-sm"/>--%>
        <%--<div class="has-error">--%>
        <%--<form:errors path="hirerDate" class="help-inline"/>--%>
        <%--</div>--%>
        <%--</div>--%>
        <%--</div>--%>
        <%--</div>--%>


        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="hirerDate">hirerdate</label>
                <div class="col-md-7">
                    <c:choose>
                        <c:when test="${edit}">
                            <%--<form:input type="date" path="hirerDate" id="hirerDate" class="form-control input-sm"/>--%>
                            <input type="text" value="${user.hirerDate}" disabled class="form-control input-sm"/>
                        </c:when>
                        <c:otherwise>
                            <form:input type="date" path="hirerDate" id="hirerDate" class="form-control input-sm"/>
                        </c:otherwise>
                    </c:choose>

                    <div class="has-error">
                        <form:errors path="hirerDate" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>


        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="sal">sal</label>
                <div class="col-md-7">
                    <form:input type="text" path="sal" id="sal" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="sal" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="com">com</label>
                <div class="col-md-7">
                    <form:input type="text" path="com" id="com" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="com" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="deptno">deptno</label>
                <div class="col-md-7">
                    <form:input type="text" path="deptno" id="deptno" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="deptno" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="login">login</label>
                <div class="col-md-7">
                    <form:input type="text" path="login" id="login" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="login" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="password">password</label>
                <div class="col-md-7">
                    <form:input type="password" path="password" id="password" class="form-control input-sm"/>
                    <div class="has-error">
                        <form:errors path="password" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>

        <%--<div class="row">--%>
            <%--<div class="form-group col-md-12">--%>
                <%--<label class="col-md-3 control-lable" for="role">type_id</label>--%>
                <%--<div class="col-md-7">--%>
                        <%--&lt;%&ndash;<form:input type="text" path="role" id="role" class="form-control input-sm"/>&ndash;%&gt;--%>
                    <%--<select path="role" name="role" id="role" class="form-control input-sm">--%>
                        <%--<option value="1">USER</option>--%>
                        <%--<option value="2">ADMIN</option>--%>
                        <%--<option value="3">DBA</option>--%>
                    <%--</select>--%>
                    <%--<div class="has-error">--%>
                        <%--<form:errors path="role" class="help-inline"/>--%>
                    <%--</div>--%>

                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>

        <%--<div class="row">--%>
            <%--<div class="form-group col-md-12">--%>
                <%--<label class="col-md-3 control-lable" for="role">type_id</label>--%>
                <%--<div class="col-md-7">--%>

                    <%--<select path="role" name="role" id="role" class="form-control input-sm">--%>
                        <%--<option value="1">USER</option>--%>
                        <%--<option value="2">ADMIN</option>--%>
                        <%--<option value="3">DBA</option>--%>
                    <%--</select>--%>
                    <%--<div class="has-error">--%>
                        <%--<form:errors path="role" class="help-inline"/>--%>
                    <%--</div>--%>

                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>



        <div class="row">
            <div class="form-group col-md-12">
                <label class="col-md-3 control-lable" for="role">Roles</label>
                <div class="col-md-7">
                    <form:select path="role" items="${roles}" multiple="true" itemValue="rolesId" itemLabel="role" class="form-control input-sm" />
                    <div class="has-error">
                        <form:errors path="role" class="help-inline"/>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="form-actions floatRight">
                <c:choose>
                    <c:when test="${edit}">
                        <input type="submit" value="Update" class="btn btn-primary btn-sm"/> or <a
                            href="<c:url value='/' />">Cancel</a>
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Register" class="btn btn-primary btn-sm"/> or <a
                            href="<c:url value='/' />">Cancel</a>
                    </c:otherwise>
                </c:choose>
            </div>
        </div>
    </form:form>


</div>
</body>
</html>