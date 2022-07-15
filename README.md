# 프로젝트 소개

## 프로젝트 주제
> AI를 이용한 농작물 피해 완화 시스템

## 개발 배경
![동물별 농작물 피해 규모](https://user-images.githubusercontent.com/80700537/179216377-5c0d525e-64dd-4a1e-8bd0-22841a7d0f2d.JPG)
> [표 1] : 동물별 농작물 피해실태(환경부 생물다양성과/연도별 유해생물에 의한 피해현황(2014~2018)/2019)

- [표 1]에서 확인할 수 있듯이 '18년 기준 피해 규모는 '14년 대비 8.1% 증가
- 즉, 해마다 피해 규모가 전반적 증가 추세임을 알 수 있음
- 동물 부분에서는 멧돼지, 고라니, 청설모 순으로 피해 규모가 큼
- 새 부분에서는 꿩, 까치, 오리류 순으로 피해 규모가 큼
> 새도 과학적으로 동물에 포함되나, 해당 프로젝트에서는 동물은 새가 아닌 동물로 지정하여, 동물과 새로 구분하였음

## 개발 목적
- 개발 배경을 통해 확인할 수 있는 피해 규모 완화 위해 사람이 직접 유해야생동물 포획 시 인건비, 안전 등 고려요소가 많음
- 이에 따라, 사람 이외의 피해 규모 완화 위한 무인 시스템 필요성을 느껴 해당 프로젝트 개발

## 개발 설계
1. 객체 탐지를 위해 AI 활용
- 객체는 [사람/동물/새/사물]로 구분
- 객체 중 새 및 동물은 퇴치 대상에 해당 <br><br>
2. 2단계 카메라 모드를 활용한 객체 촬영, 인식 및 구분
- 주간에는 일반 카메라 모드, 야간에는 적외선 카메라 모드로 구분하여 객체 촬영, 인식 및 구분<br><br>
3. 농경지와 퇴치 대상 사이 거리에 따른 퇴치 동작 다양화
- 농경지 밖 0~5m 내에 있을 경우 : 퇴치 신호 활용하여 퇴치 진행
- 농경지 내 지면에 있을 경우 : 1~4단계 순서대로 퇴치 진행 
  - 1단계 : 고강도 조명 출력
  - 2단계 : 랜덤 퇴치 신호 출력
  - 3단계 : 고주파수 출력
  - 4단계 : 1~3단계 종합 출력
<br><br> 
4. 애플리케이션을 통한 퇴치 알림 서비스
- 퇴치 대상 식별 및 퇴치 단계, 퇴치 여부를 농장 주인에게 알림 

## 순서도
![FarmSecurity_FlowChart](https://user-images.githubusercontent.com/80700537/179218577-c5aa5d2d-a47b-4818-831c-6e1da456e6f2.JPG)

## 개발 tool
