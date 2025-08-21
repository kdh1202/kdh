document.addEventListener('DOMContentLoaded', () => {
    const inquiriesData = [
        // 'ewqewq2' 사용자를 관리자로 지정
        { reporterId: 'ehdgus12', badUserId: 'ewqewq2', role: 'admin', title: '도망 갔습니다.', content: '도와주다가 갑자기 화장실 갔다온다고 하고 도망갔습니다', date: '2025-7-31 T 14:42' },
        { reporterId: 'dndud1', badUserId: 'ewqws1', role: 'user', title: '매칭이 되었는데 이렇습니다.', content: '매칭이 되었는데 상대방이 약속 장소를 계속 바꾸고, 연락을 받지 않았습니다.', date: '2025-8-01 T 08:14' },
        { reporterId: 'wowon777', badUserId: 'soo2321', role: 'user', title: '너무 불친절했습니다.', content: '봉사하는 내내 상대방의 태도가 불손하고 무례했습니다. 다음부터는 만나고 싶지 않습니다.', date: '2025-8-01 T 12:33' },
        { reporterId: 'woghd_123', badUserId: 'asd223', role: 'user', title: '요청사항말고 다른걸 요구했습니다.', content: '분명히 요청사항은 청소였는데, 자꾸 개인적인 심부름을 시키려고 했습니다.', date: '2025-8-02 T 17:52' },
        { reporterId: 'reporterA', badUserId: 'userB', role: 'user', title: '개인정보 요구', content: '만나자마자 개인적인 연락처나 정보를 과도하게 요구했습니다.', date: '2025-8-02 T 18:00' },
        { reporterId: 'reporterC', badUserId: 'userD', role: 'user', title: '약속시간 불이행', content: '약속 시간보다 30분이나 늦게 왔고, 사과도 하지 않았습니다.', date: '2025-8-03 T 09:10' },
        { reporterId: 'reporterE', badUserId: 'userF', role: 'user', title: '지나친 언행', content: '농담을 빙자한 모욕적인 발언을 계속해서 불쾌했습니다.', date: '2025-8-03 T 11:25' },
        { reporterId: 'reporterG', badUserId: 'userH', role: 'user', title: '연락 두절', content: '만나기로 한 당일 아침부터 연락이 되지 않아 곤란했습니다.', date: '2025-8-03 T 15:40' },
        { reporterId: 'reporterI', badUserId: 'userJ', role: 'user', title: '물품 파손', content: '도움 중 실수로 물건을 파손했는데, 사과 없이 그냥 가버렸습니다.', date: '2025-8-04 T 10:05' },
        { reporterId: 'reporterK', badUserId: 'userL', role: 'user', title: '금품 요구', content: '봉사 활동 중에 대가성 금품을 요구해서 당황스러웠습니다.', date: '2025-8-04 T 14:15' },
        // 'ewqewq2' 사용자를 관리자로 지정
        { reporterId: 'reporterL', badUserId: 'ewqewq2', role: 'admin', title: '또 도망갔어요', content: '이 사용자 또 도망갔습니다. 상습범 같아요.', date: '2025-8-10 T 11:00' },
        { reporterId: 'reporterM', badUserId: 'userN', role: 'user', title: '계획 무시', content: '사전에 조율했던 봉사 계획을 무시하고 자기 마음대로 진행했습니다.', date: '2025-8-05 T 16:30' },
        { reporterId: 'reporterO', badUserId: 'userP', role: 'user', title: '불성실한 태도', content: '봉사 내내 휴대폰만 보고, 적극적으로 참여하지 않았습니다.', date: '2025-8-06 T 09:50' },
        { reporterId: 'reporterQ', badUserId: 'userR', role: 'user', title: '종교 강요', content: '봉사 활동과 관계 없는 종교 활동을 강요하여 불쾌했습니다.', date: '2025-8-06 T 13:20' },
        { reporterId: 'reporterS', badUserId: 'userT', role: 'user', title: '마일리지 부정', content: '실제 활동 시간보다 더 많은 마일리지를 요구했습니다.', date: '2025-8-07 T 10:45' },
        { reporterId: 'reporterU', badUserId: 'userV', role: 'user', title: '위험한 행동', content: '안전 수칙을 지키지 않고 위험한 행동을 반복했습니다.', date: '2025-8-07 T 14:55' },
        { reporterId: 'reporterW', badUserId: 'userX', role: 'user', title: '모임 장소 변경', content: '사전 협의 없이 모임 장소를 갑자기 변경하여 곤란했습니다.', date: '2025-8-08 T 16:00' },
        { reporterId: 'reporterY', badUserId: 'userZ', role: 'user', title: '기타 불만', content: '전반적인 태도가 좋지 않았고, 다시는 만나고 싶지 않습니다.', date: '2025-8-08 T 17:10' },
        { reporterId: 'reporterAA', badUserId: 'userBB', role: 'user', title: '도움 거부', content: '봉사 요청에 대해 비협조적이었고, 도움을 거부했습니다.', date: '2025-8-09 T 08:30' },
        { reporterId: 'reporterCC', badUserId: 'userDD', role: 'user', title: '신분 속임', content: '제공된 신분 정보와 실제 인물이 달랐습니다.', date: '2025-8-09 T 12:45' },
        { reporterId: 'reporterEE', badUserId: 'userFF', role: 'user', title: '허위 요청', content: '요청 내용이 사실과 달라 봉사 진행이 불가능했습니다.', date: '2025-8-09 T 16:00' }
    ];

    // [수정] 원본 데이터에서 관리자가 신고된 내역은 필터링
    const filteredInquiries = inquiriesData.filter(inquiry => inquiry.role !== 'admin');

    const userWarnings = {}; // 사용자별 경고 횟수 추적
    const inquiriesPerPage = 5;
    let currentPage = 1;

    const inquiryTableBody = document.getElementById('inquiry-table-body');
    const paginationContainer = document.getElementById('pagination-container');
    const detailReporterId = document.getElementById('detail-reporter-id');
    const detailTitle = document.getElementById('detail-title');
    const detailContent = document.getElementById('detail-content');
    const detailBadUserId = document.getElementById('detail-bad-user-id');
    const sanctionBtn = document.getElementById('sanction-btn');
    const sanctionDropdown = document.getElementById('sanction-dropdown');
    const sanctionOptions = document.querySelectorAll('.sanction-dropdown a');
    const sanctionContainer = document.querySelector('.sanction-container');

    const replyBtn = document.getElementById('reply-btn');
    const replyFormContainer = document.getElementById('reply-form-container');
    const replyTextarea = document.getElementById('reply-textarea');
    const replyCancelBtn = document.getElementById('reply-cancel-btn');
    const replySubmitBtn = document.getElementById('reply-submit-btn');

    function renderInquiries(page) {
        inquiryTableBody.innerHTML = '';
        const start = (page - 1) * inquiriesPerPage;
        const end = start + inquiriesPerPage;
        // [수정] 필터링된 데이터를 사용
        const inquiriesToRender = filteredInquiries.slice(start, end);

        inquiriesToRender.forEach((inquiry, index) => {
            const row = document.createElement('div');
            row.className = 'div-row';
            row.dataset.reporterId = inquiry.reporterId;
            row.dataset.badUserId = inquiry.badUserId;
            row.dataset.inquiryTitle = inquiry.title;
            row.dataset.inquiryContent = inquiry.content;
            row.dataset.inquiryDate = inquiry.date;
            row.dataset.badUserRole = inquiry.role || 'user';

            const warnings = userWarnings[inquiry.badUserId] || 0;

            row.innerHTML = `
                <div class="div-cell col-reporter-id">${inquiry.reporterId}</div>
                <div class="div-cell col-user-id">${inquiry.badUserId}</div>
                <div class="div-cell col-accumulated">${warnings}회</div>
                <div class="div-cell col-inquiry-title left-align clickable-title">${inquiry.title}</div>
                <div class="div-cell col-inquiry-date">${inquiry.date}</div>
            `;
            inquiryTableBody.appendChild(row);

            // [수정] 첫 번째 항목이 없을 수도 있으므로 안전장치 추가
            if (inquiriesToRender.length > 0 && page === 1 && index === 0) {
                row.classList.add('selected-row');
                updateDetailView(row);
            }
        });

        // [수정] 표시할 항목이 없으면 상세 정보 뷰를 비움
        if (inquiriesToRender.length === 0) {
            // 첫 페이지에 아무것도 없을 경우 상세 뷰 비우기
            if (page === 1) {
                detailReporterId.textContent = '';
                detailTitle.textContent = '';
                detailContent.textContent = '표시할 문의 내역이 없습니다.';
                detailBadUserId.textContent = '';
            }
        }
    }

    function renderPagination() {
        paginationContainer.innerHTML = '';
        // [수정] 필터링된 데이터를 기준으로 페이지 수 계산
        const totalPages = Math.ceil(filteredInquiries.length / inquiriesPerPage);

        // 페이지가 1개 이하면 페이지네이션 숨기기
        if (totalPages <= 1) {
            paginationContainer.style.display = 'none';
            return;
        }
        paginationContainer.style.display = 'block';


        const prevLink = document.createElement('a');
        prevLink.href = '#';
        prevLink.innerHTML = '&lt;';
        prevLink.className = currentPage === 1 ? 'disabled' : '';
        prevLink.addEventListener('click', (e) => {
            e.preventDefault();
            if (currentPage > 1) {
                currentPage--;
                renderPage();
            }
        });
        paginationContainer.appendChild(prevLink);

        for (let i = 1; i <= totalPages; i++) {
            const pageLink = document.createElement('a');
            pageLink.href = '#';
            pageLink.textContent = i;
            pageLink.className = currentPage === i ? 'active' : '';
            pageLink.addEventListener('click', (e) => {
                e.preventDefault();
                currentPage = i;
                renderPage();
            });
            paginationContainer.appendChild(pageLink);
        }

        const nextLink = document.createElement('a');
        nextLink.href = '#';
        nextLink.innerHTML = '&gt;';
        nextLink.className = currentPage === totalPages ? 'disabled' : '';
        nextLink.addEventListener('click', (e) => {
            e.preventDefault();
            if (currentPage < totalPages) {
                currentPage++;
                renderPage();
            }
        });
        paginationContainer.appendChild(nextLink);
    }

    function updateDetailView(row) {
        detailReporterId.textContent = row.dataset.reporterId;
        detailTitle.textContent = row.dataset.inquiryTitle;
        detailContent.textContent = row.dataset.inquiryContent;
        detailBadUserId.textContent = row.dataset.badUserId;
    }

    function renderPage() {
        renderInquiries(currentPage);
        renderPagination();
    }

    sanctionBtn.addEventListener('click', (e) => {
        e.stopPropagation();
        sanctionDropdown.classList.toggle('show-dropdown');
    });

    document.addEventListener('click', (e) => {
        if (!sanctionContainer.contains(e.target)) {
            sanctionDropdown.classList.remove('show-dropdown');
        }
    });

    sanctionOptions.forEach(option => {
        option.addEventListener('click', (e) => {
            e.preventDefault();
            const action = e.target.textContent;

            const selectedRow = inquiryTableBody.querySelector('.selected-row');
            if (!selectedRow) {
                alert('제재할 사용자를 먼저 선택해주세요.');
                return;
            }
            const badUserId = selectedRow.dataset.badUserId;
            const badUserRole = selectedRow.dataset.badUserRole;

            if (badUserRole === 'admin') {
                alert('관리자 계정에는 제재 조치를 적용할 수 없습니다.');
                sanctionDropdown.classList.remove('show-dropdown');
                return;
            }

            const warningActions = ['경고', '1일정지', '7일정지'];

            if (warningActions.includes(action)) {
                userWarnings[badUserId] = (userWarnings[badUserId] || 0) + 1;
                const newWarningCount = userWarnings[badUserId];

                const allVisibleRows = inquiryTableBody.querySelectorAll('.div-row');
                allVisibleRows.forEach(r => {
                    if (r.dataset.badUserId === badUserId) {
                        r.querySelector('.col-accumulated').textContent = `${newWarningCount}회`;
                    }
                });

                alert(`'${badUserId}' 사용자에게 '${action}' 조치를 적용했으며, 누적 제재 횟수가 1회 추가되었습니다. (누적: ${newWarningCount}회)`);

            } else {
                alert(`'${badUserId}' 사용자에게 "${action}" 조치를 적용합니다.`);
            }

            sanctionDropdown.classList.remove('show-dropdown');
        });
    });

    replyBtn.addEventListener('click', () => {
        replyFormContainer.classList.toggle('show-reply-form');
        if (replyFormContainer.classList.contains('show-reply-form')) {
            replyTextarea.focus();
        }
    });

    replyCancelBtn.addEventListener('click', () => {
        replyFormContainer.classList.remove('show-reply-form');
        replyTextarea.value = '';
    });

    replySubmitBtn.addEventListener('click', () => {
        const replyContent = replyTextarea.value;
        const reporterId = detailReporterId.textContent;
        if (replyContent.trim() !== '') {
            alert(`${reporterId}님께 답변이 전송되었습니다.`);
            replyFormContainer.classList.remove('show-reply-form');
            replyTextarea.value = '';
        } else {
            alert('답변 내용을 입력해주세요.');
        }
    });

    renderPage();
});