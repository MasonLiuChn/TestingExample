package com.example.testing.testingexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

/**
 * Robolectric 测试
 *
 * http://www.huangyunkun.com/2014/04/08/mock-http-in-android-with-robolectric/
 *
 一、Mockito的简单测试
 Android SDK也有测试框架，但是那个不是基于普通JVM的，运行起来还是需要模拟器或者真机。要基于普通JVM测试，就必须让模块尽可能的不依赖于Android的东西，需要依赖的也用Mockito等Mock掉。

 如果需要Mock的是自己的代码还好，如果是Android的东西，还需要处理各种状态和返回量。


 二、Robolectric
 虽然可以使用mockito这类框架来mock掉一部分依赖，但是由于Android平台自身的复杂性，mock的正确性很难保证。

 而Robolectric是一个单元测试框架，它提供了一个测试用的Android模拟，目前只提供了android-base-4.1.2_r1_rc，但是足够使用了。一方面它运行于普通JVM，保证了速度，另一方面，它模拟了绝大部分繁琐的功能，比如布局解析，资源处理。

 这样就可以像对待黑箱测试一样的编写测试，集中精力在业务处理上，而不是Android的实现上。

 Robolectric模拟Http请求和响应
 Robolectric提供了一个虚假的Http层，你可以拦截正常的请求，用另外一个替换掉；也可以不拦截真实请求，使用真的Http层。

 当然单元测试中尽可能不依赖外界，所以一般都拦截并替换掉。



 */
@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {
    @Test
    public void testMainActivity() {

    }
}
