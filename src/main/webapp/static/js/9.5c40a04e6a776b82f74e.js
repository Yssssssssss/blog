webpackJsonp([9],{"IP+H":function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var s={name:"TextsList",inject:["reload"],data:function(){var t=this;return{pages:0,pageSize:10,pageNum:1,textsList:[],loading:!0,total:0,columns1:[{title:"标题",key:"textTitle"},{title:"摘要",render:function(t,e){return t("div",e.row.textContent.replace(/<(style|script|iframe)[^>]*?>[\s\S]+?<\/\1\s*>/gi,"").replace(/<[^>]+?>/g,"").replace(/\s+/g," ").replace(/ /g," ").replace(/>/g," ").substring(0,15)+"...")}},{title:"点击量",key:"textCount",sortable:!0},{title:"点赞数",key:"textLikenum",sortable:!0},{title:"收藏数",key:"textCollectnum",sortable:!0},{title:"评论数",key:"textCommentnum",sortable:!0},{title:"最后修改时间",key:"textReleasedate",sortable:!0},{title:"删除",key:"action",render:function(e,a){return t.userId==t.$store.state.userInfo.userId?e("div",[e("Button",{props:{type:"primary"},style:{marginRight:"5px"},on:{click:function(){t.getToEditor(a.row)}}},"编辑"),e("Button",{props:{type:"error"},on:{click:function(){t.handleDelete(a.row)}}},"删除")]):e("div",[e("Button",{props:{type:"primary"},style:{marginRight:"5px"},on:{click:function(){t.getToEditor(a.row)}}},"查看")])}}],userId:0}},methods:{getOnesAllText:function(){var t=this;(new URLSearchParams).append("pageNum",this.pageNum),this.axios.get("textByUser/"+this.userId,{params:{pageNum:this.pageNum}}).then(function(e){100===e.data.code&&(t.textsList=e.data.map.texts.list,t.pages=e.data.map.texts.pages,t.pageNum=e.data.map.texts.pageNum,t.pageSize=e.data.map.texts.pageSize,t.total=e.data.map.texts.total),t.loading=!1}).catch(function(e){t.$Message.warning("获取文章列表失败")})},pageChange:function(t){this.pageNum=t},handleDelete:function(t){var e=this;this.axios.delete("text/"+t.textId).then(function(t){100===t.data.code?(e.$Message.success("删除成功"),e.$store.commit("setTextNumSub"),e.getOnesAllText()):e.$Message.error("删除失败")}).catch(function(t){e.$Message.warning("删除失败")})},getToEditor:function(t){this.$router.push("editor?textId="+t.textId)},putText:function(){this.$router.push("saveText")}},components:{},mounted:function(){this.userId=this.$route.params.userId,this.getOnesAllText()},watch:{pageNum:function(){this.getOnesAllText()}}},n={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("Row",{staticStyle:{margin:"10px"},attrs:{type:"flex",justify:"center"}},[this.userId==this.$store.state.userInfo.userId?a("Col",[a("Button",{staticStyle:{width:"200px"},attrs:{type:"primary"},on:{click:t.putText}},[t._v("发布文章")])],1):t._e()],1),t._v(" "),a("Table",{attrs:{border:"",stripe:"","no-data-text":"并没有发表任何文章",loading:t.loading,columns:t.columns1,data:t.textsList}}),t._v(" "),a("Row",[a("Col",{attrs:{span:"4",offset:"4"}},[t._v("\n      总共"+t._s(t.total)+"条数据\n    ")]),t._v(" "),a("Col",[a("Page",{attrs:{total:t.total,current:t.pageNum,"show-elevator":""},on:{"on-change":t.pageChange}})],1)],1)],1)},staticRenderFns:[]};var r=a("C7Lr")(s,n,!1,function(t){a("hXgU")},"data-v-ffc01578",null);e.default=r.exports},hXgU:function(t,e){}});
//# sourceMappingURL=9.5c40a04e6a776b82f74e.js.map