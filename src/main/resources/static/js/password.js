$(function() {
	$("#conPassword").on("keyup", function() {
		var url = "http://localhost:8080/administrator/password_check";
		$.ajax({
			url: url,
			type: "POST",
			dataType: "json",
			data: {
				password: $("#password").val(),
				conPassword: $("#conPassword").val()
			},
			async: true
		}).done(function(data) {
			$("#conPasswordText").text(data.conPasswordText);
		}).fail(function(XMLHttpRequest, textStatus, errorThrown) {
			alert("エラーが発生しました！");
			console.log("XMLHttpRequest : " + XMLHttpRequest.status);
			console.log("textStatus     : " + textStatus);
			console.log("errorThrown    : " + errorThrown.message);
		});
	});
});