class Book 
{
    bookId: number;
    bookTitle: string;
    author: string;
    publishedYear: number;

    constructor(bookId: number, bookTitle: string, author: string, publishedYear: number)
    {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    displayDetails():void{
        console.log(`Book Details: ID-${this.bookId}, Title-${this.bookTitle}, Author-${this.author}, Published Year-${this.publishedYear}`);
    }
}

let book = new Book(1, "Umbrella Man", "Roald Dahl", 1998);
book.displayDetails();