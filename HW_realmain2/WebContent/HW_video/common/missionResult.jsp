<%@page import="kr.or.ddit.mission.vo.missionVO"%>
<%@page import="kr.or.ddit.member.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

[
<%
//�������� ��ȸ����� "list"��� key�� request�� �������
List<missionVO> missionList = (List<missionVO>)request.getAttribute("missionList");
for(int i=0 ; i<missionList.size() ; i++) {
	missionVO vo = missionList.get(i);
	String exerMission1 = vo.getExerMission1();
	String exerMission2 = vo.getExerMission2();
	String exerMission3 = vo.getExerMission3();
	
	//json Ÿ������ ������ �ϴ� �κ� ==> {name : "~", id : "~"}
	
	//��ȣ, id, �̸�, �������, ��ȭ��ȣ, ����
	//��ȣ, id, �̸�, ��й�ȣ, �������, ��ȭ��ȣ, ����, ����
	if(i > 0) {
		%>,<%
	}
	
	%>
	{
		"exerMission1" : "<%=exerMission1 %>"
		, "exerMission2" : "<%=exerMission2 %>"
		, "exerMission3" : "<%=exerMission3 %>"
	}
	<%
}
%>

]

