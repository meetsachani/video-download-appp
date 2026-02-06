package o;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import o.InterfaceC8148mw2;
import o.PT1;
import o.RP1;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* renamed from: o.t82  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9662t82<T> implements PU<T> {
    public static final a k = new a(null);
    public static final Set<String> l = new LinkedHashSet();
    public static final Object m = new Object();
    public final FA0<File> a;
    public final B12<T> b;
    public final CQ<T> c;
    public final InterfaceC9974uQ d;
    public final InterfaceC3882Ov0<T> e;
    public final String f;
    public final EY0 g;
    public final InterfaceC4144Rn1<AbstractC8311nc2<T>> h;
    public List<? extends VA0<? super NP0<T>, ? super HM<? super C7458kA2>, ? extends Object>> i;
    public final C9411s62<b<T>> j;

    /* renamed from: o.t82$a */
    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final Set<String> a() {
            return C9662t82.l;
        }

        public final Object b() {
            return C9662t82.m;
        }

        public a() {
        }
    }

    /* renamed from: o.t82$b */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: o.t82$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> extends b<T> {
            public final AbstractC8311nc2<T> a;

            public a(AbstractC8311nc2<T> abstractC8311nc2) {
                super(null);
                this.a = abstractC8311nc2;
            }

            @Override // o.C9662t82.b
            public AbstractC8311nc2<T> a() {
                return this.a;
            }
        }

        /* renamed from: o.t82$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0340b<T> extends b<T> {
            public final VA0<T, HM<? super T>, Object> a;
            public final HH<T> b;
            public final AbstractC8311nc2<T> c;
            public final InterfaceC5809dQ d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0340b(VA0<? super T, ? super HM<? super T>, ? extends Object> va0, HH<T> hh, AbstractC8311nc2<T> abstractC8311nc2, InterfaceC5809dQ interfaceC5809dQ) {
                super(null);
                C6562gT0.p(va0, "transform");
                C6562gT0.p(hh, "ack");
                C6562gT0.p(interfaceC5809dQ, "callerContext");
                this.a = va0;
                this.b = hh;
                this.c = abstractC8311nc2;
                this.d = interfaceC5809dQ;
            }

            @Override // o.C9662t82.b
            public AbstractC8311nc2<T> a() {
                return this.c;
            }

            public final HH<T> b() {
                return this.b;
            }

            public final InterfaceC5809dQ c() {
                return this.d;
            }

            public final VA0<T, HM<? super T>, Object> d() {
                return this.a;
            }
        }

        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        public abstract AbstractC8311nc2<T> a();

        public b() {
        }
    }

    /* renamed from: o.t82$c */
    /* loaded from: classes.dex */
    public static final class c extends OutputStream {
        public final FileOutputStream X;

        public c(FileOutputStream fileOutputStream) {
            C6562gT0.p(fileOutputStream, "fileOutputStream");
            this.X = fileOutputStream;
        }

        public final FileOutputStream a() {
            return this.X;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.X.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.X.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C6562gT0.p(bArr, "b");
            this.X.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "bytes");
            this.X.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* renamed from: o.t82$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC8052mY0 implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ C9662t82<T> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C9662t82<T> c9662t82) {
            super(1);
            this.X = c9662t82;
        }

        public final void c(Throwable th) {
            if (th != null) {
                this.X.h.setValue(new C7630kt0(th));
            }
            a aVar = C9662t82.k;
            Object b = aVar.b();
            C9662t82<T> c9662t82 = this.X;
            synchronized (b) {
                aVar.a().remove(c9662t82.r().getAbsolutePath());
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.t82$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC8052mY0 implements VA0<b<T>, Throwable, C7458kA2> {
        public static final e X = new e();

        public e() {
            super(2);
        }

        public final void c(b<T> bVar, Throwable th) {
            C6562gT0.p(bVar, "msg");
            if (bVar instanceof b.C0340b) {
                HH<T> b = ((b.C0340b) bVar).b();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                b.k(th);
            }
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ C7458kA2 i(Object obj, Throwable th) {
            c((b) obj, th);
            return C7458kA2.a;
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", i = {}, l = {239, 242}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.t82$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC4225Si2 implements VA0<b<T>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ C9662t82<T> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C9662t82<T> c9662t82, HM<? super f> hm) {
            super(2, hm);
            this.b1 = c9662t82;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            if (r4.b1.s((o.C9662t82.b.a) r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (r4.b1.t((o.C9662t82.b.C0340b) r5, r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
            return r0;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
            } else {
                RT1.n(obj);
                b bVar = (b) this.a1;
                if (bVar instanceof b.a) {
                    this.Z0 = 1;
                } else if (bVar instanceof b.C0340b) {
                    this.Z0 = 2;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(b<T> bVar, HM<? super C7458kA2> hm) {
            return ((f) t(bVar, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            f fVar = new f(this.b1, hm);
            fVar.a1 = obj;
            return fVar;
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.t82$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ C9662t82<T> b1;

        @FV(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.t82$g$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC4225Si2 implements VA0<AbstractC8311nc2<T>, HM<? super Boolean>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ AbstractC8311nc2<T> b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC8311nc2<T> abstractC8311nc2, HM<? super a> hm) {
                super(2, hm);
                this.b1 = abstractC8311nc2;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                C7289jT0.l();
                if (this.Z0 == 0) {
                    RT1.n(obj);
                    AbstractC8311nc2<T> abstractC8311nc2 = (AbstractC8311nc2) this.a1;
                    AbstractC8311nc2<T> abstractC8311nc22 = this.b1;
                    boolean z = false;
                    if (!(abstractC8311nc22 instanceof C8039mU) && !(abstractC8311nc22 instanceof C7630kt0) && abstractC8311nc2 == abstractC8311nc22) {
                        z = true;
                    }
                    return C10557wp.a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(AbstractC8311nc2<T> abstractC8311nc2, HM<? super Boolean> hm) {
                return ((a) t(abstractC8311nc2, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                a aVar = new a(this.b1, hm);
                aVar.a1 = obj;
                return aVar;
            }
        }

        /* renamed from: o.t82$g$b */
        /* loaded from: classes.dex */
        public static final class b implements InterfaceC3882Ov0<T> {
            public final /* synthetic */ InterfaceC3882Ov0 X;

            /* renamed from: o.t82$g$b$a */
            /* loaded from: classes.dex */
            public static final class a implements InterfaceC4076Qv0<AbstractC8311nc2<T>> {
                public final /* synthetic */ InterfaceC4076Qv0 X;

                @FV(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", i = {}, l = {C3503Kz.a0}, m = "emit", n = {}, s = {})
                /* renamed from: o.t82$g$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0341a extends KM {
                    public /* synthetic */ Object Y0;
                    public int Z0;
                    public Object a1;

                    public C0341a(HM hm) {
                        super(hm);
                    }

                    @Override // o.AbstractC5644cl
                    public final Object F(Object obj) {
                        this.Y0 = obj;
                        this.Z0 |= Integer.MIN_VALUE;
                        return a.this.c(null, this);
                    }
                }

                public a(InterfaceC4076Qv0 interfaceC4076Qv0) {
                    this.X = interfaceC4076Qv0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.InterfaceC4076Qv0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object c(Object obj, HM hm) {
                    C0341a c0341a;
                    int i;
                    if (hm instanceof C0341a) {
                        c0341a = (C0341a) hm;
                        int i2 = c0341a.Z0;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0341a.Z0 = i2 - Integer.MIN_VALUE;
                            Object obj2 = c0341a.Y0;
                            Object l = C7289jT0.l();
                            i = c0341a.Z0;
                            if (i == 0) {
                                if (i == 1) {
                                    RT1.n(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                RT1.n(obj2);
                                InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                                AbstractC8311nc2 abstractC8311nc2 = (AbstractC8311nc2) obj;
                                if (!(abstractC8311nc2 instanceof C10700xO1)) {
                                    if (!(abstractC8311nc2 instanceof C7630kt0)) {
                                        if (abstractC8311nc2 instanceof C8039mU) {
                                            Object c = ((C8039mU) abstractC8311nc2).c();
                                            c0341a.Z0 = 1;
                                            if (interfaceC4076Qv0.c(c, c0341a) == l) {
                                                return l;
                                            }
                                        } else if (abstractC8311nc2 instanceof C6427fy2) {
                                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                        } else {
                                            throw new C3865Oq1();
                                        }
                                    } else {
                                        throw ((C7630kt0) abstractC8311nc2).a();
                                    }
                                } else {
                                    throw ((C10700xO1) abstractC8311nc2).a();
                                }
                            }
                            return C7458kA2.a;
                        }
                    }
                    c0341a = new C0341a(hm);
                    Object obj22 = c0341a.Y0;
                    Object l2 = C7289jT0.l();
                    i = c0341a.Z0;
                    if (i == 0) {
                    }
                    return C7458kA2.a;
                }
            }

            public b(InterfaceC3882Ov0 interfaceC3882Ov0) {
                this.X = interfaceC3882Ov0;
            }

            @Override // o.InterfaceC3882Ov0
            public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
                Object a2 = this.X.a(new a(interfaceC4076Qv0), hm);
                if (a2 == C7289jT0.l()) {
                    return a2;
                }
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C9662t82<T> c9662t82, HM<? super g> hm) {
            super(2, hm);
            this.b1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                InterfaceC4076Qv0 interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                AbstractC8311nc2 abstractC8311nc2 = (AbstractC8311nc2) this.b1.h.getValue();
                if (!(abstractC8311nc2 instanceof C8039mU)) {
                    this.b1.j.e(new b.a(abstractC8311nc2));
                }
                b bVar = new b(C4467Uv0.k0(this.b1.h, new a(abstractC8311nc2, null)));
                this.Z0 = 1;
                if (C4467Uv0.l0(interfaceC4076Qv0, bVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((g) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            g gVar = new g(this.b1, hm);
            gVar.a1 = obj;
            return gVar;
        }
    }

    /* renamed from: o.t82$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC8052mY0 implements FA0<File> {
        public final /* synthetic */ C9662t82<T> X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C9662t82<T> c9662t82) {
            super(0);
            this.X = c9662t82;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final File invoke() {
            File file = (File) this.X.a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = C9662t82.k;
            synchronized (aVar.b()) {
                if (!aVar.a().contains(absolutePath)) {
                    Set<String> a = aVar.a();
                    C6562gT0.o(absolutePath, "it");
                    a.add(absolutePath);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {276, 281, 284}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
    /* renamed from: o.t82$i */
    /* loaded from: classes.dex */
    public static final class i extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ C9662t82<T> c1;
        public int d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(C9662t82<T> c9662t82, HM<? super i> hm) {
            super(hm);
            this.c1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.b1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return this.c1.t(null, this);
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 1, 1, 2}, l = {322, 348, InterfaceC8148mw2.g.m}, m = "readAndInit", n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
    /* renamed from: o.t82$j */
    /* loaded from: classes.dex */
    public static final class j extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public Object d1;
        public /* synthetic */ Object e1;
        public final /* synthetic */ C9662t82<T> f1;
        public int g1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C9662t82<T> c9662t82, HM<? super j> hm) {
            super(hm);
            this.f1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.e1 = obj;
            this.g1 |= Integer.MIN_VALUE;
            return this.f1.u(this);
        }
    }

    /* renamed from: o.t82$k */
    /* loaded from: classes.dex */
    public static final class k implements NP0<T> {
        public final /* synthetic */ InterfaceC4826Yn1 a;
        public final /* synthetic */ RP1.a b;
        public final /* synthetic */ RP1.h<T> c;
        public final /* synthetic */ C9662t82<T> d;

        @FV(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", i = {0, 0, 1, 2, 2}, l = {InterfaceC8148mw2.g.k, 337, 339}, m = "updateData", n = {"transform", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv", "newData"}, s = {"L$0", "L$1", "L$0", "L$0", "L$2"})
        /* renamed from: o.t82$k$a */
        /* loaded from: classes.dex */
        public static final class a extends KM {
            public Object Y0;
            public Object Z0;
            public Object a1;
            public Object b1;
            public Object c1;
            public /* synthetic */ Object d1;
            public int f1;

            public a(HM<? super a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.d1 = obj;
                this.f1 |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(InterfaceC4826Yn1 interfaceC4826Yn1, RP1.a aVar, RP1.h<T> hVar, C9662t82<T> c9662t82) {
            this.a = interfaceC4826Yn1;
            this.b = aVar;
            this.c = hVar;
            this.d = c9662t82;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:30:0x0096, B:32:0x009a, B:49:0x00da, B:50:0x00e1), top: B:55:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:30:0x0096, B:32:0x009a, B:49:0x00da, B:50:0x00e1), top: B:55:0x0096 }] */
        @Override // o.NP0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(VA0<? super T, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
            a aVar;
            int i;
            InterfaceC4826Yn1 interfaceC4826Yn1;
            C9662t82 c9662t82;
            RP1.a aVar2;
            RP1.h<T> hVar;
            InterfaceC4826Yn1 interfaceC4826Yn12;
            InterfaceC4826Yn1 interfaceC4826Yn13;
            C9662t82 c9662t822;
            T t;
            RP1.h<T> hVar2;
            try {
                if (hm instanceof a) {
                    aVar = (a) hm;
                    int i2 = aVar.f1;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.f1 = i2 - Integer.MIN_VALUE;
                        Object obj = aVar.d1;
                        Object l = C7289jT0.l();
                        i = aVar.f1;
                        if (i == 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        t = (T) aVar.a1;
                                        hVar2 = (RP1.h) aVar.Z0;
                                        interfaceC4826Yn12 = (InterfaceC4826Yn1) aVar.Y0;
                                        try {
                                            RT1.n(obj);
                                            hVar2.X = t;
                                            hVar = hVar2;
                                            T t2 = hVar.X;
                                            interfaceC4826Yn12.h(null);
                                            return t2;
                                        } catch (Throwable th) {
                                            th = th;
                                            interfaceC4826Yn12.h(null);
                                            throw th;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c9662t822 = (C9662t82) aVar.a1;
                                hVar = (RP1.h) aVar.Z0;
                                interfaceC4826Yn13 = (InterfaceC4826Yn1) aVar.Y0;
                                try {
                                    RT1.n(obj);
                                    if (C6562gT0.g(obj, hVar.X)) {
                                        aVar.Y0 = interfaceC4826Yn13;
                                        aVar.Z0 = hVar;
                                        aVar.a1 = obj;
                                        aVar.f1 = 3;
                                        if (c9662t822.A(obj, aVar) != l) {
                                            t = (T) obj;
                                            hVar2 = hVar;
                                            interfaceC4826Yn12 = interfaceC4826Yn13;
                                            hVar2.X = t;
                                            hVar = hVar2;
                                            T t22 = hVar.X;
                                            interfaceC4826Yn12.h(null);
                                            return t22;
                                        }
                                        return l;
                                    }
                                    interfaceC4826Yn12 = interfaceC4826Yn13;
                                    T t222 = hVar.X;
                                    interfaceC4826Yn12.h(null);
                                    return t222;
                                } catch (Throwable th2) {
                                    th = th2;
                                    interfaceC4826Yn12 = interfaceC4826Yn13;
                                    interfaceC4826Yn12.h(null);
                                    throw th;
                                }
                            }
                            hVar = (RP1.h) aVar.b1;
                            aVar2 = (RP1.a) aVar.a1;
                            VA0<? super T, ? super HM<? super T>, ? extends Object> va02 = (VA0) aVar.Y0;
                            RT1.n(obj);
                            c9662t82 = (C9662t82) aVar.c1;
                            va0 = va02;
                            interfaceC4826Yn1 = (InterfaceC4826Yn1) aVar.Z0;
                        } else {
                            RT1.n(obj);
                            interfaceC4826Yn1 = this.a;
                            RP1.a aVar3 = this.b;
                            RP1.h<T> hVar3 = this.c;
                            c9662t82 = this.d;
                            aVar.Y0 = va0;
                            aVar.Z0 = interfaceC4826Yn1;
                            aVar.a1 = aVar3;
                            aVar.b1 = hVar3;
                            aVar.c1 = c9662t82;
                            aVar.f1 = 1;
                            if (interfaceC4826Yn1.e(null, aVar) != l) {
                                aVar2 = aVar3;
                                hVar = hVar3;
                            }
                            return l;
                        }
                        if (aVar2.X) {
                            aVar.Y0 = interfaceC4826Yn1;
                            aVar.Z0 = hVar;
                            aVar.a1 = c9662t82;
                            aVar.b1 = null;
                            aVar.c1 = null;
                            aVar.f1 = 2;
                            Object i3 = va0.i((T) hVar.X, aVar);
                            if (i3 != l) {
                                interfaceC4826Yn13 = interfaceC4826Yn1;
                                obj = i3;
                                c9662t822 = c9662t82;
                                if (C6562gT0.g(obj, hVar.X)) {
                                }
                            }
                            return l;
                        }
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                }
                if (aVar2.X) {
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC4826Yn12 = interfaceC4826Yn1;
                interfaceC4826Yn12.h(null);
                throw th;
            }
            aVar = new a(hm);
            Object obj2 = aVar.d1;
            Object l2 = C7289jT0.l();
            i = aVar.f1;
            if (i == 0) {
            }
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {302}, m = "readAndInitOrPropagateAndThrowFailure", n = {"this"}, s = {"L$0"})
    /* renamed from: o.t82$l */
    /* loaded from: classes.dex */
    public static final class l extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public final /* synthetic */ C9662t82<T> a1;
        public int b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(C9662t82<T> c9662t82, HM<? super l> hm) {
            super(hm);
            this.a1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.Z0 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return this.a1.v(this);
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {311}, m = "readAndInitOrPropagateFailure", n = {"this"}, s = {"L$0"})
    /* renamed from: o.t82$m */
    /* loaded from: classes.dex */
    public static final class m extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public final /* synthetic */ C9662t82<T> a1;
        public int b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C9662t82<T> c9662t82, HM<? super m> hm) {
            super(hm);
            this.a1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.Z0 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return this.a1.w(this);
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0}, l = {381}, m = "readData", n = {"this"}, s = {"L$0"})
    /* renamed from: o.t82$n */
    /* loaded from: classes.dex */
    public static final class n extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ C9662t82<T> c1;
        public int d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C9662t82<T> c9662t82, HM<? super n> hm) {
            super(hm);
            this.c1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.b1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return this.c1.x(this);
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 1, 2, 2}, l = {359, 362, 365}, m = "readDataOrHandleCorruption", n = {"this", "ex", "ex", "newData"}, s = {"L$0", "L$1", "L$0", "L$1"})
    /* renamed from: o.t82$o */
    /* loaded from: classes.dex */
    public static final class o extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ C9662t82<T> b1;
        public int c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C9662t82<T> c9662t82, HM<? super o> hm) {
            super(hm);
            this.b1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.a1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return this.b1.y(this);
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {402, 410}, m = "transformAndWrite", n = {"this", "curDataAndHash", "curData"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: o.t82$p */
    /* loaded from: classes.dex */
    public static final class p extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ C9662t82<T> c1;
        public int d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C9662t82<T> c9662t82, HM<? super p> hm) {
            super(hm);
            this.c1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.b1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return this.c1.z(null, null, this);
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.t82$q */
    /* loaded from: classes.dex */
    public static final class q extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super T>, Object> {
        public int Z0;
        public final /* synthetic */ VA0<T, HM<? super T>, Object> a1;
        public final /* synthetic */ T b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(VA0<? super T, ? super HM<? super T>, ? extends Object> va0, T t, HM<? super q> hm) {
            super(2, hm);
            this.a1 = va0;
            this.b1 = t;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RT1.n(obj);
            VA0<T, HM<? super T>, Object> va0 = this.a1;
            T t = this.b1;
            this.Z0 = 1;
            Object i2 = va0.i(t, this);
            if (i2 == l) {
                return l;
            }
            return i2;
        }

        public final Object U(InterfaceC9974uQ interfaceC9974uQ, HM<? super T> hm) {
            return ((q) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(InterfaceC9974uQ interfaceC9974uQ, Object obj) {
            return U(interfaceC9974uQ, (HM) obj);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new q(this.a1, this.b1, hm);
        }
    }

    @FV(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {426}, m = "writeData$datastore_core", n = {"this", "scratchFile", "stream"}, s = {"L$0", "L$1", "L$4"})
    /* renamed from: o.t82$r */
    /* loaded from: classes.dex */
    public static final class r extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public /* synthetic */ Object d1;
        public final /* synthetic */ C9662t82<T> e1;
        public int f1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(C9662t82<T> c9662t82, HM<? super r> hm) {
            super(hm);
            this.e1 = c9662t82;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            this.d1 = obj;
            this.f1 |= Integer.MIN_VALUE;
            return this.e1.A(null, this);
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9662t82(FA0<? extends File> fa0, B12<T> b12, List<? extends VA0<? super NP0<T>, ? super HM<? super C7458kA2>, ? extends Object>> list, CQ<T> cq, InterfaceC9974uQ interfaceC9974uQ) {
        C6562gT0.p(fa0, "produceFile");
        C6562gT0.p(b12, "serializer");
        C6562gT0.p(list, "initTasksList");
        C6562gT0.p(cq, "corruptionHandler");
        C6562gT0.p(interfaceC9974uQ, "scope");
        this.a = fa0;
        this.b = b12;
        this.c = cq;
        this.d = interfaceC9974uQ;
        this.e = C4467Uv0.I0(new g(this, null));
        this.f = ".tmp";
        this.g = WY0.b(new h(this));
        this.h = C9533sc2.a(C6427fy2.a);
        this.i = C10662xF.Y5(list);
        this.j = new C9411s62<>(interfaceC9974uQ, new d(this), e.X, new f(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[Catch: IOException -> 0x00bc, TryCatch #4 {IOException -> 0x00bc, blocks: (B:25:0x0092, B:28:0x00a0, B:29:0x00bb, B:34:0x00c1), top: B:49:0x0021 }] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(T t, HM<? super C7458kA2> hm) {
        r rVar;
        int i2;
        File file;
        C9662t82<T> c9662t82;
        File file2;
        FileOutputStream fileOutputStream;
        Throwable th;
        FileOutputStream fileOutputStream2;
        try {
            if (hm instanceof r) {
                rVar = (r) hm;
                int i3 = rVar.f1;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    rVar.f1 = i3 - Integer.MIN_VALUE;
                    Object obj = rVar.d1;
                    Object l2 = C7289jT0.l();
                    i2 = rVar.f1;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            fileOutputStream = (FileOutputStream) rVar.c1;
                            th = (Throwable) rVar.b1;
                            ?? r2 = (Closeable) rVar.a1;
                            file2 = (File) rVar.Z0;
                            c9662t82 = (C9662t82) rVar.Y0;
                            try {
                                RT1.n(obj);
                                fileOutputStream2 = r2;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        p(r());
                        file = new File(C6562gT0.C(r().getAbsolutePath(), this.f));
                        try {
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                            try {
                                B12<T> b12 = this.b;
                                c cVar = new c(fileOutputStream3);
                                rVar.Y0 = this;
                                rVar.Z0 = file;
                                rVar.a1 = fileOutputStream3;
                                rVar.b1 = null;
                                rVar.c1 = fileOutputStream3;
                                rVar.f1 = 1;
                                if (b12.a(t, cVar, rVar) == l2) {
                                    return l2;
                                }
                                c9662t82 = this;
                                file2 = file;
                                fileOutputStream = fileOutputStream3;
                                th = null;
                                fileOutputStream2 = fileOutputStream3;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            if (file.exists()) {
                                file.delete();
                            }
                            throw e;
                        }
                    }
                    fileOutputStream.getFD().sync();
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    C5033aE.a(fileOutputStream2, th);
                    if (!file2.renameTo(c9662t82.r())) {
                        return c7458kA2;
                    }
                    throw new IOException("Unable to rename " + file2 + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                }
            }
            if (i2 == 0) {
            }
            fileOutputStream.getFD().sync();
            C7458kA2 c7458kA22 = C7458kA2.a;
            C5033aE.a(fileOutputStream2, th);
            if (!file2.renameTo(c9662t82.r())) {
            }
        } catch (IOException e3) {
            e = e3;
            file = 1;
        }
        rVar = new r(this, hm);
        Object obj2 = rVar.d1;
        Object l22 = C7289jT0.l();
        i2 = rVar.f1;
    }

    @Override // o.PU
    public Object a(VA0<? super T, ? super HM<? super T>, ? extends Object> va0, HM<? super T> hm) {
        HH c2 = JH.c(null, 1, null);
        this.j.e(new b.C0340b(va0, c2, this.h.getValue(), hm.getContext()));
        return c2.v(hm);
    }

    @Override // o.PU
    public InterfaceC3882Ov0<T> getData() {
        return this.e;
    }

    public final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException(C6562gT0.C("Unable to create parent directories of ", file));
        }
    }

    public final File r() {
        return (File) this.g.getValue();
    }

    public final Object s(b.a<T> aVar, HM<? super C7458kA2> hm) {
        AbstractC8311nc2<T> value = this.h.getValue();
        if (!(value instanceof C8039mU)) {
            if (value instanceof C10700xO1) {
                if (value == aVar.a()) {
                    Object w = w(hm);
                    if (w == C7289jT0.l()) {
                        return w;
                    }
                    return C7458kA2.a;
                }
            } else if (C6562gT0.g(value, C6427fy2.a)) {
                Object w2 = w(hm);
                if (w2 == C7289jT0.l()) {
                    return w2;
                }
                return C7458kA2.a;
            } else if (value instanceof C7630kt0) {
                throw new IllegalStateException("Can't read in final state.");
            }
        }
        return C7458kA2.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(5:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53)))|27)|24))|59|6|7|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bb, code lost:
        if (r9 != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, o.t82, o.t82<T>] */
    /* JADX WARN: Type inference failed for: r9v20, types: [o.HH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(b.C0340b<T> c0340b, HM<? super C7458kA2> hm) {
        i iVar;
        int i2;
        Object b2;
        HH<T> hh;
        HH<T> b3;
        AbstractC8311nc2<T> value;
        C9662t82 c9662t82;
        Object z;
        b.C0340b<T> c0340b2;
        b.C0340b<T> c0340b3;
        if (hm instanceof i) {
            iVar = (i) hm;
            int i3 = iVar.d1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.d1 = i3 - Integer.MIN_VALUE;
                Object obj = iVar.b1;
                Object l2 = C7289jT0.l();
                i2 = iVar.d1;
                boolean z2 = true;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                c0340b3 = (b.C0340b<T>) ((HH) iVar.Y0);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            HH<T> hh2 = (HH) iVar.a1;
                            c9662t82 = (C9662t82) iVar.Z0;
                            b.C0340b<T> c0340b4 = (b.C0340b) iVar.Y0;
                            RT1.n(obj);
                            b3 = hh2;
                            c0340b2 = c0340b4;
                        }
                    } else {
                        c0340b3 = (HH) iVar.Y0;
                    }
                    RT1.n(obj);
                    c0340b = c0340b3;
                    b2 = PT1.b(obj);
                    hh = c0340b;
                    JH.d(hh, b2);
                    return C7458kA2.a;
                }
                RT1.n(obj);
                b3 = c0340b.b();
                try {
                    PT1.a aVar = PT1.Y;
                    value = this.h.getValue();
                } catch (Throwable th) {
                    th = th;
                    c0340b = b3;
                    PT1.a aVar2 = PT1.Y;
                    b2 = PT1.b(RT1.a(th));
                    hh = c0340b;
                    JH.d(hh, b2);
                    return C7458kA2.a;
                }
                if (value instanceof C8039mU) {
                    VA0<T, HM<? super T>, Object> d2 = c0340b.d();
                    InterfaceC5809dQ c2 = c0340b.c();
                    iVar.Y0 = b3;
                    iVar.d1 = 1;
                    z = z(d2, c2, iVar);
                    if (z == l2) {
                    }
                    HH<T> hh3 = b3;
                    obj = z;
                    c0340b = hh3;
                    b2 = PT1.b(obj);
                    hh = c0340b;
                    JH.d(hh, b2);
                    return C7458kA2.a;
                }
                if (!(value instanceof C10700xO1)) {
                    z2 = value instanceof C6427fy2;
                }
                if (z2) {
                    if (value == c0340b.a()) {
                        iVar.Y0 = c0340b;
                        iVar.Z0 = this;
                        iVar.a1 = b3;
                        iVar.d1 = 2;
                        if (v(iVar) != l2) {
                            c9662t82 = this;
                            c0340b2 = c0340b;
                        }
                    } else {
                        throw ((C10700xO1) value).a();
                    }
                } else if (value instanceof C7630kt0) {
                    throw ((C7630kt0) value).a();
                } else {
                    throw new C3865Oq1();
                }
                return l2;
                VA0<T, HM<? super T>, Object> d3 = c0340b2.d();
                InterfaceC5809dQ c3 = c0340b2.c();
                iVar.Y0 = b3;
                iVar.Z0 = null;
                iVar.a1 = null;
                iVar.d1 = 3;
                z = c9662t82.z(d3, c3, iVar);
            }
        }
        iVar = new i(this, hm);
        Object obj2 = iVar.b1;
        Object l22 = C7289jT0.l();
        i2 = iVar.d1;
        boolean z22 = true;
        if (i2 == 0) {
        }
        VA0<T, HM<? super T>, Object> d32 = c0340b2.d();
        InterfaceC5809dQ c32 = c0340b2.c();
        iVar.Y0 = b3;
        iVar.Z0 = null;
        iVar.a1 = null;
        iVar.d1 = 3;
        z = c9662t82.z(d32, c32, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(HM<? super C7458kA2> hm) {
        j jVar;
        int i2;
        boolean z;
        InterfaceC4826Yn1 b2;
        RP1.h hVar;
        C9662t82<T> c9662t82;
        RP1.h hVar2;
        List<? extends VA0<? super NP0<T>, ? super HM<? super C7458kA2>, ? extends Object>> list;
        C9662t82<T> c9662t822;
        RP1.h hVar3;
        k kVar;
        Iterator<T> it;
        InterfaceC4826Yn1 interfaceC4826Yn1;
        RP1.a aVar;
        RP1.a aVar2;
        j jVar2;
        C9662t82<T> c9662t823;
        RP1.h hVar4;
        InterfaceC4826Yn1 interfaceC4826Yn12;
        T t;
        if (hm instanceof j) {
            jVar = (j) hm;
            int i3 = jVar.g1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.g1 = i3 - Integer.MIN_VALUE;
                T t2 = (T) jVar.e1;
                Object l2 = C7289jT0.l();
                i2 = jVar.g1;
                int i4 = 0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                interfaceC4826Yn12 = (InterfaceC4826Yn1) jVar.b1;
                                aVar2 = (RP1.a) jVar.a1;
                                hVar4 = (RP1.h) jVar.Z0;
                                c9662t823 = (C9662t82) jVar.Y0;
                                RT1.n(t2);
                                try {
                                    aVar2.X = true;
                                    C7458kA2 c7458kA2 = C7458kA2.a;
                                    interfaceC4826Yn12.h(null);
                                    InterfaceC4144Rn1<AbstractC8311nc2<T>> interfaceC4144Rn1 = c9662t823.h;
                                    t = hVar4.X;
                                    if (t != null) {
                                        i4 = t.hashCode();
                                    }
                                    interfaceC4144Rn1.setValue(new C8039mU(t, i4));
                                    return c7458kA2;
                                } catch (Throwable th) {
                                    interfaceC4826Yn12.h(null);
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) jVar.d1;
                        kVar = (k) jVar.c1;
                        aVar = (RP1.a) jVar.b1;
                        hVar3 = (RP1.h) jVar.a1;
                        interfaceC4826Yn1 = (InterfaceC4826Yn1) jVar.Z0;
                        c9662t822 = (C9662t82) jVar.Y0;
                        RT1.n(t2);
                        while (it.hasNext()) {
                            jVar.Y0 = c9662t822;
                            jVar.Z0 = interfaceC4826Yn1;
                            jVar.a1 = hVar3;
                            jVar.b1 = aVar;
                            jVar.c1 = kVar;
                            jVar.d1 = it;
                            jVar.g1 = 2;
                            if (((VA0) it.next()).i(kVar, jVar) == l2) {
                                break;
                            }
                        }
                        jVar2 = jVar;
                        aVar2 = aVar;
                        hVar2 = hVar3;
                        b2 = interfaceC4826Yn1;
                        c9662t823 = c9662t822;
                        c9662t823.i = null;
                        jVar2.Y0 = c9662t823;
                        jVar2.Z0 = hVar2;
                        jVar2.a1 = aVar2;
                        jVar2.b1 = b2;
                        jVar2.c1 = null;
                        jVar2.d1 = null;
                        jVar2.g1 = 3;
                        if (b2.e(null, jVar2) != l2) {
                            hVar4 = hVar2;
                            interfaceC4826Yn12 = b2;
                            aVar2.X = true;
                            C7458kA2 c7458kA22 = C7458kA2.a;
                            interfaceC4826Yn12.h(null);
                            InterfaceC4144Rn1<AbstractC8311nc2<T>> interfaceC4144Rn12 = c9662t823.h;
                            t = hVar4.X;
                            if (t != null) {
                            }
                            interfaceC4144Rn12.setValue(new C8039mU(t, i4));
                            return c7458kA22;
                        }
                        return l2;
                    }
                    hVar = (RP1.h) jVar.b1;
                    hVar2 = (RP1.h) jVar.a1;
                    b2 = (InterfaceC4826Yn1) jVar.Z0;
                    c9662t82 = (C9662t82) jVar.Y0;
                    RT1.n(t2);
                } else {
                    RT1.n(t2);
                    if (!C6562gT0.g(this.h.getValue(), C6427fy2.a) && !(this.h.getValue() instanceof C10700xO1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        b2 = C6143eo1.b(false, 1, null);
                        hVar = new RP1.h();
                        jVar.Y0 = this;
                        jVar.Z0 = b2;
                        jVar.a1 = hVar;
                        jVar.b1 = hVar;
                        jVar.g1 = 1;
                        t2 = (T) y(jVar);
                        if (t2 != l2) {
                            c9662t82 = this;
                            hVar2 = hVar;
                        }
                        return l2;
                    }
                    throw new IllegalStateException("Check failed.");
                }
                hVar.X = t2;
                RP1.a aVar3 = new RP1.a();
                k kVar2 = new k(b2, aVar3, hVar2, c9662t82);
                list = c9662t82.i;
                if (list != null) {
                    aVar2 = aVar3;
                    jVar2 = jVar;
                    c9662t823 = c9662t82;
                    c9662t823.i = null;
                    jVar2.Y0 = c9662t823;
                    jVar2.Z0 = hVar2;
                    jVar2.a1 = aVar2;
                    jVar2.b1 = b2;
                    jVar2.c1 = null;
                    jVar2.d1 = null;
                    jVar2.g1 = 3;
                    if (b2.e(null, jVar2) != l2) {
                    }
                    return l2;
                }
                c9662t822 = c9662t82;
                hVar3 = hVar2;
                kVar = kVar2;
                it = list.iterator();
                interfaceC4826Yn1 = b2;
                aVar = aVar3;
                while (it.hasNext()) {
                }
                jVar2 = jVar;
                aVar2 = aVar;
                hVar2 = hVar3;
                b2 = interfaceC4826Yn1;
                c9662t823 = c9662t822;
                c9662t823.i = null;
                jVar2.Y0 = c9662t823;
                jVar2.Z0 = hVar2;
                jVar2.a1 = aVar2;
                jVar2.b1 = b2;
                jVar2.c1 = null;
                jVar2.d1 = null;
                jVar2.g1 = 3;
                if (b2.e(null, jVar2) != l2) {
                }
                return l2;
            }
        }
        jVar = new j(this, hm);
        T t22 = (T) jVar.e1;
        Object l22 = C7289jT0.l();
        i2 = jVar.g1;
        int i42 = 0;
        if (i2 == 0) {
        }
        hVar.X = t22;
        RP1.a aVar32 = new RP1.a();
        k kVar22 = new k(b2, aVar32, hVar2, c9662t82);
        list = c9662t82.i;
        if (list != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(HM<? super C7458kA2> hm) {
        l lVar;
        int i2;
        C9662t82<T> c9662t82;
        if (hm instanceof l) {
            lVar = (l) hm;
            int i3 = lVar.b1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.b1 = i3 - Integer.MIN_VALUE;
                Object obj = lVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = lVar.b1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        c9662t82 = (C9662t82) lVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th) {
                            th = th;
                            c9662t82.h.setValue(new C10700xO1(th));
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        lVar.Y0 = this;
                        lVar.b1 = 1;
                        if (u(lVar) == l2) {
                            return l2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c9662t82 = this;
                        c9662t82.h.setValue(new C10700xO1(th));
                        throw th;
                    }
                }
                return C7458kA2.a;
            }
        }
        lVar = new l(this, hm);
        Object obj2 = lVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = lVar.b1;
        if (i2 == 0) {
        }
        return C7458kA2.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(HM<? super C7458kA2> hm) {
        m mVar;
        int i2;
        C9662t82<T> c9662t82;
        if (hm instanceof m) {
            mVar = (m) hm;
            int i3 = mVar.b1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.b1 = i3 - Integer.MIN_VALUE;
                Object obj = mVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = mVar.b1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        c9662t82 = (C9662t82) mVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th) {
                            th = th;
                            c9662t82.h.setValue(new C10700xO1(th));
                            return C7458kA2.a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    try {
                        mVar.Y0 = this;
                        mVar.b1 = 1;
                        if (u(mVar) == l2) {
                            return l2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c9662t82 = this;
                        c9662t82.h.setValue(new C10700xO1(th));
                        return C7458kA2.a;
                    }
                }
                return C7458kA2.a;
            }
        }
        mVar = new m(this, hm);
        Object obj2 = mVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = mVar.b1;
        if (i2 == 0) {
        }
        return C7458kA2.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [o.t82$n, o.HM] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.t82] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [o.B12<T>, o.B12] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(HM<? super T> hm) {
        ?? r0;
        int i2;
        Throwable th;
        FileInputStream fileInputStream;
        try {
            if (hm instanceof n) {
                n nVar = (n) hm;
                int i3 = nVar.d1;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.d1 = i3 - Integer.MIN_VALUE;
                    r0 = nVar;
                    Object obj = r0.b1;
                    Object l2 = C7289jT0.l();
                    i2 = r0.d1;
                    if (i2 == 0) {
                        if (i2 == 1) {
                            th = (Throwable) r0.a1;
                            ?? r2 = (Closeable) r0.Z0;
                            C9662t82 c9662t82 = (C9662t82) r0.Y0;
                            try {
                                RT1.n(obj);
                                fileInputStream = r2;
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        try {
                            FileInputStream fileInputStream2 = new FileInputStream(r());
                            try {
                                r0.Y0 = this;
                                r0.Z0 = fileInputStream2;
                                r0.a1 = null;
                                r0.d1 = 1;
                                obj = this.b.b(fileInputStream2, r0);
                                if (obj == l2) {
                                    return l2;
                                }
                                th = null;
                                fileInputStream = fileInputStream2;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } catch (FileNotFoundException e2) {
                            e = e2;
                            r0 = this;
                            if (!r0.r().exists()) {
                                return r0.b.r();
                            }
                            throw e;
                        }
                    }
                    C5033aE.a(fileInputStream, th);
                    return obj;
                }
            }
            if (i2 == 0) {
            }
            C5033aE.a(fileInputStream, th);
            return obj;
        } catch (FileNotFoundException e3) {
            e = e3;
        }
        r0 = new n(this, hm);
        Object obj2 = r0.b1;
        Object l22 = C7289jT0.l();
        i2 = r0.d1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(HM<? super T> hm) {
        o oVar;
        Object l2;
        int i2;
        C9662t82 c9662t82;
        Object a2;
        BQ bq;
        C9662t82 c9662t822;
        BQ bq2;
        if (hm instanceof o) {
            oVar = (o) hm;
            int i3 = oVar.c1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.c1 = i3 - Integer.MIN_VALUE;
                Object obj = oVar.a1;
                l2 = C7289jT0.l();
                i2 = oVar.c1;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                Object obj2 = oVar.Z0;
                                bq2 = (BQ) oVar.Y0;
                                try {
                                    RT1.n(obj);
                                    return obj2;
                                } catch (IOException e2) {
                                    e = e2;
                                    C3917Pf0.a(bq2, e);
                                    throw bq2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bq = (BQ) oVar.Z0;
                        c9662t822 = (C9662t82) oVar.Y0;
                        RT1.n(obj);
                        try {
                            oVar.Y0 = bq;
                            oVar.Z0 = obj;
                            oVar.c1 = 3;
                            if (c9662t822.A(obj, oVar) != l2) {
                                return l2;
                            }
                            return obj;
                        } catch (IOException e3) {
                            e = e3;
                            bq2 = bq;
                            C3917Pf0.a(bq2, e);
                            throw bq2;
                        }
                    }
                    c9662t82 = (C9662t82) oVar.Y0;
                    try {
                        RT1.n(obj);
                        return obj;
                    } catch (BQ e4) {
                        e = e4;
                    }
                } else {
                    RT1.n(obj);
                    try {
                        oVar.Y0 = this;
                        oVar.c1 = 1;
                        Object x = x(oVar);
                        if (x != l2) {
                            return x;
                        }
                    } catch (BQ e5) {
                        e = e5;
                        c9662t82 = this;
                    }
                }
                CQ<T> cq = c9662t82.c;
                oVar.Y0 = c9662t82;
                oVar.Z0 = e;
                oVar.c1 = 2;
                a2 = cq.a(e, oVar);
                if (a2 != l2) {
                    C9662t82 c9662t823 = c9662t82;
                    bq = e;
                    obj = a2;
                    c9662t822 = c9662t823;
                    oVar.Y0 = bq;
                    oVar.Z0 = obj;
                    oVar.c1 = 3;
                    if (c9662t822.A(obj, oVar) != l2) {
                    }
                }
                return l2;
            }
        }
        oVar = new o(this, hm);
        Object obj3 = oVar.a1;
        l2 = C7289jT0.l();
        i2 = oVar.c1;
        if (i2 == 0) {
        }
        CQ<T> cq2 = c9662t82.c;
        oVar.Y0 = c9662t82;
        oVar.Z0 = e;
        oVar.c1 = 2;
        a2 = cq2.a(e, oVar);
        if (a2 != l2) {
        }
        return l2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(VA0<? super T, ? super HM<? super T>, ? extends Object> va0, InterfaceC5809dQ interfaceC5809dQ, HM<? super T> hm) {
        p pVar;
        T t;
        int i2;
        C8039mU c8039mU;
        Object obj;
        C9662t82<T> c9662t82;
        Object obj2;
        C9662t82 c9662t822;
        int i3;
        if (hm instanceof p) {
            pVar = (p) hm;
            int i4 = pVar.d1;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pVar.d1 = i4 - Integer.MIN_VALUE;
                t = (T) pVar.b1;
                Object l2 = C7289jT0.l();
                i2 = pVar.d1;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            obj2 = pVar.Z0;
                            c9662t822 = (C9662t82) pVar.Y0;
                            RT1.n(t);
                            InterfaceC4144Rn1<AbstractC8311nc2<T>> interfaceC4144Rn1 = c9662t822.h;
                            if (obj2 == null) {
                                i3 = obj2.hashCode();
                            } else {
                                i3 = 0;
                            }
                            interfaceC4144Rn1.setValue(new C8039mU(obj2, i3));
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = pVar.a1;
                    c8039mU = (C8039mU) pVar.Z0;
                    c9662t82 = (C9662t82) pVar.Y0;
                    RT1.n(t);
                } else {
                    RT1.n(t);
                    C8039mU c8039mU2 = (C8039mU) this.h.getValue();
                    c8039mU2.a();
                    Object c2 = c8039mU2.c();
                    q qVar = new q(va0, c2, null);
                    pVar.Y0 = this;
                    pVar.Z0 = c8039mU2;
                    pVar.a1 = c2;
                    pVar.d1 = 1;
                    Object h2 = C5426br.h(interfaceC5809dQ, qVar, pVar);
                    if (h2 != l2) {
                        c8039mU = c8039mU2;
                        t = h2;
                        obj = c2;
                        c9662t82 = this;
                    }
                    return l2;
                }
                c8039mU.a();
                if (!C6562gT0.g(obj, t)) {
                    return obj;
                }
                pVar.Y0 = c9662t82;
                pVar.Z0 = t;
                pVar.a1 = null;
                pVar.d1 = 2;
                if (c9662t82.A(t, pVar) != l2) {
                    obj2 = t;
                    c9662t822 = c9662t82;
                    InterfaceC4144Rn1<AbstractC8311nc2<T>> interfaceC4144Rn12 = c9662t822.h;
                    if (obj2 == null) {
                    }
                    interfaceC4144Rn12.setValue(new C8039mU(obj2, i3));
                    return obj2;
                }
                return l2;
            }
        }
        pVar = new p(this, hm);
        t = (T) pVar.b1;
        Object l22 = C7289jT0.l();
        i2 = pVar.d1;
        if (i2 == 0) {
        }
        c8039mU.a();
        if (!C6562gT0.g(obj, t)) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C9662t82(FA0 fa0, B12 b12, List list, CQ cq, InterfaceC9974uQ interfaceC9974uQ, int i2, C9516sY c9516sY) {
        this(fa0, b12, r3, r4, interfaceC9974uQ);
        List H = (i2 & 4) != 0 ? C8222nF.H() : list;
        CQ c3180Hq1 = (i2 & 8) != 0 ? new C3180Hq1() : cq;
        if ((i2 & 16) != 0) {
            C8909q40 c8909q40 = C8909q40.a;
            interfaceC9974uQ = C10217vQ.a(C8909q40.c().M(C8088mh2.c(null, 1, null)));
        }
    }

    public static /* synthetic */ void q() {
    }
}
