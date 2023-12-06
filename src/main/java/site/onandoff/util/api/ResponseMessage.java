package site.onandoff.util.api;

public enum ResponseMessage {

	// Member
	SIGNUP_SUCCESS("회원가입에 성공했습니다"),
	NICKNAME_MODIFICATION_SUCCESS("닉네임을 변경했습니다"),
	PASSWORD_MODIFICATION_SUCCESS("비밀번호를 변경했습니다"),
	MEMBER_DELETE_SUCCESS("회원탈퇴에 성공했습니다"),
	MEMBER_PROFILE_FIND_SUCCESS("회원정보 조회에 성공했습니다"),

	// Auth
	LOGIN_SUCCESS("로그인에 성공했습니다"),
	REISSUE_TOKENS_SUCCESS("토큰 재발급에 성공했습니다");

	private final String message;

	ResponseMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

}
