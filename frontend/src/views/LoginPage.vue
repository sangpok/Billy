<template>
    <main id="login-page">
        <div class="full-container">
            <div class="splash-container">
                <div class="img-wrapper">
                    <img :src="require('@/assets/5.jpg')" alt="" />
                </div>
            </div>

            <div class="right-container">
                <div class="login-container box">
                    <section class="login-section">
                        <div class="img-wrapper">
                            <img :src="require('@/assets/billy-logo.png')" alt="" />
                        </div>

                        <span class="description">안녕하세요, <strong>Billy</strong>입니다.</span>

                        <div class="account-field">
                            <div class="input-field">
                                <TextBox
                                    iconname="person_outline"
                                    placeholder="이메일을 입력하세요..."
                                    v-model="this.account_email"
                                    :tabindex="1"
                                    @input="onChangedEmail"
                                ></TextBox>

                                <TextBox
                                    iconname="password"
                                    typename="password"
                                    placeholder="비밀번호를 입력하세요..."
                                    v-model="this.account_pw"
                                    :tabindex="2"
                                    @input="onChangedPW"
                                ></TextBox>

                                <div class="login-setting-field">
                                    <div class="chkbox-wrapper">
                                        <input
                                            type="checkbox"
                                            name="auto-login"
                                            id="auto-login"
                                            tabindex="3"
                                        />
                                        <label for="auto-login">자동 로그인</label>
                                    </div>
                                    <div class="chkbox-wrapper">
                                        <input
                                            type="checkbox"
                                            name="save-email"
                                            id="save-email"
                                            tabindex="4"
                                        />
                                        <label for="save-email">아이디 저장하기</label>
                                    </div>
                                </div>
                            </div>

                            <div class="login-btn-field">
                                <ButtonCtl :tabindex="5">로그인</ButtonCtl>
                            </div>
                        </div>

                        <DelimiterCtl content="또는"></DelimiterCtl>

                        <div class="social-login-field">
                            <ButtonCtl backgroundColor="#19CE60">
                                <!-- <img :src="require('@/assets/favicon-naver.jpg')" /> -->
                                네이버로 로그인하기
                            </ButtonCtl>
                            <ButtonCtl backgroundColor="#1976D2">
                                <!-- <img :src="require('@/assets/favicon-naver.jpg')" /> -->
                                구글로 로그인하기
                            </ButtonCtl>
                            <ButtonCtl backgroundColor="#FFEB00">
                                <!-- <img :src="require('@/assets/favicon-naver.jpg')" /> -->
                                카카오로 로그인하기
                            </ButtonCtl>
                        </div>
                    </section>
                </div>

                <section class="account-help-section box">
                    <div class="account-help-content">
                        <div class="search-pwd-field">
                            <span class="description"
                                >비밀번호가 기억나지 않으신가요?
                                <router-link to="/">비밀번호 찾기</router-link></span
                            >
                        </div>
                        <div class="signin-field">
                            <span class="description"
                                >아직 계정이 없으신가요?
                                <router-link to="/signin">회원가입 하기</router-link></span
                            >
                        </div>
                    </div>
                </section>
            </div>
        </div>
    </main>
</template>

<script>
    import TextBox from '@/components/TextBox';
    import ButtonCtl from '@/components/ButtonCtl';
    import DelimiterCtl from '@/components/DelimiterCtl.vue';

    export default {
        name: 'LoginPage',
        components: {
            TextBox,
            ButtonCtl,
            DelimiterCtl,
        },
        data() {
            return {
                sampleData: '',
                account_email: '',
                aacount_pw: '',
            };
        },
        setup() {},
        created() {},
        mounted() {},
        unmounted() {},
        methods: {
            onChangedEmail(newValue) {
                this.account_email = newValue;
            },

            onChangedPW(newValue) {
                this.account_pw = newValue;
            },
        },
    };
</script>

<style lang="scss" scoped>
    @import '@/scss/pages/LoginPage';
</style>
