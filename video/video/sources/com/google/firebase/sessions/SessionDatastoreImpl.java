package com.google.firebase.sessions;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC10668xG1;
import o.AbstractC4225Si2;
import o.C10217vQ;
import o.C11154zG1;
import o.C4467Uv0;
import o.C5910dr;
import o.C6551gQ1;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.C9450sG1;
import o.C9516sY;
import o.C9755tW1;
import o.FV;
import o.HM;
import o.InterfaceC11186zO1;
import o.InterfaceC3882Ov0;
import o.InterfaceC4076Qv0;
import o.InterfaceC5809dQ;
import o.InterfaceC9974uQ;
import o.JJ1;
import o.KM;
import o.PU;
import o.RT1;
import o.TW0;
import o.VA0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionDatastoreImpl implements SessionDatastore {
    @Deprecated
    @NotNull
    public static final String g = "FirebaseSessionsRepo";
    @NotNull
    public final Context b;
    @NotNull
    public final InterfaceC5809dQ c;
    @NotNull
    public final AtomicReference<FirebaseSessionsData> d;
    @NotNull
    public final InterfaceC3882Ov0<FirebaseSessionsData> e;
    @NotNull
    public static final Companion f = new Companion(null);
    @Deprecated
    @NotNull
    public static final InterfaceC11186zO1<Context, PU<AbstractC10668xG1>> h = C9450sG1.b(SessionDataStoreConfigs.a.a(), null, null, null, 14, null);

    @FV(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;

        public AnonymousClass1(HM<? super AnonymousClass1> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
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
                InterfaceC3882Ov0 interfaceC3882Ov0 = SessionDatastoreImpl.this.e;
                final SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                InterfaceC4076Qv0 interfaceC4076Qv0 = new InterfaceC4076Qv0() { // from class: com.google.firebase.sessions.SessionDatastoreImpl.1.1
                    @Override // o.InterfaceC4076Qv0
                    @Nullable
                    /* renamed from: a */
                    public final Object c(@NotNull FirebaseSessionsData firebaseSessionsData, @NotNull HM<? super C7458kA2> hm) {
                        SessionDatastoreImpl.this.d.set(firebaseSessionsData);
                        return C7458kA2.a;
                    }
                };
                this.Z0 = 1;
                if (interfaceC3882Ov0.a(interfaceC4076Qv0, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        @Nullable
        /* renamed from: U */
        public final Object i(@NotNull InterfaceC9974uQ interfaceC9974uQ, @Nullable HM<? super C7458kA2> hm) {
            return ((AnonymousClass1) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        @NotNull
        public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
            return new AnonymousClass1(hm);
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ TW0<Object>[] a = {C6551gQ1.v(new JJ1(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ Companion(C9516sY c9516sY) {
            this();
        }

        public final PU<AbstractC10668xG1> b(Context context) {
            return (PU) SessionDatastoreImpl.h.a(context, a[0]);
        }

        private Companion() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class FirebaseSessionDataKeys {
        @NotNull
        public static final FirebaseSessionDataKeys a = new FirebaseSessionDataKeys();
        @NotNull
        public static final AbstractC10668xG1.a<String> b = C11154zG1.f(C9755tW1.p);

        private FirebaseSessionDataKeys() {
        }

        @NotNull
        public final AbstractC10668xG1.a<String> a() {
            return b;
        }
    }

    public SessionDatastoreImpl(@NotNull Context context, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C6562gT0.p(context, "context");
        C6562gT0.p(interfaceC5809dQ, "backgroundDispatcher");
        this.b = context;
        this.c = interfaceC5809dQ;
        this.d = new AtomicReference<>();
        final InterfaceC3882Ov0 t = C4467Uv0.t(f.b(context).getData(), new SessionDatastoreImpl$firebaseSessionDataFlow$1(null));
        this.e = new InterfaceC3882Ov0<FirebaseSessionsData>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1

            /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2  reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements InterfaceC4076Qv0 {
                public final /* synthetic */ InterfaceC4076Qv0 X;
                public final /* synthetic */ SessionDatastoreImpl Y;

                @FV(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                /* renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends KM {
                    public /* synthetic */ Object Y0;
                    public int Z0;
                    public Object a1;

                    public AnonymousClass1(HM hm) {
                        super(hm);
                    }

                    @Override // o.AbstractC5644cl
                    @Nullable
                    public final Object F(@NotNull Object obj) {
                        this.Y0 = obj;
                        this.Z0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.c(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC4076Qv0 interfaceC4076Qv0, SessionDatastoreImpl sessionDatastoreImpl) {
                    this.X = interfaceC4076Qv0;
                    this.Y = sessionDatastoreImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.InterfaceC4076Qv0
                @Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(Object obj, @NotNull HM hm) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    FirebaseSessionsData i2;
                    if (hm instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) hm;
                        int i3 = anonymousClass1.Z0;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.Z0 = i3 - Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.Y0;
                            Object l = C7289jT0.l();
                            i = anonymousClass1.Z0;
                            if (i == 0) {
                                if (i == 1) {
                                    RT1.n(obj2);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                RT1.n(obj2);
                                InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                                i2 = this.Y.i((AbstractC10668xG1) obj);
                                anonymousClass1.Z0 = 1;
                                if (interfaceC4076Qv0.c(i2, anonymousClass1) == l) {
                                    return l;
                                }
                            }
                            return C7458kA2.a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(hm);
                    Object obj22 = anonymousClass1.Y0;
                    Object l2 = C7289jT0.l();
                    i = anonymousClass1.Z0;
                    if (i == 0) {
                    }
                    return C7458kA2.a;
                }
            }

            @Override // o.InterfaceC3882Ov0
            @Nullable
            public Object a(@NotNull InterfaceC4076Qv0<? super FirebaseSessionsData> interfaceC4076Qv0, @NotNull HM hm) {
                Object a = InterfaceC3882Ov0.this.a(new AnonymousClass2(interfaceC4076Qv0, this), hm);
                if (a == C7289jT0.l()) {
                    return a;
                }
                return C7458kA2.a;
            }
        };
        C5910dr.f(C10217vQ.a(interfaceC5809dQ), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    @Nullable
    public String a() {
        FirebaseSessionsData firebaseSessionsData = this.d.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.d();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public void b(@NotNull String str) {
        C6562gT0.p(str, "sessionId");
        C5910dr.f(C10217vQ.a(this.c), null, null, new SessionDatastoreImpl$updateSessionId$1(this, str, null), 3, null);
    }

    public final FirebaseSessionsData i(AbstractC10668xG1 abstractC10668xG1) {
        return new FirebaseSessionsData((String) abstractC10668xG1.c(FirebaseSessionDataKeys.a.a()));
    }
}
