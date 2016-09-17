(function($) {
   return analytic = {
      track: function() {
        $.ajax({
            url: "http://localhost:9000/track",
            jsonp: "callback",
            dataType: "jsonp",
            data: {
                url: window.location.href
            },
            success: function( response ) {
                console.log( response );
            }
        });
      }
   }
})($);
