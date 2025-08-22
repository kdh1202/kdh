<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<style>
.popup {
	border: 1px solid black;
	width: 200px;
	height: 300px;
}

.hide {
	display: none;
}
</style>


	<script>
		window.addEventListener('load',()=>{
			showPopup();
			
	document.querySelector('#noShow').addEventListener('click',function(event){
		
		// cookie 먹이는법 (세션쿠키, 만료일 없음)
		document.cookie = 'a= a1'
		document.cookie = 'abcd= 1234'
		console.log(document.cookie)
		
		
		const isCheck = event.target.checked;
		if( isCheck ){
			// 10초 뒤 시간 가져오기
			const now = new Date() // 현재 시간 
			const s10 = now.getSeconds() + 10
			now.setSeconds(s10) // 초 단위로 재설정함
			document.cookie = 'noShow=true;expires='+ now.toGMTString()
		}
		
	})
})
	
	function showPopup(){
			console.log(document.cookie)
			//cookie5.jsp:31 a=a1; abcd=1234; noShow=true
		
		const cookies = document.cookie.split('; ')
		for(let i =0; i<cookies.length; i++){
			const cookie = cookies[i].split('=')
			const name = cookie[0] 
			const value = cookie[1] 
			
			if( name == 'noShow' && value == 'true'){
				document.querySelector('.popup').classList.add('hide');
			}
		}
		
		}
	
	
	</script>



	<div class="popup">

		공지 입니다. 꼭 보세요 <br> <br> <input type="checkbox" id="noShow">
		10초 동안 보지 않기


	</div>





</body>
</html>