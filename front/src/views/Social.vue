<template>
  <div>
    <div>
      <!-- <button @click="hello">Gokakao</button> -->
      <img
        @click="kakaoLogin"
        id="kakao-login-btn"
        src="https://kauth.kakao.com/public/widget/login/kr/kr_02_medium.png"
        style="cursor: pointer"
        onmouseover="this.src='https://kauth.kakao.com/public/widget/login/kr/kr_02_medium_press.png'"
        onmouseout="this.src='https://kauth.kakao.com/public/widget/login/kr/kr_02_medium.png'"
      />
    </div>
    <div>
      <button @click="handleClickGetAuth">get auth code</button>
    </div>
  </div>
</template>

<script>
import KakaoAuth from "@/apis/KakaoApi.js";
import axios from "axios";
export default {
  name: "App",
  methods: {
    kakaoLogin() {
      KakaoAuth.loginWithKakao();
    },
    handleClickGetAuth() {
      this.$gAuth
        .signIn()
        .then((GoogleUser) => {
          //on success do something
          axios
            .post("http://localhost/user/socialLogin", GoogleUser["Ca"])
            .then();
        })
        .catch((error) => {
          alert(error);
        });
    },
  },
};
</script>
