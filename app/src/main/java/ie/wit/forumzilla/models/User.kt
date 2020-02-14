package ie.wit.forumzilla.models

class User(val uid: String, val username: String) {
    constructor() : this("", "")
}