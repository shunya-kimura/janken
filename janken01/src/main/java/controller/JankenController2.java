package controller;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/JankenController2")
public class JankenController2 extends HttpServlet {
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
		int computerIndex1 = rand.nextInt(3);
		int computerIndex2 = rand.nextInt(3);
		String computerChoice1 = choices[computerIndex1];
		String computerChoice2 = choices[computerIndex2];

		//勝敗を判定
		String result = "";
		if ((playerChoice.equals(computerChoice1) && playerChoice.equals(computerChoice2)) 
				|| (playerChoice.equals("paper") && computerChoice1.equals("rock") && computerChoice2.equals("scissors"))
				|| (playerChoice.equals("paper") && computerChoice1.equals("scissors") && computerChoice2.equals("rock"))
				|| (playerChoice.equals("rock") && computerChoice1.equals("scissors") && computerChoice2.equals("paper"))
				|| (playerChoice.equals("rock") && computerChoice1.equals("paper") && computerChoice2.equals("scissors"))
				|| (playerChoice.equals("scissors") && computerChoice1.equals("paper") && computerChoice2.equals("rock"))
				|| (playerChoice.equals("scissors") && computerChoice1.equals("rock") && computerChoice2.equals("paper"))
			    ) {
		    result = "引き分け";
		} else if ((playerChoice.equals("rock") && computerChoice1.equals("scissors") && computerChoice2.equals("scissors"))
				|| (playerChoice.equals("rock") && computerChoice1.equals("scissors") && computerChoice2.equals("rock"))
				|| (playerChoice.equals("rock") && computerChoice1.equals("rock") && computerChoice2.equals("scissors"))
				|| (playerChoice.equals("paper") && computerChoice1.equals("rock") && computerChoice2.equals("rock"))
				|| (playerChoice.equals("paper") && computerChoice1.equals("paper") && computerChoice2.equals("rock"))
				|| (playerChoice.equals("paper") && computerChoice1.equals("rock") && computerChoice2.equals("paper"))
				|| (playerChoice.equals("scissors") && computerChoice1.equals("paper")&& computerChoice2.equals("paper"))
				|| (playerChoice.equals("scissors") && computerChoice1.equals("scissors")&& computerChoice2.equals("paper"))
				|| (playerChoice.equals("scissors") && computerChoice1.equals("paper")&& computerChoice2.equals("scissors"))
				) {
			result = "勝ち";
		} else {
			result = "負け";
		}

		//結果をリクエスト属性として設定
		request.setAttribute("playerChoice", playerChoice);
        request.setAttribute("computerChoice1", computerChoice1);
        request.setAttribute("computerChoice2", computerChoice2);
        request.setAttribute("result", result);

		//結果をjspに転送
		String view = "/WEB-INF/views/jankenResult2.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}
}