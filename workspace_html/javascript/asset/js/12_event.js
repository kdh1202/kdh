console.log('hello word')


// window.onload = init;
window.addEventListener('load', init)


function init(){
    const cho =document.querySelector('#cho')
    cho.style.top = '10px';
    cho.style.left = '10px';
    const login = document.querySelector('#login')
    const c = document.querySelector('#console');
    console.log( c );
    bind();
}
function bind(){

    const msg = document.querySelector('#console');

    const btn1 = document.querySelector('#btn1');
    console.log(btn1)
    btn1.onclick = function(){
         msg.innerHTML += '<br>버튼1 클릭'
        }
        // btn1.onclick=''
        // onclick은 변수라서 마지막 값만 저장된다

        const btn2 =document.querySelector('#btn2');
        // addEventListener 는 계속 동일안 이벤트를 추가할수있다
        btn2.addEventListener('click',function(){
            msg.innerHTML += '<br>버튼2 클릭'
    })
    const login = document.querySelector('#login')
    login.addEventListener('click',function(){
     const id = document.querySelector('#id').value;
     const pw = document.querySelector('#pw').value;

    //  debugger


     console.log('id:',id,id == "")
     if(id ==""){
         msg.innerHTML += '<br>아이디는 필수입니다'
     } else if(pw ==""){
         msg.innerHTML += '<br>비밀번호는 필수입니다'
     }else{
         msg.innerHTML += `<br>${id},${pw}`;
     }
    })


    window.addEventListener('resize',function(){
        console.log('resize')
        console.log( window.innerWidth)
    })
    
    window.addEventListener('scroll',function(){
        console.log('scroll')
        console.log('scrollTop',document.documentElement.scrollTop)
        // document.documentElement.scrollTop = 140;

    })
    document.querySelector('#top').addEventListener('click',function(){
        // window.scrollTo(0,null)
        // window.scrollTo(
            //     {
                //         top:0,
                //         behavior:'smooth'
                //     }
                // )
                // document.documentElement.scrollTop -= 10;
                // 스크롤탑 위치 180 정도 에있는대 
                // 0까지 -10씩 바꾼다
                // 180 일때 100
                // 170 일떄 200
                // 160 일떄 300

                for(let i = document.documentElement.scrollTop; i >= 0 ; i -=10){
                    let time = (200 - i) * 10
                    setTimeout(function(){
                        console.log('i:',i,'time',time)
                        document.documentElement.scrollTop = i;
                    },time)
                }

            })
            // document.querySelector('#id').addEventListener('keydown',function(){
            document.querySelector('#id').addEventListener('keyup',function(event){
                console.log(event)
                console.log(event.keyCode )
                if(event.keyCode ==13 ){
                    console.log('엔터')
                    document.querySelector('#pw').focus()
                }
            })
            document.querySelector('#pw')
            .addEventListener('keyup',function(event){
                 if(event.keyCode ==13 ){
                document.querySelector('#login').click()
                }

            })
            document.querySelector('body').addEventListener('keydown',function(event){
                console.log(event.keyCode)
                const cho = document.querySelector('#cho')
                console.log(cho.style.left)
                //  왼쪽
                if(event.keyCode == 37){
                    cho.style.left = (parseInt(cho.style.left) - 10 ) +'px'
                } else if(event.keyCode == 39){
                    cho.style.left = (parseInt(cho.style.left) + 10 ) +'px'
                }
            })



}


function btnClick(){
     const msg = document.querySelector('#console');
      msg.innerHTML += '<br>btnClick 실행'
}



// 로그인버튼 눌렀을떄 
// 아이디와 비밀번호가 비어있지 않다면
//      아이디 , 비밀번호  출력 
//      하나라도 안썻다면 
//      아이디는 필수입니다 또는 비밀번호는 필수입니다 출력
 


// function id(){
//     const d = document.querySelector('#id')
//     const f = document.querySelector('#pw')

//     g.onclick =function(){
//         if(id != undefined && pw != undefined){
//             console.log(d,f)
//         } else if ( d != undefined && f == undefined){
//             console.log('비밀번호 입력해주세요' )
//         } else if(  d == undefined && f != undefined){
//             console.log('아이디를 입력해주세요')
//         } else if(  d == undefined && f == undefined){
//             console.log('아이디 비밀번호 입력해주세요')
//         }
//     }
        

// }















