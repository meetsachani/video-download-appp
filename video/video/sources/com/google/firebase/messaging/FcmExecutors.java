package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.threads.PoolableExecutors;
import com.google.firebase.messaging.threads.ThreadPriority;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class FcmExecutors {
    public static final String a = "Firebase-Messaging-Network-Io";
    public static final String b = "Firebase-Messaging-Task";
    public static final String c = "Firebase-Messaging-File";
    public static final String d = "Firebase-Messaging-Intent-Handle";
    public static final String e = "Firebase-Messaging-Topics-Io";
    public static final String f = "Firebase-Messaging-Init";
    public static final String g = "Firebase-Messaging-File-Io";
    public static final String h = "Firebase-Messaging-Rpc-Task";

    private FcmExecutors() {
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static Executor a(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService b() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(c));
    }

    public static Executor c() {
        return a(g);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService d() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(f));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService e() {
        return PoolableExecutors.a().i(new NamedThreadFactory(d), ThreadPriority.HIGH_SPEED);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService f() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(a));
    }

    public static Executor g() {
        return a(h);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ExecutorService h() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory(b));
    }

    @SuppressLint({"ThreadPoolCreation"})
    public static ScheduledExecutorService i() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory(e));
    }
}
