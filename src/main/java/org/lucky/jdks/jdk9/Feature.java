package org.lucky.jdks.jdk9;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Feature {

    public static void main(String[] args) throws Exception {

        // New HTTPClient methods with builder
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .GET()
                .build();
        HttpResponse<byte[]> response = HttpClient.newHttpClient().send(httpRequest, HttpResponse.BodyHandlers.ofByteArray());
        System.out.println(new String(response.body()));

        //IN JAVA 7
        MyClosable myobj1 = new MyClosable();
        try (myobj1){
            System.out.println("From try java 7");
        }catch (Exception ex){
            System.out.println("From catch java 7..!");
        }

        //IN JAVA 9 does not work compile time error
        /*MyClosable myobj9 = new MyClosable();
        try (new MyClosable(){}.finalWrapper.finalCloseable){
            System.out.println("From try java 9");
        }catch (Exception ex){
            System.out.println("From catch java 9..!");
        }*/

        FooClass<Integer> fc = new FooClass<>(1) {
            public Integer get(){
                return super.getValue()+1;
            }
        };
        System.out.println(fc.get());

        // interface with private methods
        Pizza pizza = new Pizza() {};
        pizza.base();

        Laptop laptop=new Laptop(){

            @Override
            public void ram() {
                System.out.println("adding ram");
            }

            @Override
            public void ssd() {
                System.out.println("adding ssd");
            }

            @Override
            public void os() {
                System.out.println("adding os");
            }
        };

        laptop.assemble();

        // New API
        // of method create immutable collection
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7);
        // throw an error
//        System.out.println(integerList.add(8));
        // throw an error
//        System.out.println(Set.of(1, 2, 3, 4).add(8));

        Optional<Integer> iOptional = Optional.empty();
        iOptional.stream().forEach(System.out::println);
        Optional<List<Integer>> iOptional_data = Optional.of(integerList);
        integerList.stream()
                .flatMap(d -> Optional.ofNullable(d).stream())
                .forEach(System.out::println);

    }
}


class MyClosable implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("closing method call...!");
    }
}

abstract class FooClass<T>{

    private T t;
    FooClass(T t) {
        this.t=t;
    }

    abstract T get();

    protected T getValue(){
        return t;
    }
}

interface Pizza{
    default void base(){
        System.out.println("adding pan base");
        sauce();
    }

    private void sauce(){
        System.out.println("adding base sauce");
    }
}

interface Laptop{
    void ram();
    void ssd();
    void os();

    default void assemble(){
        ram();
        ssd();
        os();
    }
}



