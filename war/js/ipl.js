var IPL = IPL || (function(){
    var _args = {}; // private
    return {
        init : function(Args) {
            _args = Args;
        },
        request_location : function() {
            var oHead = document.getElementsByTagName('head')[0];
            var oScript = document.createElement("script");
            oScript.type = "text/javascript";
            oScript.src = "http://ip-api.com/json/" + _args + "?callback=callback";
            oHead.appendChild(oScript);
            console.log('I ran');
        }
    };
}());