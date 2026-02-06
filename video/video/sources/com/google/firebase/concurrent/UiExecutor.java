package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public enum UiExecutor implements Executor {
    INSTANCE;
    
    @SuppressLint({"ThreadPoolCreation"})
    public static final Handler Y = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Y.post(runnable);
    }
}
