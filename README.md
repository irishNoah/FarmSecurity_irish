# :blue_book: 프로젝트 소개

## :bell: 프로젝트 주제
:apple: AI를 이용한 농작물 피해 완화 시스템

## :beginner: 개발 배경
<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/179216377-5c0d525e-64dd-4a1e-8bd0-22841a7d0f2d.JPG" alt="img1"/>
  
  :file_folder: [표 1] : 동물별 농작물 피해실태(환경부 생물다양성과/연도별 유해생물에 의한 피해현황(2014~2018)/2019)
</div>

:heavy_check_mark: [표 1]에서 확인할 수 있듯이 '18년 기준 피해 규모는 '14년 대비 8.1% 증가 <br>
:heavy_check_mark: 즉, 해마다 피해 규모가 전반적 증가 추세임을 알 수 있음 <br>
:heavy_check_mark: 동물 부분에서는 멧돼지, 고라니, 청설모 순으로 피해 규모가 큼 <br>
:heavy_check_mark: 새 부분에서는 꿩, 까치, 오리류 순으로 피해 규모가 큼 <br>
> :bangbang: 새도 과학적으로 동물에 포함되나, 해당 프로젝트에서는 동물은 새가 아닌 동물로 지정하여, 동물과 새로 구분하였음

## :fire: 개발 목적
:heavy_check_mark: 개발 배경을 통해 확인할 수 있는 피해 규모 완화 위해 사람이 직접 유해야생동물 포획 시 인건비, 안전 등 고려요소가 많음<br>
:heavy_check_mark: 이에 따라, 사람 이외의 피해 규모 완화 위한 무인 시스템 필요성을 느껴 해당 프로젝트 개발<br>

## :sweat_drops: 개발 설계
:one: __객체 탐지를 위해 AI 활용__<br>
:heavy_check_mark: 객체는 [사람/동물/새/사물]로 구분<br>
:heavy_check_mark: 객체 중 새 및 동물은 퇴치 대상에 해당 <br><br>

:two: __카메라 모드를 활용한 객체 촬영, 인식 및 구분__<br>
:heavy_check_mark: 주간에는 일반 카메라 모드, 야간에는 적외선 카메라 모드로 구분하여 객체 촬영, 인식 및 구분<br><br>

:three: __농경지와 퇴치 대상 사이 거리에 따른 퇴치 동작 다양화__<br>
:heavy_check_mark: 농경지 밖 0-5m 내에 있을 경우 : 퇴치 신호 활용하여 퇴치 진행<br>
:heavy_check_mark: 농경지 내 지면에 있을 경우 : 1-4단계 순서대로 퇴치 진행<br>
> :rotating_light: __1단계 : 고강도 조명 출력<br> :sound: 2단계 : 랜덤 퇴치 신호 출력<br> :zap: 3단계 : 고주파수 출력<br> :smiling_imp: 4단계 : 1~3단계 종합 출력__<br>
<br>
:four: __애플리케이션을 통한 퇴치 알림 서비스__<br>
:heavy_check_mark: 퇴치 대상 식별 및 퇴치 단계, 퇴치 여부를 농장 주인에게 알림<br> 

## :chart_with_upwards_trend: 순서도
<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/179218577-c5aa5d2d-a47b-4818-831c-6e1da456e6f2.JPG" alt="img2"/>
</div>

## :dart: 사용 Tool / 사이트 / 프레임워크

| 구분 | 사용 Tool / 사이트 / 프레임워크 |     
| :------: | :-----------------------------------------------:|
| 언어 | Python |
| 데이터 수집 | Python / Kaggle 등 |
| 데이터 train & test | Goolge Colab Pro & Yolov4 |
| 프론트엔드 | Raact.Js & Android Studio |
| 백엔드 | Node.Js|
| DB | MySQL|
| 데브옵스 | Github|
| 협업 tool| Jira |

## :factory: 개발 과정
:one: __Yolo v4 vs v5 선택__<br>
<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/179221837-d6928d6d-3a25-4477-b081-6f0d94b96021.JPG" alt="img3"/>
</div><br>

> :smiley: 참고 링크 : https://yong0810.tistory.com/30 <br>
:heavy_check_mark: v5로 선택할 시 좀 더 정확한 인식률 등을 기대할 수 있으나, 이것은 모델 성능 향상에 따른 인식률 등의 개선이지, 연구자 등의 노력으로 인한 개선이 아님<br>
:heavy_check_mark: 이러한 점과 연구 목적에 맞는 v4가 좀 더 합당하다고 판단하여 v4로 최종적으로 선택하였음<br>

<br>
:two: __yolov4의 Darknet으로 공부__ <br>

:heavy_check_mark: [velog 블로그](https://velog.io/@irish/Yolov4%EB%A5%BC-%ED%99%9C%EC%9A%A9%ED%95%9C-%EA%B0%9D%EC%B2%B4-%ED%83%90%EC%A7%80-%EA%B5%AC%ED%98%84) <br>
:heavy_check_mark: [정리 ipynb 파일 보기](https://github.com/whdms2008/FarmSecurity/blob/main/Team_AI/All/FarmSecurity_ipynb/220718/farmSecurity.ipynb) <br>

:three: __비교(IOU / Avg Loss / Accuracy / Iteratoin 캡처 등)__ <br>
--- 작성 해야 함 ---
<br><br>

:four: __에러 및 처리__ <br>
--- 작성 해야 함 ---
<br><br>

:five: __기타__ <br>
--- 작성 해야 함 ---
<br><br>

## :rocket: 성과 및 기대 효과
:one: __농작물 재배 편의성 측면__ <br>
:heavy_check_mark: 농경지 면적이 많은 전남, 경북 등의 농업 종사자에게 무인 시스템을 제공함으로써 농작물 피해 규모 완화<br><br>

:two: __지역 경제 활성화 측면__ <br> 
:heavy_check_mark: 질 좋은 농작물 재배 및 수출을 통해 지역 경제 활성화<br>
:heavy_check_mark: 양질의 농작물 재배를 통한 해외 농작물 수입 억제<br>

## :checkered_flag: 참여 대회
:one: __2022 KOAT 아이디어 경진대회__ <br>
> :running: [제출 파일 다운로드하러 가기](https://github.com/irishNoah/FarmSecurity_irish/blob/main/contest_exhibit/2022_KOAT/%EB%B0%95%EC%B0%BD%EC%98%81_2022_KOAT%ED%98%81%EC%8B%A0%EC%95%84%EC%9D%B4%EB%94%94%EC%96%B4%EA%B3%B5%EB%AA%A8%EC%A0%84_AI%EB%A5%BC%EC%9D%B4%EC%9A%A9%ED%95%9C%EB%86%8D%EC%9E%91%EB%AC%BC%ED%94%BC%ED%95%B4%EC%99%84%ED%99%94%EC%8B%9C%EC%8A%A4%ED%85%9C.hwp)
<br>

:two: __2022 청소년/청년 아이디어 경진대회__ <br>
> :running: [제출 파일 다운로드하러 가기](https://github.com/irishNoah/FarmSecurity_irish/blob/main/contest_exhibit/2022_%EC%B2%AD%EC%86%8C%EB%85%84%26%EC%B2%AD%EB%85%84/FarmSecurity(%EB%B0%95%EC%B0%BD%EC%98%81)_2022_%EC%B2%AD%EC%86%8C%EB%85%84%EC%B2%AD%EB%85%84_%EC%95%84%EC%9D%B4%EB%94%94%EC%96%B4_%EA%B2%BD%EC%A7%84%EB%8C%80%ED%9A%8C.hwp)
<br>










