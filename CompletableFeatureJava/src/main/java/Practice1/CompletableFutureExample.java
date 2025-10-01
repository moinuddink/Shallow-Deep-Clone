package Practice1;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


    /*
    * Q).What is CompletableFuture?
    *CompletableFuture: A new era of asynchronous programming
    *
    * 1.Using Asynchronous programming you can write non blocking code
    * where concurrently you can run N no of task in separate thread without blocking main thread.
    * 2.When the task is complete, it notifies to the main thread(whether the task was completed or failed).
    *
    * Why CompletableFuture?
    ***There are different ways to implement asynchronous programming in Java using any of the below mechanism
    * for example you can use Futures, ExecutorService, Callback interfaces, Thread Pools, etc.
    *
    * 1.It cann't be manually completed
    * 2.Multiple Futures cann't be chained together
    * 3.we can not combine multiple Futures together
    * 4.No Proper Exception Handling Mechanism
    *
    * How to create CompletableFuture?
    *
    * How to use runAsync and  SupplyAsyn method  with usecase?
    *
    *
    * */

        ExecutorService service = Executors.newFixedThreadPool(10);
      Future<List<Integer>> future  = service.submit(() ->{
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        });

    List<Integer> list= future.get();
    System.out.println(list);

    //Completed till 6.00min(<----https://www.youtube.com/watch?v=GJ5Tx43q6KM-->)




    }
}
