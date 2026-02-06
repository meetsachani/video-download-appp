package o;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* renamed from: o.ue1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10026ue1 {
    public static final b a = new b(null);

    /* renamed from: o.ue1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC10026ue1 {
        public final AbstractC9783te1 b;

        @FV(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ue1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0346a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ C6199f20 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0346a(C6199f20 c6199f20, HM<? super C0346a> hm) {
                super(2, hm);
                this.b1 = c6199f20;
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
                    AbstractC9783te1 abstractC9783te1 = a.this.b;
                    C6199f20 c6199f20 = this.b1;
                    this.Z0 = 1;
                    if (abstractC9783te1.a(c6199f20, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((C0346a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0346a(this.b1, hm);
            }
        }

        @FV(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {C7834lj1.G}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ue1$a$b */
        /* loaded from: classes.dex */
        public static final class b extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super Integer>, Object> {
            public int Z0;

            public b(HM<? super b> hm) {
                super(2, hm);
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
                AbstractC9783te1 abstractC9783te1 = a.this.b;
                this.Z0 = 1;
                Object b = abstractC9783te1.b(this);
                if (b == l) {
                    return l;
                }
                return b;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super Integer> hm) {
                return ((b) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new b(hm);
            }
        }

        @FV(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {C3503Kz.W}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ue1$a$c */
        /* loaded from: classes.dex */
        public static final class c extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ Uri b1;
            public final /* synthetic */ InputEvent c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, HM<? super c> hm) {
                super(2, hm);
                this.b1 = uri;
                this.c1 = inputEvent;
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
                    AbstractC9783te1 abstractC9783te1 = a.this.b;
                    Uri uri = this.b1;
                    InputEvent inputEvent = this.c1;
                    this.Z0 = 1;
                    if (abstractC9783te1.d(uri, inputEvent, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((c) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new c(this.b1, this.c1, hm);
            }
        }

        @FV(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {C3503Kz.e0}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ue1$a$d */
        /* loaded from: classes.dex */
        public static final class d extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ Uri b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Uri uri, HM<? super d> hm) {
                super(2, hm);
                this.b1 = uri;
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
                    AbstractC9783te1 abstractC9783te1 = a.this.b;
                    Uri uri = this.b1;
                    this.Z0 = 1;
                    if (abstractC9783te1.e(uri, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((d) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new d(this.b1, hm);
            }
        }

        @FV(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {C3503Kz.k0}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ue1$a$e */
        /* loaded from: classes.dex */
        public static final class e extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ C5303bK2 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(C5303bK2 c5303bK2, HM<? super e> hm) {
                super(2, hm);
                this.b1 = c5303bK2;
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
                    AbstractC9783te1 abstractC9783te1 = a.this.b;
                    C5303bK2 c5303bK2 = this.b1;
                    this.Z0 = 1;
                    if (abstractC9783te1.f(c5303bK2, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((e) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new e(this.b1, hm);
            }
        }

        @FV(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", i = {}, l = {C10997yd1.q1}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.ue1$a$f */
        /* loaded from: classes.dex */
        public static final class f extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ C5788dK2 b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(C5788dK2 c5788dK2, HM<? super f> hm) {
                super(2, hm);
                this.b1 = c5788dK2;
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
                    AbstractC9783te1 abstractC9783te1 = a.this.b;
                    C5788dK2 c5788dK2 = this.b1;
                    this.Z0 = 1;
                    if (abstractC9783te1.g(c5788dK2, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((f) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new f(this.b1, hm);
            }
        }

        public a(AbstractC9783te1 abstractC9783te1) {
            C6562gT0.p(abstractC9783te1, "mMeasurementManager");
            this.b = abstractC9783te1;
        }

        @Override // o.AbstractC10026ue1
        public InterfaceFutureC8411o11<C7458kA2> a(C6199f20 c6199f20) {
            J10 b2;
            C6562gT0.p(c6199f20, "deletionRequest");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new C0346a(c6199f20, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }

        @Override // o.AbstractC10026ue1
        public InterfaceFutureC8411o11<Integer> c() {
            J10 b2;
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new b(null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }

        @Override // o.AbstractC10026ue1
        public InterfaceFutureC8411o11<C7458kA2> d(Uri uri, InputEvent inputEvent) {
            J10 b2;
            C6562gT0.p(uri, "attributionSource");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new c(uri, inputEvent, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }

        @Override // o.AbstractC10026ue1
        public InterfaceFutureC8411o11<C7458kA2> e(Uri uri) {
            J10 b2;
            C6562gT0.p(uri, "trigger");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new d(uri, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }

        @Override // o.AbstractC10026ue1
        public InterfaceFutureC8411o11<C7458kA2> f(C5303bK2 c5303bK2) {
            J10 b2;
            C6562gT0.p(c5303bK2, "request");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new e(c5303bK2, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }

        @Override // o.AbstractC10026ue1
        public InterfaceFutureC8411o11<C7458kA2> g(C5788dK2 c5788dK2) {
            J10 b2;
            C6562gT0.p(c5788dK2, "request");
            b2 = C5910dr.b(C10217vQ.a(C8909q40.a()), null, null, new f(c5788dK2, null), 3, null);
            return C5324bQ.c(b2, null, 1, null);
        }
    }

    /* renamed from: o.ue1$b */
    /* loaded from: classes.dex */
    public static final class b {
        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        public final AbstractC10026ue1 a(Context context) {
            C6562gT0.p(context, "context");
            AbstractC9783te1 a = AbstractC9783te1.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }

        public b() {
        }
    }

    @InterfaceC9511sW0
    public static final AbstractC10026ue1 b(Context context) {
        return a.a(context);
    }

    public abstract InterfaceFutureC8411o11<C7458kA2> a(C6199f20 c6199f20);

    public abstract InterfaceFutureC8411o11<Integer> c();

    public abstract InterfaceFutureC8411o11<C7458kA2> d(Uri uri, InputEvent inputEvent);

    public abstract InterfaceFutureC8411o11<C7458kA2> e(Uri uri);

    public abstract InterfaceFutureC8411o11<C7458kA2> f(C5303bK2 c5303bK2);

    public abstract InterfaceFutureC8411o11<C7458kA2> g(C5788dK2 c5788dK2);
}
