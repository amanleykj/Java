import java.util.Date;
// import java.text.DateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String personName = String.format("Hello, %s lovely to see you. How are you?", name);
        return personName;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        String finalDate = date.toString();
        return "It is currently " + finalDate + ".";
    }
    
    public String respondBeforeAlexis(String conversation) {
        
        if(conversation.indexOf("Alexis") != -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        else if(conversation.indexOf("Alfred") != -1){
            return "At your service. As you wish, naturally.";
        }
        else{
            return "Right, and with that I'm bouts to retire in this mug.";

        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

