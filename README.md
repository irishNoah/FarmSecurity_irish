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

## 🐟 H/W & S/W 구성도<br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/186291096-df9253c7-dadf-42e8-898d-3786f0734994.JPG" width="800" height="500"/>
</div><br>

✔️ 라즈베리(카메라)는 실시간으로 영상 촬영 및 AI 모듈에 영상 제공<br>
✔️ AI 모듈은 실시간으로 객체 탐지 실행. 만약 탐지 객체가 동물 또는 새일 경우 퇴치 단계에 따라 라즈베리(빛) 또는 라즈베리(스피커) 제어<br>
✔️ 라즈베리(빛) 또는 라즈베리(스피커)는 AI 모듈의 제어 신호에 따라 작동됨<br>
✔️ AI 모듈은 동물 또는 새 탐지 시 [카메라 일련번호 / 탐지 객체 캡처 링크 / 퇴치 단계 / 탐지 시간] 정보를 서버(=Spring Boot)에 송신<br>
✔️ 서버는 실시간으로 AI 모듈에서 보내는 정보를 감지. 감지된 정보가 있을 경우 해당 정보를 DB 삽입. 또한 이 정보를 사용자에게 알림{-> 탐지 객체 있을 경우 사용자가 알아야 하므로}<br>
✔️ 사용자가 과거 기록 확인 요청할 경우 해당 요청 정보 확인 가능<br>

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

## 🚥 Yolo 설정
### 🎏 __Yolo v4 vs v5 선택__<br>
<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/179221837-d6928d6d-3a25-4477-b081-6f0d94b96021.JPG" alt="img3"/>
</div><br>

> :smiley: 참고 링크 : https://yong0810.tistory.com/30 <br>
:heavy_check_mark: v5로 선택할 시 좀 더 정확한 인식률 등을 기대할 수 있으나, 이것은 모델 성능 향상에 따른 인식률 등의 개선이지, 연구자 등의 노력으로 인한 개선이 아님<br>
:heavy_check_mark: 이러한 점과 연구 목적에 맞는 v4가 좀 더 합당하다고 판단하여 v4로 최종적으로 선택하였음<br>

### 🎫 __yolov4의 Darknet을 활용한 객체 탐지__  <br>
:heavy_check_mark: [객체 탐지 과정 설명 블로그](https://velog.io/@irish/Yolov4%EB%A5%BC-%ED%99%9C%EC%9A%A9%ED%95%9C-%EA%B0%9D%EC%B2%B4-%ED%83%90%EC%A7%80-%EA%B5%AC%ED%98%84) <br>
:heavy_check_mark: [정리 ipynb 파일 보기](https://github.com/whdms2008/FarmSecurity/blob/main/Team_AI/All/FarmSecurity_ipynb/220718/farmSecurity.ipynb) <br>

# :factory: 학습
## :one: __학습 Dataset 개수 차이에 따른 비교__ <br>
:heavy_check_mark: 학습을 진행할 때마다 weights 파일 생성. Iteration을 중점으로 1000단위마다 파일 생성<br>
- 예) yolov4-1000.weights / yolov4-3000.weights 등<br>

:heavy_check_mark: 이 weights 파일을 통해 Avg Loss, mAP, IoU 등을 알 수 있음<br>
:heavy_check_mark: 보통 6000 Itertaion으로 많이 채택하여 사용<br>

__1) 이미지 수 기준(150장 vs 750장)__ <br>
:heavy_check_mark: 새 / 동물 / 사람 별 각 50장 씩 추출한 총 150장과, 각 150장 씩 추출한 총 750장 간 학습 및 실험에서 Iteration에 따른 Avg Loss 및 IoU 측정 <br><br>

__#1 Avg Loss, IoU 측면__ <br>

__1. 150장__
<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/180736911-2fbc9124-587a-479b-b452-22a9e43c27c0.png" alt="50_dataset_6000_train_chart" width="500" height="500"/>
</div>

:stars: 위 표에서 파란색 선은 Avg Loss, 빨간색 선은 IoU를 지칭<br>
:stars: 150장에서 Avg Loss는 Iteration이 커질수록 감소, IoU는 Itration이 커질수록 증가<br><br>

__2. 750장__
<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/180737017-ea6835b5-eedc-4803-8f47-a45de30a0895.png" alt="250_dataset_6000_train_chart" width="500" height="500"/>
</div>

:stars: 각 선이 의미하는 바는 150장의 표와 동일<br>
:stars: 150장과 동일하게 750장에서도 Avg Loss는 Iteration이 커질수록 감소, IoU는 Itration이 커질수록 증가<br><br>

__3. 공통점__ <br>
:stars: 이미지 수와 상관없이 Iteration이 증가할수록, 대부분 Avg Loss는 감소 / IoU는 증가한다는 점을 알 수 있음<br><br><br><br>

__#2 mAP 측면__

__1. 이미지 수 기준(총 150장 vs 총 750장)__ <br>
:heavy_check_mark: 150장, 750장 훈련에서 발생한 각 6000.weights 파일 기준으로 test하여 mAP 측정 진행<br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/180740427-84b54fec-7707-448b-a892-021542efb56e.JPG" alt="250vs750_mAP_chart" width="800" height="350"/>
</div>

:stars: 150장의 mAP는 58.87%인 반면, 750장은 mAP가 70.97%로 약 12% 정도 차이를 보임<br>
:stars: 750장이 확실히 mAP가 높은 것을 알 수 있음<br>
:stars: 이를 통해 사진 수가 많을수록 mAP가 높다는 것을 알 수 있음<br><br><br>

__2) Iteration 기준(6000번 vs 9000번)__ <br>
:heavy_check_mark: 동일한 이미지 수에서 Iteration이 차이날 경우 Avg Loss, IoU의 수치는 상호 간 약간의 차이가 있을 수 있으나 6000번과 9000번의 그래프 형상은 비슷한 모습이므로, Avg Loss와 IoU는 생략하였음<br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/180742261-78b76660-9b3c-4112-9ddb-2e81632df34b.JPG" alt="6000Iterationvs6000Iteration_mAP_chart" width="800" height="350"/>
</div>

:stars: 이미지 수가 차이났을 때의 mAP는 확연한 차이가 있었으나, 이미지 수가 동일한 상황 속에서 Iteration이 3000번 정도나 차이가 남에도 불구하고 두 mAP의 차이는 1.2정도밖에 나지 않음<br>
:stars: 즉, Iteration의 차이는 mAP에 큰 영향을 미치지 않는다는 것을 알 수 있음<br>

<br>

## :two: 기법을 적용한 정확도 개선 확인 <br>
✔️ 1️⃣에서 확인할 수 있듯이 이미지 수를 늘릴수록, mAP 등 정확도가 높아진다는 것을 알 수 있음 <br>
✔️ 이미지 수만 늘려서 정확도를 높이기보다, 특정 기법을 적용해서 정확도를 높이기 위한 방식을 찾아보았음 <br>
✔️ sharpning 기법, 차영상 기법, sobel 기법을 적용하여 test를 진행하였음 <br>

### 🔪 sharpning 기법 <br>
✔️ ["sharpning"이란](https://marisara.tistory.com/entry/%ED%8C%8C%EC%9D%B4%EC%8D%AC-openCV-13-%EB%B8%94%EB%9F%AC%EB%A7%81blurring%EC%8A%A4%EB%AC%B4%EB%94%A9smoothing%EC%83%A4%ED%94%84%EB%8B%9Dsharpening)  <br>
✔️ sharpning 기법을 적용한 결과는 아래와 같음 <br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/185849277-7f990217-69c1-4b6e-a371-376ca7889cd7.JPG" width="300" height="300"/>
</div> <br>

🌠 750장 test시 사용했던 동일한 Dataset에 sharpning 기법을 적용 후 train하였고, 이 중 6000.weights 파일 기준으로 test하여 mAP 측정 진행한 것임<br>
🌠 아무 기법 적용하지 않은 750장 mAP 결과보다, sharpning 기법을 적용한 mAP가 약 10% 정도 낮은 것을 확인할 수 있음<br>

### 📹 차영상 기법 <br>
✔️ ["차영상"이란](https://www.geeksforgeeks.org/python-background-subtraction-using-opencv/) <br>

#### 차영상 결과
<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/185859034-ec9be1ba-6703-49f4-b088-1681bd10b9e3.JPG" width="700" height="300"/>
</div> <br>

🌠 왼쪽 사진에서 빨간 사각형이 있는 부분이 탐지된 객체임 <br>
🌠 오른쪽 사진에 보이는 흰색 부분이 탐지된 객체 부분에 해당되며, 검정색 부분은 그 외의 부분에 해당됨

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/185859155-da9c55c5-f216-4ab8-88c5-302308e351fb.JPG" width="700" height="300"/>
</div> <br>

🌠 왼쪽 사진에 있는 흰색 부분에 원본과 겹치는 부분이 들어가게 됨. 하지만 여기서는 객체가 탐지되지 않는 것을 확인할 수 있음<br>
🌠 예상 문제로는 이미지가 작아서 주변 잡음에 쉽게 영향을 받기 때문인 것으로 추측됨. 확대하니 인식이 잘 되긴 하지만, 객체 인식 때마다 이렇게 하는 것은 매우 비효율적인 방식에 해당됨.<br>
🌠 이에 따라 차영상에 관한 mAP는 따로 생성하지 않았음<br>

### 🔮 sobel 기법 <br>
✔️ ["sobel"이란](https://deep-learning-study.tistory.com/205)  <br>
✔️ sobel 기법을 적용한 결과는 아래와 같음 <br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/185861525-a0d738c5-ba70-4a03-83f5-ec7c2712da0d.png" width="300" height="300"/>
</div> <br>

🌠 750장 test시 사용했던 동일한 Dataset에 sobel 기법을 적용 후 train하였고, 이 중 6000.weights 파일 기준으로 test하여 mAP 측정 진행한 것임<br>
🌠 아무 기법 적용하지 않은 750장 mAP 결과보다, sobel 기법을 적용한 mAP가 약 13~14% 정도 낮은 것을 확인할 수 있음<br>

## 3️⃣ 명확한 전처리를 통한 정확도 개선  <br>
✔️ 2️⃣ 에서 확인할 수 있듯이 sharpning, 차영상, sobel 기법을 통해 정확도가 개선되지 않음을 알 수 있음<br>
✔️ 이에 특정 기법을 적용해서 정확도 개선을 기대하기 보다는, 더 명확한 전처리를 통해 개선을 기대하기로 함<br>
✔️ 맨 처음 150장, 750장을 학습시키기 위한 전처리는 labeling과 각 이미지 속에 있는 객체 좌표값만 있었음<br>
✔️ 이에 따라, 아래와 같은 방식으로 전처리를 진행하였음<br>

### 🍑 이전 전처리 방식과 달라진 점<br>
🌠 __416*416으로 모든 데이터 크기 맞추기 및 좌표 재설정__ <br>
- 이전에는 각 이미지의 크기가 달랐고, cfg 파일에서 416*416 사이즈로 입력받도록 하였음<br>
- 하지만, 객체 좌표값은 기존 이미지 크기에 입각한 좌표값인데, 416*416 사이즈로 변경될 경우 이 좌표값과 matching이 안되는 경우가 발생<br>
- 이에 따라 cfg에서 resize를 진행하기 보다, 애초에 모든 이미지 size를 416*416으로 조정<br>
- 이후 이 사이즈 규격을 기반으로 객체 좌표값 산출<br>

🌠 __해상도 높이기(bilateralFilter)__ <br>
- [이미지 속 객체 해상도 높이기 참고 링크](https://deep-learning-study.tistory.com/164) <br>
- 해상도를 높이면 학습 효과가 더 올라가는 경우가 존재함에 따라 해상도를 높임<br>

🌠 __cfg 파일도 재설정__ <br>
- cfg 파일 점검 재진행<br>

🌠 __animal, bird, human 클래스 데이터별로 train, test, valid 크기 맞추기__ <br>
- 예전 학습 때에는 한 Dataset 파일에 animal, bird, human 클래스 데이터를 넣고 train, test, valid를 임의로 6:2:2 비율로 나누었음<br>
- 이럴 경우, 각 클래스 데이터별로 6:2:2로 나누어지는 것이 아니기 때문에, 특정 클래스 데이터가 더 많은 학습 데이터에 사용될 수도 안될수도 있음<br>
- 이에 따라, 클래스 데이터별로 폴더로 나누어 train, test, valid를 6:2:2 비율로 정확히 나누었음<br>
- 이로 인해 모든 클래스 데이터가 공평한 이미지 수로 학습에 참여할 수 있게 되었음<br>

🌠 __yolov4 정확도 높이기(cfg 관련) 적용__ <br>

### 🎸 달라진 결과 확인<br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/186552231-3e3637c5-888a-4ba1-9bf3-f59944a1a5ba.png" width="350" height="350"/>
</div> <br>

- 학습 때 사용한 Dataset은 이전 전처리 방식의 750장 Dataset과 동일함<br>
- 이전 전처리 방식에서의 mAP는 약 71%였던 것에 비해, 이번 전처리 방식에서의 mAP는 약 77%로 6% 가량 오른 것을 확인할 수 있음<br>
- 이를 통해, 명확한 전처리 방식이 학습 효과 향상에 기여한다는 것을 확인할 수 있음<br>

### 🎰 Number of objects per class (클래스별 탐지 객체 수)

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/186587636-5cbdfe8e-6471-45ae-b3c5-a16e4e423438.png" width="450" height="350"/>
</div> <br>

- True Positive(이하 TP) : 예측을 잘함<br>
- False Positive(이하 FP) : false 인데 positive로 판단<br>
- bird의 FP/TP+FP는 약 0.18을 기록<br>
- animal의 FP/TP+FP는 약 0.11을 기록<br>
- human의 FP/TP+FP는 약 0.19를 기록<br>
- 즉, bird와 human의 오탐율은 비교적 높고, animal의 오탐율은 비교적 낮음을 확인할 수 있음<br>

## 4️⃣ Yolo의 한계점 <br>
✔️ [Yolo의 한계 관련 참고 링크](https://deepbaksuvision.github.io/Modu_ObjectDetection/posts/04_01_Review_of_YOLO_Paper.html) <br>
✔️ 주로 농경지에 animal과 human이 때를 지어 다니는 경우는 없으나, bird는 때를 지어 다니는 경우가 빈번함 <br>
✔️ 이에 따라, 한 이미지 속에 bird가 많은 것으로 test를 진행할 경우, 일부는 새로 인식하나, 새로 인식하지 못한 개체들도 많았음<br>
✔️ YOLO 문제점은 각 그리드 셀마다 오직 하나의 객체만을 검출할 수 있다는 것임. 이는 객체 검출에서 아주 강한 공간적 제약(spatial constraints)에 해당됨. 이러한 공간적 제약으로 인해 YOLO는 '새 떼'와 같이 작은 객체들이 무리 지어 있는 경우의 객체 검출이 제한적일 수 있음<br>

## 5️⃣ 날씨 및 빛 세기에 따른 이미지 생성 & Test <br>
:heavy_check_mark: 날씨(눈/비), 빛 세기(일출&일몰/밤)가 객체 인식에 영향을 줄 수 있음 <br>
:heavy_check_mark: 이에 따라, 각 종류별 250장을 눈/비/일출&일몰/밤 필터 총 4개와 합성하여 1000장의 이미지를 생성 <br>

__1. 이미지 생성__  <br>
:stars: 각 필터와, 동일한 동물 이미지에 대한 결과는 아래 순서와 같음  <br>
:stars: 결과 이미지는 흑백 처리까지 한 결과임  <br>

__#1 이미지 필터__  <br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/180904419-008b90d7-005c-4c4c-b597-04960853f0f6.JPG" alt="img-filters" width="500" height="300"/></div>

__#2 결과 이미지__  <br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/80700537/180904530-f19a422f-12e5-4581-a4ab-17bd652ea076.JPG" alt="img-filters-results" width="500" height="300"/></div> <br><br>
  
__2. 이미지 Test__ <br>
#참고 자료 <br>
1. [전·후처리를 이용한 딥러닝 기반의 주차여부인식](https://www.kci.go.kr/kciportal/ci/sereArticleSearch/ciSereArtiView.kci?sereArticleSearchBean.artiId=ART002519323) <br>
2. [파이썬 코드를 이용한 파이카메라 제어](https://neosarchizo.gitbooks.io/raspberrypiforsejonguniv/content/chapter4.html) <br>

--- 추가 작성 해야 함 --- <br>
<br><br> 

## 객체 인식 정보() 서버에 송신하기
- Yolo에서 동물 또는 새를 인식하면, 이에 대한 정보(예 : 객체 탐지 시간 / 탐지 객체 캡처 사진) 등을 최종적으로 클라이언트에 보여주기 위해 이 값들을 서버에 보내주어야 한다. 객체 탐지 시간 등에 대한 정보는 단순 text이기 때문에 이를 처리하는 과정은 단순하다. 하지만, 캡처된 이미지 자체를 보내주는 것은 어렵다. 이를 해결하기 위해서는 캡처 이미지를 공개 URL 등을 통해 다른 곳에서도 쉽게 접근해야 할 것이다. 이에 대한 과정을 ~~~ 


### 4️⃣ __사용자에게 객체 인식 이미지 보여주기__ <br>

<br><br> 

### 6️⃣ __에러 및 처리__ <br>
--- 작성 해야 함 ---
<br><br>

### 7️⃣ __기타__ <br>
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










