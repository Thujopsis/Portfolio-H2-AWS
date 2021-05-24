$(document).ready(function() {
    $('#delete-confirm').on('show.bs.modal', function(event) {
        var button = $(event.relatedTarget)
        var id = button.data('id')

        $('form').attr('action', '/delete/' + id);
    })
} );
