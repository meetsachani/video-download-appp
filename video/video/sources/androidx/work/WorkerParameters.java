package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import o.AbstractC10454wN2;
import o.InterfaceC3748Nl2;
import o.InterfaceC6268fJ1;
import o.InterfaceC9615sx0;

/* loaded from: classes.dex */
public final class WorkerParameters {
    public UUID a;
    public b b;
    public Set<String> c;
    public a d;
    public int e;
    public Executor f;
    public InterfaceC3748Nl2 g;
    public AbstractC10454wN2 h;
    public InterfaceC6268fJ1 i;
    public InterfaceC9615sx0 j;

    /* loaded from: classes.dex */
    public static class a {
        public List<String> a;
        public List<Uri> b;
        public Network c;

        public a() {
            List list = Collections.EMPTY_LIST;
            this.a = list;
            this.b = list;
        }
    }

    public WorkerParameters(UUID id, b inputData, Collection<String> tags, a runtimeExtras, int runAttemptCount, Executor backgroundExecutor, InterfaceC3748Nl2 workTaskExecutor, AbstractC10454wN2 workerFactory, InterfaceC6268fJ1 progressUpdater, InterfaceC9615sx0 foregroundUpdater) {
        this.a = id;
        this.b = inputData;
        this.c = new HashSet(tags);
        this.d = runtimeExtras;
        this.e = runAttemptCount;
        this.f = backgroundExecutor;
        this.g = workTaskExecutor;
        this.h = workerFactory;
        this.i = progressUpdater;
        this.j = foregroundUpdater;
    }

    public Executor a() {
        return this.f;
    }

    public InterfaceC9615sx0 b() {
        return this.j;
    }

    public UUID c() {
        return this.a;
    }

    public b d() {
        return this.b;
    }

    public Network e() {
        return this.d.c;
    }

    public InterfaceC6268fJ1 f() {
        return this.i;
    }

    public int g() {
        return this.e;
    }

    public a h() {
        return this.d;
    }

    public Set<String> i() {
        return this.c;
    }

    public InterfaceC3748Nl2 j() {
        return this.g;
    }

    public List<String> k() {
        return this.d.a;
    }

    public List<Uri> l() {
        return this.d.b;
    }

    public AbstractC10454wN2 m() {
        return this.h;
    }
}
