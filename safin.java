<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Own Profile</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            transition: background-color 0.5s ease;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: #f0f0f0;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        p {
            line-height: 1.6;
            color: #555;
        }
        .change-bg-btn {
            display: block;
            margin-top: 20px;
            text-align: center;
        }
        #back-to-top {
            position: fixed;
            bottom: 20px;
            right: 20px;
            background-color: #333;
            color: #fff;
            padding: 10px 20px;
            border-radius: 5px;
            text-decoration: none;
            display: none;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>My Profile</h1>
        <p>
            Hello! I'm [Your Name]. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam gravida ex quis urna consectetur, vitae finibus risus aliquet. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris dapibus neque vel nisl dictum tempus.
        </p>
        <p>
            Nam eget bibendum quam. Integer nec arcu eget lacus rutrum faucibus. Phasellus sit amet nibh non augue tincidunt accumsan. Sed vestibulum aliquet quam, nec egestas nunc fermentum a. Nulla at posuere nunc.
        </p>
        <p>
            Proin tincidunt dui eu nisi rhoncus, a scelerisque arcu finibus. Duis malesuada lorem non neque gravida mattis. Nam sit amet justo eget ex vestibulum hendrerit vel et nunc. Aenean euismod turpis nec ex pharetra, in rhoncus libero vehicula. Donec tristique, velit at vehicula rutrum, odio lectus convallis metus, a pellentesque libero nisl non nulla.
        </p>
        <a href="#" class="change-bg-btn" onclick="changeBgColor()">Change Background Color</a>
    </div>

    <a href="#" id="back-to-top">Back to Top</a>

    <script>
        // Function to change background color
        function changeBgColor() {
            var colors = ['#ff6347', '#7fffd4', '#ffd700', '#dda0dd', '#00ffff'];
            var randomColor = colors[Math.floor(Math.random() * colors.length)];
            document.body.style.backgroundColor = randomColor;
        }

        // Function to scroll to top
        window.onscroll = function() {scrollFunction()};

        function scrollFunction() {
            if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
                document.getElementById("back-to-top").style.display = "block";
            } else {
                document.getElementById("back-to-top").style.display = "none";
            }
        }

        document.getElementById("back-to-top").addEventListener("click", function(event) {
            event.preventDefault();
            document.body.scrollTop = 0;
            document.documentElement.scrollTop = 0;
        });
    </script>
</body>
</html>
