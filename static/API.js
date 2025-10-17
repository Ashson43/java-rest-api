var booksData = [];
var wishlistData = [];

async function fetchBooks(callback) {
    const url = "/books";
    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`Response status: ${response.status}`);
        }

        booksData = await response.json();
        callback(booksData);

    } catch (error) {
        console.error(error.message);
    }
}
async function deleteBook(id) {
    const url = "/books/" + id;
    try {
        const response = await fetch(url, { "method": "DELETE" });
        if (!response.ok) {
            throw new Error(`Response status: ${response.status}`);
        }
    } catch (error) {
        console.error(error.message);
    }
}

async function fetchWishlist(callback) {
    const url = "/users/1/wishlist";
    try {
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error(`Response status: ${response.status}`);
        }

        wishlistData = await response.json();
        callback(wishlistData);
    } catch (error) {
        console.error(error.message);
    }
}
async function addBookToWishlist(id) {
    const url = "/users/1/wishlist";
    try {
        const response = await fetch(url, {
            "method": "POST", headers: {
                'Content-Type': 'application/json',
            }, body: JSON.stringify(booksData[id])
        });
        if (!response.ok) {
            throw new Error(`Response status: ${response.status}`);
        }
    } catch (error) {
        console.error(error.message);
    }
}

async function deleteBookFromWishlist(id) {
    const url = "/users/1/wishlist/" + id;
    try {
        const response = await fetch(url, { "method": "DELETE" });
        if (!response.ok) {
            throw new Error(`Response status: ${response.status}`);
        }
    } catch (error) {
        console.error(error.message);
    }
}

async function addBook(callback) {
    var author=getAuthor();
    var title=getTitle()
    const url = "/books";
    try {
        const response = await fetch(url, {
            "method": "POST", headers: {
                'Content-Type': 'application/json',
            }, body: JSON.stringify({"title":title,"author":author})
        });
        if (!response.ok) {
            throw new Error(`Response status: ${response.status}`);
        }

        
        callback();
    } catch (error) {
        console.error(error.message);
    }
}

