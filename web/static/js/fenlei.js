//动画	
		
		$(function(){
			$(window).scroll(function(){
				if($(window).scrollTop()>= 1200&&$(window).scrollTop()<1750){
					$('.foot72').show();
					$('.foot76').show();
					$('.foot75').fadeIn(0);
					$('.foot76').animate({"left":"-690px"},800,function(){});
					$('.foot72').animate({"left":"630px"},800,function(){});
				}else if($(window).scrollTop()>1900||$(window).scrollTop()<1100){
					$('.foot72').hide();
					$('.foot76').hide();
					$('.foot75').fadeOut(300);
				}
			})
			$(window).scroll(function(){
				if($(window).scrollTop()>= 1400&&$(window).scrollTop()<2000){
					$('.foot79').show();
					$('.foot83').show();
					$('.foot82').fadeIn(0);
					$('.foot83').animate({"left":"-690px"},1000,function(){});
					$('.foot79').animate({"left":"630px"},1000,function(){});
				}else if($(window).scrollTop()>2200||$(window).scrollTop()<1400){
					$('.foot79').hide();
					$('.foot83').hide();
					$('.foot82').fadeOut(300);
				}
			})
		})
		$(function(){
			$('.foot73').hover(function(){
				$('.js').css("color","orangered");
			},function(){
				$('.js').css("color","black");
			})
			$('.foot74').hover(function(){
				$('.js1').css("color","orangered");
			},function(){
				$('.js1').css("color","black");
			})
			$('.foot75').hover(function(){
				$('.js2').css("color","orangered");
			},function(){
				$('.js2').css("color","black");
			})
			$('.foot77').hover(function(){
				$('.js3').css("color","orangered");
			},function(){
				$('.js3').css("color","black");
			})
			$('.foot78').hover(function(){
				$('.js4').css("color","orangered");
			},function(){
				$('.js4').css("color","black");
			})
			$('.foot80').hover(function(){
				$('.js5').css("color","orangered");
			},function(){
				$('.js5').css("color","black");
			})
			$('.foot81').hover(function(){
				$('.js6').css("color","orangered");
			},function(){
				$('.js6').css("color","black");
			})
			$('.foot82').hover(function(){
				$('.js7').css("color","orangered");
			},function(){
				$('.js7').css("color","black");
			})
			$('.foot84').hover(function(){
				$('.js8').css("color","orangered");
			},function(){
				$('.js8').css("color","black");
			})
			$('.foot85').hover(function(){
				$('.js9').css("color","orangered");
			},function(){
				$('.js9').css("color","black");
			})
			
		})
//foot
		$(function(){
				$('.foot445').hide();
				$('.foot45').hover(function(){
					$('.foot445').show();
				},function(){
				$('.foot445').fadeOut(300);
					$('.foot445').css("transform","")
				})
		})
		$(function(){
				$('.foot446').hide();
				$('.foot46').hover(function(){
					$('.foot446').show();
				},function(){
				$('.foot446').fadeOut(300);
					$('.foot446').css("transform","")
				})
		})
		$(function(){
				$('.foot444').hide();
				$('.foot44').hover(function(){
					$('.foot444').show();
				},function(){
				$('.foot444').fadeOut(300);
					$('.foot444').css("transform","")
				})
		})
		$(function(){
				$('.foot333').hide();
				$('.foot33').hover(function(){
					$('.foot333').show();
				},function(){
				$('.foot333').fadeOut(300);
					$('.foot333').css("transform","")
				})
		})
		$(function(){
				$('.foot344').hide();
				$('.foot34').hover(function(){
					$('.foot344').show();
				},function(){
				$('.foot344').fadeOut(300);
					$('.foot344').css("transform","")
				})
		})
		$(function(){
				$('.foot377').hide();
				$('.foot37').hover(function(){
					$('.foot377').show();
				},function(){
				$('.foot377').fadeOut(300);
					$('.foot377').css("transform","")
				})
		})
		
//分类
		$(function(){
				$('.a4').hide();
				$('.a2').hide();
				$('.a6').hide();
				$('.a8').hide();
				$('.a10').hide();
				$('.a12').hide();
			$('.a1').mouseover(function(){
				$('.a4').hide();
				$('.a6').hide();
				$('.a8').hide();
				$('.a10').hide();
				$('.a12').hide();
				$('.a2').show();
				$('.a1').css({
					"background-color":"white",
					"color":"black",
					});
				$('.a3,.a5,.a7,.a9,.a11').css({
					"background-color":"",
					"color":"",
				});
			})
			$('.a3').mouseover(function(){
				$('.a3').css({
					"background-color":"white",
					"color":"black",
					});
				$('.a1,.a5,.a7,.a9,.a11').css({
					"background-color":"",
					"color":"",
				});
				$('.a4').show();
				$('.a6').hide();
				$('.a2').hide();
				$('.a8').hide();
				$('.a10').hide();
				$('.a12').hide();
			})
			$('.a5').mouseover(function(){
				$('.a5').css({
					"background-color":"white",
					"color":"black",
					});
				$('.a1,.a3,.a7,.a9,.a11').css({
					"background-color":"",
					"color":"",
				});
				$('.a6').show();
				$('.a4').hide();
				$('.a2').hide();
				$('.a8').hide();
				$('.a10').hide();
				$('.a12').hide();
			})
			$('.a7').mouseover(function(){
				$('.a7').css({
					"background-color":"white",
					"color":"black",
					});
				$('.a1,.a5,.a3,.a9,.a11').css({
					"background-color":"",
					"color":"",
				});
				$('.a6').hide();
				$('.a4').hide();
				$('.a2').hide();
				$('.a8').show();
				$('.a10').hide();
				$('.a12').hide();
			})
			$('.a9').mouseover(function(){
				$('.a9').css({
					"background-color":"white",
					"color":"black",
					});
				$('.a1,.a5,.a7,.a3,.a11').css({
					"background-color":"",
					"color":"",
				});
				$('.a6').hide();
				$('.a4').hide();
				$('.a2').hide();
				$('.a8').hide();
				$('.a10').show();
				$('.a12').hide();
			})
			$('.a11').mouseover(function(){
				$('.a11').css({
					"background-color":"white",
					"color":"black",
					});
				$('.a1,.a5,.a7,.a9,.a3').css({
					"background-color":"",
					"color":"",
				});
				$('.a6').hide();
				$('.a4').hide();
				$('.a2').hide();
				$('.a8').hide();
				$('.a10').hide();
				$('.a12').show();
			})
			$('.a1.a2.a3.a4.a5.a6.a7.a8.a9.a10.a11.a12').mouseleave(function(){
					$('.a4').hide();
					$('.a2').hide();
					$('.a6').hide();
					$('.a8').hide();
					$('.a10').hide();
					$('.a12').hide();
			})
			$(".aaa").mouseleave(function(){
					$('.a1,.a5,.a3,.a7,.a9,.a11').css({
						"background-color":"",
						"color":"",
					});
					$('.a4').hide();
					$('.a2').hide();
					$('.a6').hide();
					$('.a8').hide();
					$('.a10').hide();
					$('.a12').hide();
			})
		})