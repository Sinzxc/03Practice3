import java.util.Random
import kotlin.system.exitProcess

fun main(args: Array<String>) {



    //1
    val myAge = 18;
    val isTeenager=(myAge > 13) && (myAge < 19);

    //



    //2
    val theirAge = 30;
    val bothTeenagers=((myAge > 13) && (myAge < 19)) && ((theirAge > 13) && (theirAge < 19));
    //



    //3
    val reader="Никита Панычев";
    val author="Richard Lucas";
    val authorIsReader=reader==author;
    //



    //4
    val readerBeforeAuthor=reader<author;
    println(readerBeforeAuthor);
    //



    //5
    val myAge2=18;
    if((myAge2 > 13) && (myAge2 < 19))
    {
        println("Подросток");
    }
    else{
        println("Не подросток");
    }
    //



    //6
    val answer =if((myAge2 > 13) && (myAge2 < 19)) "Подросток"; else "Не подросток";
    println(answer)
    //



    //7
   /* var counter=0;
    while (counter<10)
    {
        println("counter = ${counter}");
        counter++;
    }*/
    //



    //8
    var counter=0;
    var roll=0;
    do
    {
    roll=Random().nextInt(6);
    println("После ${counter} бросков, roll равен ${roll}");
    counter++;
    }while(roll!=0)

    //



    //9
    val range=1..10;
    for (i in range)
    {
        println(Math.pow(i.toDouble(),2.0));
    }
    //



    //10
    for (i in range)
    {
        println(Math.sqrt(i.toDouble()));
    }
    //



    //11
    var sum=0;
    for(row in 1 until 8 step 2){
        for (column in 0 until 8)
        {
            sum+=row*column;
        }
    }
    println(sum);
    //
}
