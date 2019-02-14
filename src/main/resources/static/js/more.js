$(function(){
	$('#tjprice').click(function(){
		var reg=/^[0-9]*$/;
		var url="../price";
		var jiage1=$('#price_L').val()?$('#price_L').val():0;
		var jiage2=$('#price_R').val()?$('#price_R').val():0;
		if(!reg.test(jiage1)||!reg.test(jiage2)){
			alert('请输入数字');
		}else{
			if(jiage1==0&&jiage2==0){
				$("#tjprice").attr({"disabled":"disabled"});
			}else{
				$("#tjprice").removeAttr("disabled");
				var p1=jiage1+'-'+jiage2;
				location.href=url+"?p1="+p1;
				/*changeload('jg',p1);*/
			}
		}
	})
});
/*function changeload(name,value){
	alert(name);
	alert(value);
	var url_form=$('#urlform').val();
	var url='../maiche_list';
	$.ajax({
		type: "POST",
		url: url,
		async:false,
		data: {name:name,value:value},
		dataType: "json",
		success: function(data){
			location.href = data.url;
		}
	 });
	 return false;
}*/