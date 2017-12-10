$(document).ready(function () {
    $('#set-greeting').submit(function (event) {
        event.preventDefault();
        var newGreeting = $('input:first').val();

        // send ajax get request to SetGreetingController
        $.get('set-greeting', {
            newGreeting: newGreeting
        }, function (response) {
            $('#msg').text(response);
            $('input:first').val('');
        });
    });
});
