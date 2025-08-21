import React, { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom"; // 추가
import '../Styles/Meeting.css'; // CSS 파일명 맞추기
import Header from "../components/Header";

function Meeting() {
  const [totalSeconds, setTotalSeconds] = useState(59 * 60); // 59분 0초
  const [dotsIndex, setDotsIndex] = useState(0);
  const dotsArr = ["", ".", "..", "..."];
  const navigate = useNavigate(); // 추가

  // 타이머 증가
  useEffect(() => {
    const timer = setInterval(() => {
      setTotalSeconds(sec => sec + 1);
    }, 1000);
    return () => clearInterval(timer);
  }, []);

  // 점 애니메이션
  useEffect(() => {
    const dotTimer = setInterval(() => {
      setDotsIndex(idx => (idx + 1) % dotsArr.length);
    }, 500);
    return () => clearInterval(dotTimer);
  }, []);

  // 시간 포맷
  function formatTime(sec) {
    const h = Math.floor(sec / 3600);
    const m = Math.floor((sec % 3600) / 60);
    const s = sec % 60;
    const mm = String(m).padStart(2, "0");
    const ss = String(s).padStart(2, "0");
    return h > 0 ? `${h}시간 ${mm}분 ${ss}초` : `${mm}분 ${ss}초`;
  }

  // 버튼 핸들러 (페이지 이동)
  const handleComplete = () => {
    // 요청 완료 후 MeetingDone(또는 /meeting-done) 페이지로 이동
    navigate("/meeting-done");
  };
  const handleCancel = () => alert('요청 취소 로직 구현');
  const handleReport = () => alert('신고하기 로직 구현');

  return (
    <>
      <Header />
      <main className="INGM">
        {/* 좌측 광고 */}
        <a href="#">
          <div className="INGleft" title="협력업체 광고">
            협력업체 광고
          </div>
        </a>

        {/* 중앙 타이머 */}
        <div className="INGcenter">
          <h1>한끼온+</h1>
          <div className="INGstatus">
            <span id="INGstatic">요청 진행중</span>
            <span id="INGdots">{dotsArr[dotsIndex]}</span>
          </div>

          <div className="INGicon-box">
            <img
              src="https://media.discordapp.net/attachments/1397101424705405031/1400634538920771605/image.png?ex=688d5a10&is=688c0890&hm=691fda443f9c2a600779af81e2a91bb374c07e964f9957e7e88e3b0f8c5ffb39&=&format=webp&quality=lossless&width=929&height=808"
              alt="봉사자 아이콘"
            />
          </div>

          <p className="INGvolunteer">
            봉사자: <span className="INGname">김동현</span>
          </p>
          <h2>현재 경과 시간</h2>
          <div className="INGtimer" id="INGtimer">
            {formatTime(totalSeconds)}
          </div>

          <div className="INGbuttons">
            <button id="INGcompleteBtn" onClick={handleComplete}>요청 완료</button>
            <button id="INGcancelBtn" onClick={handleCancel}>요청 취소</button>
            <button id="INGreportBtn" onClick={handleReport}>신고 하기</button>
          </div>
        </div>

        {/* 우측 빈 박스 */}
        <div className="INGright" style={{ display: "none" }}></div>
      </main>
    </>
  );
}

export default Meeting;
