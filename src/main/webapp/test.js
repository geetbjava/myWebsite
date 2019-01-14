		 
		function sloganHighlight(){
			var sloganEle=document.getElementById("slogan");
			sloganEle.style.background="red";
		}
		function sloganNormal(){
			document.getElementById("slogan").style.background="white";
		}
		function uidFocus(){
			console.log("customer focus in  userid text box");
		}
		
		function uidBlur(){
			console.log("customer lost focus from userid text box");
		}
		function     validateUid(  ){
			var userEnteredUID=document.getElementById("uid").value;
			console.log("inside javascript function : user entered :"+userEnteredUID);
			if(userEnteredUID == "")
				alert("userid is mandatory");
		}
	