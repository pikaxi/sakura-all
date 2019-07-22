// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import ElementUI from 'element-ui'
import  VueQuillEditor from 'vue-quill-editor'
import VueCookies from 'vue-cookies'
// import axios from 'axios'
import utils from './common/utils.js'
import 'element-ui/lib/theme-chalk/index.css'
import 'swiper/dist/css/swiper.css'
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'
Vue.config.productionTip = false
var axios = require('axios')
Vue.prototype.$axios = axios
axios.defaults.baseURL = "http://127.0.0.1:8081/sakura/"
Vue.prototype.utils = utils

Vue.use(ElementUI)
Vue.use(VueQuillEditor)
Vue.use(VueCookies)
/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
