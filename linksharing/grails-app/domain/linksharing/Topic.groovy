package linksharing
import linksharing.*
class Topic {
    String name;
    Date dateCreated
    Date lastUpdated
    Visibility visibility
    static hasMany = [resource:Resource,sub:Subscription]

    static constraints = {
    }
}
