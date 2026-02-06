package com.google.android.gms.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public abstract class Task<TResult> {
    @InterfaceC5670cr1
    public Task<TResult> a(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @InterfaceC5670cr1
    public Task<TResult> b(@InterfaceC5670cr1 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @InterfaceC5670cr1
    public Task<TResult> c(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @InterfaceC5670cr1
    public Task<TResult> d(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @InterfaceC5670cr1
    public Task<TResult> e(@InterfaceC5670cr1 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @InterfaceC5670cr1
    public Task<TResult> f(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @InterfaceC5670cr1
    public abstract Task<TResult> g(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnFailureListener onFailureListener);

    @InterfaceC5670cr1
    public abstract Task<TResult> h(@InterfaceC5670cr1 OnFailureListener onFailureListener);

    @InterfaceC5670cr1
    public abstract Task<TResult> i(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnFailureListener onFailureListener);

    @InterfaceC5670cr1
    public abstract Task<TResult> j(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnSuccessListener<? super TResult> onSuccessListener);

    @InterfaceC5670cr1
    public abstract Task<TResult> k(@InterfaceC5670cr1 OnSuccessListener<? super TResult> onSuccessListener);

    @InterfaceC5670cr1
    public abstract Task<TResult> l(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnSuccessListener<? super TResult> onSuccessListener);

    @InterfaceC5670cr1
    public <TContinuationResult> Task<TContinuationResult> m(@InterfaceC5670cr1 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @InterfaceC5670cr1
    public <TContinuationResult> Task<TContinuationResult> n(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @InterfaceC5670cr1
    public <TContinuationResult> Task<TContinuationResult> o(@InterfaceC5670cr1 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @InterfaceC5670cr1
    public <TContinuationResult> Task<TContinuationResult> p(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @InterfaceC11300zs1
    public abstract Exception q();

    public abstract TResult r();

    public abstract <X extends Throwable> TResult s(@InterfaceC5670cr1 Class<X> cls) throws Throwable;

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    @InterfaceC5670cr1
    public <TContinuationResult> Task<TContinuationResult> w(@InterfaceC5670cr1 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @InterfaceC5670cr1
    public <TContinuationResult> Task<TContinuationResult> x(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
