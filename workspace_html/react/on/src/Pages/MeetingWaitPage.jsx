import React, { useState } from 'react';
import { useLocation, useNavigate } from 'react-router-dom';
import '../Styles/MeetingWaitPage.css';
import Header from '../components/Header';

function MeetingWaitPage() {
  const [chatVisible, setChatVisible] = useState(false);
  const { state } = useLocation();
  const navigate = useNavigate();

  // 역할 구분 ('requester': 요청자, 'helper': 봉사자)
  const role = state?.role || 'helper'; // 기본은 봉사자

  // 요청 데이터
  const {
    id = '',          // 요청 id (필수)
    request = '',
    problem = '',
    time = '',
    place = ''
  } = state || {};

  const handleChatToggle = () => setChatVisible(prev => !prev);

  // 요청자가 취소: 요청 데이터 삭제 + 홈 이동
  const handleCancelRequest = () => {
    if (id) {
      const requests = JSON.parse(localStorage.getItem("helpRequests") || "[]");
      const updated = requests.filter(r => r.id !== id);
      localStorage.setItem("helpRequests", JSON.stringify(updated));
    }
    alert("요청이 취소되었습니다.");
    navigate("/"); // 홈으로 이동
  };

  // 봉사자가 나가기: 요청 데이터 그대로 + 홈 이동
  const handleLeave = () => {
    alert("연결에서 나갔습니다.");
    navigate("/"); // 홈 등 원하는 경로
  };

  return (
    <>
      <Header />
      <div className="MHHb">
        <main className="MHHM">
          <a href="">
            <div className="MHHleft" title="협력업체 광고">
              협력업체 광고
            </div>
          </a>
          <div className="MHHcenter">
            <h1>한끼온+</h1>
            <h2>연결 되었습니다.</h2>
            <span className="MHHOncenter">ON</span>
            <div className="MHHloader"></div>
            <div className="MHHAftMatch-contentsWrap">
              <p className="MHHAftMatch-contents">
                약속시간 : <span>{time}</span>
              </p>
              <p className="MHHAftMatch-contents">
                약속장소 : <span>{place}</span>
              </p>
              <p className="MHHAftMatch-contents">
                요청사항 : <span>{request}</span>
              </p>
              <p className="MHHAftMatch-contents">
                불편사항 : <span>{problem}</span>
              </p>
            </div>
            <div className="MHHbuttons">
              <button type="button" onClick={handleChatToggle}>1:1 대화하기</button>
              <button type="button" onClick={() => navigate("/meeting")}>만났어요!</button>
              {/* 역할에 따라 다른 버튼 노출 */}
              {role === 'requester' ? (
                <button type="button" onClick={handleCancelRequest}>요청 취소</button>
              ) : (
                <button type="button" onClick={handleLeave}>연결 나가기</button>
              )}
            </div>
          </div>
          {chatVisible && (
            <div className="MHHright" id="MHHchatWindow">
              <div style={{
                color: "#999",
                fontSize: "15px",
                margin: "10px 0 18px 0",
                textAlign: "center"
              }}>
                <b>실시간 1:1 채팅 기능은<br />DB 연동 시 구현 가능합니다.</b>
              </div>
              <div style={{
                color: "#ccc",
                fontSize: "13px",
                textAlign: "center",
                marginTop: "30px"
              }}>
                (예시: Firebase, Supabase, Socket.io 등 실시간 데이터베이스 사용)
              </div>
            </div>
          )}
        </main>
      </div>
    </>
  );
}

export default MeetingWaitPage;
