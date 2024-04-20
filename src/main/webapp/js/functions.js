function studentModify() {
    var countChecked = 0;
    var inputElements = document.getElementsByClassName('checkbox');
    var idModify = 0;
    for(var i=0; inputElements[i]; ++i){
        if (inputElements[i].checked){
            countChecked++;
            idModify = inputElements[i].value;
        }
    }

    if (countChecked === 0) {
        alert("Please, select anyStudent");
        return;
    }

    if (countChecked > 1) {
        alert("Please, select only one anyStudent");
        return;
    }


    document.getElementById('hiddenToModify').value = idModify;
    document.getElementById('formToModify').submit();
}