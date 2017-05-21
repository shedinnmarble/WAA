/**
 * Created by Dewei Xiang on 3/3/2017.
 */
$(document).ready(function () {
    //show all person
    $("#btnShowAll").click(function() {
        $.ajax({
            method: "get",
            datatype: "json",
            url: "/all",
            data: {},
            success: function(data) {
                var content = '';
                $.each(data, function(key, person) {
                    var temp = person.key + '\t' + person.firstName + '\t' + person.lastName;
                    content += '<span>' + temp + '</span><br />'
                })
                $('#allPerson').html(content);
            }
        })
    })

    //add  one person by Ajax
    $('#addPerson').click(function() {
        var key = $('#input_key').val();
        var firstname = $('#input_firstName').val();
        var lastname = $('#input_lastName').val();
        $.ajax({
            method: "post",
            url: "/add",
            data: {
                key: key,
                firstName: firstname,
                lastName: lastname
            },
            success: function(data) {
                $('#requestResult').html("<span>"+data+"</span>")

            }
        })
    })

    //delete by ID
    $('#btnDelete').click(function () {
        $.ajax({
            method:"post",
            url:"/remove",
            data:{key:$('#input_key_del').val()},
            success:function (data) {
                $('#requestResult').html("<span>"+data+"</span>")
            }
        })
    })

})