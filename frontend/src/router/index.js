import { createRouter, createWebHistory } from 'vue-router';
import LoginPage from '@/views/LoginPage';
import SigninPage from '@/views/SigninPage';

const routes = [
    {
        path: '/',
        name: 'LoginPage',
        component: LoginPage,
    },
    {
        path: '/signin',
        name: 'SigninPage',
        component: SigninPage,
    },
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
});

export default router;
