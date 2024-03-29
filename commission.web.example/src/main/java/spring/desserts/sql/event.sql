CREATE TABLE events (
	id INT AUTO_INCREMENT NOT NULL,
    type CHAR(4) NOT NULL,
    title VARCHAR(50) NOT NULL,
    period VARCHAR(23) NOT NULL,
    PRIMARY KEY(id)
);

INSERT INTO events(type, title, period) VALUES
('제휴혜택', '이제 스위트에서도 애플페이', '상시운영'),
('프로모션', '1월 이달의 맛, 인스타그램에 사진을 올려주세요!', '2024-01-01 ~ 2024-01-26'),
('프로모션', '스위트 신년 맞이 행운 부적을 나눠주세요!', '2024-01-05 ~ 2024-01-28'),
('제휴혜택', '2024 KT 멤버십 스위트 특별한 제휴 혜택!', '상시 운영'),
('프로모션', '1월 스위트데이 럭키드로우 추가 혜택!', '2024-01-04 ~ 2024-01-10'),
('프로모션', 'X-MAS 케이크 구매 시 하트베어 테디백 8,900원!', '2023-12-08 ~ 소진 시까지'),
('프로모션', '아이스크림 스쿱퍼, 해피앱 스캔 시 3천 원 OFF!', '2023-09-04 ~ 소진 시까지'),
('제휴혜택', 'T멤버십 회원 대상 싱글레귤러 최대 50% 할인 또는 적립', '상시 운영'),
('제휴혜택', '해피앱에서 5% 적립 놓치지 마세요!', '상시 운영'),
('프로모션', '아이스크림 보냉 컨테이너 매장판매 시작!', '2023-07-05 ~ 소진 시까지'),
('프로모션', '1회용 컵 사용 줄이기 안내', '상시 운영');