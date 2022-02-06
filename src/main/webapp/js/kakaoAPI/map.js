var mapContainer = document.getElementById('mapBox'), //지도를 생성할 div
mapOption = {
		center: new kakao.maps.LatLng(37.46350160501614, 126.90730494667949), //지도 중심좌표
		level: 3
}; //지도 확대 레벨

var map = new kakao.maps.Map(mapContainer, mapOption); //지도를 생성.

function fn_clickSetting(){
	var clickMarker=null;
	//노선 마커와 위치 클릭 마커
	
	var clickIcon = new kakao.maps.MarkerImage(
			".image/location.png",
			new kakao.maps.Size(32,32));
			
	//지도에 클릭 이벤트를 등록합니다.
	//지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다.
	kakao.maps.event.addListener(map,'click',function(mouseEvent){
		 if(clickMarker !=null){
			clickMarker.setMap(null);
		}
		
		//클릭 위도, 경도 정보를 가져옵니다.
		var latlng = mouseEvent.latLng;
		
		var resultDiv1 = documnet.getElementById('lat');
		resultDiv1.value = Math.floor(latlng.getLat()*10000)/10000;
		var resultDiv2 = documnet.getElementById('lng');
		resultDiv2.value = Math.floor(latlng.getLng()*10000)/10000;
		
		clickMarker = new kakao.maps.Marker({
			position: new kakao.maps.LatLng(resultDiv1.value,resultDiv2.value),
			image:clickIcon,
			clickable:alse
		});
		
		clickMarker.setmap(map);
	});
}

//배열에 추가된 마커들을 지도에 표시하거나 삭제하는 함수입니다.
function setMarkers(map){
	for(var i=0; i<markers.length; i++){
		markers[i].setMap(map);
	}
}