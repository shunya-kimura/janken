<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>じゃんけん</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
  <div class="image-container">
	<form action="JankenController" method="post">
	    <h1>ジャジャン拳</h1>
	    <img src="./image/最初は.jpg" alt="チョキ" class="small-image">
		<p>最初はグー...</p>
		<input type="radio" name="playerChoice" value="rock" required>
		<img src="./image/rock.jpg" alt="グー" class="small-image">
		<input type="radio" name="playerChoice" value="paper" required>
		<img src="./image/paper.jpg" alt="パー" class="small-image">
		<input type="radio" name="playerChoice" value="scissors" required>
		<img src="./image/scissors.jpg" alt="チョキ" class="small-image">
		<br>
		<div class="submit-button-container">
        <input type="submit" value="ジャンケン...！！">
        </div>
	</form>
	
	<form action="JankenController2" method="post">
	    <h1>ジャジャン拳vsCPU×2</h1>
	    <img src="./image/最初は.jpg" alt="チョキ" class="small-image">
		<p>最初はグー...</p>
		<input type="radio" name="playerChoice" value="rock" required>
		<img src="./image/rock.jpg" alt="グー" class="small-image">
		<input type="radio" name="playerChoice" value="paper" required>
		<img src="./image/paper.jpg" alt="パー" class="small-image">
		<input type="radio" name="playerChoice" value="scissors" required>
		<img src="./image/scissors.jpg" alt="チョキ" class="small-image">
		<br>
		<div class="submit-button-container">
        <input type="submit" value="ジャンケン...！！">
        </div>
	</form>
	</div>
</body>
</html>