let view
let isDown = false
window.onload = function () {
    view = document.querySelector("#view");
    const cursor = document.querySelector("#cursor");
    cursor.style.top= '-1000px';
    cursor.style.left= '-1000px';
    bind()
}
function bind() {
    view.innerHTML = '안녕?<br>'

    document.querySelector('#mouse')
        .addEventListener('mousedown', function (evt) {
            isDown =true;
            view.innerHTML = 'mousedown 발생<br>' + view.innerHTML

            console.log(evt)
            /*
                offset : Dom 의 좌상단 기준
                page : 스크롤에 관계없이 문서 좌상단 기분
                client : 지금보이는 화면 최상단 기준
            */
            view.innerHTML = `
            event.offsetX : ${evt.offsetX} event.offsetY : ${evt.offsetY}
            event.pageX : ${evt.pageX} event.pageY : ${evt.pageY}
            event.clientX : ${evt.clientX} event.clientY : ${evt.clientY}

            ${view.innerHTML}
            `
        })

        // offset 개념을 아니가
        //  그 dom으로 스크롤 바로 가기
        // window.scrollTo
    document.querySelector('#mouse')
        .addEventListener('mouseup', function () {
            isDown = false;
            view.innerHTML = 'mouseup 발생<br>' + view.innerHTML
        })

    //  복잡하게 계속 나와서 주석처리 
    // document.querySelector('#mouse')
    //     .addEventListener('mousemove', function () {
    //         view.innerHTML = 'mousemove 발생<br>' + view.innerHTML
    //     })

    // 마우스 들어옴 mouseover 또는 mousesenter
    document.querySelector('#mouse')
        .addEventListener('mouseover', function () {
            view.innerHTML = 'mouseover 발생<br>' + view.innerHTML

            document.querySelector('#mouse').style.backgroundColor='yellow'
        })

    // 마우스 나감 monuseout 또는 mouseeleave
    document.querySelector('#mouse')
        .addEventListener('mouseout', function () {
            view.innerHTML = 'mouseout 발생<br>' + view.innerHTML
            document.querySelector('#mouse').style.backgroundColor='black'
        })

        document.querySelector('body')
            .addEventListener('mousemove',function(evt){
                if(isDown){

                    const cursor= document.getElementById('cursor')
                    
                    cursor.style.top = evt.pageY+1  + 'px'; 
                    cursor.style.left = evt.pageX +1 + 'px';
                }
            })
            document.querySelector('#drag')
            .addEventListener('mousedown',function(evt){
                isDown = true
            })

}
