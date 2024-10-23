

// 변수
// 입력창
const emailInput = document.getElementById("email");  // 매번 요소 불러오기 번거로우니까 변수에 저장
const pwInput = document.getElementById("password");
const confirmPwInput = document.getElementById("confirmPassword");

// 에러창
const emailError = document.getElementById("emailError");
const pwError = document.getElementById("pwError");
const confirmPwError = document.getElementById("confirmPwError");


// 함수
// 이메일 유효성 검사 함수
function validateEmail(email) {
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return emailPattern.test(email);  // email이 정규표현식에 맞는지 테스트 
}

// 비밀번호 유효성 검사 함수
function vaildatePassword(pw) {
    const pwPattern = /^(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z\d!@#$%^&*]{8,}$/;
    return pwPattern.test(pw);
}


// 이벤트
// 이메일 입력 실시간 검사
emailInput.addEventListener("input", () => {
    const email = emailInput.value;
    if (!validateEmail(email)) {
        emailError.textContent = "유효한 이메일 형식을 입력하세요.";
        emailError.style.display = "block";
    } 
    else emailError.style.display = "none";
});

// 비밀번호 실시간 검사
pwInput.addEventListener("input", () => {
    const pw = pwInput.value;
    if(!vaildatePassword(pw)){
        pwError.textContent = "비밀번호는 최소 8자이며 숫자와 특수문자를 포함해야 합니다.";
        pwError.style.display = "block";
    }
    else pwError.style.display = "none";
})

// 비밀번호 확인 실시간 검사
confirmPwInput.addEventListener("input", () => {
    const pw = pwInput.value;
    const confirmPw = confirmPwInput.value;
    if(pw != confirmPw) {
        confirmPwError.textContent = "비밀번호가 일치하지 않습니다.";
        confirmPwError.style.display = "block";
    }
    else confirmPwError.style.display = "none";
})