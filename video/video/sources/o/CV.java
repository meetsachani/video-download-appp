package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC8148mw2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDebugCoroutineInfoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugCoroutineInfoImpl.kt\nkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
@HK1
/* loaded from: classes3.dex */
public final class CV {
    @InterfaceC7058iW0
    @Nullable
    public volatile WeakReference<InterfaceC10706xQ> _lastObservedFrame;
    @InterfaceC7058iW0
    @NotNull
    public volatile String _state = DV.a;
    @Nullable
    public final C2620Cb2 a;
    @InterfaceC7058iW0
    public final long b;
    @NotNull
    public final WeakReference<InterfaceC5809dQ> c;
    public int d;
    @InterfaceC7058iW0
    @Nullable
    public volatile Thread lastObservedThread;

    @FV(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1", f = "DebugCoroutineInfoImpl.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class a extends MT1 implements VA0<F02<? super StackTraceElement>, HM<? super C7458kA2>, Object> {
        public /* synthetic */ Object Y0;
        public int Z;
        public final /* synthetic */ C2620Cb2 a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2620Cb2 c2620Cb2, HM<? super a> hm) {
            super(2, hm);
            this.a1 = c2620Cb2;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                CV cv = CV.this;
                InterfaceC10706xQ g = this.a1.g();
                this.Z = 1;
                if (cv.k((F02) this.Y0, g, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super StackTraceElement> f02, HM<? super C7458kA2> hm) {
            return ((a) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.a1, hm);
            aVar.Y0 = obj;
            return aVar;
        }
    }

    @FV(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0}, l = {C7834lj1.G}, m = "yieldFrames", n = {"$this$yieldFrames", InterfaceC8148mw2.a.L}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class b extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int d1;

        public b(HM<? super b> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return CV.this.k(null, null, this);
        }
    }

    public CV(@Nullable InterfaceC5809dQ interfaceC5809dQ, @Nullable C2620Cb2 c2620Cb2, long j) {
        this.a = c2620Cb2;
        this.b = j;
        this.c = new WeakReference<>(interfaceC5809dQ);
    }

    public final List<StackTraceElement> b() {
        C2620Cb2 c2620Cb2 = this.a;
        if (c2620Cb2 == null) {
            return C8222nF.H();
        }
        return C6695h12.G3(N02.b(new a(c2620Cb2, null)));
    }

    @Nullable
    public final InterfaceC5809dQ c() {
        return this.c.get();
    }

    @Nullable
    public final C2620Cb2 d() {
        return this.a;
    }

    @NotNull
    public final List<StackTraceElement> e() {
        return b();
    }

    @Nullable
    public final InterfaceC10706xQ f() {
        WeakReference<InterfaceC10706xQ> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @NotNull
    public final String g() {
        return this._state;
    }

    @NotNull
    public final List<StackTraceElement> h() {
        InterfaceC10706xQ f = f();
        if (f == null) {
            return C8222nF.H();
        }
        ArrayList arrayList = new ArrayList();
        while (f != null) {
            StackTraceElement Y = f.Y();
            if (Y != null) {
                arrayList.add(Y);
            }
            f = f.g();
        }
        return arrayList;
    }

    public final void i(@Nullable InterfaceC10706xQ interfaceC10706xQ) {
        WeakReference<InterfaceC10706xQ> weakReference;
        if (interfaceC10706xQ != null) {
            weakReference = new WeakReference<>(interfaceC10706xQ);
        } else {
            weakReference = null;
        }
        this._lastObservedFrame = weakReference;
    }

    public final synchronized void j(@NotNull String str, @NotNull HM<?> hm, boolean z) {
        InterfaceC10706xQ interfaceC10706xQ;
        try {
            if (C6562gT0.g(this._state, DV.b) && C6562gT0.g(str, DV.b) && z) {
                this.d++;
            } else if (this.d > 0 && C6562gT0.g(str, DV.c)) {
                this.d--;
                return;
            }
            if (C6562gT0.g(this._state, str) && C6562gT0.g(str, DV.c) && f() != null) {
                return;
            }
            this._state = str;
            Thread thread = null;
            if (hm instanceof InterfaceC10706xQ) {
                interfaceC10706xQ = (InterfaceC10706xQ) hm;
            } else {
                interfaceC10706xQ = null;
            }
            i(interfaceC10706xQ);
            if (C6562gT0.g(str, DV.b)) {
                thread = Thread.currentThread();
            }
            this.lastObservedThread = thread;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004b -> B:25:0x0062). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:24:0x005f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(F02<? super StackTraceElement> f02, InterfaceC10706xQ interfaceC10706xQ, HM<? super C7458kA2> hm) {
        b bVar;
        int i;
        InterfaceC10706xQ interfaceC10706xQ2;
        CV cv;
        if (hm instanceof b) {
            bVar = (b) hm;
            int i2 = bVar.d1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.d1 = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b1;
                Object l = C7289jT0.l();
                i = bVar.d1;
                if (i == 0) {
                    if (i == 1) {
                        CV cv2 = (CV) bVar.a1;
                        InterfaceC10706xQ interfaceC10706xQ3 = (InterfaceC10706xQ) bVar.Z0;
                        F02<? super StackTraceElement> f022 = (F02) bVar.Y0;
                        RT1.n(obj);
                        interfaceC10706xQ2 = interfaceC10706xQ3;
                        cv = cv2;
                        f02 = f022;
                        interfaceC10706xQ2 = interfaceC10706xQ2.g();
                        if (interfaceC10706xQ2 == null) {
                            return C7458kA2.a;
                        }
                        if (interfaceC10706xQ2 == null) {
                            StackTraceElement Y = interfaceC10706xQ2.Y();
                            if (Y != null) {
                                bVar.Y0 = f02;
                                bVar.Z0 = interfaceC10706xQ2;
                                bVar.a1 = cv;
                                bVar.d1 = 1;
                                if (f02.b(Y, bVar) == l) {
                                    return l;
                                }
                                f022 = f02;
                                cv2 = cv;
                                interfaceC10706xQ3 = interfaceC10706xQ2;
                                interfaceC10706xQ2 = interfaceC10706xQ3;
                                cv = cv2;
                                f02 = f022;
                            }
                            interfaceC10706xQ2 = interfaceC10706xQ2.g();
                            if (interfaceC10706xQ2 == null) {
                            }
                            if (interfaceC10706xQ2 == null) {
                                return C7458kA2.a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    interfaceC10706xQ2 = interfaceC10706xQ;
                    cv = this;
                    if (interfaceC10706xQ2 == null) {
                    }
                }
            }
        }
        bVar = new b(hm);
        Object obj2 = bVar.b1;
        Object l2 = C7289jT0.l();
        i = bVar.d1;
        if (i == 0) {
        }
    }

    @NotNull
    public String toString() {
        return "DebugCoroutineInfo(state=" + g() + ",context=" + c() + ')';
    }
}
