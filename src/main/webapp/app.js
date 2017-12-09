$(document).ready(function () {

    $.get('greeting', {}, function (responseText) {
        $('#greeting-message').text(responseText);
    });

    $('#set-greeting').submit(function (event) {
        var newGreeting = $('input:first').val();
        $.get('setGreeting', {
            newGreeting: newGreeting
        });
    });

});