package xyz.dmfe.inner

import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

class AnonymousInnerGroovy {
    CountDownLatch called = new CountDownLatch(1)

    void runTimer() {
        Timer timer = new Timer()
        timer.schedule(new TimerTask() {
            @Override
            void run() {
                called.countDown()
            }
        }, 0)

        assert called.await(10, TimeUnit.SECONDS)
    }

}
