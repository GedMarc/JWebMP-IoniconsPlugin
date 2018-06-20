/*! Built with http://stenciljs.com */
ionicons.loadBundle("mryaiewq",["exports"],function(e){var t=window.ionicons.h,n=function(){function e(){this.svgContent=null,this.ariaLabel="",this.ios="",this.md="",this.name="",this.src="",this.icon=""}return e.prototype.componentWillLoad=function(){var e=this;this.waitUntilVisible(this.el,"50px",function(){e.isVisible=!0,e.loadIcon()})},e.prototype.waitUntilVisible=function(e,t,n){if(this.win.IntersectionObserver){var i=new this.win.IntersectionObserver(function(e){e[0].isIntersecting&&(i.disconnect(),n())},{rootMargin:t});i.observe(e)}else n()},e.prototype.loadIcon=function(){var e=this;if(!this.isServer&&this.isVisible){var t=this.getUrl();t&&function(e){var t=i.get(e);return t||(t=fetch(e,{cache:"force-cache"}).then(function(e){return e.ok?e.text():Promise.resolve(null)}),i.set(e,t)),t}(t).then(function(t){e.svgContent=function(e,t){if(t){var n=e.createDocumentFragment(),i=e.createElement("div");i.innerHTML=t,n.appendChild(i);for(var r=i.childNodes.length-1;r>=0;r--)"svg"!==i.childNodes[r].nodeName.toLowerCase()&&i.removeChild(i.childNodes[r]);var o=i.firstElementChild;if(o&&"svg"===o.nodeName.toLowerCase()&&function e(t){if(1===t.nodeType){if("script"===t.nodeName.toLowerCase())return!1;for(var n=0;n<t.attributes.length;n++){var i=t.attributes[n].value;if("string"==typeof i&&0===i.toLowerCase().indexOf("on"))return!1}for(n=0;n<t.childNodes.length;n++)if(!e(t.childNodes[n]))return!1}return!0}(o))return i.innerHTML}return""}(e.doc,t)})}this.ariaLabel||r(this.name,this.mode,this.ios,this.md)&&(this.ariaLabel=this.name.replace("ios-","").replace("md-","").replace(/\-/g," "))},e.prototype.getUrl=function(){var e=o(this.src);return e||((e=r(this.name,this.mode,this.ios,this.md))?this.getNamedUrl(e):(e=o(this.icon))?e:(e=r(this.icon,this.mode,this.ios,this.md))?this.getNamedUrl(e):null)},e.prototype.getNamedUrl=function(e){return this.resourcesUrl+"svg/"+e+".svg"},e.prototype.hostData=function(){var e;return{role:"img",class:Object.assign({},function(e){var t;return e?((t={"ion-color":!0})["ion-color-"+e]=!0,t):null}(this.color),(e={},e["icon-"+this.size]=!!this.size,e))}},e.prototype.render=function(){return!this.isServer&&this.svgContent?t("div",{class:"icon-inner",innerHTML:this.svgContent}):t("div",{class:"icon-inner"})},Object.defineProperty(e,"is",{get:function(){return"ion-icon"},enumerable:!0,configurable:!0}),Object.defineProperty(e,"encapsulation",{get:function(){return"shadow"},enumerable:!0,configurable:!0}),Object.defineProperty(e,"properties",{get:function(){return{ariaLabel:{type:String,attr:"aria-label",reflectToAttr:!0,mutable:!0},color:{type:String,attr:"color"},doc:{context:"document"},el:{elementRef:!0},icon:{type:String,attr:"icon",watchCallbacks:["loadIcon"]},ios:{type:String,attr:"ios"},isServer:{context:"isServer"},isVisible:{state:!0},md:{type:String,attr:"md"},mode:{context:"mode"},name:{type:String,attr:"name",watchCallbacks:["loadIcon"]},resourcesUrl:{context:"resourcesUrl"},size:{type:String,attr:"size"},src:{type:String,attr:"src",watchCallbacks:["loadIcon"]},svgContent:{state:!0},win:{context:"window"}}},enumerable:!0,configurable:!0}),Object.defineProperty(e,"style",{get:function(){return"[data-ion-icon-host]{display:inline-block;font-size:inherit;width:1em;height:1em;contain:strict;--ion-color-base:currentColor}.icon-small[data-ion-icon-host]{font-size:18px}.icon-large[data-ion-icon-host]{font-size:32px}.icon-inner[data-ion-icon]{font-size:inherit}.icon-inner[data-ion-icon], svg[data-ion-icon]{height:100%;width:100%}svg[data-ion-icon]{fill:var(--ion-color-base);stroke:var(--ion-color-base)}.ion-color-primary[data-ion-icon-host]{--ion-color-base:var(--ion-color-primary, #3880ff)}.ion-color-secondary[data-ion-icon-host]{--ion-color-base:var(--ion-color-secondary, #0cd1e8)}.ion-color-tertiary[data-ion-icon-host]{--ion-color-base:var(--ion-color-tertiary, #f4a942)}.ion-color-success[data-ion-icon-host]{--ion-color-base:var(--ion-color-success, #10dc60)}.ion-color-warning[data-ion-icon-host]{--ion-color-base:var(--ion-color-warning, #ffce00)}.ion-color-danger[data-ion-icon-host]{--ion-color-base:var(--ion-color-danger, #f14141)}.ion-color-light[data-ion-icon-host]{--ion-color-base:var(--ion-color-light, #f4f5f8)}.ion-color-medium[data-ion-icon-host]{--ion-color-base:var(--ion-color-medium, #989aa2)}.ion-color-dark[data-ion-icon-host]{--ion-color-base:var(--ion-color-dark, #222428)}"},enumerable:!0,configurable:!0}),e}(),i=new Map;function r(e,t,n,i){return t=(t||"md").toLowerCase(),n&&"ios"===t?e=n.toLowerCase():i&&"md"===t?e=i.toLowerCase():e&&!/^md-|^ios-|^logo-/.test(e)&&(e=t+"-"+e.toLowerCase()),"string"!=typeof e||""===e.trim()?null:""!==e.replace(/[a-z]|-|\d/gi,"")?null:e}function o(e){return"string"==typeof e&&(e=e.trim()).length>0&&/(\/|\.)/.test(e)?e:null}e.IonIcon=n,Object.defineProperty(e,"__esModule",{value:!0})});