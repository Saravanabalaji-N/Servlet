<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
   <style type="text/css">
    .main{
    height:100vh;
   display: flex;
  justify-content:center;
  align-items:center;

   }
   .signup{
   display: flex;
   flex-direction: column;
   width:300px;
   margin: 20px;
  
   }
   
   label{
   width:100%;
   text-align: center;
   color: red;
   font-size: x-large;
   font-weight: 600;
   }
   .signup lable ,input, button{
   padding: 10px;
   border-radius: 10px;
   margin: 20px;
   }
   
   </style>

</head>
<body>
<form action="servlet3" method="post">
<div class="main">
 <div class="signup">  
            <label for="chk" aria-hidden="true">Sign up</label>
            <input type="text" name="txt" placeholder="User name" required>
            <input type="tel" name="tel" placeholder="PhoneNo" required>
            <input type="email" name="mail" placeholder="E-mail Id" required>
            <button>Sign up</button>
</div>
</div>
</form>
</body>
</html>