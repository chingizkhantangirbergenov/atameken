<template>
	<div>
		<h1> Hello dad</h1>
		<h1 style="background-color: black; color: white">{{ this.cityInfo.karaganda.city }}</h1>
		{{this.cityInfo}}
	</div>
</template>

<script>
	export default {
		data() {
			return {
				cityInfo: []
			}
		},
		created() {
			let api = 'https://huyhuy-bd04e.firebaseio.com/region.json'
			this.axios.get(api).then( response => {
				this.cityInfo = response.data
			})
		}
	}
</script>
