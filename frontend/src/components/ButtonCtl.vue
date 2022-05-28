<template>
    <div
        :class="outlinedType ? 'button-field outlined' : 'button-field'"
        @click="onClicked"
        ref="buttonfield"
    >
        <button ref="buttontext" :tabindex="tabindex">
            <slot></slot>
        </button>
    </div>
</template>

<script>
    export default {
        components: {},
        props: {
            backgroundColor: String,
            outlinedType: Boolean,
            tabindex: {
                type: Number,
                required: false,
                default: 1,
            },
        },
        data() {
            return {
                sampleData: '',
            };
        },
        setup() {},
        created() {},
        beforeMount() {},
        mounted() {
            this.updateBkColor(this.$props.backgroundColor);
        },
        methods: {
            onClicked(event) {
                this.$emit('click', event);
            },

            updateBkColor(newValue) {
                if (newValue === undefined) return;

                this.$refs.buttonfield.style.backgroundColor = newValue;
                this.$refs.buttontext.style.color = this.getTextColorByBackgroundColor(newValue);
            },

            getTextColorByBackgroundColor(hexColor) {
                const c = hexColor.substring(1); // 색상 앞의 # 제거
                const rgb = parseInt(c, 16); // rrggbb를 10진수로 변환
                const r = (rgb >> 16) & 0xff; // red 추출
                const g = (rgb >> 8) & 0xff; // green 추출
                const b = (rgb >> 0) & 0xff; // blue 추출
                const luma = 0.2126 * r + 0.7152 * g + 0.0722 * b; // per ITU-R BT.709

                return luma < 200 ? 'white' : '#121212'; // 글자색이
            },
        },
    };
</script>

<style lang="scss" scoped>
    @import '@/scss/components/ButtonCtl.scss';
</style>
