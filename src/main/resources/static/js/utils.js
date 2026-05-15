const SL_DISTRICTS = [
    'Ampara','Anuradhapura','Badulla','Batticaloa','Colombo','Galle','Gampaha',
    'Hambantota','Jaffna','Kalutara','Kandy','Kegalle','Kilinochchi','Kurunegala',
    'Mannar','Matale','Matara','Monaragala','Mullaitivu','Nuwara Eliya',
    'Polonnaruwa','Puttalam','Ratnapura','Trincomalee','Vavuniya'
];

function populateDistricts(selectId, blankLabel) {
    const label = blankLabel || 'All Districts';
    const sel = document.getElementById(selectId);
    if (!sel) return;
    sel.innerHTML = '<option value="">' + label + '</option>' +
        SL_DISTRICTS.map(function(d) { return '<option value="' + d + '">' + d + '</option>'; }).join('');
}
