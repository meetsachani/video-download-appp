package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4788Ye;
import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class X extends AbstractList<S> {
    @NotNull
    public static final b b1 = new b(null);
    @NotNull
    public static final AtomicInteger c1 = new AtomicInteger();
    @Nullable
    public Handler X;
    public int Y;
    @NotNull
    public List<S> Y0;
    @NotNull
    public final String Z;
    @NotNull
    public List<a> Z0;
    @Nullable
    public String a1;

    /* loaded from: classes2.dex */
    public interface a {
        void a(@NotNull X x);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public b() {
        }
    }

    /* loaded from: classes2.dex */
    public interface c extends a {
        void b(@NotNull X x, long j, long j2);
    }

    public X() {
        this.Z = String.valueOf(Integer.valueOf(c1.incrementAndGet()));
        this.Z0 = new ArrayList();
        this.Y0 = new ArrayList();
    }

    @NotNull
    public final List<a> B() {
        return this.Z0;
    }

    @NotNull
    public final String D() {
        return this.Z;
    }

    @NotNull
    public final List<S> F() {
        return this.Y0;
    }

    public int G() {
        return this.Y0.size();
    }

    public final int H() {
        return this.Y;
    }

    public /* bridge */ int J(S s) {
        return super.indexOf(s);
    }

    public /* bridge */ int K(S s) {
        return super.lastIndexOf(s);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: L */
    public final /* bridge */ S remove(int i) {
        return Q(i);
    }

    public /* bridge */ boolean M(S s) {
        return super.remove(s);
    }

    @NotNull
    public S Q(int i) {
        return this.Y0.remove(i);
    }

    public final void U(@NotNull a aVar) {
        C6562gT0.p(aVar, "callback");
        this.Z0.remove(aVar);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* renamed from: V */
    public S set(int i, @NotNull S s) {
        C6562gT0.p(s, "element");
        return this.Y0.set(i, s);
    }

    public final void X(@Nullable String str) {
        this.a1 = str;
    }

    public final void Y(@Nullable Handler handler) {
        this.X = handler;
    }

    public final void a0(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.Y = i;
            return;
        }
        throw new IllegalArgumentException("Argument timeoutInMilliseconds must be >= 0.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.Y0.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof S;
        }
        if (!z) {
            return false;
        }
        return h((S) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, @NotNull S s) {
        C6562gT0.p(s, "element");
        this.Y0.add(i, s);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e */
    public boolean add(@NotNull S s) {
        C6562gT0.p(s, "element");
        return this.Y0.add(s);
    }

    public final void f(@NotNull a aVar) {
        C6562gT0.p(aVar, "callback");
        if (!this.Z0.contains(aVar)) {
            this.Z0.add(aVar);
        }
    }

    public /* bridge */ boolean h(S s) {
        return super.contains(s);
    }

    @NotNull
    public final List<Y> i() {
        return j();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof S;
        }
        if (!z) {
            return -1;
        }
        return J((S) obj);
    }

    public final List<Y> j() {
        return S.n.j(this);
    }

    @NotNull
    public final W k() {
        return l();
    }

    public final W l() {
        return S.n.m(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof S;
        }
        if (!z) {
            return -1;
        }
        return K((S) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    /* renamed from: p */
    public S get(int i) {
        return this.Y0.get(i);
    }

    @Nullable
    public final String r() {
        return this.a1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return G();
    }

    @Nullable
    public final Handler w() {
        return this.X;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof S) {
            return M((S) obj);
        }
        return false;
    }

    public X(@NotNull Collection<S> collection) {
        C6562gT0.p(collection, "requests");
        this.Z = String.valueOf(Integer.valueOf(c1.incrementAndGet()));
        this.Z0 = new ArrayList();
        this.Y0 = new ArrayList(collection);
    }

    public X(@NotNull S... sArr) {
        C6562gT0.p(sArr, "requests");
        this.Z = String.valueOf(Integer.valueOf(c1.incrementAndGet()));
        this.Z0 = new ArrayList();
        this.Y0 = new ArrayList(C4788Ye.t(sArr));
    }

    public X(@NotNull X x) {
        C6562gT0.p(x, "requests");
        this.Z = String.valueOf(Integer.valueOf(c1.incrementAndGet()));
        this.Z0 = new ArrayList();
        this.Y0 = new ArrayList(x);
        this.X = x.X;
        this.Y = x.Y;
        this.Z0 = new ArrayList(x.Z0);
    }
}
