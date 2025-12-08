 Branch 구조

🔵 main

배포용 브랜치

항상 안정된 코드만 유지

직접 커밋 금지

오직 develop → main merge만 허용

🟢 develop

기능 통합 브랜치

feature / fix / refactor 브랜치에서 완료된 작업이 merge됨

배포 전 최종 통합 코드가 존재

🌿 feature/*

기능 단위 개발 브랜치

develop에서 분기

UI, Controller, Service, Repository, DTO 등
해당 기능 구현에 필요한 전체 코드 세트 포함

해당 기능과 관련된 테스트 코드도 feature 브랜치에서 함께 개발

기능 완성 후 develop에 PR

merge 후 feature 브랜치 삭제

🛠 fix/*

버그 수정 브랜치

develop에서 분기

오류·예외 상황·로직 문제 해결 시 사용

완료 후 develop에 merge 및 브랜치 삭제

🔁 refactor/*

리팩토링 전용 브랜치

기능 변경 없이 코드 구조 개선, 성능 향상, 공통화 등

완료 후 develop에 merge

📝 docs/*

문서 작업 브랜치

README, API 명세, ERD 변경 등 문서만 수정할 때 사용

develop에 merge 후 삭제


🧩 Branch Workflow

feature/*   ┐
fix/*       ├──→ develop → main(배포)
refactor/*  ┘


기능 개발 → develop 통합 → main 배포 흐름이 명확합니다.


📝 Commit Convention

✔ 형식
type: description

영어

명령형(add, fix, update…)

✔ Commit Types
타입	설명	예시
feat	기능 추가	feat: add sales chart
fix	버그 수정	fix: correct stock amount calc
style	UI/스타일 변경(기능 영향 없음)	style: update table layout
refactor	코드 구조 개선	refactor: simplify sales service logic
docs	문서 변경	docs: update ERD schema
test	테스트 코드 추가/수정 (feature 내부에서 작성)	test: add item repository test
delete	불필요 파일 삭제	delete: remove unused dto
revert	커밋 되돌림	revert: undo wrong price calculation
wip	작업중 커밋	wip: implement manager filter
merge	머지 커밋	merge: feature/menu into develop

※ test 커밋은 feature 브랜치 안에서만 사용하고 test/ 브랜치는 만들지 않음*
