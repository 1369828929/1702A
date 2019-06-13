<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="/css/css.css">
<script type="text/javascript" src="/js/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
		function sc(id){
			$.post("delete",{id:id},function(flag){
				if(flag){
					alert("删除成功");
					location="list"
				}else{
					alert("删除失败");
				}
			})
		}
		function qx(){
			$("[name='check']").prop('checked',true);
		}
		function qbx(){
			$("[name='check']").prop('checked',false);
		}
		function fx(){
			$("[name='check']").each(function(){
				$(this).prop('checked',!$(this).prop("checked"));
			});
		}
		function cx(){
			location="cx.jsp"
		}
	</script>
<body>
	<input type="button" value="查询" onclick="cx()">
	<table>
		<tr>
			<td><input type="button" value="全选" onclick="qx()">
			<input type="button" value="全不选" onclick="qbx()">
			<input type="button" value="反选" onclick="fx()">
			</td>
			<td>影片名</td>
			<td>导演</td>
			<td>票价</td>
			<td>上映时间</td>
			<td>时长</td>
			<td>类型</td>
			<td>年代</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="l">
			<tr>
				<td><input type="checkbox" name="check" value="${l.id }"></td>
				<td>${l.mname }</td>
				<td>${l.dname }</td>
				<td>${l.price }</td>
				<td>${l.stime }</td>
				<td>${l.mtype }</td>
				<td>${l.shour }</td>
				<td>${l.dname }</td>
				<td>${l.addr }</td>
				<td>
					<c:if test="${l.zt==0 }">
						已下架
					</c:if>
					<c:if test="${l.zt==1 }">
						热映中
					</c:if>
				</td>
				<td>
					<c:if test="${l.zt==0 }">
						<input type="button" value="上架">
					</c:if>
					<c:if test="${l.zt==1 }">
						<input type="button" value="下架">
					</c:if>
					<input type="button" value="删除" onclick="sc(${l.id})">
				</td>
			</tr>
		</c:forEach>
		<%-- <tr>
			<td colspan="22">${page.page }</td>
		</tr> --%>
	</table>
</body>
</html>