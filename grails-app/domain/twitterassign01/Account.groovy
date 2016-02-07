package twitterassign01

class Account {
    String userHandle       // required field
    String fullName        // required field
    String emailAddr        // required field
    String phoneNumber
    Date dateOfBirth
    String accPassword      // required field


    static constraints = {
        userHandle nullable:false, size: 0..30, unique: true
        fullName nullable:false, blank: false
        emailAddr nullable: false, blank: false, unique: true
        phoneNumber nullable:true
        dateOfBirth nullable:true
        accPassword nullable: false, blank: false , size: 8..16
    }
}
