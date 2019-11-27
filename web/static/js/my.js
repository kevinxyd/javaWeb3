window.onload=function(){
	var page=-1;
	var len=3;
	var stop=false;
	function c1(){
		if(!stop){
			page++;
			if(page==len){
				page=0;
				$("#c1").animate({"left":"-"+page*900+"px"},0);
			}
			$("#c1").animate({"left":"-"+page*900+"px"},300);
			$("#c3 li").removeClass("on");
			$("#c3 li").eq(page).addClass("on");
		}
		setTimeout(c1,3000)
	}
	c1();
	$("#cc").hover(function(){
		stop=true;
	})
	$("#cc").mouseleave(function(){
		stop=false;
	})
	$("#c21").click(function(){
		stop=true;
		page--; 
		if(page==-1){
			page=len-1;
			$("#c1").animate({"left":"-"+page*900+"px"},300);
		}
		$("#c1").animate({"left":"-"+page*900+"px"},300);
			$("#c3 li").removeClass("on");
			$("#c3 li").eq(page).addClass("on");
	})
	$("#c22").click(function(){
		stop=true;
		page++;
		if(page==len){
			page=0;
			$("#c1").animate({"left":"-"+page*900+"px"},300);
		}
		$("#c1").animate({"left":"-"+page*900+"px"},300);
			$("#c3 li").removeClass("on");
			$("#c3 li").eq(page).addClass("on");
	})
}
