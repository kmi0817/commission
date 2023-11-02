# dropdown-menu

- 동작 화면

![ezgif com-video-to-gif](https://github.com/kmi0817/dropdown-menu/assets/62174395/9011c068-1d2b-419f-be95-f111cb5cfe8e)

## CSS: `@import` vs `link`

- HTML 파일에 여러 CSS 파일을 `@import`하는 방식을 택했습니다.
- `@import`는 CSS 파일 내에서 다른 CSS 파일을 가져오기 때문에 HTML 파일에는 딱 한 개의 CSS 파일만 link할 수 있어 깔끔합니다.
- 그러나 여러 개의 CSS 파일을 가져올 때 `@import`는 직렬 로딩 방식, 즉 순차적으로 하나씩 불러오기 때문에 페이지 로딩 속도가 저하될 수 있습니다.
- 반면 `link`는 병렬 로딩 방식이라서 페이지 로딩 속도가 더 빠르고 효율적입니다.
- 하지만 아직은 CSS 양이 많지 않고, 데모용이기 때문에 보기에 더 깔끔한 `@import`를 선택하였습니다.
