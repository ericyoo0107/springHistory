# ์คํ๋ง MVC 1ํธ

## ๐ ์๋ธ๋ฆฟ
HTTP ๋ฉ์ธ์ง์ ํ์ฑ๊ณผ์ ์ HttpServletRequest๋ฅผ ํตํด ์ฝ๊ฒ ๋ง๋ค์ด์ค ํ์ง๋ง ํด๋ผ์ด์ธํธ์๊ฒ ๊ฐ์ ๋ณด์ฌ์ค๋ ์๋ฐ ์ฝ๋์์ html์ ๋ฃ์ด์ผ ํ๋ค๋ ์ ์ด ๋๋ฌด ๋ถํธํ์

## ๐ jsp
๊ฒฐ๊ณผ์ ์ผ๋ก ๋ค ์๋ธ๋ฆฟ์ผ๋ก ๋ฐ๋์ง๋ง HTTP๋ฅผ ์ผ์ผ์ด getwriter+write ํ ํ์๊ฐ ์์ด์ ์๋ธ๋ฆฟ ๋ณด๋ค ํธํ๋ค ์๋ธ๋ฆฟ์ ์๋ฐ๊ฐ ๋ฉ์ธ์ html์ด ์๋ธ์ธ ๋๋์ด๋ผ๋ฉด jsp๋ html์ด ๋ฉ์ธ์ ์๋ฐ๊ฐ ์๋ธ์ธ ๋๋์ด๋ค. 
ํ์ง๋ง ์ด๊ฒ ๋ํ ์๋ฐ๋ก์ง๊ณผ html๋ก์ง์ด ์์ฌ ์๊ธฐ ๋๋ฌธ์ ์ ์ง๋ณด์ํ๊ธฐ๊ฐ ์ด๋ ค์ ๋ณด์๊ณ  ํ๋์ ํ์ผ์ด ์ฌ์ด์ฆ๊ฐ ๋๋ฌด ์ปค์ง๊ฒ ๊ฐ์๋ค

## ๐ MVC ๋ชจ๋ธ(controller:์๋ธ๋ฆฟ + view:jsp)
ํ์คํ jsp์ ํ๊บผ๋ฒ์ ์ฝ๋๋ฅผ ๋ฃ๋๊ฒ๋ณด๋จ ์ ์ง๋ณด์๊ฐ ํธํด๋ณด์๋ค
์ ์ง๋ณด์์๋ ๋์์ธ ๊ด๋ จ ๋ถ๋ถ์ด ์์๋๋ ์๊ณ  ๋ก์ง ๋ถ๋ถ์์ ๋ณด์๋ฅผ ํด์ผํ  ์ํฉ์ด ๋ฐ๋ก ์๋๋ฐ ์ด ๋์ ๋ถ๋ฆฌ ํ๊ธฐ ๋๋ฌธ์ด๋ค. ํ์ง๋ง
์๋ธ๋ฆฟ์์ ๊ฐ์ ๋ฐ์์ getattributeํ๊ณ  request.getRequestDispatcher("jsp์์น").forward(request, response)๊ฐ ๋๋ฌด ๋ฐ๋ณต๋๋ ๋๋์ ๋ฐ์๋ค. 

## ๐ 1์ฐจ ๋ฆฌํฉํ ๋ง
FrontController๋ผ๋ ๊ฐ๋์ ๋์ํด์ ์๋ธ๋ฆฟ๋ถ๋ถ(์ปจํธ๋กค๋ฌ ๋ถ๋ถ)์ ์ฌ์ฉ์๊ฐ ์์ฒญ์ ํ๋ฉด ๋ฐ๋ก ํด๋น ์ปจํธ๋กค๋ฌ๋ก ๊ฐ๋๊ฒ ์๋๋ผ 
๊ณตํต๋ ๋ถ๋ถ์ ์ฒ๋ฆฌํ๊ณ  ์ปจํธ๋กค๋ฌ๋ก ๊ฐ๋๋ก ๊ตฌ์กฐ๋ฅผ ๋ฐ๊พธ์๋ค ํ์คํ ์ด์ ๋ณด๋ค ์ฝ๋๊ฐ ๊น๋ํด์ก๋ค

## ๐ 2์ฐจ ๋ฆฌํฉํ ๋ง
์ปจํธ๋กค๋ฌ์์ view๋ก ์ด๋ํ๋ ๋ถ๋ถ์ ํด๋์ค๋ก ๋ฝ์๋ค(myview)

## ๐ 3์ฐจ ๋ฆฌํฉํ ๋ง
1. ์๋ธ๋ฆฟ์ ์ข์์ ์ด์ง ์๊ฒ modelview ๊ฐ์ฒด๋ฅผ ๋ง๋ค๊ณ  FrontController๋ง ์๋ธ๋ฆฟ์ ์ฌ์ฉํ๋๋ก ๋ง๋ค์๋ค  
2. view๋ก ์ด๋ํ๋ ์ด๋ฆ์ view resolver๋ก ์ค๋ณต๋ถ๋ถ์ ๋ฝ์ ๋ด์๋ค

## ๐ 4์ฐจ ๋ฆฌํฉํ ๋ง
์ปจํธ๋กค๋ฌ๊ฐ modelview ๊ฐ์ฒด๋ฅผ FrontController์๊ฒ ๋ฐํํ๋๊ฒ์ด ์๋๋ผ ๋ผ๋ฆฌ ์ด๋ฆ์ ๋ฐํํ๋๋ก ํ์๋ค. modelview๋ฅผ ๋ง๋๋ ๋ถ๋ถ์ด ์ปจํธ๋กค๋ฌ์์ ์์ด์ ธ์ ํจ์ฌ ์ฝ๋๊ฐ ๊น๋ํด์ก๋ค

## ๐ 5์ฐจ ๋ฆฌํฉํ ๋ง
3์ฐจ ๋ฆฌํฉํ ๋งํ ๋ด์ฉ๊ณผ 4์ฐจ ๋ฆฌํฉํ ๋งํ ๋ด์ฉ์์ ๊ฐ๊ฐ ์ปจํธ๋กค๋ฌ๋ค์ด ๋ฐํํ๋๊ฐ์ด ๋ค๋ฅธ๋ฐ(modelview, ๋ผ๋ฆฌ ์ด๋ฆ) ์ด๋ฅผ ์ด๋ํฐ๋ผ๋ ๊ฐ๋์ ์ด์ฉํด์ ์๋ก ๋ค๋ฅธ ๊ฐ์ ๋ฐํํ๋ ์ปจํธ๋กค๋ฌ๋ค์ 
modelview๋ฅผ ๋ฐํํ๋๋ก ๋ฐ๊พธ์๋ค. ์ปจํธ๋กค๋ฌ๋ผ๊ธฐ ๋ณด๋จ ํธ๋ค๋ฌ์ ๊ฐ๊น์ด ๊ฐ๋์ด ๋์๋ค.

## ์ดํด๊ฐ ๋์ง ์์๋ ๋ถ๋ถ
request, response์ ์ข์์ ์ด์ง ์์ผ๋ฉด ๋ฌด์์ด ์ข์๊ฒ์ธ๊ฐ? 
1. ํ์คํธ์ ์ฉ์ดํจ 

ํธ๋ค๋ฌ๋?  ์๋์ฐจ์ ํธ๋ค๊ณผ ๋ง์ฐฌ๊ฐ์ง๋ก ํด๋ผ์ด์ธํธ์ ์์ฒญ์ ์ฒ๋ฆฌํ๋ ์ฒ๋ฆฌ์
