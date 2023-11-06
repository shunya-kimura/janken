<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけん結果</title>
<link rel="stylesheet" href="./css/style.css">
<script src="./Javascript/script.js"></script>
</head>
<body>
	<div class="image-container">
	  <h1>勝負結果</h1>
        <p>あなたの選択：<img src="./image/${playerChoice}.jpg" alt="${playerChoice}" class="small-image"></p>
        <p>CPU1の選択：<img src="./image/${computerChoice}.jpg" alt="${computerChoice1}" class="small-image"></p>
        <p>結果： ${result}</p>
	</div>
</body>
</html>