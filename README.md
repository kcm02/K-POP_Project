# K-POP_Project

일반 회원가입 -> 이름, 닉네임, 나이, 지역 등의 정보를 전부 입력 후 가입
OAuth 로그인 -> 구글, 네이버 등을 통한 로그인 성공 -> 추가 정보를 입력 후 가입

추가 정보 입력 전까진 Role을 Guest로 설정, 입력 후 가입시 User로 업데이트 예정
(회원가입, 로그인 구현이므로 Admin은 Role에 만들어놓기만 했습니다!)

OAuth는 <구글, 네이버, 카카오> 총 3개로 구현했습니다.

※혹시 모를 수정을 위해 db를 create(프로젝트 실행할 때마다 초기화)로 설정했습니다.
향후 update로 변경 예정
