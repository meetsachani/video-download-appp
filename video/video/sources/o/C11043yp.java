package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.helper.CookieUtil;

@InterfaceC8303na2({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n9#2:364\n9#2:365\n9#2:369\n9#2:372\n9#2:378\n9#2:379\n9#2:385\n9#2:388\n9#2:389\n9#2:390\n774#3:366\n865#3,2:367\n1863#3,2:370\n1755#3,3:373\n1863#3,2:376\n1863#3,2:380\n774#3:382\n865#3,2:383\n1863#3,2:386\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl\n*L\n115#1:364\n137#1:365\n162#1:369\n186#1:372\n228#1:378\n280#1:379\n292#1:385\n304#1:388\n331#1:389\n343#1:390\n138#1:366\n138#1:367,2\n175#1:370,2\n191#1:373,3\n200#1:376,2\n282#1:380,2\n287#1:382\n287#1:383,2\n295#1:386,2\n*E\n"})
/* renamed from: o.yp  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11043yp<E> extends C10804xq<E> implements InterfaceC10800xp<E> {
    public final int h1;
    @NotNull
    public final ReentrantLock i1;
    @NotNull
    public List<? extends C10804xq<E>> j1;
    @Nullable
    public Object k1;
    @NotNull
    public final HashMap<InterfaceC6691h02<?>, Object> l1;

    @InterfaceC8303na2({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n*L\n1#1,363:1\n9#2:364\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered\n*L\n311#1:364\n*E\n"})
    /* renamed from: o.yp$a */
    /* loaded from: classes3.dex */
    public final class a extends C10804xq<E> {
        public a() {
            super(C11043yp.this.D2(), null, 2, null);
        }

        @Override // o.C10804xq
        /* renamed from: A2 */
        public boolean a0(@Nullable Throwable th) {
            ReentrantLock reentrantLock = C11043yp.this.i1;
            C11043yp<E> c11043yp = C11043yp.this;
            reentrantLock.lock();
            try {
                c11043yp.I2(this);
                return super.a0(th);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* renamed from: o.yp$b */
    /* loaded from: classes3.dex */
    public final class b extends ZJ<E> {
        public b() {
            super(1, EnumC7132iq.Y, null, 4, null);
        }

        @Override // o.C10804xq
        /* renamed from: E2 */
        public boolean a0(@Nullable Throwable th) {
            C11043yp.this.I2(this);
            return super.a0(th);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2", f = "BroadcastChannel.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
    @InterfaceC8303na2({"SMAP\nBroadcastChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n+ 2 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,363:1\n9#2:364\n1#3:365\n*S KotlinDebug\n*F\n+ 1 BroadcastChannel.kt\nkotlinx/coroutines/channels/BroadcastChannelImpl$registerSelectForSend$2\n*L\n253#1:364\n*E\n"})
    /* renamed from: o.yp$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ C11043yp<E> a1;
        public final /* synthetic */ Object b1;
        public final /* synthetic */ InterfaceC6691h02<?> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C11043yp<E> c11043yp, Object obj, InterfaceC6691h02<?> interfaceC6691h02, HM<? super c> hm) {
            super(2, hm);
            this.a1 = c11043yp;
            this.b1 = obj;
            this.c1 = interfaceC6691h02;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object z;
            Object l = C7289jT0.l();
            int i = this.Z0;
            boolean z2 = true;
            try {
                if (i != 0) {
                    if (i == 1) {
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    Object obj2 = this.b1;
                    this.Z0 = 1;
                    if (this.a1.d0(obj2, this) == l) {
                        return l;
                    }
                }
            } catch (Throwable th) {
                if (this.a1.h0() && ((th instanceof C7714lE) || this.a1.M0() == th)) {
                    z2 = false;
                } else {
                    throw th;
                }
            }
            ReentrantLock reentrantLock = this.a1.i1;
            C11043yp<E> c11043yp = this.a1;
            InterfaceC6691h02<?> interfaceC6691h02 = this.c1;
            reentrantLock.lock();
            try {
                HashMap hashMap = c11043yp.l1;
                if (z2) {
                    z = C7458kA2.a;
                } else {
                    z = C11047yq.z();
                }
                hashMap.put(interfaceC6691h02, z);
                C6562gT0.n(interfaceC6691h02, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
                C6436g02 c6436g02 = (C6436g02) interfaceC6691h02;
                C7458kA2 c7458kA2 = C7458kA2.a;
                if (((C6436g02) interfaceC6691h02).L(c11043yp, c7458kA2) != Tu2.Y) {
                    c11043yp.l1.remove(interfaceC6691h02);
                }
                reentrantLock.unlock();
                return c7458kA2;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((c) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new c(this.a1, this.b1, this.c1, hm);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {179}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
    /* renamed from: o.yp$d */
    /* loaded from: classes3.dex */
    public static final class d extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ C11043yp<E> c1;
        public int d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C11043yp<E> c11043yp, HM<? super d> hm) {
            super(hm);
            this.c1 = c11043yp;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return this.c1.d0(null, this);
        }
    }

    public C11043yp(int i) {
        super(0, null);
        this.h1 = i;
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i + " was specified").toString());
        }
        this.i1 = new ReentrantLock();
        this.j1 = C8222nF.H();
        this.k1 = C11286zp.b();
        this.l1 = new HashMap<>();
    }

    @Override // o.C10804xq, o.InterfaceC10362w02
    @NotNull
    public Object B(E e) {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            if (h0()) {
                return super.B(e);
            }
            List<? extends C10804xq<E>> list = this.j1;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((C10804xq) it.next()).l2()) {
                        return C10642xA.b.b();
                    }
                }
            }
            if (this.h1 == -1) {
                this.k1 = e;
            }
            Iterator<T> it2 = this.j1.iterator();
            while (it2.hasNext()) {
                ((C10804xq) it2.next()).B(e);
            }
            return C10642xA.b.c(C7458kA2.a);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final int D2() {
        return this.h1;
    }

    public final E E2() {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            if (h0()) {
                Throwable w0 = w0();
                if (w0 == null) {
                    throw new IllegalStateException("This broadcast channel is closed");
                }
                throw w0;
            } else if (this.k1 != C11286zp.b()) {
                E e = (E) this.k1;
                reentrantLock.unlock();
                return e;
            } else {
                throw new IllegalStateException("No value");
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Nullable
    public final E G2() {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            E e = null;
            if (!b() && this.k1 != C11286zp.b()) {
                e = (E) this.k1;
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I2(OO1<? extends E> oo1) {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.j1) {
                if (((C10804xq) obj) != oo1) {
                    arrayList.add(obj);
                }
            }
            this.j1 = arrayList;
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // o.C10804xq
    public void P1(@NotNull InterfaceC6691h02<?> interfaceC6691h02, @Nullable Object obj) {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            Object remove = this.l1.remove(interfaceC6691h02);
            if (remove != null) {
                interfaceC6691h02.e(remove);
                reentrantLock.unlock();
                return;
            }
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
            C5910dr.f(C10217vQ.a(interfaceC6691h02.getContext()), null, EnumC10949yQ.Y0, new c(this, obj, interfaceC6691h02, null), 1, null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C10804xq, o.InterfaceC10362w02
    public boolean W(@Nullable Throwable th) {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.j1.iterator();
            while (it.hasNext()) {
                ((C10804xq) it.next()).W(th);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.j1) {
                if (((C10804xq) obj).U0()) {
                    arrayList.add(obj);
                }
            }
            this.j1 = arrayList;
            boolean W = super.W(th);
            reentrantLock.unlock();
            return W;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // o.C10804xq
    public boolean a0(@Nullable Throwable th) {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            Iterator<T> it = this.j1.iterator();
            while (it.hasNext()) {
                ((C10804xq) it.next()).a0(th);
            }
            this.k1 = C11286zp.b();
            boolean a0 = super.a0(th);
            reentrantLock.unlock();
            return a0;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:30:0x0080). Please submit an issue!!! */
    @Override // o.C10804xq, o.InterfaceC10362w02
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d0(E e, @NotNull HM<? super C7458kA2> hm) {
        d dVar;
        int i;
        E e2;
        Iterator it;
        C11043yp<E> c11043yp;
        if (hm instanceof d) {
            dVar = (d) hm;
            int i2 = dVar.d1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.d1 = i2 - Integer.MIN_VALUE;
                Object obj = dVar.b1;
                Object l = C7289jT0.l();
                i = dVar.d1;
                if (i == 0) {
                    if (i == 1) {
                        it = (Iterator) dVar.a1;
                        Object obj2 = dVar.Z0;
                        c11043yp = (C11043yp) dVar.Y0;
                        RT1.n(obj);
                        E e3 = obj2;
                        if (((Boolean) obj).booleanValue() && c11043yp.h0()) {
                            throw c11043yp.M0();
                        }
                        e2 = e3;
                        if (it.hasNext()) {
                            dVar.Y0 = c11043yp;
                            dVar.Z0 = e2;
                            dVar.a1 = it;
                            dVar.d1 = 1;
                            Object V1 = ((C10804xq) it.next()).V1(e2, dVar);
                            if (V1 == l) {
                                return l;
                            }
                            e3 = e2;
                            obj = V1;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            e2 = e3;
                            if (it.hasNext()) {
                                return C7458kA2.a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    ReentrantLock reentrantLock = this.i1;
                    reentrantLock.lock();
                    try {
                        if (!h0()) {
                            if (this.h1 == -1) {
                                this.k1 = e;
                            }
                            List<? extends C10804xq<E>> list = this.j1;
                            reentrantLock.unlock();
                            e2 = e;
                            it = list.iterator();
                            c11043yp = this;
                            if (it.hasNext()) {
                            }
                        } else {
                            throw M0();
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
            }
        }
        dVar = new d(this, hm);
        Object obj3 = dVar.b1;
        Object l2 = C7289jT0.l();
        i = dVar.d1;
        if (i == 0) {
        }
    }

    @Override // o.C10804xq, o.InterfaceC10362w02
    public boolean h0() {
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            return super.h0();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o.C10804xq
    @NotNull
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.k1 != C11286zp.b()) {
            str = "CONFLATED_ELEMENT=" + this.k1 + CookieUtil.b;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("BROADCAST=<");
        sb.append(super.toString());
        sb.append(">; SUBSCRIBERS=");
        sb.append(C10662xF.p3(this.j1, ";", "<", ">", 0, null, null, 56, null));
        return sb.toString();
    }

    @Override // o.InterfaceC10800xp
    @NotNull
    public OO1<E> z() {
        a aVar;
        ReentrantLock reentrantLock = this.i1;
        reentrantLock.lock();
        try {
            if (this.h1 == -1) {
                aVar = new b();
            } else {
                aVar = new a();
            }
            if (h0() && this.k1 == C11286zp.b()) {
                ((C10804xq) aVar).W(w0());
                reentrantLock.unlock();
                return aVar;
            }
            if (this.k1 != C11286zp.b()) {
                ((C10804xq) aVar).B(E2());
            }
            this.j1 = C10662xF.H4(this.j1, aVar);
            reentrantLock.unlock();
            return aVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static /* synthetic */ void F2() {
    }

    public static /* synthetic */ void H2() {
    }
}
