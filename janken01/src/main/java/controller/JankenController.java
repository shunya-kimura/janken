package controller;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/JankenController")
public class JankenController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// GETメソッドの処理
		// JSPを表示する
		String view = "/WEB-INF/views/janken.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//ユーザーの選択を取得
		String playerChoice = request.getParameter("playerChoice");

		//CPUのランダムな選択を生成
		String[] choices = { "rock", "paper", "scissors" };
		Random rand = new Random();
		int computerIndex = rand.nextInt(3);
		String computerChoice = choices[computerIndex];

		//勝敗を判定
		String result = "";
		if (playerChoice.equals(computerChoice)) {
			result = "引き分け";
		} else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
				|| (playerChoice.equals("paper") && computerChoice.equals("rock"))
				|| (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
			result = "勝ち";
		} else {
			result = "負け";
		}

		//結果をリクエスト属性として設定
		request.setAttribute("playerChoice", playerChoice);
		request.setAttribute("computerChoice", computerChoice);
		request.setAttribute("result", result);

		//結果をjspに転送
		String view = "/WEB-INF/views/jankenResult.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}
}