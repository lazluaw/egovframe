var user = user || {}
user = (function(){ //즉시실행
	let _, javascript, session //인스턴스변수처리
	let init = function(){ //자바 new와 같음
		 _ = sessionStorage.getItem('context'), //도메인
		 javascript = sessionStorage.getItem('javascript'), //도메인
		 session = sessionStorage.getItem('session') //도메인
	}
	let join = function(payload){
		$.ajax({
			url : _+`/users/joinProcess`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				if(res === 'SUCCESS') {
					location.href = _+'/location/users/Login' //tiles가 아니니까 바로 갈 수 있음
				} else {
					alert('회원가입에 실패하였습니다. 다시 한 번 시도해주세요.')
					location.href = _+'/location/users/Join'
				}
			},
			error: function(request,status,error){
				alert("code = "+ request.status + " message = " + request.responseText + " error = " + error)
			}
		})
	}
	let login = function(payload){
		$.ajax({
			url: `/users/loginProcess`,
			type: 'POST',
			data: JSON.stringify(payload),
			dataType: 'json',
			contentType: 'application/json; charset=UTF-8',
			success: function(res){
				if(res === 'SUCCESS') {
					alert('로그인 성공')
				}	 else {
					alert('로그인 실패')
					location.href = _+'/location/users/Login'
				}
			},
			error: function(request,status,error){
				alert("code = "+ request.status + " message = " + request.responseText + " error = " + error)
			}
		})
	}
	let logout = function(){
		sessionStroage.removeItem('userId')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
		location.href = _+'/'
	}
	let remove = function(){
		sessionStroage.removeItem('userId')
		sessionStroage.removeItem('context')
		sessionStroage.removeItem('javascript')
		sessionStroage.removeItem('css')
		sessionStroage.removeItem('image')
		location.href = _+'/'
	}
	return {init, join, login, logout} //리턴타입이 json이라 객체로 return 가능
})()