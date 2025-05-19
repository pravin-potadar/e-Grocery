


$(document).ready(function () {
    $("#Category").on("click", function () {
        $("#CategorySubPart").slideToggle(200); // 200ms animation
    });

    $("#product").on("click", function () {
        $("#productSubPart").slideToggle(200);
    });

    $("#orders").on("click", function () {
        $("#ordersSubPart").slideToggle(200);
    });

    $("#Customers").on("click", function () {
        $("#CustomersSubPart").slideToggle(200);
    });

    $("#Transactions").on("click", function () {
        $("#TransactionsSubPart").slideToggle(200);
    });
});
