<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/styles.css">
</head>
<body>

  <div class="container">
    <div class="content">
      <div class="left-side">
        <div class="address details">
          <i class="fas fa-map-marker-alt"></i>
          <div class="topic">Address</div>
          <div class="text-one">your address, here</div>
          <div class="text-two">Bangalore</div>
        </div>
        <div class="phone details">
          <i class="fas fa-phone-alt"></i>
          <div class="topic">Phone</div>
          <div class="text-one">1234567890</div>
          <div class="text-two">0987654321</div>
        </div>
        <div class="email details">
          <i class="fas fa-envelope"></i>
          <div class="topic">Email</div>
          <div class="text-one">schoolmanage@gmail.com</div>
          <div class="text-two">shubbham13@gmail.com</div>
        </div>
      </div>
      <div class="right-side">
        <div class="topic-text">Send us a message</div>
        <p>If you have any work from me or any types of quries, you can send me message from here. It's my pleasure to help you.</p>
      <form action="contact">
        <div class="input-box">
          <input type="text" placeholder="Enter your name" name="name">
        </div>
        <div class="input-box">
          <input type="text" placeholder="Enter your email" name="email">
        </div>
        <div class="input-box message-box">
           <input type="text" placeholder="Enter your massage" name="massage">
        </div>
        <div class="button">
          <input type="button" value="Send Now" >
        </div>
      </form>
    </div>
    </div>
  </div>


</body>
</html>