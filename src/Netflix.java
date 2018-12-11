

public class Netflix {
public static void main(String[] args) {
	 Movie a=new Movie("Avengers: Infinity War",10);
	Movie b=new Movie("Shrek", 100);
	Movie c=new Movie("Shrek 2",1000);
	Movie d=new Movie("Shrek the Third", 10000);
	Movie e=new Movie("Shrek Forever After",100000);
	a.getTicketPrice();
	NetflixQueue n=new NetflixQueue();
	
	n.addMovie(a);
	n.addMovie(b);
	n.addMovie(c);
	n.addMovie(d);
	n.addMovie(e);
	Movie bestMovie=n.getBestMovie();
	Movie sMovie=n.getMovie(1);
	 n.printMovies();
	 System.out.println("The best movie is "+ bestMovie);
	 System.out.println("The second best movie is "+ sMovie);
	}
}
