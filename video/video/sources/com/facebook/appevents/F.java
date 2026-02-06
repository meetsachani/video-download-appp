package com.facebook.appevents;

import com.facebook.appevents.F;
import com.facebook.internal.C;
import com.facebook.internal.C2375u;
import com.facebook.internal.C2379y;
import o.C10307vo;
import o.C11091z02;
import o.C2826Ee0;
import o.C5396bj1;
import o.C5855dd;
import o.C6475g71;
import o.C9072qk1;
import o.HP1;
import o.HT1;
import o.InterfaceC9511sW0;
import o.NT1;
import o.PJ1;
import o.SQ;
import o.VO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HT1({HT1.a.Y})
/* loaded from: classes2.dex */
public final class F {
    @NotNull
    public static final F a = new F();

    /* loaded from: classes2.dex */
    public static final class a implements C.b {
        public static final void n(boolean z) {
            if (z) {
                C5396bj1 c5396bj1 = C5396bj1.a;
                C5396bj1.b();
            }
        }

        public static final void o(boolean z) {
            if (z) {
                NT1 nt1 = NT1.a;
                NT1.a();
            }
        }

        public static final void p(boolean z) {
            if (z) {
                C5855dd c5855dd = C5855dd.a;
                C5855dd.b();
            }
        }

        public static final void q(boolean z) {
            if (z) {
                C9072qk1 c9072qk1 = C9072qk1.a;
                C9072qk1.f();
            }
        }

        public static final void r(boolean z) {
            if (z) {
                C2826Ee0 c2826Ee0 = C2826Ee0.a;
                C2826Ee0.a();
            }
        }

        public static final void s(boolean z) {
            if (z) {
                VO0 vo0 = VO0.a;
                VO0.a();
            }
        }

        public static final void t(boolean z) {
            if (z) {
                PJ1 pj1 = PJ1.a;
                PJ1.c();
            }
        }

        public static final void u(boolean z) {
            if (z) {
                C6475g71 c6475g71 = C6475g71.a;
                C6475g71.a();
            }
        }

        public static final void v(boolean z) {
            if (z) {
                C10307vo c10307vo = C10307vo.a;
                C10307vo.b();
            }
        }

        public static final void w(boolean z) {
            if (z) {
                HP1 hp1 = HP1.a;
                HP1.b();
            }
        }

        public static final void x(boolean z) {
            if (z) {
                C11091z02 c11091z02 = C11091z02.a;
                C11091z02.b();
            }
        }

        @Override // com.facebook.internal.C.b
        public void a() {
        }

        @Override // com.facebook.internal.C.b
        public void b(@Nullable C2379y c2379y) {
            C2375u c2375u = C2375u.a;
            C2375u.a(C2375u.b.AAM, new C2375u.a() { // from class: com.facebook.appevents.u
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.n(z);
                }
            });
            C2375u.a(C2375u.b.RestrictiveDataFiltering, new C2375u.a() { // from class: com.facebook.appevents.x
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.o(z);
                }
            });
            C2375u.a(C2375u.b.PrivacyProtection, new C2375u.a() { // from class: com.facebook.appevents.y
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.q(z);
                }
            });
            C2375u.a(C2375u.b.EventDeactivation, new C2375u.a() { // from class: com.facebook.appevents.z
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.r(z);
                }
            });
            C2375u.a(C2375u.b.IapLogging, new C2375u.a() { // from class: com.facebook.appevents.A
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.s(z);
                }
            });
            C2375u.a(C2375u.b.ProtectedMode, new C2375u.a() { // from class: com.facebook.appevents.B
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.t(z);
                }
            });
            C2375u.a(C2375u.b.MACARuleMatching, new C2375u.a() { // from class: com.facebook.appevents.C
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.u(z);
                }
            });
            C2375u.a(C2375u.b.BlocklistEvents, new C2375u.a() { // from class: com.facebook.appevents.D
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.v(z);
                }
            });
            C2375u.a(C2375u.b.FilterRedactedEvents, new C2375u.a() { // from class: com.facebook.appevents.E
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.w(z);
                }
            });
            C2375u.a(C2375u.b.FilterSensitiveParams, new C2375u.a() { // from class: com.facebook.appevents.v
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.x(z);
                }
            });
            C2375u.a(C2375u.b.CloudBridge, new C2375u.a() { // from class: com.facebook.appevents.w
                @Override // com.facebook.internal.C2375u.a
                public final void a(boolean z) {
                    F.a.p(z);
                }
            });
        }
    }

    @InterfaceC9511sW0
    public static final void a() {
        if (SQ.e(F.class)) {
            return;
        }
        try {
            com.facebook.internal.C c = com.facebook.internal.C.a;
            com.facebook.internal.C.d(new a());
        } catch (Throwable th) {
            SQ.c(th, F.class);
        }
    }
}
