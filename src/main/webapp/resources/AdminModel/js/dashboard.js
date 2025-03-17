$(document).ready(function() {
    $("#Category").on("click", function() {
        $("#CategorySubPart").toggle();
    });

    $("#product").on("click", function() {
        $("#productSubPart").toggle();
    });

    $("#orders").on("click", function() {
        $("#ordersSubPart").toggle();
    });

    $("#Customers").on("click", function() {
        $("#CustomersSubPart").toggle();
    });

    $("#Transactions").on("click", function() {
        $("#TransactionsSubPart").toggle();
    });
});
