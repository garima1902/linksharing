package linksharing

class Resource {
    String description
    User creator
    Topic topic
    Date dateCreated
    Date lastUpdated
    static hasMany=[readingitem:ReadingItem]
    static constraints = {
    }
}
