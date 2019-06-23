package service;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.ws.Endpoint;
import javax.jws.*;
import javax.xml.ws.Endpoint;
import javax.jws.soap.*;

/**
 * @author Azamat
 *
 */

@WebService(endpointInterface="service.RandomQuote")
public class RandomQuoteImpl implements RandomQuote {
	 private ArrayList<String>quoteList; // an arraylist that holds the quotes 
	 private Random rand;
	 
	 public RandomQuoteImpl(){
		 this.rand =new Random();
		 this.quoteList =new ArrayList<String>();  
		
		 this.quoteList.add("Whenever you find yourself on the side of the majority, it is time to pause and\r\n" + 
		 		"reflect.\r\n" + 
		 		"-- Mark Twain\r\n" + 
		 		"");
		 this.quoteList.add("To be yourself in a world that is constantly trying to make you something else\r\n" + 
		 		"is the greatest accomplishment.\r\n" + 
		 		"-- Ralph Waldo Emerson");
		 
		 this.quoteList.add("\r\n" + 
		 		"It is not a lack of love, but a lack of friendship that makes unhappy marriages.\r\n" + 
		 		"-- Friedrich Nietzsche");
		 this.quoteList.add("In terms of energy, it's better to make a wrong choice than none at all.\r\n" + 
		 		"-- George Leonard, Mastery.");
		 this.quoteList.add("Courage is grace under pressure.\r\n" + 
		 		"-- Ernest Hemingway\r\n" + 
		 		"");
		 this.quoteList.add("Before enlightenment, chop wood and carry water.\r\n" + 
		 		"After enlightenment, chop wood and carry water.\r\n" + 
		 		"-- Ancient Eastern adage");
		 this.quoteList.add("Whatever you can do, or dream you can, begin it. Boldness has genius, power, and\r\n" + 
		 		"magic in it.\r\n" + 
		 		"-- Goethe");
		 this.quoteList.add("Since programmers create programs out of nothing, imagination is our\r\n" + 
		 		"only limitation. Thus, in the world of programming, the hero is the one\r\n" + 
		 		"who has great vision. Paul Graham is one of our contemporary heroes. He\r\n" + 
		 		"has the ability to embrace the vision, and to express it plainly. His\r\n" + 
		 		"works are my favorites, especially the ones describing language design.\r\n" + 
		 		"He explains secrets of programming, languages, and human nature that can\r\n" + 
		 		"only be learned from the hacker experience. This book shows you his\r\n" + 
		 		"great vision, and tells you the truth about the nature of hacking.\r\n" + 
		 		"-- Yukihiro \"Matz\" Matsumoto, creator of Ruby");
		 this.quoteList.add("To follow the path:\r\n" + 
		 		"    look to the master,\r\n" + 
		 		"    follow the master,\r\n" + 
		 		"    walk with the master,\r\n" + 
		 		"    see through the master,\r\n" + 
		 		"    become the master.\r\n" + 
		 		"-- Modern zen Poem");
		 this.quoteList.add("No problem should ever have to be solved twice.\r\n" + 
		 		"-- Eric S. Raymond, How to become a hacker");
		 this.quoteList.add("Attitude is no substitute for competence.\r\n" + 
		 		"-- Eric S. Raymond, How to become a hacker");
		 this.quoteList.add("It is said that the real winner is the one who lives in today but able\r\n" + 
		 		"to see tomorrow.\r\n" + 
		 		"-- Juan Meng, Reviewing \"The future of ideas\" by Lawrence Lessig\r\n" + 
		 		"");
		 this.quoteList.add("Fools ignore complexity. Pragmatists suffer it. Some can avoid it.\r\n" + 
		 		"Geniuses remove it.\r\n" + 
		 		"-- Alan J. Perlis (Epigrams in programming)");
		 this.quoteList.add("A year spent in artificial intelligence is enough to make one believe in\r\n" + 
		 		"God.\r\n" + 
		 		"-- Alan J. Perlis (Epigrams in programming)");
		 this.quoteList.add("A little learning is a dangerous thing.\r\n" + 
		 		"-- Alexander Pope");
		 this.quoteList.add("Computer science education cannot make anybody an expert programmer any\r\n" + 
		 		"more than studying brushes and pigment can make somebody an expert\r\n" + 
		 		"painter.\r\n" + 
		 		"-- Eric Raymond");
		 this.quoteList.add("Einstein argued that there must be simplified explanations of nature,\r\n" + 
		 		"because God is not capricious or arbitrary.\r\n" + 
		 		"-- Frederick P. Brooks, No Sliver Bullet.");
		 this.quoteList.add("There really is no learning without doing.\r\n" + 
		 		"-- Roger Schank, Engines for Education");
		 this.quoteList.add("\r\n" + 
		 		"The only problems we can really solve in a satisfactory manner are those\r\n" + 
		 		"that finally admit a nicely factored solution.\r\n" + 
		 		"-- E. W. Dijkstra, The humble programmer\r\n" + 
		 		"");
		 this.quoteList.add("The best way to learn to live with our limitations is to know them.\r\n" + 
		 		"--E. W. Dijkstra, The humble programmer\r\n" + 
		 		"");
		 this.quoteList.add("This challenge, viz. the confrontation with the programming task, is so\r\n" + 
		 		"unique that this novel experience can teach us a lot about ourselves. It\r\n" + 
		 		"should deepen our understanding of the processes of design and creation,\r\n" + 
		 		"it should give us better control over the task of organizing our\r\n" + 
		 		"thoughts. If it did not do so, to my taste we should no deserve the\r\n" + 
		 		"computer at all!  It has allready taught us a few lessons, and the one I\r\n" + 
		 		"have chosen to stress in this talk is the following. We shall do a much\r\n" + 
		 		"better programming job, provided that we approach the task with a full\r\n" + 
		 		"appreciation of its tremenduous difficulty, provided that we stick to\r\n" + 
		 		"modest and elegant programming languages, provided that we respect the\r\n" + 
		 		"intrinsec limitations of the human mind and approach the task as Very\r\n" + 
		 		"Humble Programmers.\r\n" + 
		 		"-- E. W. Dijkstra, The humble programmer");
		 this.quoteList.add("Thus, programs must be written for people to read, and only incidentally\r\n" + 
		 		"for machines to execute.\r\n" + 
		 		"-- Alan J. Perlis\r\n" + 
		 		"");
		 this.quoteList.add("Everything should be made as simple as possible, but no simpler.\r\n" + 
		 		"-- Albert Einstein");
		 this.quoteList.add("The great dividing line between success and failure can be expressed in\r\n" + 
		 		"five words: \"I did not have time.\"\r\n" + 
		 		"-- WestHost weekly newsletter 14 Feb 2003");
		 this.quoteList.add("When your enemy is making a very serious mistake, don't be impolite and\r\n" + 
		 		"disturb him.\r\n" + 
		 		"-- Napoleon Bonaparte (allegedly)");
		 this.quoteList.add("A charlatan makes obscure what is clear; a thinker makes clear what is\r\n" + 
		 		"obscure.\r\n" + 
		 		"-- Hugh Kingsmill\r\n" + 
		 		"");
		 this.quoteList.add("XML wasn't designed to be edited by humans on a regular basis.\r\n" + 
		 		"-- Guido van Rossum\r\n" + 
		 		"");
		 this.quoteList.add("Premature abstraction is an equally grevious sin as premature\r\n" + 
		 		"optimization.\r\n" + 
		 		"-- Keith Devens\r\n" + 
		 		"");
		 this.quoteList.add("If we wish to count lines of code, we should not regard them as *lines\r\n" + 
		 		"produced* but as *lines spent*.\r\n" + 
		 		"-- Edsger Dijkstra		\r\n" + 
		 		"");
		 this.quoteList.add("I have never met a man so ignorant that I couldn't learn something from\r\n" + 
		 		"him.\r\n" + 
		 		"-- Galileo Galilei\r\n" + 
		 		"");
		 this.quoteList.add("Philosophy: the finding of bad reasons for what one believes by\r\n" + 
		 		"instinct.\r\n" + 
		 		"-- Brave New World (paraphrased)");
		 this.quoteList.add("Fools! Don't they know that tears are a woman's most effective weapon?\r\n" + 
		 		"-- Catwoman (The Batman TV Series, episode 83)\r\n" + 
		 		"");
		 this.quoteList.add("C++ is history repeated as tragedy. Java is history repeated as farce.\r\n" + 
		 		"-- Scott McKay\r\n" + 
		 		"");
		 this.quoteList.add("Simplicity takes effort-- genius, even.\r\n" + 
		 		"-- Paul Graham");
		 this.quoteList.add("If you choose not to decide, you still have made a choice.\r\n" + 
		 		"-- Rush (Freewill)");
		 this.quoteList.add("Life moves pretty fast. If you don't stop and look around once in a\r\n" + 
		 		"while, you could miss it.\r\n" + 
		 		"-- Ferris Bueller");
		 quoteList.add("The direct pursuit of happiness is a recipe for an unhappy life.\r\n" + 
		 		"-- Donald Campbell");
		 this.quoteList.add("\r\n" + 
		 		"All problems in computer science can be solved by another level of\r\n" + 
		 		"indirection.\r\n" + 
		 		"-- Butler Lampson	");
		 this.quoteList.add("A designer knows he has arrived at perfection not when there is no\r\n" + 
		 		"longuer anything to add, but when there is no longuer anything to take\r\n" + 
		 		"away.\r\n" + 
		 		"-- Antoine de St Exupery.\r\n" + 
		 		"");
		 this.quoteList.add("For the things we have to learn before we can do them, we learn by doing\r\n" + 
		 		"them.\r\n" + 
		 		"-- Aristotle.\r\n" + 
		 		"");
		 this.quoteList.add("Having large case statements in an object-oriented language is a sure\r\n" + 
		 		"sign your design is flawed.\r\n" + 
		 		"-- [Fixing architecture flaws in Rails' ORM]");
		 
		 
	 }

	
	

	@Override
	public String getQuote() {
		// TODO Auto-generated method stub
		return this.quoteList.get(this.rand.nextInt(this.quoteList.size()));
	}

	@Override
	public void addQuote(String quote) {
		this.quoteList.add(quote);
		
	}
	
	}







