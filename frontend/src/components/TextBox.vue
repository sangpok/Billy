<template>
    <div class="text-field">
        <div class="text-content">
            <div class="input-icon" v-if="iconname === '' ? false : true">
                <span class="material-icons" tabindex="-1"> {{ this.$props.iconname }} </span>
            </div>
            <input
                :type="this.$props.typename === '' ? 'text' : this.$props.typename"
                :placeholder="this.$props.placeholder"
                v-model="value"
                :tabindex="tabindex"
                @change="onDataChanged"
            />
            <button
                v-show="value === '' ? false : true"
                class="reset"
                @click="clearText"
                tabindex="-1"
            >
                <span class="material-icons md-18" tabindex="-1"> cancel </span>
            </button>
        </div>
    </div>
</template>

<script>
    export default {
        components: {},
        props: {
            width: Number,
            height: Number,
            placeholder: String,
            iconname: String,
            typename: String,
            tabindex: {
                type: Number,
                required: false,
                default: 1,
            },
        },
        data() {
            return {
                sampleData: '',
                value: '',
            };
        },
        setup() {},
        created() {},
        mounted() {},
        unmounted() {},
        methods: {
            clearText() {
                this.value = '';
                this.onDataChanged();
            },

            onDataChanged() {
                this.$emit('input', this.value);
            },
        },
    };
</script>

<style lang="scss" scoped>
    @import '@/scss/components/TextBox.scss';
</style>
