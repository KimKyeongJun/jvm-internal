package com.kkj;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.pool.TypePool;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

import static net.bytebuddy.matcher.ElementMatchers.named;

public class Masulsa {

    public static void main(String[] args) {
//        try {
//            new ByteBuddy().redefine(Moja.class).method(named("pullOut")).intercept(FixedValue.value("Rabbit!!"))
//                            .make().saveIn(new File("C:\\Users\\v4901\\Desktop\\workspace\\jvm-internal\\target\\classes\\"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        ClassLoader classLoader = Masulsa.class.getClassLoader();
//        TypePool typePool = TypePool.Default.of(classLoader);
//        try {
//            new ByteBuddy()
//                    .redefine(
//                            typePool.describe("com.kkj.Moja").resolve(),
//                            ClassFileLocator.ForClassLoader.of(classLoader)
//                    )
//                    .method(named("pullOut")).intercept(FixedValue.value("Rabbit!!"))
//                    .make().saveIn(new File("C:\\Users\\v4901\\Desktop\\workspace\\jvm-internal\\target\\classes\\"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(new Moja().pullOut());
    }
}
