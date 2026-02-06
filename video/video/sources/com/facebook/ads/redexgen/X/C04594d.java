package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.4d  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C04594d<T> {
    public static byte[] A09;
    public static String[] A0A = {"qNhODmuhOGTzTOdNu4k", "7K2GPWa5EHuyy4", "E4NOCJ5RL4hYeLNooPFdkLqGKDRv", "JwlW7s8WNTa19hdGL1amV", "YNjlntyRTdoFHiJHxz0qVC", "VcHvMaXHchlXNA9aE7EYkOxPZlMykCpc", "sHIyzZJD7qVKB1sd9lWDot", "2KMjU5K0FjJgBGqm2h4w3g2sgyG9pwrH"};
    public boolean A00;
    public boolean A01;
    public final AnonymousClass45 A02;
    public final C4X A03;
    public final InterfaceC04574b<T> A04;
    public final Object A05;
    public final ArrayDeque<Runnable> A06;
    public final ArrayDeque<Runnable> A07;
    public final CopyOnWriteArraySet<C04584c<T>> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C04594d(CopyOnWriteArraySet<C04584c<T>> copyOnWriteArraySet, Looper looper, AnonymousClass45 anonymousClass45, InterfaceC04574b<T> interfaceC04574b) {
        this.A02 = anonymousClass45;
        this.A08 = copyOnWriteArraySet;
        this.A04 = interfaceC04574b;
        this.A05 = new Object();
        this.A06 = new ArrayDeque<>();
        this.A07 = new ArrayDeque<>();
        this.A03 = anonymousClass45.A5P(looper, new Handler.Callback() { // from class: com.facebook.ads.redexgen.X.4Z
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                boolean A05;
                A05 = C04594d.this.A05(message);
                return A05;
            }
        });
        this.A01 = true;
        this.A00 = C1844ja.A03(EnumC1841jX.A0E);
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{C3307Iz.a0, C3307Iz.f0, 54, 47, C3307Iz.c0, C3307Iz.X, C3307Iz.V, 60, C3307Iz.e0, 58, C3307Iz.a0, 60, C3307Iz.V, C3307Iz.Z, C3307Iz.Y, C8077mf.p, C3307Iz.V, C3307Iz.Y, C3307Iz.V, 59, 32, C3307Iz.e0, C3307Iz.d0};
        if (A0A[0].length() == 4) {
            throw new RuntimeException();
        }
        A0A[3] = "KpT";
    }

    static {
        A03();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public C04594d(Looper looper, AnonymousClass45 anonymousClass45, InterfaceC04574b<T> interfaceC04574b) {
        this(new CopyOnWriteArraySet(), looper, anonymousClass45, interfaceC04574b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private final C04594d<T> A00(Looper looper, AnonymousClass45 anonymousClass45, InterfaceC04574b<T> interfaceC04574b) {
        return new C04594d<>(this.A08, looper, anonymousClass45, interfaceC04574b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    private void A02() {
        if (!this.A01) {
            return;
        }
        AbstractC04543y.A08(Thread.currentThread() == this.A03.A8R().getThread());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    public static /* synthetic */ void A04(CopyOnWriteArraySet copyOnWriteArraySet, int i, InterfaceC04564a interfaceC04564a) {
        Iterator it = copyOnWriteArraySet.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(0, 6, 102));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public boolean A05(Message message) {
        Iterator<C04584c<T>> it = this.A08.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(6, 17, 110));
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4b != com.facebook.ads.androidx.media3.common.util.ListenerSet$IterationFinishedEvent<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final C04594d<T> A07(Looper looper, InterfaceC04574b<T> interfaceC04574b) {
        return A00(looper, this.A02, interfaceC04574b);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    /* JADX WARN: Incorrect condition in loop: B:12:0x003d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A08() {
        A02();
        if (this.A07.isEmpty()) {
            return;
        }
        if (!this.A03.A9n(0)) {
            this.A03.AJD(this.A03.ACg(0));
        }
        boolean z = !this.A06.isEmpty();
        this.A06.addAll(this.A07);
        this.A07.clear();
        if (z) {
            return;
        }
        while (!recursiveFlushInProgress) {
            Runnable peekFirst = this.A06.peekFirst();
            String[] strArr = A0A;
            if (strArr[4].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "yEp1Grh3pDykJXHd8ndBtu";
            strArr2[6] = "iM1KUlOTpdsgtS4YknLkQB";
            peekFirst.run();
            this.A06.removeFirst();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4c != com.facebook.ads.androidx.media3.common.util.ListenerSet$ListenerHolder<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A09(final int i, final InterfaceC04564a<T> interfaceC04564a) {
        A02();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.A08);
        if (this.A00) {
            Iterator it = copyOnWriteArraySet.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NullPointerException(A01(0, 6, 102));
            }
            return;
        }
        this.A07.add(new Runnable() { // from class: com.facebook.ads.redexgen.X.4Y
            @Override // java.lang.Runnable
            public final void run() {
                C04594d.A04(copyOnWriteArraySet, i, interfaceC04564a);
            }
        });
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4a != com.facebook.ads.androidx.media3.common.util.ListenerSet$Event<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.4d != com.facebook.ads.androidx.media3.common.util.ListenerSet<T> */
    public final void A0A(int i, InterfaceC04564a<T> interfaceC04564a) {
        A09(i, interfaceC04564a);
        A08();
    }
}
