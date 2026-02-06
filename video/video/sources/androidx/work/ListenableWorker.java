package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.AbstractC10454wN2;
import o.C8880px0;
import o.E22;
import o.InterfaceC3748Nl2;
import o.InterfaceFutureC8411o11;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context X;
    public WorkerParameters Y;
    public boolean Y0;
    public volatile boolean Z;
    public boolean Z0;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0053a extends a {
            public final androidx.work.b a;

            public C0053a() {
                this(androidx.work.b.c);
            }

            @Override // androidx.work.ListenableWorker.a
            public androidx.work.b c() {
                return this.a;
            }

            public boolean equals(Object o2) {
                if (this == o2) {
                    return true;
                }
                if (o2 != null && C0053a.class == o2.getClass()) {
                    return this.a.equals(((C0053a) o2).a);
                }
                return false;
            }

            public int hashCode() {
                return (C0053a.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.a + '}';
            }

            public C0053a(androidx.work.b outputData) {
                this.a = outputData;
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends a {
            @Override // androidx.work.ListenableWorker.a
            public androidx.work.b c() {
                return androidx.work.b.c;
            }

            public boolean equals(Object o2) {
                if (this == o2) {
                    return true;
                }
                if (o2 != null && b.class == o2.getClass()) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {
            public final androidx.work.b a;

            public c() {
                this(androidx.work.b.c);
            }

            @Override // androidx.work.ListenableWorker.a
            public androidx.work.b c() {
                return this.a;
            }

            public boolean equals(Object o2) {
                if (this == o2) {
                    return true;
                }
                if (o2 != null && c.class == o2.getClass()) {
                    return this.a.equals(((c) o2).a);
                }
                return false;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.a + '}';
            }

            public c(androidx.work.b outputData) {
                this.a = outputData;
            }
        }

        public static a a() {
            return new C0053a();
        }

        public static a b(androidx.work.b outputData) {
            return new C0053a(outputData);
        }

        public static a d() {
            return new b();
        }

        public static a e() {
            return new c();
        }

        public static a f(androidx.work.b outputData) {
            return new c(outputData);
        }

        public abstract androidx.work.b c();
    }

    public ListenableWorker(Context appContext, WorkerParameters workerParams) {
        if (appContext != null) {
            if (workerParams != null) {
                this.X = appContext;
                this.Y = workerParams;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.X;
    }

    public Executor getBackgroundExecutor() {
        return this.Y.a();
    }

    public InterfaceFutureC8411o11<C8880px0> getForegroundInfoAsync() {
        E22 u = E22.u();
        u.q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u;
    }

    public final UUID getId() {
        return this.Y.c();
    }

    public final b getInputData() {
        return this.Y.d();
    }

    public final Network getNetwork() {
        return this.Y.e();
    }

    public final int getRunAttemptCount() {
        return this.Y.g();
    }

    public final Set<String> getTags() {
        return this.Y.i();
    }

    public InterfaceC3748Nl2 getTaskExecutor() {
        return this.Y.j();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.Y.k();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.Y.l();
    }

    public AbstractC10454wN2 getWorkerFactory() {
        return this.Y.m();
    }

    public boolean isRunInForeground() {
        return this.Z0;
    }

    public final boolean isStopped() {
        return this.Z;
    }

    public final boolean isUsed() {
        return this.Y0;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC8411o11<Void> setForegroundAsync(C8880px0 foregroundInfo) {
        this.Z0 = true;
        return this.Y.b().a(getApplicationContext(), getId(), foregroundInfo);
    }

    public InterfaceFutureC8411o11<Void> setProgressAsync(b data) {
        return this.Y.f().a(getApplicationContext(), getId(), data);
    }

    public void setRunInForeground(boolean runInForeground) {
        this.Z0 = runInForeground;
    }

    public final void setUsed() {
        this.Y0 = true;
    }

    public abstract InterfaceFutureC8411o11<a> startWork();

    public final void stop() {
        this.Z = true;
        onStopped();
    }
}
