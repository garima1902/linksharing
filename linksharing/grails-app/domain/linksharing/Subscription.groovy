package linksharing
import linksharing.*
class Subscription {
    Seriousness seriousness
    Date dateCreated
    static belongsTo = [topic:Topic,user:User]
    static constraints = {
    }
}
