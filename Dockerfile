# 베이스 이미지를 선택
FROM public.ecr.aws/amazoncorretto/amazoncorretto:21

# 작업 디렉토리 지정, 해당 디렉토리가 없으면 새로 생성
# 이 이후 명령어는 해당 디렉토리 기준으로 동작
WORKDIR /app

# 도커로 생성된 컨테이너에서 열어줄 포트 지정
# 컨테이너 생성 시 -p 옵션으로 포트 expose 값 지정
EXPOSE 8080

# copy/add 빌드 명령 중간에 호스트 파일 or 폴더를 이미지에 전달
# add 명령은 압축 파일이나 네트워크 상의 파일도 사용 가능, 보통은 copy 권장
COPY build/libs/cicd-0.0.1-SNAPSHOT.jar cicd.jar

# cmd / entrypoint 컨테이너 생성 및 실행 할 때 명령어
# cmd 컨테이너 생성할 때만 실행
# entrypoint 컨테이너 시작 할 때 실행
CMD ["java", "-jar", "cicd.jar"]
