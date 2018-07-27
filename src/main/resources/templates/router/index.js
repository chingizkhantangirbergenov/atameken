import Vue from 'vue'
import Router from 'vue-router'
import MapPage from '@/components/MapPage'
import Regions from '@/components/Regions'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'Map',
      component: MapPage
    },
    {
     path: '/regions',
      name: 'Regions',
      component: Regions 
    }  
  ]	
})

