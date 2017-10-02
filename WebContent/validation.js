function msg() {
	
	var n = document.login.email.value;
	var p = document.login.pwd.value;
	
	var status=false;  
	
	if( n.length==0) {
		alert("Email cannot be empty"); 
		status=false;
	}
	else
		{status=true;}
	
	if( p.length==0) {
		alert("Password cannot be empty");
		status=false;
	}
	else
		{status=true;}
	
}

function forgot() {
	
	var n = document.forgot.email.value;
	var p = document.forgot.secret.value;
	
	if( n.length==0) {
		alert("Email cannot be empty");
	}
	
	if( p.length==0) {
		alert("Secret cannot be empty");
	}
	
}

function validate(){  
	var name=document.register.name.value;  
	var password=document.register.pwd.value;
	var email=document.register.email.value;
	var cpwd=document.register.cpwd.value;
	var mobile=document.register.mobile.value;
	var secret=document.register.secret.value;
	var qualification=document.register.qualification.value;
	var domain=document.register.domain.value;
	var experience=document.register.experience.value;
	var status=false; 
	var flag=true;
	if(qualification.length<3){  
		document.getElementById("qualificationloc").innerHTML="Please enter Valid Qualification";  
		status=false;
		flag=false;
		}else{  
		document.getElementById("qualificationloc").innerHTML="Looks great";  
		//status=true;  
		} 
	if(domain.length<3){  
		document.getElementById("domainloc").innerHTML="Please enter Valid Domain name";  
		status=false;
		flag=false;
		}else{  
		document.getElementById("domainloc").innerHTML="Looks great";  
		//status=true;  
		}
	if(experience.length!=1){  
		document.getElementById("experienceloc").innerHTML="Please enter Valid experience in number";  
		status=false;
		flag=false;
		}else{  
		document.getElementById("experienceloc").innerHTML="Looks great";  
		//status=true;  
		}
	if(name.length<3){  
	document.getElementById("nameloc").innerHTML="Please enter your name";  
	status=false;
	flag=false;
	}else{  
	document.getElementById("nameloc").innerHTML="Looks great";  
	//status=true;  
	}  
	if(secret.length<3){  
		document.getElementById("secretloc").innerHTML="Please enter your secret word";  
		status=false; 
		flag=false;
		}else{  
		document.getElementById("secretloc").innerHTML="Looks great";  
	//	status=true;  
		} 
	if(password.length<6){  
	document.getElementById("passwordloc").innerHTML= "Password must be of 6 digits as your date of birth(only numbers allowed)";  
	status=false;  
	flag=false;
	}
	else{  
	document.getElementById("passwordloc").innerHTML="Looks great"; 
//	status=true;
	} 
	if(mobile.length!=10){  
		document.getElementById("mobileloc").innerHTML= "Mobile number must be of 10 digits(only numbers allowed)";  
		status=false;
		flag=false;
		}
		else{  
		document.getElementById("mobileloc").innerHTML="Looks great"; 
//		status=true;
		} 
	
	if (email.length<5){    
		  document.getElementById("emailloc").innerHTML= "Please enter a valid e-mail address";
		  status=false;
		  flag=false;
	  }  
	else
		{
		document.getElementById("emailloc").innerHTML= "Looks great";
		//status=true;
		}

	  
	if(password===cpwd && cpwd.length!=0){  
		 document.getElementById("cpwdloc").innerHTML= "Passwords matched";
	}
		 
	else {  
		 document.getElementById("cpwdloc").innerHTML= "Passwords must be same";
	status= false;  
	flag=false;
	}  
	
	if(name!="" && email!="" && secret!="" &&password!="" && cpwd!="" && password===cpwd && mobile!=""&& qualification!="" &&domain!="" &&experience!="" && flag==true)
	 {
 status=true;
 }
	return status;  
	}  


function isNumber(evt) {
    var iKeyCode = (evt.which) ? evt.which : evt.keyCode
    if (iKeyCode != 46 && iKeyCode > 31 && (iKeyCode < 48 || iKeyCode > 57))
        return false;

    return true;
}



