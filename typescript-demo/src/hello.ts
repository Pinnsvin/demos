function hello(person: string) {
    return "Hello " + person;
}

let user = "Tom";
document.body.innerHTML = hello(user);

interface Person {
    firstName: string;
    lastName: string;
}

function hello2(person: Person) {
    return "Hello " + person.firstName + " " + person.lastName;
}

let user2 = { firstName: "Tom", lastName: "Cat" };
document.body.innerHTML = hello2(user2);

class Man {
    fullName: string;
    constructor(public firstName, public lastName) {
        this.fullName = firstName + " " + lastName;
    }
}

let user3 = new Man("Tom", "Cat");
document.body.innerHTML = hello2(user3)