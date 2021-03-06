# 망작선
https://mangjakseon.com/</br>
 프로젝트 명: 망작선</br>
 맡은부분: 리뷰작성, 리뷰 페이지 제작</br>
 팀원: 심동수 외 5명</br>
 프로젝트 기간: 4주 </br>
 + 프로젝트 기획
   + TMDB사이트의 API를 가져와서 낮은 평점(6점이하, 망작)의 영화를 리뷰하는 사이트를 제작
   + TMDB평점과 본 사이트의 평점 동시 제공
   + 망작(6점이하)중 인기있는 영화 추천
   + 영화에 리뷰를 남겨 의견 공유
   + 유튜버(거의없다)의 걸(乞)작선에 있는 영화 제공

# 일정계획
![일정계획](https://user-images.githubusercontent.com/102348698/179400953-1c2a0ec3-4399-4c87-948a-2e0708c1d2a9.png)

# 최초 UI설계서
![Image 1](https://user-images.githubusercontent.com/102348698/179400892-907f74e4-cd29-4f40-8c6f-60fb7d1552d1.png)
![Image 2](https://user-images.githubusercontent.com/102348698/179400894-9467825b-64f9-47f4-a35e-284ccb0c9a03.png)
![Image 3](https://user-images.githubusercontent.com/102348698/179400897-6c7a0177-f34e-4809-bc4f-01f3779003e8.png)
![Image 4](https://user-images.githubusercontent.com/102348698/179400899-35ff2029-2029-4af6-899b-e77f5dbf7113.png)
![Image 5](https://user-images.githubusercontent.com/102348698/179400900-0a43a2c1-95f8-4b87-841f-ff95fce41010.png)
![Image 6](https://user-images.githubusercontent.com/102348698/179400901-87eb7d36-dd43-4212-82ea-e472b738d8e2.png)
![Image 7](https://user-images.githubusercontent.com/102348698/179400902-dfaf784e-d855-4112-b7c2-0a08387a512c.png)
![Image 8](https://user-images.githubusercontent.com/102348698/179400904-d628c1f1-0216-430a-bf7a-91f4b18db93a.png)
![Image 9](https://user-images.githubusercontent.com/102348698/179400906-3fc74cce-bfaa-406d-a6fe-c97e2f7dabe0.png)

# ERD
![이알디](https://user-images.githubusercontent.com/102348698/179401408-f7aa95ed-0771-40f3-800a-70794a3720e6.png)

# 개발환경
**FrontEnd**
```
HTML5, CSS3, JavaScript, JQuery, Thymeleaf, BootStrap, Ajax
```
**BackEnd**
```
JAVA, SpringBoot, Spring-Security, Gradle, JPA
```

**DB**
```
MariaDB
```

**WAS**
```
Apache Tomcat 9
```
 
# 개발 중 오류 와 해결방안(리뷰관련)
1. 별점 기능과 리뷰 쓰기 기능을 통합할 때 겪었던 어려움 리뷰쓰기와 별점기능을 따로 개발을 했기에 통합시 어려움을 겪음.

   해결 - 리뷰 entity에 별점 컬럼을 추가하고 dto,repository, service, controller 도 순차적으로 수정 하였음.
   
2. 리뷰 작성시 리뷰 데이터가 DB에는 저장 되지만 list를 불러오는 과정에서 오류가 발생

   해결 - ReviewController에서 리뷰목록의 MediaType을 APPLICATION_JSON_VALUE를 이용하여 JSON형태로 불러오도록 제작
   
3. 최근에 등록한 리뷰를 가장 윗 부분에 출력하는 Query 작성시 오류 발생

   해결 - Query작성시 내림차순으로 정렬이 되지만 movieId에 해당하는 리뷰만 출력되는 것이 아닌 모든 리뷰가 출력되는 현상이 나타났었고 Query 사용이 미숙하다고 판단 되어 method 명명규칙을 사용하여 해결


