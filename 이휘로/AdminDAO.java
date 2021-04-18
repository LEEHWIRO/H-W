

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


public interface AdminSERVICE {
	public int insertAdmin(Connection conn, AdminVO mv) throws SQLException;
	public boolean checkAdmin(Connection conn, int adminNo) throws SQLException;
	public List<AdminVO> getAllAdminList(Connection conn) throws SQLException;
	public int updateAdmin(Connection conn, AdminVO mv) throws SQLException;
	public int deleteAdmin(Connection conn, int adminNo) throws SQLException;
	public List<AdminVO> getSearchAdmin(Connection conn, AdminVO mv) throws SQLException;
}
public interface MemberSERVICE {
	public int insertMember(Connection conn, MemberVO mv) throws SQLException;
	public boolean checkMember(Connection conn, int memberNo) throws SQLException;
	public List<MemberVO> getAllMemberList(Connection conn) throws SQLException;
	public int updateMember(Connection conn, MemberVO mv) throws SQLException;
	public int deleteMember(Connection conn, int memberNo) throws SQLException;
	public List<MemberVO> getSearchMember(Connection conn, MemberVO mv) throws SQLException;
}
public interface TrainerSERVICE {
	public int insertTrainer(Connection conn, TrainerVO mv) throws SQLException;
	public boolean checkTrainer(Connection conn, int trainerNo) throws SQLException;
	public List<TrainerVO> getAllTrainerList(Connection conn) throws SQLException;
	public int updateTrainer(Connection conn, TrainerVO mv) throws SQLException;
	public int deleteTrainer(Connection conn, int trainerNo) throws SQLException;
	public List<TrainerVO> getSearchTrainer(Connection conn, TrainerVO mv) throws SQLException;
}
public interface MypageSERVICE {
	public int insertMypage(Connection conn, MypageVO mv) throws SQLException;
	public boolean checkMypage(Connection conn, int mypageNo) throws SQLException;
	public List<MypageVO> getAllMypageList(Connection conn) throws SQLException;
	public int updateMypage(Connection conn, MypageVO mv) throws SQLException;
	public int deleteMypage(Connection conn, int mypageNo) throws SQLException;
	public List<MypageVO> getSearchMypage(Connection conn, MypageVO mv) throws SQLException;
}
public interface ProdSERVICE {
	public int insertProd(Connection conn, ProdVO mv) throws SQLException;
	public boolean checkProd(Connection conn, int prodNo) throws SQLException;
	public List<ProdVO> getAllProdList(Connection conn) throws SQLException;
	public int updateProd(Connection conn, ProdVO mv) throws SQLException;
	public int deleteProd(Connection conn, int prodNo) throws SQLException;
	public List<ProdVO> getSearchProd(Connection conn, ProdVO mv) throws SQLException;
}
public interface ProdReviewSERVICE {
	public int insertProdReview(Connection conn, ProdReviewVO mv) throws SQLException;
	public boolean checkProdReview(Connection conn, int prodReviewNo) throws SQLException;
	public List<ProdReviewVO> getAllProdReviewList(Connection conn) throws SQLException;
	public int updateProdReview(Connection conn, ProdReviewVO mv) throws SQLException;
	public int deleteProdReview(Connection conn, int prodReviewNo) throws SQLException;
	public List<ProdReviewVO> getSearchProdReview(Connection conn, ProdReviewVO mv) throws SQLException;
}
public interface ProdReviewCommentSERVICE {
	public int insertProdReviewComment(Connection conn, ProdReviewCommentVO mv) throws SQLException;
	public boolean checkProdReviewComment(Connection conn, int prodReviewCommentNo) throws SQLException;
	public List<ProdReviewCommentVO> getAllProdReviewCommentList(Connection conn) throws SQLException;
	public int updateProdReviewComment(Connection conn, ProdReviewCommentVO mv) throws SQLException;
	public int deleteProdReviewComment(Connection conn, int prodReviewCommentNo) throws SQLException;
	public List<ProdReviewCommentVO> getSearchProdReviewComment(Connection conn, ProdReviewCommentVO mv) throws SQLException;
}
public interface DeliveryQnASERVICE {
	public int insertDeliveryQnA(Connection conn, DeliveryQnAVO mv) throws SQLException;
	public boolean checkDeliveryQnA(Connection conn, int deliveryQnANo) throws SQLException;
	public List<DeliveryQnAVO> getAllDeliveryQnAList(Connection conn) throws SQLException;
	public int updateDeliveryQnA(Connection conn, DeliveryQnAVO mv) throws SQLException;
	public int deleteDeliveryQnA(Connection conn, int deliveryQnANo) throws SQLException;
	public List<DeliveryQnAVO> getSearchDeliveryQnA(Connection conn, DeliveryQnAVO mv) throws SQLException;
}
public interface DeliveryQnACommentSERVICE {
	public int insertDeliveryQnAComment(Connection conn, DeliveryQnACommentVO mv) throws SQLException;
	public boolean checkDeliveryQnAComment(Connection conn, int deliveryQnACommentNo) throws SQLException;
	public List<DeliveryQnACommentVO> getAllDeliveryQnACommentList(Connection conn) throws SQLException;
	public int updateDeliveryQnAComment(Connection conn, DeliveryQnACommentVO mv) throws SQLException;
	public int deleteDeliveryQnAComment(Connection conn, int deliveryQnACommentNo) throws SQLException;
	public List<DeliveryQnACommentVO> getSearchDeliveryQnAComment(Connection conn, DeliveryQnACommentVO mv) throws SQLException;
}
public interface ProdQnASERVICE {
	public int insertProdQnA(Connection conn, ProdQnAVO mv) throws SQLException;
	public boolean checkProdQnA(Connection conn, int prodQnANo) throws SQLException;
	public List<ProdQnAVO> getAllProdQnAList(Connection conn) throws SQLException;
	public int updateProdQnA(Connection conn, ProdQnAVO mv) throws SQLException;
	public int deleteProdQnA(Connection conn, int prodQnANo) throws SQLException;
	public List<ProdQnAVO> getSearchProdQnA(Connection conn, ProdQnAVO mv) throws SQLException;
}
public interface ProdQnACommentSERVICE {
	public int insertProdQnAComment(Connection conn, ProdQnACommentVO mv) throws SQLException;
	public boolean checkProdQnAComment(Connection conn, int prodQnACommentNo) throws SQLException;
	public List<ProdQnACommentVO> getAllProdQnACommentList(Connection conn) throws SQLException;
	public int updateProdQnAComment(Connection conn, ProdQnACommentVO mv) throws SQLException;
	public int deleteProdQnAComment(Connection conn, int prodQnACommentNo) throws SQLException;
	public List<ProdQnACommentVO> getSearchProdQnAComment(Connection conn, ProdQnACommentVO mv) throws SQLException;
}
public interface NoticeSERVICE {
	public int insertNotice(Connection conn, NoticeVO mv) throws SQLException;
	public boolean checkNotice(Connection conn, int noticeNo) throws SQLException;
	public List<NoticeVO> getAllNoticeList(Connection conn) throws SQLException;
	public int updateNotice(Connection conn, NoticeVO mv) throws SQLException;
	public int deleteNotice(Connection conn, int noticeNo) throws SQLException;
	public List<NoticeVO> getSearchNotice(Connection conn, NoticeVO mv) throws SQLException;
}
public interface NoticeCommentSERVICE {
	public int insertNoticeComment(Connection conn, NoticeCommentVO mv) throws SQLException;
	public boolean checkNoticeComment(Connection conn, int noticeCommentNo) throws SQLException;
	public List<NoticeCommentVO> getAllNoticeCommentList(Connection conn) throws SQLException;
	public int updateNoticeComment(Connection conn, NoticeCommentVO mv) throws SQLException;
	public int deleteNoticeComment(Connection conn, int noticeCommentNo) throws SQLException;
	public List<NoticeCommentVO> getSearchNoticeComment(Connection conn, NoticeCommentVO mv) throws SQLException;
}
public interface QnASERVICE {
	public int insertQnA(Connection conn, QnAVO mv) throws SQLException;
	public boolean checkQnA(Connection conn, int qnANo) throws SQLException;
	public List<QnAVO> getAllQnAList(Connection conn) throws SQLException;
	public int updateQnA(Connection conn, QnAVO mv) throws SQLException;
	public int deleteQnA(Connection conn, int qnANo) throws SQLException;
	public List<QnAVO> getSearchQnA(Connection conn, QnAVO mv) throws SQLException;
}
public interface QnACommentSERVICE {
	public int insertQnAComment(Connection conn, QnACommentVO mv) throws SQLException;
	public boolean checkQnAComment(Connection conn, int qnACommentNo) throws SQLException;
	public List<QnACommentVO> getAllQnACommentList(Connection conn) throws SQLException;
	public int updateQnAComment(Connection conn, QnACommentVO mv) throws SQLException;
	public int deleteQnAComment(Connection conn, int qnACommentNo) throws SQLException;
	public List<QnACommentVO> getSearchQnAComment(Connection conn, QnACommentVO mv) throws SQLException;
}
public interface ProdAdminSERVICE {
	public int insertProdAdmin(Connection conn, ProdAdminVO mv) throws SQLException;
	public boolean checkProdAdmin(Connection conn, int prodAdminNo) throws SQLException;
	public List<ProdAdminVO> getAllProdAdminList(Connection conn) throws SQLException;
	public int updateProdAdmin(Connection conn, ProdAdminVO mv) throws SQLException;
	public int deleteProdAdmin(Connection conn, int prodAdminNo) throws SQLException;
	public List<ProdAdminVO> getSearchProdAdmin(Connection conn, ProdAdminVO mv) throws SQLException;
}
public interface CartSERVICE {
	public int insertCart(Connection conn, CartVO mv) throws SQLException;
	public boolean checkCart(Connection conn, int cartNo) throws SQLException;
	public List<CartVO> getAllCartList(Connection conn) throws SQLException;
	public int updateCart(Connection conn, CartVO mv) throws SQLException;
	public int deleteCart(Connection conn, int cartNo) throws SQLException;
	public List<CartVO> getSearchCart(Connection conn, CartVO mv) throws SQLException;
}
public interface ProdOrderSERVICE {
	public int insertProdOrder(Connection conn, ProdOrderVO mv) throws SQLException;
	public boolean checkProdOrder(Connection conn, int prodOrderNo) throws SQLException;
	public List<ProdOrderVO> getAllProdOrderList(Connection conn) throws SQLException;
	public int updateProdOrder(Connection conn, ProdOrderVO mv) throws SQLException;
	public int deleteProdOrder(Connection conn, int prodOrderNo) throws SQLException;
	public List<ProdOrderVO> getSearchProdOrder(Connection conn, ProdOrderVO mv) throws SQLException;
}
public interface CardSERVICE {
	public int insertCard(Connection conn, CardVO mv) throws SQLException;
	public boolean checkCard(Connection conn, int cardNo) throws SQLException;
	public List<CardVO> getAllCardList(Connection conn) throws SQLException;
	public int updateCard(Connection conn, CardVO mv) throws SQLException;
	public int deleteCard(Connection conn, int cardNo) throws SQLException;
	public List<CardVO> getSearchCard(Connection conn, CardVO mv) throws SQLException;
}
public interface MemberAdminSERVICE {
	public int insertMemberAdmin(Connection conn, MemberAdminVO mv) throws SQLException;
	public boolean checkMemberAdmin(Connection conn, int memberAdminNo) throws SQLException;
	public List<MemberAdminVO> getAllMemberAdminList(Connection conn) throws SQLException;
	public int updateMemberAdmin(Connection conn, MemberAdminVO mv) throws SQLException;
	public int deleteMemberAdmin(Connection conn, int memberAdminNo) throws SQLException;
	public List<MemberAdminVO> getSearchMemberAdmin(Connection conn, MemberAdminVO mv) throws SQLException;
}
public interface TrainerAdminSERVICE {
	public int insertTrainerAdmin(Connection conn, TrainerAdminVO mv) throws SQLException;
	public boolean checkTrainerAdmin(Connection conn, int trainerAdminNo) throws SQLException;
	public List<TrainerAdminVO> getAllTrainerAdminList(Connection conn) throws SQLException;
	public int updateTrainerAdmin(Connection conn, TrainerAdminVO mv) throws SQLException;
	public int deleteTrainerAdmin(Connection conn, int trainerAdminNo) throws SQLException;
	public List<TrainerAdminVO> getSearchTrainerAdmin(Connection conn, TrainerAdminVO mv) throws SQLException;
}
public interface EventSERVICE {
	public int insertEvent(Connection conn, EventVO mv) throws SQLException;
	public boolean checkEvent(Connection conn, int eventNo) throws SQLException;
	public List<EventVO> getAllEventList(Connection conn) throws SQLException;
	public int updateEvent(Connection conn, EventVO mv) throws SQLException;
	public int deleteEvent(Connection conn, int eventNo) throws SQLException;
	public List<EventVO> getSearchEvent(Connection conn, EventVO mv) throws SQLException;
}
public interface ConsultSERVICE {
	public int insertConsult(Connection conn, ConsultVO mv) throws SQLException;
	public boolean checkConsult(Connection conn, int consultNo) throws SQLException;
	public List<ConsultVO> getAllConsultList(Connection conn) throws SQLException;
	public int updateConsult(Connection conn, ConsultVO mv) throws SQLException;
	public int deleteConsult(Connection conn, int consultNo) throws SQLException;
	public List<ConsultVO> getSearchConsult(Connection conn, ConsultVO mv) throws SQLException;
}
public interface VideoSERVICE {
	public int insertVideo(Connection conn, VideoVO mv) throws SQLException;
	public boolean checkVideo(Connection conn, int videoNo) throws SQLException;
	public List<VideoVO> getAllVideoList(Connection conn) throws SQLException;
	public int updateVideo(Connection conn, VideoVO mv) throws SQLException;
	public int deleteVideo(Connection conn, int videoNo) throws SQLException;
	public List<VideoVO> getSearchVideo(Connection conn, VideoVO mv) throws SQLException;
}
public interface MissionSERVICE {
	public int insertMission(Connection conn, MissionVO mv) throws SQLException;
	public boolean checkMission(Connection conn, int missionNo) throws SQLException;
	public List<MissionVO> getAllMissionList(Connection conn) throws SQLException;
	public int updateMission(Connection conn, MissionVO mv) throws SQLException;
	public int deleteMission(Connection conn, int missionNo) throws SQLException;
	public List<MissionVO> getSearchMission(Connection conn, MissionVO mv) throws SQLException;
}
public interface ExerBoardSERVICE {
	public int insertExerBoard(Connection conn, ExerBoardVO mv) throws SQLException;
	public boolean checkExerBoard(Connection conn, int exerBoardNo) throws SQLException;
	public List<ExerBoardVO> getAllExerBoardList(Connection conn) throws SQLException;
	public int updateExerBoard(Connection conn, ExerBoardVO mv) throws SQLException;
	public int deleteExerBoard(Connection conn, int exerBoardNo) throws SQLException;
	public List<ExerBoardVO> getSearchExerBoard(Connection conn, ExerBoardVO mv) throws SQLException;
}
public interface ExerBoardCommentSERVICE {
	public int insertExerBoardComment(Connection conn, ExerBoardCommentVO mv) throws SQLException;
	public boolean checkExerBoardComment(Connection conn, int exerBoardCommentNo) throws SQLException;
	public List<ExerBoardCommentVO> getAllExerBoardCommentList(Connection conn) throws SQLException;
	public int updateExerBoardComment(Connection conn, ExerBoardCommentVO mv) throws SQLException;
	public int deleteExerBoardComment(Connection conn, int exerBoardCommentNo) throws SQLException;
	public List<ExerBoardCommentVO> getSearchExerBoardComment(Connection conn, ExerBoardCommentVO mv) throws SQLException;
}



