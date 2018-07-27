<template>
  <div>
    <div id="title">
    	<nav class="uk-navbar"><div class="uk-navbar-left"><a href="../" class="uk-navbar-item uk-logo"><svg width="28" height="34" viewBox="0 0 28 34" xmlns="http://www.w3.org/2000/svg" class="uk-margin-small-right uk-svg">
	<polygon fill="#fff" points="19.1,4.1 13.75,1 8.17,4.45 13.6,7.44 "></polygon>
	<path fill="#fff" d="M21.67,5.43l-5.53,3.34l6.26,3.63v9.52l-8.44,4.76L5.6,21.93v-7.38L0,11.7v13.51l13.75,8.08L28,25.21V9.07 L21.67,5.43z"></path>
</svg> Атамекен
                    </a></div> <div class="uk-container uk-container-expand"> </div> <div class="uk-navbar-right"><ul class="uk-navbar-nav uk-visible@m"><li><a href="../pro">Регионы</a></li> <li class="uk-active"><a href="../docs/">Условия для бизнеса</a></li> <li><a href="../changelog">Рейтинги</a></li></ul> <div class="uk-navbar-item uk-visible@m"><a href="../download" class="uk-button uk-button-default tm-button-default uk-icon">Реестр <canvas uk-icon="icon: download" width="20" height="20" class="uk-icon" hidden="true"></canvas><svg width="20" height="20" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"> <polyline fill="none" stroke="#000" points="14,10 9.5,14.5 5,10"></polyline> <rect x="3" y="17" width="13" height="1"></rect> <line fill="none" stroke="#000" x1="9.5" y1="13.91" x2="9.5" y2="3"></line></svg></a></div> <a uk-navbar-toggle-icon="" href="#offcanvas" uk-toggle="" class="uk-navbar-toggle uk-hidden@m uk-navbar-toggle-icon uk-icon"><svg width="20" height="20" viewBox="0 0 20 20" xmlns="http://www.w3.org/2000/svg"><rect y="9" width="20" height="2"></rect><rect y="3" width="20" height="2"></rect><rect y="15" width="20" height="2"></rect></svg></a></div></nav>
    <h1 id="h1sx"> РЕГИОНАЛЬНАЯ КАРТА
РАЗВИТИЯ ПРЕДПРИНИМАТЕЛЬСТВА </h1> 
      <img src="https://preview.ibb.co/bQ6FYd/download.png" width="700" height="700" alt="" usemap="Map" />
    </div>
<map name="Map" id="Map">
    <area alt="try" title="Акмолинская область" href="http://localhost:8080/#/regions" shape="poly" coords="302,97,306,87,312,79,331,77,345,71,351,61,360,50,362,45,382,58,402,61,420,67,426,79,421,94,406,112,385,119,380,127,356,127,321,115,305,109" />
</map>
      </map>  
    </div>
</template>

<style>
	.uk-navbar {
  display:flex;
  position:relative;
  margin-bottom: 20px;
}
.uk-navbar-container:not(.uk-navbar-transparent) {
  background:#F8F8F8;
}
.uk-navbar-container > ::before, .uk-navbar-container > ::after {
  display:none !important;
}
.uk-navbar-left, .uk-navbar-right, .uk-navbar-center, .uk-navbar-center-left > *, .uk-navbar-center-right > * {
  align-items:center;
  display:flex;
}
.uk-navbar-right {
  margin-left:auto;
}
.uk-navbar-center:only-child {
  margin-left:auto;
  margin-right:auto;
  position:relative;
}
.uk-navbar-center:not(:only-child) {
  left:50%;
  position:absolute;
  top:50%;
  transform:translate(-50%, -50%);
  z-index:990;
}
.uk-navbar-center:not(:only-child) .uk-navbar-nav > li > a, .uk-navbar-center:not(:only-child) .uk-navbar-item, .uk-navbar-center:not(:only-child) .uk-navbar-toggle {
  white-space:nowrap;
}
.uk-navbar-center-left, .uk-navbar-center-right {
  position:absolute;
  top:0;
}
.uk-navbar-center-left {
  right:100%;
}
.uk-navbar-center-right {
  left:100%;
}
[class*="uk-navbar-center-"] .uk-navbar-nav > li > a, [class*="uk-navbar-center-"] .uk-navbar-item, [class*="uk-navbar-center-"] .uk-navbar-toggle {
  white-space:nowrap;
}
.uk-navbar-nav {
  display:flex;
  list-style:none;
  margin:0;
  padding:0;
}
.uk-navbar-left, .uk-navbar-right, .uk-navbar-center:only-child {
  flex-wrap:wrap;
}
.uk-navbar-nav > li > a, .uk-navbar-item, .uk-navbar-toggle {
  align-items:center;
  box-sizing:border-box;
  display:flex;
  font-family:ProximaNova, -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
  font-size:14px;
  height:80px;
  justify-content:center;
  padding:0 15px;
  text-decoration:none;
}
.uk-navbar-nav > li > a {
  color:#999999;
  text-transform:uppercase;
  transition:color 0.1s ease-in-out, background-color;
}
.uk-navbar-nav > li:hover > a, .uk-navbar-nav > li > a:focus, .uk-navbar-nav > li > a.uk-open {
  color:#666666;
  outline:none;
}
.uk-navbar-nav > li > a:active {
  color:#222222;
}
.uk-navbar-nav > li.uk-active > a {
  color:#222222;
}
.uk-navbar-item {
  color:#666666;
}
.uk-navbar-toggle {
  color:#999999;
}
.uk-navbar-toggle:hover, .uk-navbar-toggle:focus, .uk-navbar-toggle.uk-open {
  color:#666666;
  outline:none;
  text-decoration:none;
}
.uk-navbar-subtitle {
  font-size:14px;
}
.uk-navbar-dropdown {
  background:#FFFFFF;
  box-shadow:rgba(0, 0, 0, 0.15) 0 5px 12px;
  box-sizing:border-box;
  color:#666666;
  display:none;
  padding:25px;
  position:absolute;
  width:200px;
  z-index:1020;
}
.uk-navbar-dropdown.uk-open {
  display:block;
}
[class*="uk-navbar-dropdown-top"] {
  margin-top:-15px;
}
[class*="uk-navbar-dropdown-bottom"] {
  margin-top:15px;
}
[class*="uk-navbar-dropdown-left"] {
  margin-left:-15px;
}
[class*="uk-navbar-dropdown-right"] {
  margin-left:15px;
}
.uk-navbar-dropdown-grid {
  margin-left:-50px;
}
.uk-navbar-dropdown-grid > * {
  padding-left:50px;
}
.uk-navbar-dropdown-grid > .uk-grid-margin {
  margin-top:50px;
}
.uk-navbar-dropdown-stack .uk-navbar-dropdown-grid > * {
  width:100% !important;
}
.uk-navbar-dropdown-width-2:not(.uk-navbar-dropdown-stack) {
  width:400px;
}
.uk-navbar-dropdown-width-3:not(.uk-navbar-dropdown-stack) {
  width:600px;
}
.uk-navbar-dropdown-width-4:not(.uk-navbar-dropdown-stack) {
  width:800px;
}
.uk-navbar-dropdown-width-5:not(.uk-navbar-dropdown-stack) {
  width:1000px;
}
.uk-navbar-dropdown-dropbar {
  box-shadow:none;
  margin-bottom:0;
  margin-top:0;
}
.uk-navbar-dropdown-nav {
  font-size:14px;
}
.uk-navbar-dropdown-nav > li > a {
  color:#999999;
}
.uk-navbar-dropdown-nav > li > a:hover, .uk-navbar-dropdown-nav > li > a:focus {
  color:#666666;
}
.uk-navbar-dropdown-nav > li.uk-active > a {
  color:#222222;
}
.uk-navbar-dropdown-nav .uk-nav-header {
  color:#222222;
}
.uk-navbar-dropdown-nav .uk-nav-divider {
  border-top:1px solid #E5E5E5;
}
.uk-navbar-dropdown-nav .uk-nav-sub a {
  color:#999999;
}
.uk-navbar-dropdown-nav .uk-nav-sub a:hover, .uk-navbar-dropdown-nav .uk-nav-sub a:focus {
  color:#666666;
}
.uk-navbar-dropbar {
  background:#FFFFFF;
}
.uk-navbar-dropbar-slide {
  box-shadow:rgba(0, 0, 0, 0.05) 0 5px 7px;
  left:0;
  position:absolute;
  right:0;
  z-index:980;
}
.uk-navbar-container > .uk-container .uk-navbar-left {
  margin-left:-15px;
  margin-right:-15px;
}
.uk-navbar-container > .uk-container .uk-navbar-right {
  margin-right:-15px;
}
.uk-navbar-dropdown-grid > * {
  position:relative;
}
.uk-navbar-dropdown-grid > :not(.uk-first-column)::before {
  border-left:1px solid #E5E5E5;
  bottom:0;
  content:"";
  left:25px;
  position:absolute;
  top:0;
}
.uk-navbar-dropdown-grid.uk-grid-stack > .uk-grid-margin::before {
  border-top:1px solid #E5E5E5;
  content:"";
  left:50px;
  position:absolute;
  right:0;
  top:-25px;
}
.uk-container-expand {
  max-width:none;
}
theme.css?928
.uk-container {
  box-sizing:content-box;
  margin-left:auto;
  margin-right:auto;
  max-width:1380px;
  padding-left:15px;
  padding-right:15px;
}
.uk-light, .uk-section-primary:not(.uk-preserve-color), .uk-section-secondary:not(.uk-preserve-color), .uk-tile-primary:not(.uk-preserve-color), .uk-tile-secondary:not(.uk-preserve-color), .uk-card-primary.uk-card-body, .uk-card-primary > :not([class*="uk-card-media"]), .uk-card-secondary.uk-card-body, .uk-card-secondary > :not([class*="uk-card-media"]), .uk-overlay-primary, .tm-navbar-container:not(.uk-navbar-transparent) {
  color:rgba(255, 255, 255, 0.8);
}
.h1sx {
	font-size: 12px;
	margin-bottom: 12px;
}
</style>