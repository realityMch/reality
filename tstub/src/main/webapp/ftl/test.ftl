<html>
<head>
<meta charset="UTF-8">
<title>freemarker测试</title>
<script type="text/javascript" src="${request.contextPath}/js/d3.js"></script>
<link rel="stylesheet" type="text/css" href="${request.contextPath}/css/mincss/buttons.css">

<style type="text/css">
	.menu ul {
		list-style: none;
	}
	.menu ul li {
		float: left;
		margin-right: 35px;
		width: 81px;
		height: 72px;
		position: relative;
		color: yellow;
		border: solid;
		border-color: silver;
		background-color: blue;
		text-align: center;
		font-style: normal;
	}
</style>
</head>
<body>
	<h1>${message},${name}</h1>
	<button class="btn">你好</button>
	<div class="menu"><ul></ul></div>
	<script type="text/javascript">
		var data = ["开发", "测试", "运维"];
		d3.select(".menu").select("ul").selectAll("li").data(data).enter().append("li").text(function(d) {
			return d;
		});
	</script>
</body>
</html>