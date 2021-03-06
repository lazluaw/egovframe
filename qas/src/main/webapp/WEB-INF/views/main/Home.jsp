<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="auth-page">
	<div>
		<h5 class="auth-logo">
			<i class="fa fa-circle text-primary"></i> QAS <i class="fa fa-circle text-danger"></i>
		</h5>
		<div class="widget-auth mx-auto" title="<h3 class='mt-0'>LOGIN</h3>">
			<form class="mt">
				<div class="form-group">
					<input class="form-control no-border" required type="email" id="userEmail" placeholder="Email" />
				</div>
				<div class="form-group">
					<input class="form-control no-border" required type="password" id="userPassword" placeholder="Password" />
				</div>
				<button id="login_btn" class="auth-btn mb-3">Login</button>
			</form>
			<p class="widget-auth-info">Don't have an account? Sign up now!</p>
			<button id="join_btn" class="d-block text-center">Create an Account</button>
		</div>
<script>
	$('#join_btn').click(function(e) {
		e.preventDefault()
		alert('${context}')
		location.href='${context}/account/join/form'
	})
</script>