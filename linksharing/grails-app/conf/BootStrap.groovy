import linksharing.*
//import linksharing.Enum.Visibility
//import linksharing.Enum.Seriousness

class BootStrap {

    def init = { servletContext ->
        createuser()
        createtopics()
        createresource()
        createreadingitem()

    }
    void createuser(){
        User obj=new User(email:"k",username:"k",password:"k",fname:"k",lname:"k",admin:false,active:true)
        User obj1=new User(email:"a",username:"a",password:"a",fname:"a",lname:"a",admin:false,active:true)
        obj.save(failOnError:true)
        obj1.save(failOnError:true)
    }

    void createtopics(){
        List user=User.list()
        user.eachWithIndex{u,index->
            u.addToTopic(new Topic(name:"Topic-{$index}",visibility:Visibility.Public))
            //u.addToSubscription(new Subscription(seriousness:Seriousness.Serious))
            u.save(failOnError:true)
        }
    }

    void createresource()
    {
        List topic=Topic.list()
        topic.eachWithIndex{t,index->
            if(index%2==0)
                t.addToResource(new LinkResource(creator:User.findById(index),description:"LinkResource ${index}",url:""))
            else
                t.addToResource(new DocumentResource(creator:User.findById(index),description:"DocumentResource ${index}",path:""))
            t.save(failOnError:true)
        }

    }

  /*  void createreadingitem(){
        List u= User.list()
        u.eachWithIndex{us,index->
            Random ran=new Random()
            us.addToReadingItem(new ReadingItem(resource:Resource.get(ran.nextInt(11)),user:User,isread:true))
            us.save(failOnError:true)
        }
    }*/
    def destroy = {
    }
}
