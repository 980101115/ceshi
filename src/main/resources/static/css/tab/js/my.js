document.getElementById("hide").style.display="none";
function hideagain() {
    document.getElementById("hide").style.display="none";
}
function check(phone){
    var reg = new RegExp("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$");
    // var div = document.getElementById("falseEmail");
    var obj = document.getElementById("phone");
    if(obj.value === ""){ //输入不能为空
        document.getElementById("hide").style.display="none";
    }else if(!reg.test(obj.value)){ //正则验证不通过，格式不对
        document.getElementById("hide").style.display="";
    }else{
        document.getElementById("hide").style.display="none";
    }
}
var countdown = 60;
$('#numbtn').on('click',function(){
    var obj = $("#numbtn");

    if($("#phone").val() === ""){ //输入不能为空
        document.getElementById("hide").style.display="";
        return;
    }

    settime(obj);
    //var类型后台认不清哈哈哈哈哈哈哈
})
function settime(obj) { //发送验证码倒计时
    if (countdown == 0) {
        obj.attr('disabled', false);
        //obj.removeattr("disabled");
        obj.html("获取验证码");
        countdown = 60;
        return;
    } else {
        obj.attr('disabled', true);
        obj.html("重新发送(" + countdown + ")");
        countdown--;

    }
    setTimeout(function () {
            settime(obj)
        }
        , 1000)
    // alert($("#phone").val());
}
function smsg(phone) {
    $.post("/sendmsg", {"phone":$("#phone").val()}, function (data) {
    });
}
function checkCode(checkCode,phone) {
    // alert($("#checkCode").val());
    $.post("/checkCode", {"checkCode":$("#checkCode").val(),"phone":$("#phone").val()}, function (data) {
        console.log(data);
        // window.location.href = "http://localhost:8081/indexx";
        // window.location.reload();

    });
}
