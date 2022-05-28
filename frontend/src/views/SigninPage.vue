<template>
    <section id="signin-page">
        <div class="full-container">
            <div class="full-container-content">
                <div class="logo"></div>
                <div class="description">
                    <span>회원 정보를 입력해주세요</span>
                </div>
                <div class="input-field">
                    <div class="field-title">
                        <h1>이메일</h1>
                    </div>

                    <SingleText
                        v-model="account_email"
                        @input="onChangedEmail"
                        inputState="not_focused"
                        place-holder="example@example.com"
                    ></SingleText>

                    <div class="input-description">
                        이미 가입된 이메일입니다. 다른 이메일을 입력해주세용.
                    </div>
                </div>
                <div class="input-field"></div>
                <div class="input-field"></div>
                <div class="input-field"></div>
                <div class="submit-field"></div>
            </div>
        </div>
    </section>
</template>

<script>
    import SingleText from '@/components/SingleText.vue';

    export default {
        name: 'SigninPage',
        components: {
            SingleText,
        },
        data() {
            return {
                sampleData: '',
                account_email: '',
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
        },
    };
</script>
