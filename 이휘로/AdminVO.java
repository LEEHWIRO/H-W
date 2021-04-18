
class AdminVO {
	String adminId;
	String adminPass;
	String adminName;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	
	
}

class MemberVO {
	String memId;
	String memPass;
	String memName;
	int memIn;
	String memGender;
	String memEmail;
	int memHp;
	int memAddr;
	int memZip;
	int memHeight;
	int memWeight;
	int memBMI;
	String memeCo;
	String memSick;
	int memOrder;
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPass() {
		return memPass;
	}
	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemIn() {
		return memIn;
	}
	public void setMemIn(int memIn) {
		this.memIn = memIn;
	}
	public String getMemGender() {
		return memGender;
	}
	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public int getMemHp() {
		return memHp;
	}
	public void setMemHp(int memHp) {
		this.memHp = memHp;
	}
	public int getMemAddr() {
		return memAddr;
	}
	public void setMemAddr(int memAddr) {
		this.memAddr = memAddr;
	}
	public int getMemZip() {
		return memZip;
	}
	public void setMemZip(int memZip) {
		this.memZip = memZip;
	}
	public int getMemHeight() {
		return memHeight;
	}
	public void setMemHeight(int memHeight) {
		this.memHeight = memHeight;
	}
	public int getMemWeight() {
		return memWeight;
	}
	public void setMemWeight(int memWeight) {
		this.memWeight = memWeight;
	}
	public int getMemBMI() {
		return memBMI;
	}
	public void setMemBMI(int memBMI) {
		this.memBMI = memBMI;
	}
	public String getMemeCo() {
		return memeCo;
	}
	public void setMemeCo(String memeCo) {
		this.memeCo = memeCo;
	}
	public String getMemSick() {
		return memSick;
	}
	public void setMemSick(String memSick) {
		this.memSick = memSick;
	}
	public int getMemOrder() {
		return memOrder;
	}
	public void setMemOrder(int memOrder) {
		this.memOrder = memOrder;
	}
	
	
	
}

class TrainerVO{
	String trainerId;
	String trainerPass;
	String trainerName;
	int trainerIn;
	String trainerGender;
	String trainerEmail;
	int trainerHp;
	int trainerAddr;
	int trainerZip;
	int trainerHeight;
	int trainerWeight;
	int trainerBMI;
	String trainereCo;
	String trainerSick;
	int trainerOrder;
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerPass() {
		return trainerPass;
	}
	public void setTrainerPass(String trainerPass) {
		this.trainerPass = trainerPass;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public int getTrainerIn() {
		return trainerIn;
	}
	public void setTrainerIn(int trainerIn) {
		this.trainerIn = trainerIn;
	}
	public String getTrainerGender() {
		return trainerGender;
	}
	public void setTrainerGender(String trainerGender) {
		this.trainerGender = trainerGender;
	}
	public String getTrainerEmail() {
		return trainerEmail;
	}
	public void setTrainerEmail(String trainerEmail) {
		this.trainerEmail = trainerEmail;
	}
	public int getTrainerHp() {
		return trainerHp;
	}
	public void setTrainerHp(int trainerHp) {
		this.trainerHp = trainerHp;
	}
	public int getTrainerAddr() {
		return trainerAddr;
	}
	public void setTrainerAddr(int trainerAddr) {
		this.trainerAddr = trainerAddr;
	}
	public int getTrainerZip() {
		return trainerZip;
	}
	public void setTrainerZip(int trainerZip) {
		this.trainerZip = trainerZip;
	}
	public int getTrainerHeight() {
		return trainerHeight;
	}
	public void setTrainerHeight(int trainerHeight) {
		this.trainerHeight = trainerHeight;
	}
	public int getTrainerWeight() {
		return trainerWeight;
	}
	public void setTrainerWeight(int trainerWeight) {
		this.trainerWeight = trainerWeight;
	}
	public int getTrainerBMI() {
		return trainerBMI;
	}
	public void setTrainerBMI(int trainerBMI) {
		this.trainerBMI = trainerBMI;
	}
	public String getTrainereCo() {
		return trainereCo;
	}
	public void setTrainereCo(String trainereCo) {
		this.trainereCo = trainereCo;
	}
	public String getTrainerSick() {
		return trainerSick;
	}
	public void setTrainerSick(String trainerSick) {
		this.trainerSick = trainerSick;
	}
	public int getTrainerOrder() {
		return trainerOrder;
	}
	public void setTrainerOrder(int trainerOrder) {
		this.trainerOrder = trainerOrder;
	}
	
	
}
class MypageVO {
	String memName;
	int calenDate;
	String calenTitle;
	String calenContent;
	String orderList;
	String membership;
	String cartList;
	String wishList;
	String trainerList;
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getCalenDate() {
		return calenDate;
	}
	public void setCalenDate(int calenDate) {
		this.calenDate = calenDate;
	}
	public String getCalenTitle() {
		return calenTitle;
	}
	public void setCalenTitle(String calenTitle) {
		this.calenTitle = calenTitle;
	}
	public String getCalenContent() {
		return calenContent;
	}
	public void setCalenContent(String calenContent) {
		this.calenContent = calenContent;
	}
	public String getOrderList() {
		return orderList;
	}
	public void setOrderList(String orderList) {
		this.orderList = orderList;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public String getCartList() {
		return cartList;
	}
	public void setCartList(String cartList) {
		this.cartList = cartList;
	}
	public String getWishList() {
		return wishList;
	}
	public void setWishList(String wishList) {
		this.wishList = wishList;
	}
	public String getTrainerList() {
		return trainerList;
	}
	public void setTrainerList(String trainerList) {
		this.trainerList = trainerList;
	}
	
	
}

class ProdVO {
	String prodNum;
	String prodName;
	int prodPrice;
	int prodMemberPrice;
	String prodDetailInfo;
	String prodQty;
	public String getProdNum() {
		return prodNum;
	}
	public void setProdNum(String prodNum) {
		this.prodNum = prodNum;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(int prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdMemberPrice() {
		return prodMemberPrice;
	}
	public void setProdMemberPrice(int prodMemberPrice) {
		this.prodMemberPrice = prodMemberPrice;
	}
	public String getProdDetailInfo() {
		return prodDetailInfo;
	}
	public void setProdDetailInfo(String prodDetailInfo) {
		this.prodDetailInfo = prodDetailInfo;
	}
	public String getProdQty() {
		return prodQty;
	}
	public void setProdQty(String prodQty) {
		this.prodQty = prodQty;
	}
	
	
}
class ProdReviewVO {
	String prodReviewTitle;
	int prodReviewNum;
	String prodReviewWriter;
	String prodReviewContent;
	public String getProdReviewTitle() {
		return prodReviewTitle;
	}
	public void setProdReviewTitle(String prodReviewTitle) {
		this.prodReviewTitle = prodReviewTitle;
	}
	public int getProdReviewNum() {
		return prodReviewNum;
	}
	public void setProdReviewNum(int prodReviewNum) {
		this.prodReviewNum = prodReviewNum;
	}
	public String getProdReviewWriter() {
		return prodReviewWriter;
	}
	public void setProdReviewWriter(String prodReviewWriter) {
		this.prodReviewWriter = prodReviewWriter;
	}
	public String getProdReviewContent() {
		return prodReviewContent;
	}
	public void setProdReviewContent(String prodReviewContent) {
		this.prodReviewContent = prodReviewContent;
	}
	
	
}
class ProdReviewCommentVO {
	String prodReviewCommentTitle;
	int prodReviewCommentNum;
	String prodReviewCommentWriter;
	String prodReviewCommentContent;
	public String getProdReviewCommentTitle() {
		return prodReviewCommentTitle;
	}
	public void setProdReviewCommentTitle(String prodReviewCommentTitle) {
		this.prodReviewCommentTitle = prodReviewCommentTitle;
	}
	public int getProdReviewCommentNum() {
		return prodReviewCommentNum;
	}
	public void setProdReviewCommentNum(int prodReviewCommentNum) {
		this.prodReviewCommentNum = prodReviewCommentNum;
	}
	public String getProdReviewCommentWriter() {
		return prodReviewCommentWriter;
	}
	public void setProdReviewCommentWriter(String prodReviewCommentWriter) {
		this.prodReviewCommentWriter = prodReviewCommentWriter;
	}
	public String getProdReviewCommentContent() {
		return prodReviewCommentContent;
	}
	public void setProdReviewCommentContent(String prodReviewCommentContent) {
		this.prodReviewCommentContent = prodReviewCommentContent;
	}
	
	
}
class DeliveryQnAVO {
	String DeliveryQnATitle;
	int DeliveryQnANum;
	String DeliveryQnAWriter;
	String DeliveryQnAContent;
	public String getDeliveryQnATitle() {
		return DeliveryQnATitle;
	}
	public void setDeliveryQnATitle(String deliveryQnATitle) {
		DeliveryQnATitle = deliveryQnATitle;
	}
	public int getDeliveryQnANum() {
		return DeliveryQnANum;
	}
	public void setDeliveryQnANum(int deliveryQnANum) {
		DeliveryQnANum = deliveryQnANum;
	}
	public String getDeliveryQnAWriter() {
		return DeliveryQnAWriter;
	}
	public void setDeliveryQnAWriter(String deliveryQnAWriter) {
		DeliveryQnAWriter = deliveryQnAWriter;
	}
	public String getDeliveryQnAContent() {
		return DeliveryQnAContent;
	}
	public void setDeliveryQnAContent(String deliveryQnAContent) {
		DeliveryQnAContent = deliveryQnAContent;
	}
	
}

class DeliveryQnACommentVO{
	String DeliveryQnACommentTitle;
	int DeliveryQnACommentNum;
	String DeliveryQnACommentWriter;
	String DeliveryQnACommentContent;
	public String getDeliveryQnACommentTitle() {
		return DeliveryQnACommentTitle;
	}
	public void setDeliveryQnACommentTitle(String deliveryQnACommentTitle) {
		DeliveryQnACommentTitle = deliveryQnACommentTitle;
	}
	public int getDeliveryQnACommentNum() {
		return DeliveryQnACommentNum;
	}
	public void setDeliveryQnACommentNum(int deliveryQnACommentNum) {
		DeliveryQnACommentNum = deliveryQnACommentNum;
	}
	public String getDeliveryQnACommentWriter() {
		return DeliveryQnACommentWriter;
	}
	public void setDeliveryQnACommentWriter(String deliveryQnACommentWriter) {
		DeliveryQnACommentWriter = deliveryQnACommentWriter;
	}
	public String getDeliveryQnACommentContent() {
		return DeliveryQnACommentContent;
	}
	public void setDeliveryQnACommentContent(String deliveryQnACommentContent) {
		DeliveryQnACommentContent = deliveryQnACommentContent;
	}
	
}

class ProdQnAVO {
	String prodQnATitle;
	int prodQnANum;
	String prodQnAWriter;
	String prodQnAContent;
	public String getProdQnATitle() {
		return prodQnATitle;
	}
	public void setProdQnATitle(String prodQnATitle) {
		this.prodQnATitle = prodQnATitle;
	}
	public int getProdQnANum() {
		return prodQnANum;
	}
	public void setProdQnANum(int prodQnANum) {
		this.prodQnANum = prodQnANum;
	}
	public String getProdQnAWriter() {
		return prodQnAWriter;
	}
	public void setProdQnAWriter(String prodQnAWriter) {
		this.prodQnAWriter = prodQnAWriter;
	}
	public String getProdQnAContent() {
		return prodQnAContent;
	}
	public void setProdQnAContent(String prodQnAContent) {
		this.prodQnAContent = prodQnAContent;
	}
	
}

class ProdQnACommentVO {
	String prodQnACommentTitle;
	int prodQnACommentNum;
	String prodQnACommentWriter;
	String prodQnACommentContent;
	public String getProdQnACommentTitle() {
		return prodQnACommentTitle;
	}
	public void setProdQnACommentTitle(String prodQnACommentTitle) {
		this.prodQnACommentTitle = prodQnACommentTitle;
	}
	public int getProdQnACommentNum() {
		return prodQnACommentNum;
	}
	public void setProdQnACommentNum(int prodQnACommentNum) {
		this.prodQnACommentNum = prodQnACommentNum;
	}
	public String getProdQnACommentWriter() {
		return prodQnACommentWriter;
	}
	public void setProdQnACommentWriter(String prodQnACommentWriter) {
		this.prodQnACommentWriter = prodQnACommentWriter;
	}
	public String getProdQnACommentContent() {
		return prodQnACommentContent;
	}
	public void setProdQnACommentContent(String prodQnACommentContent) {
		this.prodQnACommentContent = prodQnACommentContent;
	}
	
}
class NoticeVO {
	String noticeTitle;
	int noticeNum;
	String noticeWriter;
	String noticeContent;
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public int getNoticeNum() {
		return noticeNum;
	}
	public void setNoticeNum(int noticeNum) {
		this.noticeNum = noticeNum;
	}
	public String getNoticeWriter() {
		return noticeWriter;
	}
	public void setNoticeWriter(String noticeWriter) {
		this.noticeWriter = noticeWriter;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	
	
}

class NoticeCommentVO {
	String noticeCommentTitle;
	int noticeCommentNum;
	String noticeCommentWriter;
	String noticeCommentContent;
	public String getNoticeCommentTitle() {
		return noticeCommentTitle;
	}
	public void setNoticeCommentTitle(String noticeCommentTitle) {
		this.noticeCommentTitle = noticeCommentTitle;
	}
	public int getNoticeCommentNum() {
		return noticeCommentNum;
	}
	public void setNoticeCommentNum(int noticeCommentNum) {
		this.noticeCommentNum = noticeCommentNum;
	}
	public String getNoticeCommentWriter() {
		return noticeCommentWriter;
	}
	public void setNoticeCommentWriter(String noticeCommentWriter) {
		this.noticeCommentWriter = noticeCommentWriter;
	}
	public String getNoticeCommentContent() {
		return noticeCommentContent;
	}
	public void setNoticeCommentContent(String noticeCommentContent) {
		this.noticeCommentContent = noticeCommentContent;
	}
	
}
class QnAVO {
	String QnATitle;
	int QnANum;
	String QnAWriter;
	String QnAContent;
	public String getQnATitle() {
		return QnATitle;
	}
	public void setQnATitle(String qnATitle) {
		QnATitle = qnATitle;
	}
	public int getQnANum() {
		return QnANum;
	}
	public void setQnANum(int qnANum) {
		QnANum = qnANum;
	}
	public String getQnAWriter() {
		return QnAWriter;
	}
	public void setQnAWriter(String qnAWriter) {
		QnAWriter = qnAWriter;
	}
	public String getQnAContent() {
		return QnAContent;
	}
	public void setQnAContent(String qnAContent) {
		QnAContent = qnAContent;
	}
	
}
class QnACommentVO {
	String QnACommentTitle;
	int QnACommentNum;
	String QnACommentWriter;
	String QnACommentContent;
	public String getQnACommentTitle() {
		return QnACommentTitle;
	}
	public void setQnACommentTitle(String qnACommentTitle) {
		QnACommentTitle = qnACommentTitle;
	}
	public int getQnACommentNum() {
		return QnACommentNum;
	}
	public void setQnACommentNum(int qnACommentNum) {
		QnACommentNum = qnACommentNum;
	}
	public String getQnACommentWriter() {
		return QnACommentWriter;
	}
	public void setQnACommentWriter(String qnACommentWriter) {
		QnACommentWriter = qnACommentWriter;
	}
	public String getQnACommentContent() {
		return QnACommentContent;
	}
	public void setQnACommentContent(String qnACommentContent) {
		QnACommentContent = qnACommentContent;
	}
	
}
class ProdAdminVO {
	String prodAdminNum;
	String prodAdminName;
	int prodAdminPrice;
	int prodAdminMemberPrice;
	String prodAdminDetailInfo;
	String prodAdminQty;
	public String getProdAdminNum() {
		return prodAdminNum;
	}
	public void setProdAdminNum(String prodAdminNum) {
		this.prodAdminNum = prodAdminNum;
	}
	public String getProdAdminName() {
		return prodAdminName;
	}
	public void setProdAdminName(String prodAdminName) {
		this.prodAdminName = prodAdminName;
	}
	public int getProdAdminPrice() {
		return prodAdminPrice;
	}
	public void setProdAdminPrice(int prodAdminPrice) {
		this.prodAdminPrice = prodAdminPrice;
	}
	public int getProdAdminMemberPrice() {
		return prodAdminMemberPrice;
	}
	public void setProdAdminMemberPrice(int prodAdminMemberPrice) {
		this.prodAdminMemberPrice = prodAdminMemberPrice;
	}
	public String getProdAdminDetailInfo() {
		return prodAdminDetailInfo;
	}
	public void setProdAdminDetailInfo(String prodAdminDetailInfo) {
		this.prodAdminDetailInfo = prodAdminDetailInfo;
	}
	public String getProdAdminQty() {
		return prodAdminQty;
	}
	public void setProdAdminQty(String prodAdminQty) {
		this.prodAdminQty = prodAdminQty;
	}
	
}

class CartVO {
	String cartNum;
	int cartQty;
	int cartOrder;
	public String getCartNum() {
		return cartNum;
	}
	public void setCartNum(String cartNum) {
		this.cartNum = cartNum;
	}
	public int getCartQty() {
		return cartQty;
	}
	public void setCartQty(int cartQty) {
		this.cartQty = cartQty;
	}
	public int getCartOrder() {
		return cartOrder;
	}
	public void setCartOrder(int cartOrder) {
		this.cartOrder = cartOrder;
	}
	
}
class ProdOrderVO {
	String prodOrderNum;
	String cartNum;
	int payNum;
	int buyQty;
	int buyCost;
	int buyDate;
	public String getProdOrderNum() {
		return prodOrderNum;
	}
	public void setProdOrderNum(String prodOrderNum) {
		this.prodOrderNum = prodOrderNum;
	}
	public String getCartNum() {
		return cartNum;
	}
	public void setCartNum(String cartNum) {
		this.cartNum = cartNum;
	}
	public int getPayNum() {
		return payNum;
	}
	public void setPayNum(int payNum) {
		this.payNum = payNum;
	}
	public int getBuyQty() {
		return buyQty;
	}
	public void setBuyQty(int buyQty) {
		this.buyQty = buyQty;
	}
	public int getBuyCost() {
		return buyCost;
	}
	public void setBuyCost(int buyCost) {
		this.buyCost = buyCost;
	}
	public int getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(int buyDate) {
		this.buyDate = buyDate;
	}
	
}
class CardVO {
	String cardBuyerName;
	String cardBuyerNum;
	public String getCardBuyerName() {
		return cardBuyerName;
	}
	public void setCardBuyerName(String cardBuyerName) {
		this.cardBuyerName = cardBuyerName;
	}
	public String getCardBuyerNum() {
		return cardBuyerNum;
	}
	public void setCardBuyerNum(String cardBuyerNum) {
		this.cardBuyerNum = cardBuyerNum;
	}
	
	
}
class MemberAdminVO {
	String memAdminId;
	String memAdminPass;
	String memAdminName;
	int memAdminIn;
	String memAdminGender;
	String memAdminEmail;
	int memAdminHp;
	int memAdminAddr;
	int memAdminZip;
	int memAdminHeight;
	int memAdminWeight;
	int memAdminBMI;
	String memAdmineCo;
	String memAdminSick;
	int memAdminOrder;
	public String getMemAdminId() {
		return memAdminId;
	}
	public void setMemAdminId(String memAdminId) {
		this.memAdminId = memAdminId;
	}
	public String getMemAdminPass() {
		return memAdminPass;
	}
	public void setMemAdminPass(String memAdminPass) {
		this.memAdminPass = memAdminPass;
	}
	public String getMemAdminName() {
		return memAdminName;
	}
	public void setMemAdminName(String memAdminName) {
		this.memAdminName = memAdminName;
	}
	public int getMemAdminIn() {
		return memAdminIn;
	}
	public void setMemAdminIn(int memAdminIn) {
		this.memAdminIn = memAdminIn;
	}
	public String getMemAdminGender() {
		return memAdminGender;
	}
	public void setMemAdminGender(String memAdminGender) {
		this.memAdminGender = memAdminGender;
	}
	public String getMemAdminEmail() {
		return memAdminEmail;
	}
	public void setMemAdminEmail(String memAdminEmail) {
		this.memAdminEmail = memAdminEmail;
	}
	public int getMemAdminHp() {
		return memAdminHp;
	}
	public void setMemAdminHp(int memAdminHp) {
		this.memAdminHp = memAdminHp;
	}
	public int getMemAdminAddr() {
		return memAdminAddr;
	}
	public void setMemAdminAddr(int memAdminAddr) {
		this.memAdminAddr = memAdminAddr;
	}
	public int getMemAdminZip() {
		return memAdminZip;
	}
	public void setMemAdminZip(int memAdminZip) {
		this.memAdminZip = memAdminZip;
	}
	public int getMemAdminHeight() {
		return memAdminHeight;
	}
	public void setMemAdminHeight(int memAdminHeight) {
		this.memAdminHeight = memAdminHeight;
	}
	public int getMemAdminWeight() {
		return memAdminWeight;
	}
	public void setMemAdminWeight(int memAdminWeight) {
		this.memAdminWeight = memAdminWeight;
	}
	public int getMemAdminBMI() {
		return memAdminBMI;
	}
	public void setMemAdminBMI(int memAdminBMI) {
		this.memAdminBMI = memAdminBMI;
	}
	public String getMemAdmineCo() {
		return memAdmineCo;
	}
	public void setMemAdmineCo(String memAdmineCo) {
		this.memAdmineCo = memAdmineCo;
	}
	public String getMemAdminSick() {
		return memAdminSick;
	}
	public void setMemAdminSick(String memAdminSick) {
		this.memAdminSick = memAdminSick;
	}
	public int getMemAdminOrder() {
		return memAdminOrder;
	}
	public void setMemAdminOrder(int memAdminOrder) {
		this.memAdminOrder = memAdminOrder;
	}
	
}
class TrainerAdminVO {
	String trainerAdminId;
	String trainerAdminPass;
	String trainerAdminName;
	int trainerAdminIn;
	String trainerAdminGender;
	String trainerAdminEmail;
	int trainerAdminHp;
	int trainerAdminAddr;
	int trainerAdminZip;
	int trainerAdminHeight;
	int trainerAdminWeight;
	int trainerAdminBMI;
	String trainerAdmineCo;
	String trainerAdminSick;
	int trainerAdminOrder;
	public String getTrainerAdminId() {
		return trainerAdminId;
	}
	public void setTrainerAdminId(String trainerAdminId) {
		this.trainerAdminId = trainerAdminId;
	}
	public String getTrainerAdminPass() {
		return trainerAdminPass;
	}
	public void setTrainerAdminPass(String trainerAdminPass) {
		this.trainerAdminPass = trainerAdminPass;
	}
	public String getTrainerAdminName() {
		return trainerAdminName;
	}
	public void setTrainerAdminName(String trainerAdminName) {
		this.trainerAdminName = trainerAdminName;
	}
	public int getTrainerAdminIn() {
		return trainerAdminIn;
	}
	public void setTrainerAdminIn(int trainerAdminIn) {
		this.trainerAdminIn = trainerAdminIn;
	}
	public String getTrainerAdminGender() {
		return trainerAdminGender;
	}
	public void setTrainerAdminGender(String trainerAdminGender) {
		this.trainerAdminGender = trainerAdminGender;
	}
	public String getTrainerAdminEmail() {
		return trainerAdminEmail;
	}
	public void setTrainerAdminEmail(String trainerAdminEmail) {
		this.trainerAdminEmail = trainerAdminEmail;
	}
	public int getTrainerAdminHp() {
		return trainerAdminHp;
	}
	public void setTrainerAdminHp(int trainerAdminHp) {
		this.trainerAdminHp = trainerAdminHp;
	}
	public int getTrainerAdminAddr() {
		return trainerAdminAddr;
	}
	public void setTrainerAdminAddr(int trainerAdminAddr) {
		this.trainerAdminAddr = trainerAdminAddr;
	}
	public int getTrainerAdminZip() {
		return trainerAdminZip;
	}
	public void setTrainerAdminZip(int trainerAdminZip) {
		this.trainerAdminZip = trainerAdminZip;
	}
	public int getTrainerAdminHeight() {
		return trainerAdminHeight;
	}
	public void setTrainerAdminHeight(int trainerAdminHeight) {
		this.trainerAdminHeight = trainerAdminHeight;
	}
	public int getTrainerAdminWeight() {
		return trainerAdminWeight;
	}
	public void setTrainerAdminWeight(int trainerAdminWeight) {
		this.trainerAdminWeight = trainerAdminWeight;
	}
	public int getTrainerAdminBMI() {
		return trainerAdminBMI;
	}
	public void setTrainerAdminBMI(int trainerAdminBMI) {
		this.trainerAdminBMI = trainerAdminBMI;
	}
	public String getTrainerAdmineCo() {
		return trainerAdmineCo;
	}
	public void setTrainerAdmineCo(String trainerAdmineCo) {
		this.trainerAdmineCo = trainerAdmineCo;
	}
	public String getTrainerAdminSick() {
		return trainerAdminSick;
	}
	public void setTrainerAdminSick(String trainerAdminSick) {
		this.trainerAdminSick = trainerAdminSick;
	}
	public int getTrainerAdminOrder() {
		return trainerAdminOrder;
	}
	public void setTrainerAdminOrder(int trainerAdminOrder) {
		this.trainerAdminOrder = trainerAdminOrder;
	}
	
}
class EventVO {
	String eventTitle;
	int eventNum;
	String eventWriter;
	String eventContent;
	public String getEventTitle() {
		return eventTitle;
	}
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}
	public int getEventNum() {
		return eventNum;
	}
	public void setEventNum(int eventNum) {
		this.eventNum = eventNum;
	}
	public String getEventWriter() {
		return eventWriter;
	}
	public void setEventWriter(String eventWriter) {
		this.eventWriter = eventWriter;
	}
	public String getEventContent() {
		return eventContent;
	}
	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}
	
	
}
class ConsultVO {
	String exeNum;
	String exeName;
	int foodNum;
	String foodContent;
	String foodName;
	public String getExeNum() {
		return exeNum;
	}
	public void setExeNum(String exeNum) {
		this.exeNum = exeNum;
	}
	public String getExeName() {
		return exeName;
	}
	public void setExeName(String exeName) {
		this.exeName = exeName;
	}
	public int getFoodNum() {
		return foodNum;
	}
	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}
	public String getFoodContent() {
		return foodContent;
	}
	public void setFoodContent(String foodContent) {
		this.foodContent = foodContent;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
		
}
class VideoVO {
	String videoNUm;
	String videoContent;
	String videoName;
	public String getVideoNUm() {
		return videoNUm;
	}
	public void setVideoNUm(String videoNUm) {
		this.videoNUm = videoNUm;
	}
	public String getVideoContent() {
		return videoContent;
	}
	public void setVideoContent(String videoContent) {
		this.videoContent = videoContent;
	}
	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	
}
class MissionVO {
	String missionNum;
	String missionContent;
	String missionName;
	public String getMissionNum() {
		return missionNum;
	}
	public void setMissionNum(String missionNum) {
		this.missionNum = missionNum;
	}
	public String getMissionContent() {
		return missionContent;
	}
	public void setMissionContent(String missionContent) {
		this.missionContent = missionContent;
	}
	public String getMissionName() {
		return missionName;
	}
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	
	
}
class ExerBoardVO {
	String exerBoardTitle;
	int exerBoardNum;
	String exerBoardWriter;
	String exerBoardContent;
	public String getExerBoardTitle() {
		return exerBoardTitle;
	}
	public void setExerBoardTitle(String exerBoardTitle) {
		this.exerBoardTitle = exerBoardTitle;
	}
	public int getExerBoardNum() {
		return exerBoardNum;
	}
	public void setExerBoardNum(int exerBoardNum) {
		this.exerBoardNum = exerBoardNum;
	}
	public String getExerBoardWriter() {
		return exerBoardWriter;
	}
	public void setExerBoardWriter(String exerBoardWriter) {
		this.exerBoardWriter = exerBoardWriter;
	}
	public String getExerBoardContent() {
		return exerBoardContent;
	}
	public void setExerBoardContent(String exerBoardContent) {
		this.exerBoardContent = exerBoardContent;
	}
	
}
class ExerBoardCommentVO {
	String exerBoardCommentTitle;
	int exerBoardCommentNum;
	String exerBoardCommentWriter;
	String exerBoardCommentContent;
	public String getExerBoardCommentTitle() {
		return exerBoardCommentTitle;
	}
	public void setExerBoardCommentTitle(String exerBoardCommentTitle) {
		this.exerBoardCommentTitle = exerBoardCommentTitle;
	}
	public int getExerBoardCommentNum() {
		return exerBoardCommentNum;
	}
	public void setExerBoardCommentNum(int exerBoardCommentNum) {
		this.exerBoardCommentNum = exerBoardCommentNum;
	}
	public String getExerBoardCommentWriter() {
		return exerBoardCommentWriter;
	}
	public void setExerBoardCommentWriter(String exerBoardCommentWriter) {
		this.exerBoardCommentWriter = exerBoardCommentWriter;
	}
	public String getExerBoardCommentContent() {
		return exerBoardCommentContent;
	}
	public void setExerBoardCommentContent(String exerBoardCommentContent) {
		this.exerBoardCommentContent = exerBoardCommentContent;
	}
	
}