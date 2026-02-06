package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzw<TResult> extends Task<TResult> {
    public final Object a = new Object();
    public final zzr b = new zzr();
    public boolean c;
    public volatile boolean d;
    @InterfaceC11300zs1
    public Object e;
    public Exception f;

    public final boolean A() {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.d = true;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean B(@InterfaceC5670cr1 Exception exc) {
        Preconditions.s(exc, "Exception must not be null");
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.f = exc;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean C(@InterfaceC11300zs1 Object obj) {
        synchronized (this.a) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = obj;
                this.b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D() {
        Preconditions.y(this.c, "Task is not yet complete");
    }

    public final void E() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    public final void F() {
        if (!this.c) {
            return;
        }
        throw DuplicateTaskCompletionException.a(this);
    }

    public final void G() {
        synchronized (this.a) {
            try {
                if (!this.c) {
                    return;
                }
                this.b.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> a(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnCanceledListener onCanceledListener) {
        zzh zzhVar = new zzh(TaskExecutors.a, onCanceledListener);
        this.b.a(zzhVar);
        zzv.m(activity).n(zzhVar);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> b(@InterfaceC5670cr1 OnCanceledListener onCanceledListener) {
        c(TaskExecutors.a, onCanceledListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> c(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnCanceledListener onCanceledListener) {
        this.b.a(new zzh(executor, onCanceledListener));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> d(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnCompleteListener<TResult> onCompleteListener) {
        zzj zzjVar = new zzj(TaskExecutors.a, onCompleteListener);
        this.b.a(zzjVar);
        zzv.m(activity).n(zzjVar);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> e(@InterfaceC5670cr1 OnCompleteListener<TResult> onCompleteListener) {
        this.b.a(new zzj(TaskExecutors.a, onCompleteListener));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> f(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnCompleteListener<TResult> onCompleteListener) {
        this.b.a(new zzj(executor, onCompleteListener));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> g(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnFailureListener onFailureListener) {
        zzl zzlVar = new zzl(TaskExecutors.a, onFailureListener);
        this.b.a(zzlVar);
        zzv.m(activity).n(zzlVar);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> h(@InterfaceC5670cr1 OnFailureListener onFailureListener) {
        i(TaskExecutors.a, onFailureListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> i(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnFailureListener onFailureListener) {
        this.b.a(new zzl(executor, onFailureListener));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> j(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 OnSuccessListener<? super TResult> onSuccessListener) {
        zzn zznVar = new zzn(TaskExecutors.a, onSuccessListener);
        this.b.a(zznVar);
        zzv.m(activity).n(zznVar);
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> k(@InterfaceC5670cr1 OnSuccessListener<? super TResult> onSuccessListener) {
        l(TaskExecutors.a, onSuccessListener);
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final Task<TResult> l(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 OnSuccessListener<? super TResult> onSuccessListener) {
        this.b.a(new zzn(executor, onSuccessListener));
        G();
        return this;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final <TContinuationResult> Task<TContinuationResult> m(@InterfaceC5670cr1 Continuation<TResult, TContinuationResult> continuation) {
        return n(TaskExecutors.a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final <TContinuationResult> Task<TContinuationResult> n(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 Continuation<TResult, TContinuationResult> continuation) {
        zzw zzwVar = new zzw();
        this.b.a(new zzd(executor, continuation, zzwVar));
        G();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final <TContinuationResult> Task<TContinuationResult> o(@InterfaceC5670cr1 Continuation<TResult, Task<TContinuationResult>> continuation) {
        return p(TaskExecutors.a, continuation);
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final <TContinuationResult> Task<TContinuationResult> p(@InterfaceC5670cr1 Executor executor, @InterfaceC5670cr1 Continuation<TResult, Task<TContinuationResult>> continuation) {
        zzw zzwVar = new zzw();
        this.b.a(new zzf(executor, continuation, zzwVar));
        G();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC11300zs1
    public final Exception q() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // com.google.android.gms.tasks.Task
    public final TResult r() {
        TResult tresult;
        synchronized (this.a) {
            try {
                D();
                E();
                Exception exc = this.f;
                if (exc == null) {
                    tresult = (TResult) this.e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final <X extends Throwable> TResult s(@InterfaceC5670cr1 Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.a) {
            try {
                D();
                E();
                if (!cls.isInstance(this.f)) {
                    Exception exc = this.f;
                    if (exc == null) {
                        tresult = (TResult) this.e;
                    } else {
                        throw new RuntimeExecutionException(exc);
                    }
                } else {
                    throw cls.cast(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean t() {
        return this.d;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean u() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    public final boolean v() {
        boolean z;
        synchronized (this.a) {
            try {
                z = false;
                if (this.c && !this.d && this.f == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final <TContinuationResult> Task<TContinuationResult> w(@InterfaceC5670cr1 SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        Executor executor = TaskExecutors.a;
        zzw zzwVar = new zzw();
        this.b.a(new zzp(executor, successContinuation, zzwVar));
        G();
        return zzwVar;
    }

    @Override // com.google.android.gms.tasks.Task
    @InterfaceC5670cr1
    public final <TContinuationResult> Task<TContinuationResult> x(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        zzw zzwVar = new zzw();
        this.b.a(new zzp(executor, successContinuation, zzwVar));
        G();
        return zzwVar;
    }

    public final void y(@InterfaceC5670cr1 Exception exc) {
        Preconditions.s(exc, "Exception must not be null");
        synchronized (this.a) {
            F();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void z(@InterfaceC11300zs1 Object obj) {
        synchronized (this.a) {
            F();
            this.c = true;
            this.e = obj;
        }
        this.b.b(this);
    }
}
