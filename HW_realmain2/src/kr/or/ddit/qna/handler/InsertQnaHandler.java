package kr.or.ddit.qna.handler;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import kr.or.ddit.qna.service.QnaServiceImpl;
import kr.or.ddit.qna.service.IQnaService;
import kr.or.ddit.qna.vo.QnaVO;
import kr.or.ddit.comm.handler.CommandHandler;

public class InsertQnaHandler implements CommandHandler{
	private static final String VIEW_PAGE = "/WEB-INF/view/qna/qnaInsert.jsp";

	@Override
	public boolean isRedirect(HttpServletRequest req) {
		if(req.getMethod().equals("GET")) { // Get방식인 경우.
			return false;
		}else { // POST 방식인 경우... 
			return true;
		}
	}

	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		if(req.getMethod().equals("GET")) { //GET방식인 경우 isRedirect을 하지 않는다
			return VIEW_PAGE;
		}else { //POST 방식인 경우 isRedirect를 한다 
			
			// 1. 요청파라티터 정보 가져오기
			String qnaTitle = req.getParameter("qnaTitle");
			String qnaContent = req.getParameter("qnaContent");
			
			// 2. 서비스 객체 생성하기
			IQnaService qnaService = 
					QnaServiceImpl.getInstance();
			
			HttpSession session = req.getSession();
			
			String memId = (String)session.getAttribute("signedUser");

			
			// 3. 회원정보 등록하기
			QnaVO bv = new QnaVO();
			bv.setMemId(memId);
			bv.setQnaTitle(qnaTitle);
			bv.setQnaContent(qnaContent);
			
			int cnt = qnaService.insertQna(bv);
			
			String msg = "";
			
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
			
			
			// 4. 목록 조회화면으로 이동
			String redirectUrl = req.getContextPath() +
					"/HW/qna/list.do?msg=" 
					+ URLEncoder.encode(msg, "UTF-8");
			
			return redirectUrl;
		}
	}
	
	
	
	
	
	
	
}