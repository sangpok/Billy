<template>
    <div v-if="inputState === 'not_focused'" class="single-text-field not_focused" ref="singletext">
        <div class="single-text-content">
            <input
                type="text"
                v-model="thisValue"
                :placeholder="this.$props.placeHolder"
                @input="onChanged"
                @focus="onFocused"
                @blur="onBlur"
            />
            <div class="icon-field">
                <span class="material-icons" tabindex="-1"> person </span>
            </div>
        </div>
    </div>
    <div v-else-if="inputState === 'focused'" class="single-text-field focused" ref="singletext">
        <div class="single-text-content">
            <input
                type="text"
                v-model="thisValue"
                :placeholder="this.$props.placeHolder"
                @input="onChanged"
                @focus="onFocused"
                @blur="onBlur"
            />
            <div class="icon-field">
                <span class="material-icons" tabindex="-1"> person </span>
            </div>
        </div>
    </div>
    <div v-else-if="inputState === 'inputed'" class="single-text-field inputed" ref="singletext">
        <div class="single-text-content">
            <input
                type="text"
                v-model="thisValue"
                :placeholder="this.$props.placeHolder"
                @input="onChanged"
                @focus="onFocused"
                @blur="onBlur"
            />
            <div class="icon-field">
                <span class="material-icons" tabindex="-1"> person </span>
            </div>
        </div>
    </div>
    <div v-else-if="inputState === 'error'" class="single-text-field error" ref="singletext">
        <div class="single-text-content">
            <input
                type="text"
                v-model="thisValue"
                :placeholder="this.$props.placeHolder"
                @input="onChanged"
                @focus="onFocused"
                @blur="onBlur"
            />
            <div class="icon-field">
                <span class="material-icons" tabindex="-1"> person </span>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        components: {},
        props: {
            placeHolder: {
                type: String,
                required: false,
                default: '',
            },
            inputState: {
                type: String,
                required: true,
                default: 'not_focused',
            },
        },
        data() {
            return {
                sampleData: '',
                thisValue: '',
            };
        },
        setup() {},
        created() {},
        mounted() {},
        unmounted() {},
        methods: {
            onChanged() {
                this.$emit('input', this.thisValue);
            },

            onFocused() {
                let text_ele = this.$refs.singletext;
                // let curState = text_ele.classList[1];

                text_ele.classList.remove(text_ele.classList[1]);
                text_ele.classList.add('focused');
                // if (curState === 'not_focused' && this.thisValue === '') {
                //     text_ele.classList.remove('not_focused');
                //     text_ele.classList.add('focused');
                // }
            },

            onBlur() {
                let text_ele = this.$refs.singletext;
                let curState = text_ele.classList[1];

                if (curState === 'focused' && this.thisValue !== '') {
                    text_ele.classList.remove(curState);
                    text_ele.classList.add('inputed');
                } else if (curState === 'focused' && this.thisValue === '') {
                    text_ele.classList.remove(curState);
                    text_ele.classList.add('not_focused');
                }
            },
        },
    };
</script>

<style lang="scss" scoped>
    @import '@/scss/components/SingleText.scss';
</style>
