package pl.mateusz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.mateusz.demo.Buffet.BuffetRepository;
import pl.mateusz.demo.Buffet.CinemaRepository;
import pl.mateusz.demo.config.FirstAnnotation;
import pl.mateusz.demo.config.TestServ;
import pl.mateusz.demo.dziedziczenie.Room;
import pl.mateusz.demo.dziedziczenie.Room1;
import pl.mateusz.demo.dziedziczenie.Room2;
import pl.mateusz.demo.dziedziczenie.RoomRepository;
import pl.mateusz.demo.dziedziczenie2.Toilet;
import pl.mateusz.demo.dziedziczenie2.ToiletForMen;
import pl.mateusz.demo.dziedziczenie2.ToiletForWomen;
import pl.mateusz.demo.dziedziczenie2.ToiletRepository;
import pl.mateusz.demo.runnable.Runnable1;
import pl.mateusz.demo.runnable.Runnable2;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.*;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		SpringApplication.run(Test1Application.class, args);
	}

	@Autowired
	private CinemaRepository cinemaRepository;
	@Autowired
	private BuffetRepository buffetRepository;
	@Autowired
	private RoomRepository roomRepository;
	@Autowired
	private ToiletRepository toiletRepository;

//	@Autowired
//	public Test1Application(CinemaRepository cinemaRepository, BuffetRepository buffetRepository) {
//		this.cinemaRepository = cinemaRepository;
//		this.buffetRepository = buffetRepository;
//
//	}



//	@PostConstruct
//	public void test(){
//		Buffet buffet = buffetRepository.save(new Buffet("chips","cola"));
//		Buffet buffet1 = buffetRepository.save(new Buffet("chips","cola"));
//
//		Cinema cinema = cinemaRepository.save(
//				new Cinema(0,"room 32",7, LocalDateTime.now(), Movies.ADULT, asList(buffet,buffet1))
//				);
//		Cinema cinema2 = cinemaRepository.save(
//				new Cinema(0,"room 33",5, LocalDateTime.now(), Movies.KIDS, asList(buffet,buffet1))
//		);
//		buffet.setCinema(asList(cinema, cinema2));
//		buffet1.setCinema(asList(cinema, cinema2));
//		buffetRepository.save(buffet);
//		buffetRepository.save(buffet1);
//
////		Cinema cinema1 = cinemaRepository.findById(cinema.getId()).get();
////		buffet.setCinema(Cinema);
////		buffetRepository.save(buffet);
////		System.out.println(cinema1.buffet);
//}
//
//	@PostConstruct
//	public void firstTest() throws Exception {
//
//		Function<Integer, String> firstFunction = i -> {
//			System.out.println(i);
//			String j = String.valueOf(i);
//			System.out.println(j);
//			return i + j;
//		};
//
//		BiFunction<Integer, Integer, String> firstBiFunction= ( Integer i, Integer j )-> String.valueOf(i + j);
//		 firstBiFunction.apply(1,12);
//
//		Predicate<Integer> predicate = (Integer i) ->i.equals(123);
//		predicate.test(123);
//
//		TripleFunction<Integer, Integer, Integer, String> firstTripleFunction = (Integer z, Integer x, Integer c) -> String.valueOf(z + x + c);
//		String apply = firstTripleFunction.apply(1,2,4);
//		System.out.println(apply);
//
//		System.out.println(firstFunction.apply(999));
////		System.out.println(firstFunction.apply(145));
//
//		Consumer<Integer> firstConsumer = ( Integer i) -> System.out.println(i);
//		firstConsumer.accept(123321);
//
//
//		Runnable runnable = () -> System.out.println(123);
//		runnable.run();
//
//		Callable<Integer> firstCallable = () -> 123;
//		System.out.println(firstCallable.call());
//
//		Supplier<Integer> firstSupplier = Test1Application::firstSupplier;
//		System.out.println(firstSupplier.get());
//		Test1Application test1Application = new Test1Application();
//		System.out.println(Test1Application.firstFunction(777));

	//stream

//		List<Integer> numberList = List.of(
//				List.of(44,54,65,98,102,21,66,78,10,41,20,15,14),
//				List.of(12,43,233,4656,32,133)
//		).stream()
//		.flatMap(Collection::stream)
//		.filter(i-> i > 40)
//		.map(i -> i - 12)
//		.collect(Collectors.toList());
//
//	System.out.println(numberList);
//	}
//		Map<Integer, List<Integer>> numberList = asList(44, 54, 65, 44, 98, 102, 21, 66, 66, 78, 10, 41, 20, 15, 14).stream()
//				.filter(i-> i > 40)
//				.map(i -> i - 12)
//				.collect(Collectors.groupingBy(i -> i));
//
//		System.out.println(numberList);
//	}

//	Map<Integer, Long> numberList = asList(44, 54, 65, 44, 98, 102, 21, 66, 66, 78, 10, 41, 20, 15, 14).stream()
//			.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//
//		System.out.println(numberList);
//}


//
//	public static Integer firstSupplier(){
//		return 123;
//	}
////		public static String firstFunction(Integer i){
////			return String.valueOf(i);
////			} alternatywa function

//
//	@PostConstruct
//	public void testRoom() throws Exception{
//		Room room1 = new Room1(44,"flashes",true);
//		Room room2 = new Room2(35,"movableSeats","yes");
//		roomRepository.save(room1);
//		roomRepository.save(room2);
//
//	}
//	@PostConstruct
//	public void testToilet() throws Exception{
//		Toilet toiletForMen = new ToiletForMen("4","5","6");
//		Toilet toiletForWomen = new ToiletForWomen("4","5","Yes + 2");
//		toiletRepository.save(toiletForMen);
//		toiletRepository.save(toiletForWomen);
//	}
//	@PostConstruct
//	public void testTest(){
//		Optional<String> optional1 = Optional.ofNullable(extracted());
//		optional1
//				.map(Integer::valueOf)
//				.filter(x -> x > 3)
//				.map(x -> x + 1)
//				.filter(x -> x > 4)
//				.map(x -> x + 2)
//				.flatMap(x -> process(x))
//				.ifPresent(x ->{
//					System.out.println(x);
//						});
//	}
//	private String extracted(){
//		return "4";
//	}
//	private Optional<Integer> process(Integer j){
//		return Optional.ofNullable(j)
//				.filter(x -> x == 7)
//				.map(x -> x + 3);
//	}

//	@PostConstruct
//	public void test() {
//		Thread thread = new Thread(() -> {
//			for (int x = 0; x < 10; x++) {
//				System.out.println("Test thread 1");
//			}
//
//		});
//		Thread thread2 = new Thread(new Runnable1());
//		Thread thread3 = new Thread(new Runnable2());
//
//		thread.start();
//		thread2.start();
//		thread3.start();
//	}

//	@PostConstruct
//	public void test11(){
//		ExecutorService executorService = Executors.newFixedThreadPool(10);
//		executorService.execute(() -> {
//			for (int x = 0; x < 9000; x++){
//				try{
//					TimeUnit.SECONDS.sleep(12);
//				} catch (InterruptedException e){
//					e.printStackTrace();
//				}
//				System.out.println("Test thread" + Thread.currentThread().getName());
//			}
//		});
//		Future<Integer> submit = executorService.submit(() ->{
//			try {
//				TimeUnit.SECONDS.sleep(2);
//				return 100;
//			} catch (InterruptedException e) {
//				return 1;
//			}
//		});
//		while (!submit.isDone()){
//			try {
//				TimeUnit.NANOSECONDS.sleep(1000);
//				System.out.println("Please wait");
//			} catch (InterruptedException e){
//				e.printStackTrace();
//			}
//		}
//		try{
//			System.out.println(submit.get());
//		} catch (InterruptedException e){
//			e.printStackTrace();
//		} catch (ExecutionException e){
//			e.printStackTrace();
//		}
//	}
//	@FirstAnnotation
//	private Integer bean;
//
//	@Autowired
//	@Qualifier("bean2")
//	private Integer bean2;
//
//	@Autowired
//	@Qualifier("bean-list")
//	private List<Integer> listNumbers;
//
//	@PostConstruct
//	public void test44(){
//		System.out.println(bean);
//		System.out.println(bean2);
//		System.out.println(listNumbers);
//	}

	@PostConstruct
	public void test77(){
		TestServ.create("Toys",34);
		TestServ.delete("Toys",12);
	}
	@PostConstruct
	public void test78(){
		TestServ.update("Add toys ",5);
	}


}






