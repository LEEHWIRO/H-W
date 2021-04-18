package uu;

	public class InsertQnA {
	
		private static final String VIEW_PAGE ;
		String qnaTitle;
		String qnaContent;
		String qnaDate;
		String qnaWriter;
		String qnaReple;
		String qnaCount;
		int cnt;
		String msg;
		List<> qnaList;
		
		public boolean isRedirect() {
			return false;
		
		}
	
	
		public String process() {
			return null;
		}
		
	}
	
	public class SelectQnA {
		
		private static final String VIEW_PAGE ;
	
		public boolean isRedirect() {
			return false;
		
		}
	
	
		public String process() {
			return null;
		}
		
	}
	
public class UpdateQnA{
		
		private static final String VIEW_PAGE ;
	
		String qnaTitle;
		String qnaContent;
		String qnaDate;
		String qnaWriter;
		String qnaReple;
		String qnaCount;
		int cnt;
		String msg;
		List<> qnaList;
		
		public boolean isRedirect() {
			return false;
		
		}
	
	
		public String process() {
			return null;
		}
		
	}

public class DeleteQnA {
	
	private static final String VIEW_PAGE ;
	int cnt;
	String msg;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}



///////////////////////////////////////////////////////////

public class InsertQnAComment
 {
	
	private static final String VIEW_PAGE ;
	String qnaCommentTitle;
	String qnaCommentContent;
	String qnaCommentDate;
	String qnaCommentWriter;
	String qnaCommentReple;
	String qnaCommentCount;
	int cnt;
	String msg;
	List<> qnaCommentList;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class SelectQnAComment
 {
	
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class UpdateQnAComment
{
	String qnaCommentTitle;
	String qnaCommentContent;
	String qnaCommentDate;
	String qnaCommentWriter;
	String qnaCommentReple;
	String qnaCommentCount;
	int cnt;
	String msg;
	List<> qnaCommentList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class DeleteQnAComment
 {

private static final String VIEW_PAGE ;
int cnt;
String msg;
public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}

//////////////////////////////////////////////////////////////////////////


public class InsertProdAdmin

{
	
	private static final String VIEW_PAGE ;
	String prodTitle;
	String prodContent;
	String prodDate;
	String prodWriter;
	String prodReple;
	String prodCount;
	int cnt;
	String msg;
	List<> prodList;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class SelectProdAdmin

{
	
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class UpdateProdAdmin

{
	String prodTitle;
	String prodContent;
	String prodDate;
	String prodWriter;
	String prodReple;
	String prodCount;
	int cnt;
	String msg;
	List<> prodList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class DeleteProdAdmin

{

private static final String VIEW_PAGE ;
int cnt;
String msg;
public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}
///////////////////////////////////////////////////////////////////////
public class InsertCart


{
	
	private static final String VIEW_PAGE ;
	String prodName;
	String prodChoice;
	String prodRemain;
	String prodSell;
	String prodPrice;
	String prodMemberPrice;
	String prodImgPath;
	String prodDetailInfo;
	int cnt;
	String msg;
	List<> prodList;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class DeleteCart


{
	
	private static final String VIEW_PAGE ;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}


/////////////////////////////////////////////////////////////////////////////

public class SelectProdOrder{
	
	private static final String VIEW_PAGE ;
	String cartNum;
	String memID;
	String cartQty;
	String cartOrder;
	public boolean isRedirect() {return false;}

	public String process() {return null;}
	
}

public class CheckProdOrder{
	
	private static final String VIEW_PAGE ;
	String prodNum;
	String memId;
	String payNum;
	String buyQty;
	String buycost;
	String buyDate;
	public boolean isRedirect() {return false;}

	public String process() {return null;}
	
}

//////////////////////////////////////////////////
public class WichProd
{
	
	private static final String VIEW_PAGE ;
	String memID;
	String wishList;
	public boolean isRedirect() {return false;}

	public String process() {return null;}
	
}

//////////////////////////////////////////////////////
public class CardAdmin

{
	
	private static final String VIEW_PAGE ;
	String payBuyer;
	public boolean isRedirect() {return false;}

	public String process() {return null;}
	
}

/////////////////////////////////////////////////////

public class CheckOrderCalender
{
	
	private static final String VIEW_PAGE ;
	String prodNum;
	String memId;
	String payNum;
	String buyQty;
	String buycost;
	String buyDate;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class CheckOrderList
{
	
	private static final String VIEW_PAGE ;
	String prodNum;
	String memId;
	String payNum;
	String buyQty;
	String buycost;
	String buyDate;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class DeleteOrder
{
	
	private static final String VIEW_PAGE ;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

////////////////////////////////////////////////////

public class InsertMemberAdmin
{
	
	private static final String VIEW_PAGE ;
	String memId;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	int cnt;
	String msg;
	List<> memList;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}


public class UpdateMemberAdmin{
	String memId;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	int cnt;
	String msg;
	List<> memList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class DeleteMemberAdmin{

private static final String VIEW_PAGE ;
int cnt;
String msg;
public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}


/////////////////////////////////////////////////////

public class SelectBlackList{
	
	private static final String VIEW_PAGE ;
	String blacklistID;
	String blacklistName;
	String blacklistIn;
	String blacklistDate;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	int cnt;
	String msg;
	List<> blackList;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}


public class UpdateBlackList{
	String memId;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	int cnt;
	String msg;
	List<> memtList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class InsertBlackList{

private static final String VIEW_PAGE ;
String memId;
String memPass;
String memName;
String memIn;
String memGender;
String memEmail;
String memHp;
int cnt;
String msg;
public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}

///////////////////////////////////////////////////////////////


public class EventProd{
	String prodTitle;
	String prodContent;
	String prodDate;
	String prodWriter;
	String prodReple;
	String prodCount;
	int cnt;
	String msg;
	List<> prodList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class PayTrainer{

private static final String VIEW_PAGE ;
String memId;
String memPass;
String memName;
String memIn;
String memGender;
String memEmail;
String memHp;
String fees;
String gradeCode;
int cnt;
String msg;
public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}

///////////////////////////////////////////////////////////////


public class InsertTrainerAdmin

{
	
	private static final String VIEW_PAGE ;
	String memId;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	String fees;
	String gradeCode;
	int cnt;
	String msg;
	List<> memList;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class DeleteTrainerAdmin

{
	
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class SelectTrainerAdmin

{
	String memId;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	String fees;
	String gradeCode;
	int cnt;
	String msg;
	List<> memList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class AssigTrainerAdmin

{

private static final String VIEW_PAGE ;
String memId;
String memName;
String gradeCode;
int cnt;
String msg;
List<> memList;
public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}

//////////////////////////////////////////////////////////////

public class ExerAdmin{
	String exeNum;
	String exeName;
	String ptNum;
	String gradeCode;
	int cnt;
	String msg;
	List<> exeList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class FoodAdmin
{
	String foodNum;
	String foodName;
	String foodKcal;
	String foodFat;
	String foodProtein;
	String foodRice;
	String foodSweet;
	String gradeCode;
	int cnt;
	String msg;
	List<> foodList;
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}


///////////////////////////////////////////////////////////////////////////

public class CheckClender

{
	
	private static final String VIEW_PAGE ;
	String calenId;
	String calenDate;
	String calenTitle;
	String claenContent;
	String ptNum;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}
////////////////////////////////////////////////////////
public class ChatTrainer


{
	
	private static final String VIEW_PAGE ;
	String memId;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	String fees;
	String gradeCode;
	int cnt;
	String msg;
	List<> memList;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class RecomProdTreainer
{
	
	private static final String VIEW_PAGE ;
	String memId;
	String memPass;
	String memName;
	String memIn;
	String memGender;
	String memEmail;
	String memHp;
	String fees;
	String gradeCode;
	String prodName;
	String prodChoice;
	String prodRemain;
	String prodSell;
	String prodPrice;
	String prodMemberPrice;
	String prodImgPath;
	String prodDetailInfo;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

///////////////////////////////////////////////////////////////////////////
public class PTVideo
{
	
	private static final String VIEW_PAGE ;
	String memId;
	String payNum;
	String payDate;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}
////////////////////////////////////////////////////////////////////////////
public class CheckMission


{
	
	private static final String VIEW_PAGE ;
	String memId;
	String payNum;
	String payDate;
	String membership;
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class JoinMission


{
	
	private static final String VIEW_PAGE ;
	String memId;
	String payNum;
	String payDate;
	String membership;
	
	int cnt;
	String msg;
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}



///////////////////////////////////////////////////////////

public class InsertExerBoard

{

private static final String VIEW_PAGE ;
String boardTitle;
String boardContent;
String boardDate;
String boardWriter;
String boardReple;
String boardCount;
int cnt;
String msg;
List<> boardList;
public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}

public class SelectExerBoard

{

private static final String VIEW_PAGE ;

public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}

public class UpdateExerBoard

{
String boardTitle;
String boardContent;
String boardDate;
String boardWriter;
String boardReple;
String boardCount;
int cnt;
String msg;
List<> boardList;
private static final String VIEW_PAGE ;

public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}

public class DeleteExerBoard

{

private static final String VIEW_PAGE ;
int cnt;
String msg;
public boolean isRedirect() {
return false;

}


public String process() {
return null;
}

}

//////////////////////////////////////////////////////////////////
public class InsertExerBoardComment
 {
	
	private static final String VIEW_PAGE ;
	String boardCommentTitle;
	String boardCommentContent;
	String boardCommentDate;
	String boardCommentWriter;
	String boardCommentReple;
	String boardCommentCount;
	int cnt;
	String msg;
	List<> boardCommentList;
	
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class SelectExerBoardComment
 {
	
	private static final String VIEW_PAGE ;

	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class UpdateExerBoardComment
{
	
	private static final String VIEW_PAGE ;

	String boardCommentTitle;
	String boardCommentContent;
	String boardCommentDate;
	String boardCommentWriter;
	String boardCommentReple;
	String boardCommentCount;
	int cnt;
	String msg;
	List<> boardCommentList;
	
	public boolean isRedirect() {
		return false;
	
	}


	public String process() {
		return null;
	}
	
}

public class DeleteExerBoardComment
 {

private static final String VIEW_PAGE ;
int cnt;
String msg;

public boolean isRedirect() {
	return false;

}


public String process() {
	return null;
}

}


















