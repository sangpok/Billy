<template>
    <div class="delimiter-field">
        <div class="line"></div>
        <div class="content" v-if="content === undefined ? false : true">
            {{ this.$props.content }}
        </div>
        <div class="line"></div>
    </div>
</template>

<script>
    export default {
        components: {},
        props: {
            content: String,
        },
        data() {
            return {
                sampleData: '',
            };
        },
        setup() {},
        created() {},
        mounted() {},
        unmounted() {},
        methods: {},
    };
</script>

<style lang="scss" scoped>
    @import '@/scss/components/DelimiterCtl.scss';
</style>
