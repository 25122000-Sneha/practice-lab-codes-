var Book = /** @class */ (function () {
    function Book(bookId, bookTitle, author, publishedYear) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishedYear = publishedYear;
    }
    Book.prototype.displayDetails = function () {
        console.log("Book Details: ID-".concat(this.bookId, ", Title-").concat(this.bookTitle, ", Author-").concat(this.author, ", Published Year-").concat(this.publishedYear));
    };
    return Book;
}());
var book = new Book(1, "Umbrella Man", "Roald Dahl", 1998);
book.displayDetails();
