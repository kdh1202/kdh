import React, { useEffect, useRef } from "react";
import { useLocation, useNavigate } from "react-router-dom";
import Header from "../components/Header";
import Loader from "../components/Hourglass"; // 이 줄 추가!
import "../styles/WaitingPage.css";

function WaitingPage() {
  const connectingRef = useRef(null);
  const navigate = useNavigate();
  const { state } = useLocation();

  useEffect(() => {
    const textBase = "봉사자 연결중";
    const dots = ["", ".", "..", "..."];
    let dotIndex = 0;
    const interval = setInterval(() => {
      if (connectingRef.current) {
        connectingRef.current.textContent = textBase + dots[dotIndex];
        dotIndex = (dotIndex + 1) % dots.length;
      }
    }, 500);
    return () => clearInterval(interval);
  }, []);

  useEffect(() => {
    const interval = setInterval(() => {
      if (localStorage.getItem("matchStatus") === "accepted") {
        navigate("/meeting-wait", { state });
      }
    }, 1000);
    return () => clearInterval(interval);
  }, [navigate, state]);

  return (
    <div>
      <Header />
      <main>
        <a href="">
          <div className="left" title="협력업체 광고">
            협력업체 광고
          </div>
        </a>
        <div className="center">
          <h1>한끼온+</h1>
          <h2>요청이 접수되었습니다</h2>
          <h3>잠시만 기다려 주세요</h3>
          <div className="status-icon">
            <Loader /> {/* ← 이 한 줄로 모래시계 표시 */}
          </div>
          <h3 ref={connectingRef}>봉사자 연결중...</h3>
          <p>소요 시간 10분 예상</p>
          <div className="buttons">
            <button>요청 내용</button>
            <button>요청 취소</button>
            <button>추가 요청</button>
          </div>
        </div>
        <div className="right">
          요청 대기중인 목록
          <br />
          <a href="">병원</a>
          <br />
          <a href="">산책</a>
          <br />
          <a href="">병원</a>
          <br />
          <a href="">뽀뽀</a>
        </div>
      </main>
    </div>
  );
}

export default WaitingPage;
