package linksharing

class User {
    String email
    String username
    String password
    String fname
    String lname
    Byte[] photo
    Boolean admin
    Boolean active
    Date DateCreated
    Date LastUpdated
    static hasMany = [topic:Topic,subcription:Subscription]
    static constraints = {photo nullable: true
    }
}
